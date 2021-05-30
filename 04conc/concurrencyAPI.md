# 列举常用的并发操作 API 和工具类，简单分析其使用场景和优缺点。
## volatile关键字
- volatile保证可见性，让修改的共享变量会立即被更新到主存
- 不能保证原子性
## synchronized 同步块
- 同步块的阻塞无法中断（不能 Interruptibly） 
- 同步块的阻塞无法控制超时（无法自动解锁） 
- 同步块无法异步处理锁（即不能立即知道是否可以拿到锁） 
- 同步块无法根据条件灵活的加锁解锁（即只能跟同步块范围一致）

## 锁机制类Locks
### Lock
```
//API
void        lock(); //获取锁; 类比 synchronized (lock)
void        lockInterruptibly() throws InterruptedException;	//获取锁; 允许打断;
boolean     tryLock(long time, TimeUnit unit);	//尝试获取锁; 成功则返回 true; 超时则退出
boolean     tryLock();	//尝试【无等待】获取锁; 成功则返回
void        unlock();	//解锁；要求当前线程已获得锁; 类比同步块结束
```
### Condition
```
Condition   newCondition();	//新增一个绑定到当前Lock的条件 
void        await() throws InterruptedException; //等待信号; 类比 Object#wait()
void        awaitUninterruptibly();等待信号;
boolean     await(long time, TimeUnit unit) throws InterruptedException; //等待信号; 超时则返回 false
boolean     awaitUntil(Date deadline) throws InterruptedException; //等待信号; 超时则返回 false
void        signal(); //给一个等待线程发送唤醒信号; 类比 Object#notify ()
void        signalAll(); //给所有等待线程发送唤醒信号; 类比 Object#notifyAll()
```
```
示例: （类比: Object monitor）
final Lock lock = new ReentrantLock();
final Condition notFull = lock.newCondition();
final Condition notEmpty = lock.newCondition();
```
- Lock上的信号
### ReentrantLock
```
ReentrantLock(true); 公平锁，按照申请锁的顺序获取锁，等待进程不会饥饿
ReentrantLock(false) 非公平锁，进程加锁时尝试获取锁，减少唤起进程的开销，整体吞吐效率高
```
- 支持一个线程对资源重复加锁
### ReadWriteLock
```
//API
Lock readLock(); //获取读锁，共享锁
Lock writeLock(); //获取写锁，独占锁
```
- 适用于读多写少的并发场景
### LockSupport
```
void park(Object blicker); //暂停当前线程
void parkNanos(Object blicker, long nanos); //暂停当前线程，有超时时间限制
void parkUntil(Object blicker, long deadline); //暂停当前线程，直到某个时间
void park(); //无期限暂停当前线程
void parkNanos(long nanos); //暂停当前线程，有超时时间限制
void parkUntil(long deadline); //暂停当前线程，直到某个时间
void unpark(Thread thread); //恢复当前线程
Object getBlocker(Thread thread); //
```

## 原子操作类Atomic
### AtomicInteger
```
//API
get()	获取当前的值
getAndSet(int newValue)	获取当前的值，并设置新的值
getAndIncrement()	获取当前的值，并自增
getAndDecrement()	获取当前的值，并自减
getAndAdd(int delta)	获取当前的值，并加上预期的值
boolean compareAndSet(int expect, int update)	如果输入的数值等于预期值，则以原子方式将该值设置为输入值（update）
lazySet(int newValue)	最终设置为newValue,使用 lazySet 设置之后可能导致其他线程在之后的一小段时间内还是可以读到旧的值。
```
### AtomicLong
### LongAdder

## 线程池相关类Executor
### Future
### FutureTask
### CompletableFuture
```
static final boolean useCommonPool = (ForkJoinPool.getCommonPoolParallelism() > 1); //是否使用内置线程池
static final Executor asyncPool = useCommonPool ? ForkJoinPool.commonPool() : new ThreadPerTaskExecutor(); //线程池
CompletableFuture<Void> runAsync(Runnable runnable)； //异步执行
CompletableFuture<Void> runAsync(Runnable runnable, Executor executor); //异步执行, 使用自定义线程池
T get(); //等待执行结果
T get(long timeout, TimeUnit unit); //限时等待执行结果
T getNow(T valueIfAbsent); //立即获取结果(默认值)
```
### Callable
### Executor
### ExecutorService
```
//API
void    execute(Runnable command);	//执行可运行的任务
void    shutdown();	//停止接收新任务，原来的任务继续执行
List    shutdownNow();	//停止接收新任务，原来的任务停止执行
Future  submit(Runnable task);	//提交任务; 允许获取执行结果
Future  submit(Runnable task, T result);	//提交任务（指定结果）; 控制|获取执行结果
Future  submit(Callable task);	//提交任务; 允许控制任务和获取执行结果
boolean awaitTermination(timeOut, unit);	//阻塞当前线程，返回是否线程都执行完
```

## 信号量工具类Tools
### Semaphore 信号量
```
//API
public      Semaphore(int permits); //构造方法（可用的许可数量）
void        acquire(); //获取许可
void        release(); //释放许可
int         availablePermits(); //返回此信号量中当前可用的许可证数。
int         getQueueLength(); //返回正在等待获取许可证的线程数。
boolean     hasQueuedThreads(); //是否有线程正在等待获取许可证。
void        reducePermits(int reduction); //减少reduction个许可证，是个protected方法。
Collection  getQueuedThreads(); //返回所有等待获取许可证的线程集合，是个protected方法。
```
- 控制同时访问特定资源的线程数量
### CountDownLatch
```
// API
 public		CountDownLatch(int count); //构造方法（总数）
 void		await(); // 使当前线程在闭锁计数器到零之前一直等待，除非线程被中断。
 boolean	await(long timeout, TimeUnit unit); // 使当前线程在闭锁计数器至零之前一直等待，除非线程被中断或超出了指定的等待时间。
 void		countDown(); // 递减闭锁计数器，如果计数到达零，则释放所有等待的线程。
 long		getCount(); // 返回当前计数。
 String		toString(); // 返回标识此闭锁及其状态的字符串。
```
- 阻塞主线程，N个子线程满足条件时主线程继续
- 适用于一个线程等待多个线程场景
- 计数只能被使用一次，减到0后不会重置

### CyclicBarrier
```
// API
 public		CyclicBarrier(int parties); //构造方法（等待的数量）
 public		CyclicBarrier(int parties, Runnable barrierAction); //构造方法（等待的数量, 执行的任务）
 int		await(); // 线程将一直等待直到所有参与者都在此 barrier 上调用 await 方法
 int		await(long timeout, TimeUnit unit); // 线程将一直等待直到所有参与者都在此 barrier 上调用 await 方法, 或者超出了指定的等待时间。
 int		getNumberWaiting(); // 返回当前在屏障处等待的参与者数目。
 int		getParties(); // 返回要求启动此 barrier 的参与者数目。
 boolean	isBroken(); // 查询此屏障是否处于损坏状态。
 void		reset(); // 将屏障重置为其初始状态。
```
- 等待其他任务对齐，阻塞N个线程时所有线程被唤醒继续
- 适用于一组线程相互等待的场景
- 计数器可以复用，减到0会重置
## 并发集合类Collections
### CopyOnWriteArrayList
### ConcurrentMap
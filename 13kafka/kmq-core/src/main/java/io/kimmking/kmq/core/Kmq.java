package io.kimmking.kmq.core;

import lombok.SneakyThrows;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class Kmq {

    public Kmq(String topic, int capacity) {
        this.topic = topic;
        this.capacity = capacity;
        //this.queue = new LinkedBlockingQueue(capacity);
        this.queue = new KmqQueue();
    }

    private String topic;

    private int capacity;

    //private LinkedBlockingQueue<KmqMessage> queue;
    private KmqQueue queue;


    public boolean send(KmqMessage message) {
        return queue.put(message);
    }

    public KmqMessage poll() {
        return queue.get(topic);
    }

    //@SneakyThrows
    //public KmqMessage poll(long timeout) {
    //    return queue.put(timeout, TimeUnit.MILLISECONDS);
    //}

}

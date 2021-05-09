package com.catcher.jvm;

import java.io.*;
import java.lang.reflect.Method;

public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception{
//        Object object = new HelloClassLoader().loadClass("Hello").newInstance();
        Class<?> clazz = new HelloClassLoader().loadClass("Hello");
        Object object = clazz.newInstance();
        Method method = clazz.getMethod("hello");
        method.invoke(object);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        File file = new File("/Users/wyf/Desktop/java_adv/homework/01jvm/jvm/src/main/resources/Hello.xlass");
        InputStream input = null;
        try{
//           input = new FileInputStream(file);
           input = this.getClass().getClassLoader().getResourceAsStream(name + ".xlass");
           int length = input.available();
           byte[] bytes = new byte[length];
           input.read(bytes);
           byte[] output = decode(bytes);
           return defineClass(name, output, 0, output.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ClassNotFoundException(name, e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ClassNotFoundException(name, e);
        }finally {
            if(null != input)
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new ClassNotFoundException(name, e);
                }
        }
    }

    //decode x = 255 - x
    private byte[] decode(byte[] input){
        byte[] outPut = new byte[input.length];
        for(int i = 0; i < input.length; i++){
            outPut[i] = (byte)(255 - input[i]);
        }
        return outPut;
    }
}
package com.catcher.jvm;

public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception{
        new HelloClassLoader().findClass("jvm.Hello").newInstance();
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
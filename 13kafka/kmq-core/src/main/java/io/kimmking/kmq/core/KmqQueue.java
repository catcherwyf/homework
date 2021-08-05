package io.kimmking.kmq.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class KmqQueue {


    private Map<String, AtomicInteger> offset = new HashMap<>();

    private int writeIndex = 0;

    private List<KmqMessage> queue = new ArrayList<>();

    public boolean put(KmqMessage message){
        try {
            queue.add(message);
            writeIndex++;
        }catch (OutOfMemoryError error){
            error.toString();
            return false;
        }
        return true;
    }

    public KmqMessage get(String topic){
        int index = offset.getOrDefault(topic, new AtomicInteger(-1)).incrementAndGet();
        if (writeIndex == 0 || index >= queue.size()){
            return null;
        }
        return queue.get(index);
    }


    public boolean isEmpty() {
        return writeIndex == 0 || writeIndex >= queue.size();
    }

    public int size() {
        return writeIndex;
    }
}

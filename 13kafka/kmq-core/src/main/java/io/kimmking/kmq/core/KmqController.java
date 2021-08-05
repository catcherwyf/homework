package io.kimmking.kmq.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KmqController {

    @Autowired
    private Kmq kmq;


    @PostMapping("/send")
    public boolean send(@RequestBody KmqMessage message){
        return kmq.send(message);
    }

    @PostMapping("/poll")
    public KmqMessage poll(@RequestParam String topic){
        return kmq.poll(topic);
    }
}

package com.catcher.kafkademo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class Producer {
    public static KafkaProducer<String, String> createProducer(String servers) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", servers);
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return new KafkaProducer<String, String>(properties);
    }

    public static void send(KafkaProducer<String, String> producer, String topic, String message) {
        producer.send(new ProducerRecord<String, String>(topic, message));
    }
}

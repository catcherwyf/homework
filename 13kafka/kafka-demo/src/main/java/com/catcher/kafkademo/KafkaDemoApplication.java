package com.catcher.kafkademo;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication {

	@Autowired
	private static Producer producer;

	@Autowired
	private static Consumer consumer;

	public static void main(String[] args) {
		//SpringApplication.run(KafkaDemoApplication.class, args);
		String servers = "localhost:9001,localhost:9002,localhost:9003";
		String topic = "kafka-topic";
		String message = "kafka-demo-message";

		KafkaProducer<String, String> kafkaProducer = producer.createProducer(servers);
		producer.send(kafkaProducer, topic, message);

		KafkaConsumer<String, String> kafkaConsumer = consumer.createConsumer(servers, topic);
		consumer.readMessage(kafkaConsumer, 100);
	}

}

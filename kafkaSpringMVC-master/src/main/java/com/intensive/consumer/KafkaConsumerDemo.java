package com.intensive.consumer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.context.annotation.Bean;

public class KafkaConsumerDemo {

	private Properties properties;

	public KafkaConsumerDemo(Properties properties) {
		super();
		this.properties = properties;
	}
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String receive(){
		
		KafkaConsumer<String,String> consumer = new KafkaConsumer<String,String>(properties);
		consumer.subscribe(Arrays.asList(properties.getProperty("topic")));
		
		String msg = "";
		while(true){
			ConsumerRecords<String,String> consumerRecords = consumer.poll(100);
			for(ConsumerRecord<String, String> consumerRecord:consumerRecords){
				msg += consumerRecord.value();
			}
			consumer.close();
			return msg;
		}
	}
	
}

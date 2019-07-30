package org.vijay.activemq;

import org.vijay.activemq.consumer.HelloWorldConsumer;
import org.vijay.activemq.producer.ActiveMQProducer;

public class ActiveMqApplication {

	public static void main(String[] args) {

		HelloWorldConsumer consumer = new HelloWorldConsumer();
		consumer.run();

		@SuppressWarnings("unused")
		ActiveMQProducer producer = new ActiveMQProducer();
		producer.run();
	}
}
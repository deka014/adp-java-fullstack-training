package com.deep.learningSpring;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("student"));
//			System.out.println(context.getBean(Batch.class));
			System.out.println(context.getBean("studentParams"));
			System.out.println(context.getBean("studentAuto"));
	}

}
 
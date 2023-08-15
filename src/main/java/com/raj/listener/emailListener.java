package com.raj.listener;

import org.apache.naming.factory.TransactionFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.raj.Event.transactionFailureEvent;

@Component
public class emailListener {
	@Async
	@EventListener
	@Order(1)
	public void sendEmail(transactionFailureEvent event) {
		System.out.println("email listener:--> inside the start");
		try {
			Thread.sleep(10000);
			System.out.println("sending email..,"+"\n hi  "+event.getName()+""
					+ "your transaction amount  failed with amount  "+event.getAmount());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("email listener:--> inside the end");
		
	}
//	@EventListener
//	public void sendEmail(ContextRefreshedEvent event) {
//		System.out.println("email listener:--> inside the start");
//		try {
//			Thread.sleep(10000);
//			System.out.println("sending email..,"+"\n hi  "+event.getName()+""
//					+ "your transaction amount  failed with amount  "+event.getAmount());
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("email listener:--> inside the end");
//		
	
}
 
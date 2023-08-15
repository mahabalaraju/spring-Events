package com.raj.listener;

import org.apache.naming.factory.TransactionFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.raj.Event.transactionFailureEvent;

@Component
public class faxlistener {
@Async	
@EventListener
	public void sendEmail(transactionFailureEvent event) {
		System.out.println("fax listener:--> inside the start");
		try {
			Thread.sleep(13000);
			System.out.println("sending fax..,"+"\n hi  "+event.getName()+""
					+ "your transaction amount  failed with amount  "+event.getAmount());
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("fax listener:--> inside the end");
		
	}
	
}
 
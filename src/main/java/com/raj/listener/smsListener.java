package com.raj.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.raj.Event.transactionFailureEvent;
@Component
public class smsListener {
	
	@EventListener
public void sendsms(transactionFailureEvent event) {
	System.out.println("sending sms"+"\n hi  "+event.getName()+""
			+ "your transaction amount failed with amount  "+event.getAmount());
	
}
}
 
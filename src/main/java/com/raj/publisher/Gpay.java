package com.raj.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.raj.Event.transactionFailureEvent;

@Component
public class Gpay {
	@Autowired
	private ApplicationEventPublisher eventpublisher;

	public int sendmoney(String name, double money, boolean condition) {

		try {
			if (condition) {
				throw new RuntimeException("transaction failed..,");
			}
			System.out.println("hi " + name);
			System.out.println("sending money" + money + " successful");
			return 1;

		} catch (Exception e) {
            eventpublisher.publishEvent(new transactionFailureEvent(name, money) );
		     e.printStackTrace();
		}
		return 0;
	}
}

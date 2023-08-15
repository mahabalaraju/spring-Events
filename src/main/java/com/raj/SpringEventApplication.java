package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import com.raj.publisher.Gpay;
//import com.raj.publisher.GpayTest;

@SpringBootApplication

public class SpringEventApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringEventApplication.class, args);
	
		Gpay money=context.getBean(Gpay.class);
    //context.refresh();
		money.sendmoney("mahabala ",122322.23, true);
	//	context.stop();
	}
	@Bean("ApplicationEventMulticaster")
	public ApplicationEventMulticaster makeitasynchornous() {
		SimpleApplicationEventMulticaster applicationeventmulticaster=new SimpleApplicationEventMulticaster();
		applicationeventmulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return applicationeventmulticaster;
	}

}

package com.raj.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class transactionFailureEvent {
private String name;
private double amount;
public transactionFailureEvent(String name, double amount) {
	super();
	this.name = name;
	this.amount = amount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
}

package com.smn.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("flipkart")
public class Flipkart {

	@Resource(name = "blueDart")
	private Courier courier;
	
	public String Shopping(String items[]){
		
		int orderId = 0;
		
		//generate orderId
		orderId = new Random().nextInt();
		//deliver products
		
		System.out.println(courier.deliver(orderId));
		return Arrays.toString(items) + " are delivered ";
	}
}

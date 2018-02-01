package com.smn.beans;

import javax.inject.Named;

@Named("blueDart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int orderId) {
		 
		return "Blue dart delivering order with order id :"+orderId;
	}

}

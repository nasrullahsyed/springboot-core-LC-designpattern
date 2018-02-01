package com.smn.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(int orderId) {
		 
		return "DTDC : delivering order with order id : "+orderId;
	}

}

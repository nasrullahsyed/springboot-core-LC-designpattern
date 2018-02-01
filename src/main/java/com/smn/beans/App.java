package com.smn.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.smn.beans")
public class App {

	public static void main(String[] args) {
		 ApplicationContext ctx = null;
		 Flipkart flipkart =null;
		 
		 // getBean
		 ctx = SpringApplication.run(App.class, args);
		 flipkart = ctx.getBean("flipkart",Flipkart.class);
		 System.out.println(flipkart.Shopping(new String[]{"Shirt"," Pant"}));

	}

}

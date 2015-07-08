package com.acme.order.application;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpringXmlBasedApplication {

	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"spring.xml"});

	}
}

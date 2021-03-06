package com.acme.order.delivery.strategy;

import org.springframework.stereotype.Service;

import com.acme.order.Customer;
import com.acme.order.pizza.PizzaType;

@Service
public class PizzaTypeDeliveryTimeStrategy implements DeliveryTimeStrategy {

	@Override
	public int provideDeliveryMinutesOffset(Customer customer, PizzaType pizzaType) {
		return (pizzaType == PizzaType.BIG || pizzaType == PizzaType.LARGE) ? 120 : 60;
	}

}

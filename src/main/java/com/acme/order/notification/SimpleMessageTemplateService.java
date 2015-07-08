package com.acme.order.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageTemplateService implements MessageTemplateService {

	private final DeliveryTemplate deliveryTemplate;
	private final OrderCancelledTemplate cancelDeliveryTemplate;

	public SimpleMessageTemplateService() {
		this.deliveryTemplate = new DeliveryTemplate();
		this.cancelDeliveryTemplate = new OrderCancelledTemplate();
	}
	
	@Autowired
	public SimpleMessageTemplateService(DeliveryTemplate deliveryTemplate, OrderCancelledTemplate orderCancelledTemplate) {
		this.deliveryTemplate = deliveryTemplate;
		this.cancelDeliveryTemplate = orderCancelledTemplate;
	}

	@Override
	public DeliveryTemplate getDeliveryTemplate() {
		return deliveryTemplate;
	}

	@Override
	public OrderCancelledTemplate getCancelTemplate() {
		return cancelDeliveryTemplate;
	}

}

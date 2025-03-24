package com.samspring.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var heavyResource = (HeavyResource) context.getBean("heavyResource");
//
//		var orderService = context.getBean(OrderService.class);
//
//		var orderService2 = context.getBean(OrderService.class);
//		orderService.placeOrder();

//		var notificationManager = context.getBean(NotificationManager.class);
//		notificationManager.sendNotification("Hello World");

//		context.close();

		var userService = (UserService) context.getBean("userService");
		userService.registerUser(new User(1L, "sam", "sam@sam.com", "1234567wqer"));
		userService.registerUser(new User(1L, "sam", "sam@sam.com", "1234567wqer"));
	}

}

package com.samspring.store;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("This is an SMS: " + message);
    }
}

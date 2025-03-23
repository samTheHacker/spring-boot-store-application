package com.samspring.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("This is an email: " + message);
    }
}

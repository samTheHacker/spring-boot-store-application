package com.samspring.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("This is an email: " + message);
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("host: " + host);
        System.out.println("port: " + port);
    }
}

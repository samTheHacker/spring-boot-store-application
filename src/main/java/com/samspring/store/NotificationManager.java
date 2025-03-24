package com.samspring.store;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(String message, Long userId) {
        notificationService.send(message, userId.toString());
    }
}

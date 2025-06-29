package com.example.practice;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotification(String message, String recipientEmail) {
        notificationService.send(message, recipientEmail);
    }

}

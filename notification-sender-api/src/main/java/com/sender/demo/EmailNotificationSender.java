package com.sender.demo;

import com.sender.demo.services.NotificationSenderService;

/**
 * @author AKOURTIM Ahmed on 2019-08-11
 */
public class EmailNotificationSender implements NotificationSenderService {
    @Override
    public void sendNotification(String contactInfo, SenderTemplate template) {



         System.out.print("Email notification");



 }

}

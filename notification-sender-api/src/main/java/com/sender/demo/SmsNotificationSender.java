package com.sender.demo;

import com.sender.demo.services.NotificationSenderService;

/**
 * @author AKOURTIM Ahmed on 2019-08-11
 */
public class SmsNotificationSender implements NotificationSenderService {
    @Override
    public void sendSmsNotification(String contactInfo, SenderTemplate template) {


            try {
                if ("SMS".equals(template)) {

                    System.out.print("SMS notification");
                } else throw new SenderException();

            } catch(SenderException Exception){}


    }
}

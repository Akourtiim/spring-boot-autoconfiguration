package com.sender.demo;

import com.sender.demo.services.NotificationSenderService;
import org.springframework.stereotype.Service;

/**
 * @author AKOURTIM Ahmed on 2019-08-11
 */
@Service
public class SmsNotificationSender implements NotificationSenderService {
    @Override
    public void sendNotification(String contactInfo, SenderTemplate template) {


            try {
                if ("SMS".equals(template.name())) {

                    System.out.print("SMS notification");
                } else throw new SenderException();

            } catch(SenderException Exception){}


    }
}

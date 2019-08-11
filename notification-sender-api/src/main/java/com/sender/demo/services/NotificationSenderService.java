package com.sender.demo.services;

import com.sender.demo.SenderTemplate;
import org.springframework.stereotype.Service;

/**
 * @author AKOURTIM Ahmed on 2019-08-11
 */
@Service
public interface NotificationSenderService {
    void sendSmsNotification(String contactInfo, SenderTemplate template);
}

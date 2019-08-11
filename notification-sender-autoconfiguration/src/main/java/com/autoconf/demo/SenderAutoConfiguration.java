package com.autoconf.demo;

import com.sender.demo.EmailNotificationSender;
import com.sender.demo.SenderTemplate;
import com.sender.demo.services.NotificationSenderService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AKOURTIM Ahmed on 2019-08-11
 */


@Configuration
@ConditionalOnClass(NotificationSenderService.class)
public class SenderAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public NotificationSenderService senderService(){
        return new EmailNotificationSender();
    }
}

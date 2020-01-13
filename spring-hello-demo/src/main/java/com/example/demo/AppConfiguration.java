/**
 * 
 */
package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author puneet
 *
 */
@Configuration
@ComponentScan("com.example.demo")
public class AppConfiguration {

    @Bean(name="emailService")
    public MessageService emailService(){
         return new EmailService();
    }
 
   
 
    @Bean(name="smsService")
    public MessageService smsService(){
        return new SMSService();
    }
 
    /*@Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(emailService());
    }*/
   /* @Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl();
    }*/
    
    
}
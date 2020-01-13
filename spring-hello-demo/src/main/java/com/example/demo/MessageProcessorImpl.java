/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author puneet
 *
 */
public class MessageProcessorImpl implements MessageProcessor {

	//@Value("${db.url}")
	//private String url;
	
	@Autowired
	 @Qualifier("emailService")
	private MessageService messageService;
	
	/*public MessageProcessorImpl(MessageService emailService) {
		// TODO Auto-generated constructor stub
		this.messageService=emailService;
	}*/
	
	/* @Autowired
	    public MessageProcessorImpl(@Qualifier("EmailService") MessageService messageService) {
	        this.messageService = messageService;
	    }*/
	// setter based DI
   /* @Autowired
    @Qualifier("emailService")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }*/
 
    // constructor based DI
    /*@Autowired
    public MessageProcessorImpl(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }*/
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
    
    
}

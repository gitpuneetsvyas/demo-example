package com.example.demo;

public class SMSService implements MessageService
{

	@Override
	public void sendMsg(String message) {
		 System.out.println(message);
		
	}

}

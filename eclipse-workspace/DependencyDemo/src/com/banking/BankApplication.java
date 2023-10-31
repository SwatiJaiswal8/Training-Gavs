package com.banking;

import com.messaging.EmailService;
import com.messaging.MessagingClient;
import com.messaging.SMSService;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="Account Created";
		MessagingClient client=new MessagingClient(new EmailService());
		client.sendNotification(message);
		
	}

}

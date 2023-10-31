package com.messaging;

public class EmailService implements MessageService{

	@Override
	public String sendMessage(String msg) {
		// TODO Auto-generated method stub
		return "Email sent " +msg;
	}
	

}

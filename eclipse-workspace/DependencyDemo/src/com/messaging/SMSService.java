package com.messaging;

public class SMSService implements MessageService {

	@Override
	public String sendMessage(String msg) {
		// TODO Auto-generated method stub
		return "SMS Send " +msg;
	}

}

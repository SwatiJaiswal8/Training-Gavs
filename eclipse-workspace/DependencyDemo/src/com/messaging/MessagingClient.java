package com.messaging;

public class MessagingClient {
	MessageService messaging;
	public MessagingClient(MessageService messaging) {
		this.messaging=messaging;
	}
	public void sendNotification(String msg) {
	//	messaging=new EmailService();
		System.out.println( messaging.sendMessage(msg));
	}
}

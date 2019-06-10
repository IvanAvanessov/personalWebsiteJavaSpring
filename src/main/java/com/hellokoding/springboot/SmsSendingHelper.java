package com.hellokoding.springboot;

import java.io.IOException;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.messages.TextMessage;

public class SmsSendingHelper {
  
    public static void sendSMS(String text) { 
    	NexmoClient client = NexmoClient.builder()
    	        .apiKey("917c8e66")
    	        .apiSecret("72a1ChzrVwmGWrGK")
    	        .build();
    	String messageText = text;
    	TextMessage message = new TextMessage("avanessovru", "447555015501", messageText);
    	try {
			client.getSmsClient().submitMessage(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NexmoClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    } 
}

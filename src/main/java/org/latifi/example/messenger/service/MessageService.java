package org.latifi.example.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.latifi.example.messenger.model.Message;

public class MessageService {
	
	Map messages = new HashMap<>();
	
	public MessageService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello world!", "Morteza");		
		Message m2 = new Message(1L, "Hello Jersey!", "ALi");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
	public Message getMessage(long id) {
		
	}
	
	public Message addMessage(Message message) {
		
	}
	
	public Message updateMessage(Message message) {
		
	}
	
	public Message removeMessage(long id) {
		
	}
	
}

package org.latifi.example.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.latifi.example.messenger.model.Message;
import org.latifi.example.messenger.service.MessageService;


@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessagers() {
		return messageService.getAllMessages();
	}

}

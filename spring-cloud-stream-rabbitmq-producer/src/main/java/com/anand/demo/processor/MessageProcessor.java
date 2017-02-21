package com.anand.demo.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class MessageProcessor {

	@Autowired
	private Source source;
	
	public void publishMessage(String payload) {
		GenericMessage<String> genericMessage = new GenericMessage<String>(payload);
		this.source.output().send(genericMessage);
	}
	
}

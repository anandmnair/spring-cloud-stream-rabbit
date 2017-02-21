package com.anand.demo.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class MessageProcessor {

	@StreamListener(Sink.INPUT)
    public void process(String message) {
        System.out.println(message);
    }
	
}

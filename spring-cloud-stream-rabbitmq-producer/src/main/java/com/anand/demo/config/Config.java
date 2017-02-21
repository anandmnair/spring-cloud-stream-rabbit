package com.anand.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anand.demo.processor.MessageProcessor;

@Configuration
public class Config {

	@Bean
	public MessageProcessor messageProcessor() {
		return new MessageProcessor();
	}
	
	
}

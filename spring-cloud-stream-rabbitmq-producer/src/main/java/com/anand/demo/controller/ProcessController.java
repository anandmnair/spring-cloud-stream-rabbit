package com.anand.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anand.demo.processor.MessageProcessor;

@RestController
public class ProcessController {

	@Autowired
	private MessageProcessor messageProcessor;
	
	public @ResponseBody String launchProcess(@RequestBody String message) {
		
		messageProcessor.publishMessage(message);
		
		return "success";
	}
}

package com.anand.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anand.demo.processor.MessageProcessor;

@RestController
public class ProcessController {

	@Autowired
	private MessageProcessor messageProcessor;
	
	@RequestMapping("send")
	public @ResponseBody String launchProcess() {
		
		String message = "Dummy Message " + new Date().toString();
		messageProcessor.publishMessage(message);
		
		return "success";
	}
}

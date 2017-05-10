package com.newbie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newbie.service.impl.NewbieService2Impl;
import com.newbie.service.impl.NewbieServiceImpl;

@RestController
public class Newbiecontroller {

	/* NewbieService */
	@Autowired
	private NewbieServiceImpl newbieService;

	@Autowired
	private NewbieService2Impl newbieService2;

	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getHelloMessage() {
		return "Hello World";
	}

	// 省略形
	/*@GetMapping(value="/message")
	public String getHelloMessage() {
		return "Hello World";
	}*/

	@RequestMapping(value="/message1", method=RequestMethod.GET)
	public String getMessage1() {
		return "Growth x Pertners";
	}

	@RequestMapping(value="/echo", method=RequestMethod.GET)
	public String getEchoMessage(@RequestParam(name="mes", required=true)String message) {
		return message;
	}

	@RequestMapping(value="/echo1", method=RequestMethod.GET)
	public String getEchoMessage1(@RequestParam(name="key", required=true)String message) {
		String answer = newbieService.getMessage(message);
		return answer;
	}

	@RequestMapping(value="/echo2", method=RequestMethod.GET)
	public String getEchoMessage2(@RequestParam(name="key", required=true)String message) {
		String answer = newbieService2.getMessage(message);
		return answer;
	}
}

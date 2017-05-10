package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService2;

@Service
public class NewbieService2Impl implements NewbieService2 {

	@Override
	public String getMessage(String message) {
		return "今日の天気は : " + message;
	}

}

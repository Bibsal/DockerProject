package com.bishal.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


@RestController
public class TestController {
	
	@GetMapping("/test")
	public String printString() {
		return "Docker File Executed";
	}
	
}

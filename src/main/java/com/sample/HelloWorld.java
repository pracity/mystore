package com.sample;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {
	@RequestMapping("/greeting")
    public Greeting greeting(Model model) {
		return new Greeting(1, "abc"); 
    }
}

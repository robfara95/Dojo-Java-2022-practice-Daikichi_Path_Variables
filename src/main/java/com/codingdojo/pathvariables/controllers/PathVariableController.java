package com.codingdojo.pathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class PathVariableController {
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String displayCity(@PathVariable String city) {
		return String.format("Congratulations! You will soon travel to %s!", city);
	}
	
	@RequestMapping("/lotto/{number}")
	public String displayLotto(@PathVariable int number) {
		if (number % 2 == 0) {
			return String.format("You will take a grand journey in the near future, but will be weary of tempting offers.");
		} else {
			return String.format("You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends");
		}
	}

}

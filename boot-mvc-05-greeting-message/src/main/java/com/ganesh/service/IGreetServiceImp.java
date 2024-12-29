package com.ganesh.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("greet")
public class IGreetServiceImp implements IGreetService {

	@Override
	public String greeting() {
	    LocalDateTime date = LocalDateTime.now();
	    int time = date.getHour();

	    if (time >= 18 || time < 6) // 6 PM to 6 AM
	        return "Good Night";
	    else if (time >= 6 && time < 12) // 6 AM to 12 PM
	        return "Good Morning";
	    else if (time >= 12 && time < 18) // 12 PM to 6 PM
	        return "Good Afternoon";
	    else
	        return "Good Evening";
	}


}

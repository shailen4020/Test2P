package com.company;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@RequestMapping("add")
	public String hello(@RequestParam("t1") int i,@RequestParam("t2") int j )
	{
		
		return (i+j)+"";		
	}
	
}

package com.development.development;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class DevelopmentController {

	@RequestMapping("/teste")
	public String home(){
		return "teste.html";
	}

	
	@RequestMapping("/")
	public String index(){
		return "index.html";
	}

}

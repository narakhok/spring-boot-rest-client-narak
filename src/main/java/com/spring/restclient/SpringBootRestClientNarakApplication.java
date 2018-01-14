package com.spring.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class SpringBootRestClientNarakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestClientNarakApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/create")
	public String create(){
		return "create";
	}
}

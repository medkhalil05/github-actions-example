package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		// Redirect to the static professional welcome page
		return "redirect:/welcome.html";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}

package com.example.docker.SpringBDockerImageCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBDockerImageCicdApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to JAVA Spring CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBDockerImageCicdApplication.class, args);
	}

}

//	git init
//	git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/archanasantoshwhatkar/SpringBDockerImageCICD.git
//		git push -u origin main
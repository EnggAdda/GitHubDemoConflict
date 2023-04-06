package com.example.githubdemoconflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubDemoConflictApplication {

    @GetMapping("/hello")
    public String hello(){
        return  "Hi";
    }
    public static void main(String[] args) {
        SpringApplication.run(GitHubDemoConflictApplication.class, args);
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaclientApplication implements GreetingController {

    @Autowired
    @Lazy
    private EurekaclientApplication eurekaclientApplication;
 
    @Value("${spring.application.name}")
    private String appName;
    
 
    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }
 
    @Override
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaclientApplication.getApplication(appName));
    }
	

	private Object getApplication(String appName2) {
		// TODO Auto-generated method stub
		return appName2;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	
	
}

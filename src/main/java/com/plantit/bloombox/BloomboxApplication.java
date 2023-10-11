package com.plantit.bloombox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.plantit.bloombox.components.WebController;

@SpringBootApplication
public class BloomboxApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BloomboxApplication.class, args);
		WebController controller = context.getBean(WebController.class);
		System.out.println(controller.retunValue())
		
		;
		
		
		System.out.print("ASdasds");
	
	}
	
	  

}

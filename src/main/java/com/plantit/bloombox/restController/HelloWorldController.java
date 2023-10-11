package com.plantit.bloombox.restController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantit.bloombox.beans.HelloWorld;

@RestController
public class HelloWorldController {

	@RequestMapping("/courses")
	public List<Courses> retrieveAllCourses(){
		return Arrays.asList(
				new Courses(1,"Learn AWS" ,"$34"),	
				new Courses(2,"Learn AWS1" ,"$3"),
				new Courses(3,"Learn AWS2" ,"$31"),
				new Courses(4,"Learn AWS3" ,"$66"));
				
	}	
	
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
	
	@RequestMapping(path ="/home/{name}")
    public HelloWorld homeBean(@PathVariable String name){
        return new HelloWorld("good morning" + " " + name);
    }

}

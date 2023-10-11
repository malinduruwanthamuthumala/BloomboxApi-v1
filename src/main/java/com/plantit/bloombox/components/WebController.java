package com.plantit.bloombox.components;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
 
	@Autowired
	private BusinessService bs;
	
	public long retunValue() {
		return bs.calculateSum();
	}
	
	
	
}

@Component
class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return  data.stream().reduce(Integer::sum).get();
	}
	
	
}

@Component
class DataService {
	public List<Integer> getData(){
		return Arrays.asList(10,20,30,40,50);
	}
}

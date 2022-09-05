package com.example.demo;
import com.example.demo.dao.Username;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Username;

@RestController
public class DataController {
	
	@Autowired
	private ServiceTopic  serviceTopic;
	
	@RequestMapping("/hello")
	public String sayHi(String[] args)
	{
		
		return "Hi";
		
	}
	
	@RequestMapping("/topics")
	public List<Username> getTopics()
	{
		return serviceTopic.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Username> getTopic(@PathVariable int id) {
		return serviceTopic.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/topics")
	public void addTopic(@RequestBody Username topic)
	{
		serviceTopic.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{id}")
	public void updateTopic(@RequestBody Username topic, @PathVariable int id)
	{
		serviceTopic.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{id}")
	public void deleteTopic( @PathVariable int id)
	{
		serviceTopic.deleteTopic(id);
	}

}

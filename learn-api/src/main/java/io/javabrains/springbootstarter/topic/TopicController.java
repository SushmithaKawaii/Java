package io.javabrains.springbootstarter.topic;
import io.javabrains.springbootstarter.topic.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics(); 
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return  topicService.getTopic(id);	
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public List<?> addTopic(@RequestBody Topic topic) {
		List<Topic> topics = new ArrayList<Topic>();
		topics = topicService.addTopic(topic);
		return  topics;
	}
	
	@PutMapping(value="/topics/update/{id}")
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		topicService.updateTopic(id,topic);
		return topic;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		return id;
	}
	
	
	
	
}
 
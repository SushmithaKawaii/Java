package io.javabrains.springbootstarter.topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAlllearns() {
		return topicService.getAllTopics(); 
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopics(@PathVariable String id) {
		return  topicService.getTopic(id);	
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public Topic addTopics(@RequestBody Topic topics) {
		return  topicService.addTopic(topics);
	}
	
	@PutMapping(value="/topics/update/{id}")
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		topicService.updateTopic(id, topic);
		return topic;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		return id;
	}
	
	
	
	
}
 
package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
		
	//private  List<Topic> topics = new ArrayList<>(Arrays.asList(
		//			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			//		new Topic("java", "Core Java", "Core Java Description"),
				//	new Topic("javascript", "Javascript", "Javascript Description")
					//));
	
	public List<Topic> getAllTopics() {
		//return this.topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().toLowerCase().equals(id.toLowerCase())).findFirst().get();
	    return topicRepository.findById(id).get();
	}

	public Topic addTopic(Topic topic) {
		topicRepository.save(topic);
		return topic;
		
	}

	public void updateTopic(String id, Topic topic) {
		//for(int i = 0; i < topics.size(); i++) {
			//Topic t = topics.get(i);
			//if (t.getId().equals(id)) {
				//this.topics.set(i,  topic);
				//return;
		topicRepository.save(topic);
			}
		
		
		
	

	public void deleteTopic(String id) {
		//this.topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}
	
	

}

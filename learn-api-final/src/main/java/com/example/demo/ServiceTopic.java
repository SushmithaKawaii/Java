package com.example.demo;
import com.example.demo.dao.Username;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTopic {
	
	@Autowired
	private UserRepository userRepository;
	
	private List<Username> topics = new ArrayList<>( Arrays.asList(
			new Username(44,"shridhara","bengaluru","Python Developer"),
			new Username(45,"shridhara","tumkur","JavaScript Developer")
			));
	
	public List<Username> getAllTopics(){
		
		//return topics;
		List<Username> topics = new ArrayList<>();
		userRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Username> getTopic(int id)
	{
		//return topics.stream().filter(t->t.getId()==id).findFirst().get();
		return userRepository.findById(id);
	}

	public void addTopic(Username topic) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		userRepository.save(topic);
		
	}

	public void updateTopic(int id, Username topic) {
		// TODO Auto-generated method stub
		/*for(int i = 0; i< topics.size(); i++)
		{
			Username t = topics.get(i);
			if(t.getId()==id)
			{
				topics.set(i, topic);
				return;
			}
		}*/
		userRepository.save(topic);
		
	}
	
	public void deleteTopic(int id)
	{
		//topics.removeIf(t->t.getId()==id);
		userRepository.deleteById(id);
	}

}

package io.javabrains.springbootstarter.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
		
	//private  List<Topic> topics = new ArrayList<>(Arrays.asList(
		//			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			//		new Topic("java", "Core Java", "Core Java Description"),
				//	new Topic("javascript", "Javascript", "Javascript Description")
					//));
	
	public List<Course> getAllcourses(String topicId) {
		//return this.topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().toLowerCase().equals(id.toLowerCase())).findFirst().get();
	    return courseRepository.findById(id).get();
	}

	public void addCourse(Course  course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		//for(int i = 0; i < topics.size(); i++) {
			//Topic t = topics.get(i);
			//if (t.getId().equals(id)) {
				//this.topics.set(i,  topic);
				//return;
		courseRepository.save(course);
			}
		
	public void deleteCourse(String id) {
		//this.topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
		
	}
	
	

}

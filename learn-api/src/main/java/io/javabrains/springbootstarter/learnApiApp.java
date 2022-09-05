package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.springbootstarter.hello.HelloController;

import io.javabrains.springbootstarter.topic.Topic;
import io.javabrains.springbootstarter.topic.TopicController;
import io.javabrains.springbootstarter.topic.TopicService;



@SpringBootApplication
//@ComponentScan(basePackageClasses = {HelloController.class,TopicController.class,Topic.class,TopicService.class})
public class learnApiApp {

	public static void main(String[] args) {
		SpringApplication.run(learnApiApp.class, args);
		
		

	}

}

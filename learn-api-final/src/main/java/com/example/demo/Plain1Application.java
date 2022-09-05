package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Username;
import com.example.demo.dao.Username;

@SpringBootApplication
public class Plain1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Plain1Application.class, args);
		
		ApplicationContext context = SpringApplication.run(Plain1Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class, args);
		
		 
		
		//Create User
		
		/*Username user = new Username();
		//user.setId(03);
		user.setName("Shridhara");
		user.setCity("bengaluru");
		user.setStatus("I am Python Programmer");*/
		
		
		
		//Create and update
		//Username user1 = userRepository.save((Username)hello.get(0));
		
		//List<Username> user1 = (List<Username>) userRepository.saveAll(hello);
		
		//read
		//user1.forEach((n) -> System.out.println(userRepository.findById(n.getId())));
		
		
		//Update User
		//Optional<Username> optional = userRepository.findById(03);
		
		
		//delete
		//userRepository.deleteById(user.getId());
			
		//System.out.println("Inserted Values " + user);
		
		//printHmm hmm = new printHmm();
		//System.out.println(hmm.printOut()+hmm.name);
				
		
	}
	

}

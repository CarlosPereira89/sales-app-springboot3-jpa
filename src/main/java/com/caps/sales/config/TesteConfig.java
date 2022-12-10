package com.caps.sales.config;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.caps.sales.model.User;
import com.caps.sales.repository.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Carlos", "carlos@gmail.com", "999999999", "saisiaisa");
		User u2 = new User(null, "Alexia", "alexia@gmail.com", "325285822", "lkjjdhddd");
		User u3 = new User(null, "Danilo", "danilo@gmail.com", "323276768", "opdajdjaa");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}
	
	
	
}

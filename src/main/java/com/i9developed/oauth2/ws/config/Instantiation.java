package com.i9developed.oauth2.ws.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.i9developed.oauth2.ws.domain.Role;
import com.i9developed.oauth2.ws.domain.User;
import com.i9developed.oauth2.ws.repositories.RoleRepository;
import com.i9developed.oauth2.ws.repositories.UserRepository;

@Configuration
@Profile("dev")
public class Instantiation implements CommandLineRunner  {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		roleRepository.deleteAll();
		
		Role roleAdmin = new Role("ROLE_ADMIN");
		Role roleUser = new Role("ROLE_USER");
		
		roleRepository.saveAll(Arrays.asList(roleAdmin,roleUser));
		
		
		
		User moises = new User("Moises","Rodrigues de souza","moises.souza@gmail.com");
		User maria = new User("Ana","Maria","ana.maria@gmail.com");
		 User joao = new User("João", "Souza", "joao@gmail.com");
		 User maria2 = new User("Maria", "Teixeira", "maria@gmail.com");
		 
		 moises.getRoles().addAll(Arrays.asList(roleAdmin,roleUser));
		 maria.getRoles().addAll(Arrays.asList(roleAdmin,roleUser));
		 
		 joao.getRoles().addAll(Arrays.asList(roleUser));
		 maria2.getRoles().addAll(Arrays.asList(roleUser));
		 
		userRepository.saveAll(Arrays.asList(moises,maria,maria2,joao));
	}

}

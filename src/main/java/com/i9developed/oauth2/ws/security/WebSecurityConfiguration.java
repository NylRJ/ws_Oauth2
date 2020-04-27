package com.i9developed.oauth2.ws.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	

	@Bean
	DaoAuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider provier = new DaoAuthenticationProvider();
		
		provier.setPasswordEncoder(bCryptPasswordEncoder());
		
		return provier;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		
		auth.authenticationProvider(authenticationProvider());
		
		
	}

}

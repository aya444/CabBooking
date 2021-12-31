package com.cab.booking.start;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cab.booking.service.FavAreaObserverManager;
import com.cab.booking.service.UserManager;
import com.cab.booking.service.UserPresistenceManager;
import com.cab.booking.service.impl.ArrayUserPresistenceImpl;
import com.cab.booking.service.impl.FavAreaManagerImpl;
import com.cab.booking.service.impl.UserManagerImpl;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "com.cab.booking")
public class CabBookingApplication {
	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplication.class, args);
	}
	
	@Bean
    public UserManager userManager() {
		return new UserManagerImpl();
	}
	
	@Bean
    public UserPresistenceManager presistence() {
		return new ArrayUserPresistenceImpl();
	}
}

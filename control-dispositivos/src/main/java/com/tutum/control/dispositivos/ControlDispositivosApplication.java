package com.tutum.control.dispositivos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ControlDispositivosApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(ControlDispositivosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] password = {"admin", 
							"IValenzuela", 
							"JDiaz", 
							"JGaytan", 
							"JRamirez", 
							"KGallegos", 
							"ALuna",
							"HLopez",
							"UReyes",
							"RUbillo",
							"RGonzalez"};
		
		for(int i = 0; i < password.length; i++) {
			String passwordBcrypt = passwordEncoder.encode(password[i]);
			System.out.println(passwordBcrypt);
		}
		
	}

}

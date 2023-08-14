package com.example.VaccineManagementSystem;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class VaccineManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineManagementSystemApplication.class, args);
	}

}

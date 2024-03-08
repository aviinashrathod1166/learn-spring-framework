package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Avinash";
	}

	@Bean
	public int age() {
		return 32;
	}

	@Bean
	public Person person() {
		var person = new Person("Sapana", 30);
		return person;

	}

	@Bean
	public Address address() {
		var address = new Address("Near Airport, Jalna Road ", "Sambhajinagar");
		return address;

	}

}

package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

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
		var person = new Person("Sapana", 30,new Address("Near Airport, Jalna Road ", "Sambhajinagar"));
		return person;

	}
	
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(),new Address("Pune-Banglore Highway ", "Pune"));
	}
	
	@Bean
	public Person person3Parameters(String name,int age, Address address2) {//name,age,address2
		return new Person(name, age,address());
	}

	@Bean(name="address2")
	public Address address() {
		var address = new Address("Near Airport, Jalna Road ", "Sambhajinagar");
		return address;

	}

}

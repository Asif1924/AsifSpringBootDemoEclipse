package com.example.alliconsulting.asifspringdemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alliconsulting.asifspringdemo.model.Person;
import com.example.alliconsulting.asifspringdemo.service.PersonService;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	private PersonService personService= null;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
}

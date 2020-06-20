package com.example.alliconsulting.asifspringdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.alliconsulting.asifspringdemo.dao.PersonDao;
import com.example.alliconsulting.asifspringdemo.model.Person;

@Service
public class PersonService {
	
	private PersonDao personDao = null;
	
	@Autowired
	public PersonService(@Qualifier("fakedao") PersonDao personDao) {
		this.personDao=personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.addPerson(person);
	}
}

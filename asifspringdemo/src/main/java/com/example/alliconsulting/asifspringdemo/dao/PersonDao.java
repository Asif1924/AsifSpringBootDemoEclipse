package com.example.alliconsulting.asifspringdemo.dao;

import java.util.UUID;

import com.example.alliconsulting.asifspringdemo.model.Person;

public interface PersonDao {
	int insertPerson(UUID id, Person person);
	default int addPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id,person);
	}
}

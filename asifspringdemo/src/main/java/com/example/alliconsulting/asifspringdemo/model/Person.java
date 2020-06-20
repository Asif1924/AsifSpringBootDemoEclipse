package com.example.alliconsulting.asifspringdemo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private UUID id = null;
	private String name = "";
	
	public Person(@JsonProperty("id") UUID id2, @JsonProperty("name") String name2) {
		id = id2;
		name = name2;
	}
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

package com.example.somewebapp.service;

import java.util.List;

import com.example.somewebapp.domain.Person;

// Interfejs biznesowy/ logika biznesowa
public interface PersonManager {
	
	public void addPerson(Person p);
	public List<Person> getAllPersons();
		
	public void deletePerson(int i);	
	public Person getPerson(int i);
	public void updatePerson(int i, Person p);
	
}

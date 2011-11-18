package com.example.somewebapp.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.somewebapp.domain.Person;

public class PersonManagerInMermory implements PersonManager {
	
	private static List<Person> db = new ArrayList<Person>();

	@Override
	public void addPerson(Person p) {
		Person nP = new Person(p.getName(), p.getYob());
		db.add(nP);
	}

	public List<Person> getAllPersons() {
		return db;
	}

	public void deletePerson(int i) {
		db.remove(i);		
	}

	public Person getPerson(int i){
		return db.get(i);
	}

	@Override
	public void updatePerson(int i, Person p) {
		db.set(i,  p);		
	}

}

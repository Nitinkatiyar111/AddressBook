package com.bridgelabz.service.serviceimpl;

import java.util.Comparator;

import com.bridgelabz.model.Person;


public class AddressBookZipComparator implements Comparator<Person> {

	public int compare(Person user1, Person user2) {
		return user1.getZip().compareTo(user2.getZip());
	}
}

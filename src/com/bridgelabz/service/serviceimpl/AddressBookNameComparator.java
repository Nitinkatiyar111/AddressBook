package com.bridgelabz.service.serviceimpl;

import java.util.Comparator;

import com.bridgelabz.model.Person;

public class AddressBookNameComparator implements Comparator<Person> {
	public int compare(Person user1, Person user2) {
		if(user1.getLastName().compareTo(user2.getLastName())!=0)
		{
		return user1.getLastName().compareTo(user2.getLastName());
		}
		return user1.getFirstName().compareTo(user2.getFirstName());
	}
}

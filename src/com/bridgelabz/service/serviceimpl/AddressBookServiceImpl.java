package com.bridgelabz.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;

import com.bridgelabz.model.Person;
import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.utility.InputUtility;

public class AddressBookServiceImpl implements AddressBookService{

	private ArrayList<Person> list = new ArrayList<>();
	
	@Override
	public void addNewPerson() {
        Person newUser = InputUtility.getInputForNewUser();
		list.add(newUser);
		display(list);
	}
	
	private void display(Collection<Person> list1) {
		for (Person model : list1) {
			System.out.println("First Name : "+model.getFirstName());
			System.out.println("Last Name : "+model.getLastName());
			System.out.println("City : "+model.getCity());
			System.out.println("State : "+model.getState());
			System.out.println("Zip : "+model.getZip());
			System.out.println("Phone Number : "+model.getPhoneNo());
			System.out.println();
		}
	}

}

package com.bridgelabz.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import com.bridgelabz.model.Person;
import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.ScannerUtils;

public class AddressBookServiceImpl implements AddressBookService{

	private ArrayList<Person> list = new ArrayList<>();
	private TreeSet<Person> sortedUsers;
	
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

	@Override
	public void editPerson() {
		Person editdata = InputUtility.getInputForEditUser();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().equalsIgnoreCase(editdata.getFirstName())
					&& list.get(i).getLastName().equalsIgnoreCase(editdata.getLastName())) {
				Person model = list.get(i);
				if (editdata.getCity() != null) {
					model.setCity(editdata.getCity());
				}
				if (editdata.getState() != null) {
					model.setState(editdata.getState());
				}
				if (editdata.getZip() != null) {
					model.setZip(editdata.getZip());
				}
				if (editdata.getPhoneNo() != null) {
					model.setPhoneNo(editdata.getPhoneNo());
				}
				list.set(i, model);
				display(list);
			}
		}
		
	}
	
	@Override
	public void deletePerson() {
		System.out.println("Enter the employee's first-name and last-name");
		String firstName = ScannerUtils.getString();
		String lastName = ScannerUtils.getString();
		boolean isDelete  = list.removeIf( 
				user -> user.getFirstName().equalsIgnoreCase(firstName)
						&& user.getLastName().equalsIgnoreCase(lastName));
		if(isDelete) {
			System.out.println("The Person "+firstName+" "+lastName+" Deleted from AddressBook");
		}
		else {
			System.out.println("Person Not present");
		}
		display(list);
	}
	
	@Override
	public void sortByName() {
		sortedUsers = new TreeSet<>(new AddressBookNameComparator());
		sortedUsers.addAll(list);
		display(sortedUsers);
	}

}

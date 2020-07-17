package com.bridgelabz.main;

import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.service.serviceimpl.AddressBookServiceImpl;
import com.bridgelabz.utility.ScannerUtils;

public class AddressBookManager {

	public static void main(String[] args)
	{
		System.out.println("Welcome to  AddressBook");
		AddressBookService addressBookService = new AddressBookServiceImpl();
		boolean flag = true;
		while (flag) {
			System.out.println("1:Add Person");
			System.out.println("Please enter the choice : ");
			int choice = ScannerUtils.getInt();
			switch (choice) {
			case 1:
				addressBookService.addNewPerson();
				break;
			default:
				flag = false;
			}
		}
	}
}

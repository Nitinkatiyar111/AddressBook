package com.bridgelabz.utility;

import com.bridgelabz.model.Person;

public class InputUtility {
	
	public static Person getInputForNewUser()
	{
		Person model = new Person();
		System.out.println("Enter the first name");
		model.setFirstName(ScannerUtils.getString());
		System.out.println("Enter the second name");
		model.setLastName(ScannerUtils.getString());
		System.out.println("Enter the city");
		model.setCity(ScannerUtils.getString());
		System.out.println("Enter the state");
		model.setState(ScannerUtils.getString());
		System.out.println("Enter the zip");
		model.setZip(ScannerUtils.getLong());
		System.out.println("Enter the phone number");
		model.setPhoneNo(ScannerUtils.getLong());
		return model;
	}

}

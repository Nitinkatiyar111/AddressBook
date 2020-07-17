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

	public static Person getInputForEditUser()
	{
		Person addressbookmodel = new Person();
		System.out.println("Enter first name : ");
		addressbookmodel.setFirstName(ScannerUtils.getString());
		System.out.println("Enter last name : ");
		addressbookmodel.setLastName(ScannerUtils.getString());
		System.out.println("Enter your changes : ");
		boolean b = true;
		while (b) {
			System.out.println(
					"1:change city\n 2:change state\n 3:change zip\n 4:change phone no. \n5:done");
			int num = ScannerUtils.getInt();
			switch (num) {
			case 1:
				System.out.println("Enter city name : ");
				addressbookmodel.setCity(ScannerUtils.getString());
				break;
			case 2:
				System.out.println("Enter state name : ");
				addressbookmodel.setState(ScannerUtils.getString());
				break;
			case 3:
				System.out.println("Enter Zip code : ");
				addressbookmodel.setZip(ScannerUtils.getLong());
				break;
			case 4:
				System.out.println("Enter Phone Number : ");
				addressbookmodel.setPhoneNo(ScannerUtils.getLong());
				break;
			case 5:
				return addressbookmodel;

			default:
				b = false;
				break;
			}
		}
		return addressbookmodel;
	}
}

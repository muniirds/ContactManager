package com.htc.contactmanager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ContactManager contactManager= new ContactManager();
				contactManager.addContact("Muni	", "tirupathi", "8888888889");
				System.out.println(contactManager.getAllContacts());
				
			}

	}



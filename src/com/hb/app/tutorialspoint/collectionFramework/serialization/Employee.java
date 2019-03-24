package com.usw.tutorialspoint.collectionFramework.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheque() {
		System.out.println("Mailing a cheque to " + name + " " + address);
	}
}

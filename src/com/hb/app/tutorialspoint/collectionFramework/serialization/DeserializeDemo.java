package com.usw.tutorialspoint.collectionFramework.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			emp = (Employee) objIn.readObject();
			fileIn.close();
			objIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problem in reading object");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("problem in object input stream");
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problem in reading object");
			e.printStackTrace();
			return;
		}

		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + emp.name);
		System.out.println("Address: " + emp.address);
		System.out.println("SSN: " + emp.SSN);
		System.out.println("Number: " + emp.number);
	}

}

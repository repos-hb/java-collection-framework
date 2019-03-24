package com.hb.app.collectionframework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

import com.hb.app.collectionframework.Util.Empl;


public class SortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<com.hb.app.collectionframework.Util.Empl> list = new LinkedList<Empl>();
		list.add(new Empl("Ram", 3000));
		list.add(new Empl("John", 6000));
		list.add(new Empl("Crish", 2000));
		list.add(new Empl("Tom", 2400));

		Collections.sort(list, new SalaryComp());

		for (Empl e : list)
			System.out.println(e.toString());
	}

}

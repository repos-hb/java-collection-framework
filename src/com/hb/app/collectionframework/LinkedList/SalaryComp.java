package com.hb.app.collectionframework.LinkedList;

import java.util.Comparator;

import com.hb.app.collectionframework.Util.Empl;


public class SalaryComp implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if(e1.getSalary() > e2.getSalary())
		return 1;
		return -1;
	}

}

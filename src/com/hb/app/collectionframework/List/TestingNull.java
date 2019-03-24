package com.hb.app.collectionframework.List;

import java.util.ArrayList;
import java.util.List;

public class TestingNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		String st = null;
		list.add("hello");
		list.add(st);
		System.out.println(list);
	}

}

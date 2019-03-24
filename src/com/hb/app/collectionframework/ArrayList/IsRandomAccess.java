package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;
import java.util.RandomAccess;

public class IsRandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al instanceof RandomAccess);
	}

}

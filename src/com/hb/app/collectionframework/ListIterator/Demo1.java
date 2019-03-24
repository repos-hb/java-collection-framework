package com.hb.app.collectionframework.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.hb.app.collectionframework.LinkedList.Book;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    Book b4=new Book(104,"Electronics","Mano","Wiley",2);
	    
	    ArrayList<Book> list=new ArrayList<>();
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    list.add(1,b4);
	    
	    ListIterator<Book> itr = list.listIterator();
	    
	    System.out.println("normal");
	    while(itr.hasNext())
	    	System.out.println(itr.next().name);
	    
	    System.out.println("reverse");
	    while(itr.hasPrevious())
	    	System.out.println(itr.previous().name);
	}

}

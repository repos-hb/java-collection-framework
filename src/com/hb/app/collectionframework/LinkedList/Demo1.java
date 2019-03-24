package com.hb.app.collectionframework.LinkedList;

import java.util.LinkedList;

public class Demo1 {
	
	public static void main(String a[]){
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    
	    LinkedList<Book> listBooks = new LinkedList<>();
	    
	    listBooks.add(b1);
	    listBooks.add(b2);
	    listBooks.add(b3);
	    
	    for(Book b:listBooks){
	    	System.out.println(b.name);
	    	System.out.println(b.author);
	    	System.out.println(b.publisher+"\n");
	    }
	}

}

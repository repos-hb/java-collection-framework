package comparable_vs_comparator.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import comparable_vs_comparator.comparabledemo.Student;

public class ComparableDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0;i<100;i++){
			list.add(new Student(i, r.nextDouble()*100));
		}
		
		
		Collections.sort(list);
		
		
		for(Student s: list)
			System.out.println(s);

	}

}

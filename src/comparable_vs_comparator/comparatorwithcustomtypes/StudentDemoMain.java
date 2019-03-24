package comparable_vs_comparator.comparatorwithcustomtypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StudentDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0;i<100;i++){
			list.add(new Student(i, r.nextDouble()*100));
		}
		
		
		//sorting by max to min number
		Collections.sort(list, (s1, s2)-> {
			
			return s1.getNumber()>s2.getNumber()?1:s1.getNumber()<s2.getNumber()?-1:0;
		});
		
		
		for(Student s: list)
			System.out.println(s);
		
		
		//sorting by roll number
		Collections.sort(list, (s1, s2)-> {
			
			return s1.getRoll()>s2.getRoll()?1:s1.getRoll()<s2.getRoll()?-1:0;
		});
		
		System.out.println("-------------------------------------------");
		for(Student s: list)
			System.out.println(s);

	}

}

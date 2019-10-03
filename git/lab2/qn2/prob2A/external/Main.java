package lab2.qn2.prob2A.external;

import java.util.ArrayList;
import java.util.List;

import lab2.qn2.prob2A.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Julius");
		st1.setGrade("A");
		System.out.println(st1);
		Student st2 = new Student("Meron");
		st2.setGrade("A");
		System.out.println(st2);
		
		Student st3 = new Student("Emma");
		st3.setGrade("A");
		System.out.println(st3);
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		System.out.println(list);
	}

}
/***Sample Output**
 * 
 * 	Julius Grade:A
 *	Meron Grade:A
 *	Emma Grade:A
 *	[Julius Grade:A, Meron Grade:A, Emma Grade:A]
 * 
 */
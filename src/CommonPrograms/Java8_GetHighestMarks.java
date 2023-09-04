package CommonPrograms;

import java.util.ArrayList;
import java.util.List;

public class Java8_GetHighestMarks {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Pramod", 1, 70, 30));
		studentList.add(new Student("Maunika", 2, 80, 20));
		studentList.add(new Student("Prananya", 3, 90, 5));
		
		System.out.println(studentList.size());
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getMarks());
			
		}
		
		// Streams
		studentList.stream().forEach(a -> System.out.println(a.getName() + " " + a.getMarks() ));
		
		// name where marks >= 80
		studentList.stream().filter(a -> a.getMarks()>=80).forEach(a -> System.out.println(a.getName()));
		
		// highest marks - Logic 1
		int max = studentList.stream().map(a -> a.getMarks()).max(Integer::compare).get();
		System.out.println(max);
		

		// highest marks - Logic 2
		int max1 = studentList.stream().map(a -> a.getMarks()).max((x, y) -> x.compareTo(y)).get();
		System.out.println(max1);
		

		// highest marks - Logic 3
		int max2 = studentList.stream().map(a -> a.getMarks()).max((x, y) -> x.compare(x,y)).get();
		System.out.println(max2);
		
		
		// Name who got highest marks
		studentList.stream().filter(a -> a.getMarks() == max).forEach(a -> System.out.println(a.getName()));
		
		// Streams
		int max5 = studentList.stream().mapToInt(s ->s.getMarks()).max().getAsInt();
		System.out.println(max5);
		
	}

}

class Student {

	private String name;
	private int rollNo;
	private int marks;
	private int age;

	Student(String name, int rollNo, int marks, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

}

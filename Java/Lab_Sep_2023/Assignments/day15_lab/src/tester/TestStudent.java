package tester;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.acts.core.Course;
import com.acts.core.Student;

import static utils.StudentUtils.*;
public class TestStudent {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentList = populateStudentList();
			Map<String,Student> studentMap = populateStudent(studentList);

			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Option :\n"+"1. Display all student details from a student list\n"+"2. Display all student details(list) sorted as per GPA \n"+
			                       "3. Write a tester to print average of  gpa of students for the specified course/subject\n"
			                       + "4. Print name of specified subject  topper\n"+"5. Print no of  failures for the specified subject chosen  from user , use student map\n"+
			                       "6. Display all student details from a student map\n"+"7. Exit");
			try {
				switch(sc.nextInt()) {
				case 1://Display all student details from a student list
					System.out.println("All Student details");
					
					studentList
					.stream()
					.forEach(i-> System.out.println(i));
					
					
					break;
				case 2://Display all student details(list) sorted as per GPA
					System.out.println("All Student details sorted as per GPA");
					//Collections.sort(studentList, (s1,s2)-> ((Integer)s1.getMarks()).compareTo(s2.getMarks()));
					///studentList.forEach((s) -> System.out.print(s));
					studentList.stream()
					.sorted((s1,s2)-> ((Integer)s1.getMarks()).compareTo(s2.getMarks()))
					.forEach(s->System.out.println(s));
					break;
					
				case 3://Write a tester to print average of  gpa of students for the specified course/subject
					System.out.println("Enter the course");
					Course c1 = Course.valueOf(sc.next().toUpperCase());

					double avg = studentList.stream()
					.filter(s->s.getEnrolledCourse()==c1)
					.mapToDouble(p->p.getMarks())
					.average().orElseThrow();
					
					System.out.println("Average = "+avg);
					break;
					
				case 4://Print name of specified subject  topper
					System.out.println("Enter the course");
					Course c2 = Course.valueOf(sc.next().toUpperCase());
					Student student = studentList.stream()
					.filter(s->s.getEnrolledCourse()==c2)
					.max((s1,s2)-> ((Integer)s1.getMarks()).compareTo(s2.getMarks()))
					.orElseThrow();

					System.out.println("Names = "+student.getFirstName()+" "+student.getLastName());
					break;
					
				case 5://Print no of  failures for the specified subject chosen  from user , use student map
					System.out.println("Enter the course");
					c2 = Course.valueOf(sc.next().toUpperCase());
					long countFailure = studentMap.values().stream()
					.filter(s->s.getEnrolledCourse()==c2)
					.filter(s->s.getMarks()<5)
					.count();
					
					System.out.println("No of failure students = "+countFailure);
					break;
					
				case 6://Display all student details from a student map
					System.out.println("All Student details");
					studentMap.forEach((k,v)->System.out.println(k+" "+v));
					break;
					
				case 7://exit
					exit = true;
					System.out.println("Exit!!!");
					break;
					
				}
			}catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		  }
		}

	}

}

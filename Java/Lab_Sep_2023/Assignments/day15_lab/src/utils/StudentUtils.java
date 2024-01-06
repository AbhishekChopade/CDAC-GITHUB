package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.acts.core.Course;
import com.acts.core.Student;

import custom_exceptions.StudentHandlingException;
import static java.time.LocalDate.parse;
public class StudentUtils {
//add a method for parsing string --> Course (enum)
	public static Course parseAndValidateCourse(String course)
	{
		return Course.valueOf(course.toUpperCase());
	}
	
	//add a method for parsing string --> LocalDate (dob)
	public static LocalDate parseDob(String dob)
	{
		return LocalDate.parse(dob);
	}
	//add a method for checking for dup student(PRN)
	public static void checkForDup(String prn1,HashMap<String, 
			Student> students1) throws StudentHandlingException
	{
		if(students1.containsKey(prn1))
			throw new StudentHandlingException("Dup PRN !!!!!");
		System.out.println("no dup....");
	}
	
	public static List<Student> populateStudentList(){
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("DAC20", "Ram", "Mane", 79, Course.DAC, parse("2023-05-21")));
		studentList.add(new Student("DAI36", "Ajay", "Patil", 64, Course.DAI, parse("2023-10-12")));
		studentList.add(new Student("DMC13", "Raj", "Sawant", 87, Course.DMC, parse("2023-01-30")));
		studentList.add(new Student("DBDA56","Yash", "Mane",93, Course.DBDA, parse("2023-09-23")));
		studentList.add(new Student("DAC09", "Amit", "Joshi", 71, Course.DAC, parse("2023-04-01")));
		studentList.add(new Student("DAI15", "Om", "Sagare", 4, Course.DAI, parse("2023-08-11")));
		
			
		//String prn, String firstName, String lastName, int marks, Course enrolledCourse, LocalDate dob)
		return studentList;
	}
	
	public static Map<String,Student> populateStudent(List<Student> studentList){
		Map<String,Student> studentMap = new HashMap<>();
		studentMap.put("DAC20", new Student("DAC20", "Ram", "Mane", 79, Course.DAC, parse("2023-05-21")));
		studentMap.put("DAI36", new Student("DAI36", "Ajay", "Patil", 64, Course.DAI, parse("2023-10-12")));
		studentMap.put("DMC13", new Student("DMC13", "Raj", "Sawant", 87, Course.DMC, parse("2023-01-30")));
		studentMap.put("DBDA56", new Student("DBDA56", "Yash", "Mane",93, Course.DBDA, parse("2023-09-23")));
		studentMap.put("DAC09", new Student("DAC09", "Amit", "Joshi", 71, Course.DAC, parse("2023-04-01")));
		
		for(Student s:studentList) {
			studentMap.put(s.getPrn(), s);
		}
		
		
		
		return studentMap;
	}
}

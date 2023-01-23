package com.bnt.studentassighnment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentDetails = getStudent();

		get10StudentInfo(studentDetails);
		getLenghtOfaddress(studentDetails);
	}

	public static List<Student> getStudent() {

		List<Student> studentInfo = new ArrayList<Student>();
		Student s = new Student("shivanjali", "pune india", 10);
		Student s1 = new Student("swara", "mumbai", 10);
		Student s2 = new Student("rohini", "wagholi", 12);
		Student s3 = new Student("usha", "pimpari chinchawad", 10);
		Student s4 = new Student("sita", "phaltan", 12);
		Student s5 = new Student("gita", "pune maharashtra", 10);
		Student s6 = new Student("maya", "satara", 12);
		Student s7 = new Student("ayesha", "dahiwadi", 12);
		Student s8 = new Student("samiksha", "saswad", 10);
		studentInfo.add(s);
		studentInfo.add(s1);
		studentInfo.add(s2);
		studentInfo.add(s3);
		studentInfo.add(s4);
		studentInfo.add(s5);
		studentInfo.add(s6);
		studentInfo.add(s7);
		studentInfo.add(s8);
		return studentInfo;

	}

	public static HashMap<Integer, List<Student>> get10StudentInfo(List<Student> studentInfo) {
		HashMap<Integer, List<Student>> TentStdInfoptrint = new HashMap<Integer, List<Student>>();
		List<Student> tentStdStud = new ArrayList<Student>();
		for (Student s : studentInfo) {
			// System.out.println(s);
			if (s.getStd() == 10) {
				tentStdStud.add(s);
			}
			TentStdInfoptrint.put(10, tentStdStud);

		}
		System.out.println(TentStdInfoptrint);

		return TentStdInfoptrint;

	}

	public static void getLenghtOfaddress(List<Student> studentInfo) {
		//List<Student> compareByAddresss = new ArrayList<Student>();
		Comparator<Student> cm1 = Comparator.comparing(Student::getAddress);
		Collections.sort(studentInfo, cm1);
		for (Student s1 : studentInfo) {
			System.out.println(s1.getAddress());
		}

	}

}

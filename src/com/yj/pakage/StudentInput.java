package com.yj.pakage;

import java.util.Scanner;

public class StudentInput {
	
	//addStudent 메서드
	//학생 한명을 만들어서 학생 한명을 리턴
	public Student addStudent() {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하시오");
		s.setName(sc.next());
		System.out.println("학생의 번호를 입력하시오");
		s.setNum(sc.nextInt());
		System.out.println("학생의 국어점수 입력");
		s.setKor(sc.nextInt());
		System.out.println("학생의 영어점수 입력");
		s.setMath(sc.nextInt());
		System.out.println("학생의 수학점수 입력");
		s.setMath(sc.nextInt());
		s.setTotal(s.getKor() + s.getEng() + s.getMath());
		s.setAvg(s.getTotal()/3.0);
		
		return s;
	}
	

}

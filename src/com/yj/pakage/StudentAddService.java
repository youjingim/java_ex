package com.yj.pakage;

import com.yj.pakage1.StudentController;

public class StudentAddService {
	
	//excute 메서드
	//내용은 매개변수로 받은 학생을 
	//StudentDatabase의 students 배열에 추가
	//students의 값이 null이면 
	//배열 한칸 생성해서 학생을 추가
	//null이 아니라면 배열값을 하나 추가해서 새로운 배열을 만들어야함.
	
	public void excute() {
		StudentInput Input = new StudentInput();
		Student student = Input.addStudent();
		if(StudentDatebase.stdents == null) {
			StudentDatebase.stdents = new Student[1];
			StudentDatebase.stdents[0] = student;
		} else {
			Student [] temp = new Student[StudentDatebase.stdents.length+1];
			for(int i=0;i<temp.length;i++) {
				temp[i] = StudentDatebase.stdents[i];
			}
			temp[StudentDatebase.stdents.length] = student;
			
		}
		
		
	}

}

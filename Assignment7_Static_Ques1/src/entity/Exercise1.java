package entity;

import backend.Student;

public class Exercise1 {
	public void question1() {
		Student[] studentArray = new Student[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên " + (i + 1) + ": ");
			Student std = new Student();
			studentArray[i] = std;
		}
		
		System.out.println("Thông tin các sinh viên vừa nhập : ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		
		System.out.println("Chuyển các sinh viên sang Đại Học Công Nghệ : ");
		Student.college = "Đại học Công Nghệ";
		System.out.println("Thông tin sau khi chuyển");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
	}
}

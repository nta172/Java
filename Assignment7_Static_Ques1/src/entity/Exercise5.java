package entity;

import backend.Student;

public class Exercise5 {
	public void question5() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên " + (i + 1) + ": ");
			Student std = new Student();
		}
		System.out.println("Sinh viên 4: ");
		Student std2 = new Student();
		System.out.println("Sinh viên 5: ");
		Student std3 = new Student();
		System.out.println("Số sinh viên được tạo trên hệ thống là : " + Student.COUNT);
	}
}

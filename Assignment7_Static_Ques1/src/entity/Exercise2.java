package entity;

import backend.Student;

public class Exercise2 {
	public void question2() {
		Student[] studentArray = new Student[3];
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("Sinh viên " + (i + 1) + ": ");
			Student std = new Student();
			studentArray[i] = std;
		}
		
		System.out.println("Các Student sẽ nộp quỹ, mỗi Student 100k.");
		System.out.println("Tổng quỹ : " + (Student.moneyGroup += 300));
		System.out.println("Std thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan.");
		System.out.println("Tổng quỹ : " + (Student.moneyGroup -= 50));
		System.out.println("Std thứ 2 lấy 20k đi mua bánh mì.");
		System.out.println("Tổng quỹ : " + (Student.moneyGroup -= 20));
		System.out.println("Std thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm.");
		System.out.println("Tổng quỹ : " + (Student.moneyGroup -= 150));
		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k.");
		System.out.println("Tổng quỹ : " + (Student.moneyGroup += 150));
	}
}

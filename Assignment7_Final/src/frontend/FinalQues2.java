package frontend;

import backend.ScannerUtils;
import backend.Student;

public class FinalQues2 {
	public static void main(String[] args) {
		System.out.println("Nhập vào msv của Sinh Viên : ");
		int id = ScannerUtils.inputInt();
		System.out.println("Nhập vào tên Sinh Viên");
		String name = ScannerUtils.inputString();
		Student std = new Student(id, name);
		System.out.println("Thông tin sinh viên vừa nhập.");
		System.out.println(std);
	}
}

package backend;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entity.Student;

public class Set_Question {
	private Set<Student> setStudent;

	public void loadMenu() {
		System.out.println("Nhập chức năng mà bạn muốn chọn.");
		System.out.println("1. Tạo 1 danh sách chứa name của các student không trùng nhau.");
		System.out.println("2. Tạo 1 danh sách chứa name của các student không trùng nhau. Sắp xếp theo name.");
	}

	public void question() {
		loadMenu();
		while (true) {
			int menuChoose = ScannerUtils.inputIntPositive();
			switch (menuChoose) {
			case 1:
				setStudent = new HashSet<Student>();
				System.out.println("Nhập số sinh viên mà bạn muốn thêm vào danh sách : ");
				int num1 = ScannerUtils.inputIntPositive();
				for (int i = 0; i < num1 - 3; i++) {
					Student st = new Student("Student " + (i + 1));
					setStudent.add(st);
				}

				Student st1 = new Student("Student Name");
				Student st2 = new Student("Student Name");

				setStudent.add(st1);
				setStudent.add(st2);

				Set<String> uniqueStudent = new HashSet<String>();
				for (Student student : setStudent) {
					uniqueStudent.add(student.getName());
				}

				System.out.println("Danh sách không trùng tên.");
				for (String name : uniqueStudent) {
					System.out.println(name);
				}
				break;
			case 2:
				setStudent = new HashSet<Student>();
				System.out.println("Nhập số sinh viên mà bạn muốn thêm vào danh sách : ");
				int num2 = ScannerUtils.inputIntPositive();
				for (int i = 0; i < num2 - 3; i++) {
					Student st = new Student("Student " + (i + 1));
					setStudent.add(st);
				}

				Student st3 = new Student("Student Name");
				Student st4 = new Student("Student Name");

				setStudent.add(st3);
				setStudent.add(st4);

				Set<String> uniqueStudent2 = new TreeSet<String>();
				for (Student student : setStudent) {
					uniqueStudent2.add(student.getName());
				}

				System.out.println("Danh sách không trùng tên.");
				for (String name : uniqueStudent2) {
					System.out.println(name);
				}
				break;
			default:
				break;
			}
		}
	}

	public void printStudent() {

	}
}

package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class Exercise2 {
	public void loadMenu() {
		System.out.println("Chọn chức năng bạn muốn sử dụng.");
		System.out.println("1. Tạo danh sách sinh viên. ");
		System.out.println("2. Sắp xếp theo name, ngày sinh, điểm. ");
		System.out.println("3. Thoát chương trình. ");
	}
	
	public void question() {
		List<Student> listStudent = new ArrayList<Student>();
		
		while (true) {
			loadMenu();
			switch (ScannerUtils.inputIntPositive()) {
			case 1:
				System.out.println("Nhập vào số sinh viên : ");
				int num = ScannerUtils.inputIntPositive();
				for(int i = 0; i < num; i++) {
					System.out.println("Nhập sinh viên " + (i + 1) + ": ");
					System.out.println("Nhập vào tên : ");
					String name = ScannerUtils.inputString();
					System.out.println("Nhập vào năm sinh : ");
					LocalDate birthDay = ScannerUtils.inputLocalDate();
					System.out.println("Nhập vào điểm : ");
					float score = ScannerUtils.inputFloat();
					
					Student student = new Student(name, birthDay, score);
					listStudent.add(student);
				}
				for (Student students : listStudent) {
					System.out.println(students);
				}
				System.out.println("Danh sách sinh viên vừa nhập : ");
				break;
			case 2:
				Collections.sort(listStudent);
				System.out.println("Danh sách sinh viên sau khi sắp xếp : ");
				for (Student students : listStudent) {
					System.out.println(students);
				}
				break;
			case 3:
				return;
			default:
				System.err.println("Nhập lại : ");
				break;
			}
		}
	}
}

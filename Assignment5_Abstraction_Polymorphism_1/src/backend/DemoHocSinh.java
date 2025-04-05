package backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class DemoHocSinh {
	private ArrayList<Student> listStudent;
	private Random random;
	private Scanner sc;
	
	public DemoHocSinh() {
		listStudent = new ArrayList<>();
		random = new Random();
		sc = new Scanner(System.in);
	}
	
	public void DemoChuongTrinh() {
		menu();
	}
	
	public void menu() {
		System.out.println("Lựa chọn chức năng bạn muốn.");
		System.out.println("1. Tạo danh sách học sinh.");
		System.out.println("2. Xem danh sách học sinh.");
		System.out.println("3. Điểm danh.");
		System.out.println("4. Gọi nhóm 1 đi học bài.");
		System.out.println("5. Gọi nhóm 2 đi dọn vệ sinh.");
		System.out.println("6. Thoát chương trình.");
		while (true) {
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				initStudent();
				System.out.println("Tạo thành công 10 sinh viên.");
				break;
			case 2:
				for (Student student : listStudent) {
					System.out.println(student);
				}
				break;
			case 3:
				System.out.println("Cả lớp điểm danh.");
				for (Student student : listStudent) {
					student.diemDanh();
				}
				break;
			case 4:
				System.out.println("Nhóm 1 đi học bài.");
				for (Student student : listStudent) {
					if (student.getGroup() == 1 ) {
						student.hocBai();
					}
				}
				break;
			case 5:
				System.out.println("Nhóm 2 đi dọn vệ sinh.");
				for (Student student : listStudent) {
					if (student.getGroup() == 2) {
						student.diDonVeSinh();
					}
				}
				break;
			case 6:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu.");
				break;
			}
		}
	}

	private void initStudent() {
		for (int i = 0; i < 10; i++) {
			Student st = new Student("Student" + (i + 1), random.nextInt(3) + 1);
			listStudent.add(st);
		}
	}
}

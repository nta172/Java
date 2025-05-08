package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class List_Ques1 {
	private java.util.List<Student> listStudent;

	public List_Ques1() {
		listStudent = new ArrayList<Student>();
		System.out.println("Nhập số sinh viên muốn thêm: ");
		int num = ScannerUtils.inputIntPositive();
		
		for (int i = 0; i < num - 3 ; i++) {
			Student st = new Student("Student" + (i + 1));
			listStudent.add(st);
		}
		Student st1 = new Student("Student Name");
		Student st2 = new Student("Student Name");
		Student st3 = new Student("Student Name");
		
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
	}

	public void question1() {
		loadMenuQues1();
		while (true) {
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("Tổng số phần tử của students : " + listStudent.size());
				printStudent();
				break;
			case 2:
				System.out.println("Phần tử thứ 4 của students : " + listStudent.get(3));
				break;
			case 3:
				System.out.println("Phần tử đầu của students : " + listStudent.get(0));
				System.out.println("Phần tử cuối của students : " + listStudent.get(listStudent.size() - 1));
				break;
			case 4:
				System.out.println("Thêm 1 phần tử vào vị trí đầu của student : ");
				String name4 = ScannerUtils.inputString();
				listStudent.add(0, new Student(name4));
				printStudent();
				break;
			case 5:
				System.out.println("Thêm 1 phần tử vào vị trí cuối của student : ");
				String name5 = ScannerUtils.inputString();
				listStudent.add(new Student(name5));
				printStudent();
				break;
			case 6:
				Collections.reverse(listStudent);
				System.out.println("Đã đảo ngược vị trí.");
				printStudent();
				break;
			case 7:
				System.out.println("Nhập id để tìm kiếm student : ");
				int st7 = ScannerUtils.inputInt();
				for (Student student7 : listStudent) {
					if (student7.getId() == st7) {
						System.out.println(student7);
					}
				}
				break;
			case 8:
				System.out.println("Nhập name để tìm kiếm student : ");
				String name8 = ScannerUtils.inputString();
				for (Student student8 : listStudent) {
					if (student8.getName().equals(name8)) {
						System.out.println(student8);
					}
				}
				break;
			case 9:
				System.out.println("Danh sách student có trùng tên.");
				for (int i = 0; i < listStudent.size(); i++) {
					for (int j = i + 1; j < listStudent.size(); j++) {
						if (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
							System.out.println(listStudent.get(i).toString());
						}
					}
				}
				break;
			case 10:
				System.out.println("Nhập vào id mà bạn muốn xóa name : ");
				int id10 = ScannerUtils.inputInt();
				for (Student student10 : listStudent) {
					if (student10.getId() == id10) {
						student10.setName(null);
					}
				}
				printStudent();
				break;
			case 11:
				System.out.println("Nhập id mà bạn muốn xóa student : ");
				int id11 = ScannerUtils.inputInt();
				listStudent.removeIf(student -> student.getId() == id11);
				printStudent();
				break;
			case 12:
				System.out.println("Danh sách được copy từ ListStudent.");
				List<Student> copyStd = new ArrayList<Student>();
				copyStd.addAll(listStudent);
				for (Student student13 : copyStd) {
					System.out.println(student13);
				}
				break;
			case 13:
				return;
			default:
				System.out.println("Vui lòng chọn đúng chức năng.");
				break;
			}
		}
	}

	private void loadMenuQues1() {
		System.out.println("Lựa chọn chức năng muốn sử dụng.");
		System.out.println("1. In ra tổng số phần tử của students.");
		System.out.println("2. Lấy phần tử thứ 4 của students.");
		System.out.println("3. In ra phần tử đầu và phần tử cuối của students.");
		System.out.println("4. Thêm 1 phần tử vào vị trí đầu của students.");
		System.out.println("5. Thêm 1 phần tử vào vị trí cuối của students.");
		System.out.println("6. Đảo ngược vị trí của students.");
		System.out.println("7. Tạo 1 method tìm kiếm student theo id.");
		System.out.println("8. Tạo 1 method tìm kiếm student theo name.");
		System.out.println("9. Tạo 1 method để in ra các student có trùng tên.");
		System.out.println("10. Xóa name của student có id.");
		System.out.println("11. Delete student có id.");
		System.out.println("12. Tạo 1 ArrayList tên là studentCopies và add tất cả std vào studentCopies.");
		System.out.println("13. Thoát khỏi chương trình.");
	}

	private void printStudent() {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}
}

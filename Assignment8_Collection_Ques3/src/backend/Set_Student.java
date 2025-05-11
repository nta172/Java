package backend;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import entity.Student;

public class Set_Student {
	private Set<Student> setStudent;

	public Set_Student() {
		setStudent = new HashSet<Student>();
		System.out.println("Nhập số sinh viên mà bạn muốn thêm : ");
		int num = ScannerUtils.inputInt();
		for (int i = 0; i < num - 3; i++) {
			Student st = new Student("Student " + (i + 1));
			setStudent.add(st);
		}

		Student st1 = new Student("Student Name");
		Student st2 = new Student("Student Name");
		Student st3 = new Student("Student Name");

		setStudent.add(st1);
		setStudent.add(st2);
		setStudent.add(st3);

		System.out.println("Tạo thành công " + setStudent.size() + " sinh viên.");
		printStudent();
	}

	public void menuSetStudent() {
		System.out.println("Chức năng mà bạn muốn chọn.");
		System.out.println("1. In ra tổng số phần tử của students.");
		System.out.println("2. Lấy phần tử thứ 4 của students.");
		System.out.println("3. Lấy ra phần tử đầu và phần tử cuối của students.");
		System.out.println("4. Tạo 1 method tìm kiếm student theo id.");
		System.out.println("5. Tạo 1 method tìm kiếm student theo name.");
		System.out.println("6. Xóa name của student có id.");
		System.out.println("7. Delete student có id.");
		System.out.println("8. Tạo 1 SetList tên là studentCopies và add tất cả students vào studentCopies");
		System.out.println("9. Thoát chương trình.");
	}

	public void setStudent() {
		menuSetStudent();
		while (true) {
			int menuChoose = ScannerUtils.inputInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Tổng số phần tử của students : " + setStudent.size());
				printStudent();
				break;
			case 2:
				Iterator<Student> iteratorStudent2 = setStudent.iterator();
				for (int i = 0; i <= 2; i++) {
					iteratorStudent2.next();
				}
				System.out.println("Phần tử thứ 4 của students : " + iteratorStudent2.next());
				printStudent();
				break;
			case 3:
				Iterator<Student> iteratorStudent3 = setStudent.iterator();
				System.out.println("Phần tử đầu của students : " + iteratorStudent3.next());
				for (int i = 0; i < setStudent.size() - 2; i++) {
					iteratorStudent3.next();
				}
				System.out.println("Phần tử cuối của students : " + iteratorStudent3.next());
				printStudent();
				break;
			case 4:
				System.out.println("Nhập id mà bạn muốn tìm kiếm : ");
				int id4 = ScannerUtils.inputInt();
				Iterator<Student> iteratorStudent4 = setStudent.iterator();
				for (int i = 0; i < setStudent.size(); i++) {
					Student stFind4 = iteratorStudent4.next();
					if (stFind4.getId() == id4) {
						System.out.println(stFind4);
					}
				}
				break;
			case 5:
				Student st5 = new Student("NTA");
				setStudent.add(st5);
				System.out.println("Nhập name mà bạn muốn tìm kiếm : ");
				String name5 = ScannerUtils.inputString();
				Iterator<Student> iteratorStudent5 = setStudent.iterator();
				for (int i = 0; i < setStudent.size(); i++) {
					Student stFind5 = iteratorStudent5.next();
					if (stFind5.getName().equals(name5)) {
						System.out.println(stFind5);
					}
				}
				break;
			case 6:
				System.out.println("Nhập id mà bạn muốn xóa name của students : ");
				int id6 = ScannerUtils.inputInt();
				Iterator<Student> iteratorStudent6 = setStudent.iterator();
				for (int i = 0; i < setStudent.size(); i++) {
					Student stFind6 = iteratorStudent6.next();
					if (stFind6.getId() == id6) {
						stFind6.setName(null);
					}
				}
				printStudent();
				break;
			case 7:
				System.out.println("Nhập vào id mà bạn muốn xóa students : ");
				int id7 = ScannerUtils.inputInt();
				setStudent.removeIf(student -> student.getId() == id7);
				printStudent();
				break;
			case 8:
				System.out.println("Danh sách copy từ danh sách setStudent : ");
				Set<Student> copySetStudent = new HashSet<Student>();
				copySetStudent.addAll(setStudent);
				printStudent();
				break;
			case 9:
				return;
			default:
				System.out.println("Nhập đúng số trên menu.");
				break;
			}
		}
	}

	public void printStudent() {
		Iterator<Student> i1 = setStudent.iterator();
		for(int i = 0; i < setStudent.size(); i++) {
			System.out.println(i1.next());
		}
	}
}

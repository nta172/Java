package backend;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import entity.Student;

public class StackAndQueue_Ques2 {
	private Stack<Student> stackStudent;

	public void loadMenu() {
		System.out.println("Chức năng bạn muốn sử dụng.");
		System.out.println("1. Tạo danh sách sinh viên.");
		System.out.println("2. Tạo method in ra thứ tự học sinh tới sớm nhất đến muộn nhất.");
		System.out.println("3. Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ muộn nhất tới sớm nhất ");
		System.out.println("4. Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự sớm nhất tới muộn nhất");
		System.out.println("5. Thoát chương trình.");
	}

	public void question2() {
		stackStudent = new Stack<>();
		loadMenu();
		while (true) {
			int menuChoose = ScannerUtils.inputInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Nhập số sinh viên bạn muốn thêm : ");
				int num = ScannerUtils.inputInt();
				for (int i = 0; i < num; i++) {
					Student st1 = new Student("Student " + (i + 1));
					stackStudent.push(st1);
				}
				printStudent();
				break;
			case 2:			
				System.out.println("Danh sách sinh viên tới sớm nhất tới muộn nhất.");
				Iterator<Student> iteratorStudent = stackStudent.iterator();
				while (iteratorStudent.hasNext()) {
					Student st2 = iteratorStudent.next();
					System.out.println(st2);
				}
				break;
			case 3:
				System.out.println("Danh sách sinh viên tới muộn nhất : " + stackStudent.peek());
				System.out.println("Danh sách sinh viên tới muộn nhất đến sớm nhất : ");
				for(int i = 0; i < stackStudent.size(); i++) {
					System.out.println(stackStudent.pop());
				}
				System.out.println("Sinh viên còn lại trong Stack : " + stackStudent.size());
				printStudent();
				break;
			case 4:
				Queue<Student> studentQueue = new LinkedList<Student>();
				System.out.println("Nhập vào số sinh viên muốn quản lý bằng Queue : ");
				int num4 = ScannerUtils.inputInt();
				for(int i = 0; i < num4; i++) {
					Student st4 = new Student("Student Queue " + (i + 1));
					studentQueue.add(st4);
				}
				System.out.println("Đã thêm " + num4 + " sinh viên vào queue thành công.");
				System.out.println("Danh sách sinh viên vừa được thêm : " + studentQueue);
				System.out.println("Danh sách sinh viên theo thứ tự sớm nhất tới muộn nhất dùng Poll để lấy dữ liệu : ");
				for(int i = 0; i < num4; i++) {
					System.out.println(studentQueue.poll());
				}
				System.out.println("Danh sách sinh viên còn lại trong Queue : " + studentQueue);
				break;
			case 5:
				return;
			default:
				System.out.println("Nhập đúng số chức năng trên menu.");
				break;
			}
		}
	}

	public void printStudent() {
		for (Student student : stackStudent) {
			System.out.println(student);
		}
	}
}

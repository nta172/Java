package backend;

import java.util.Scanner;

public class Demo {
	private Scanner sc;
	
	public Demo() {
		super();
		sc = new Scanner(System.in);
	}
	
	public void DemoChuongTrinh() {
		while(true) {
			System.out.println("Lựa chọn chức năng bạn muốn sử dụng. ");
			System.out.println("1. Demo Person.");
			System.out.println("2. Demo Student.");
			System.out.println("3. Exit.");
			
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				Person person = new Person();
				person.inputInfo();
				System.out.println("Thông tin của Person vừa nhập vào : ");
				System.out.println(person.showInfo());
				break;
			case 2:
				Student st = new Student();
				st.inputInfo();
				System.out.println("Thông tin Student vừa nhập vào : ");
				System.out.println(st.showInfo());
				if (st.Scholarship()) {
					System.out.println("Sinh viên này đạt học bổng.");
				}else {
					System.out.println("Sinh viên này không đạt học bổng.");
				}
				break;
			case 3:
				return;
			default:
				System.out.println("Vui lòng lựa chọn đúng số trên menu.");
				break;
			}
		}
	}
}

package backend;

import entity.Student;
import entity.Employee;
import entity.MyMap;
import entity.Phone;
import entity.Staff;

public class Exercise {
	public void question1_2() {
		// Khởi tạo đối tượng có id là int
		Student<Integer> std1 = new Student<Integer>(1, "Anh");

		// Khởi tạo đối tượng có id là float
		Student<Float> std2 = new Student<Float>(2.0f, "Anh");

		// Khởi tạo đối tượng có id là double
		Student<Double> std3 = new Student<Double>(3.13, "Anh");

		// Print object
		print(std1);
		print(std2);
		print(std3);

		// Print number
		print(1);
		print(2f);
		print(3d);
	}

	public void question4() {
		Integer[] arrayInt = { 1, 2, 3 };
		Float[] arrayFloat = { 1.0f, 2.0f, 3.0f };
		Double[] arrayDouble = { 4d, 5d, 6d };
		Long[] arrayLong = { 10000000L, 15000000L, 20000000L };

		printArray(arrayInt);
		printArray(arrayFloat);
		printArray(arrayDouble);
		printArray(arrayLong);
	}

	public void question5() {
		// Employee có datatype int
		Integer[] salaryEmployee1 = { 1000, 2000, 3000 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "Anh", salaryEmployee1);

		System.out.println("Employee vừa khởi tạo : ");
		print(employee1);
		System.out.println("Lương tháng cuối cùng của employee1 : " + salaryEmployee1[salaryEmployee1.length - 1]);

		// Employee có datatype float
		Float[] salaryEmployee2 = { 123.4f, 234.5f, 456.7f };
		Employee<Float> employee2 = new Employee<Float>(2, "Anh2", salaryEmployee2);
		System.out.println("Employee vừa khởi tạo : ");
		print(employee2);
		System.out.println("Lương tháng cuối cùng của employee2 : " + salaryEmployee2[salaryEmployee2.length - 1]);

		// Employee có datatype double
		Double[] salaryEmployee3 = { 234d, 345d, 567d };
		Employee<Double> employee3 = new Employee<Double>(3, "Anh3", salaryEmployee3);
		System.out.println("Employee vừa khởi tạo : ");
		print(employee3);
		System.out.println("Lương tháng cuối cùng của employee3 : " + salaryEmployee3[salaryEmployee3.length - 1]);
	}

	public void question6() {
		MyMap<Integer, String> student1 = new MyMap<Integer, String>(133, "Anh");
		System.out.println(student1);
	}

	public void question7() {
		// <email, phone number>
		Phone<String, String> email = new Phone<String, String>("anh03@gmail.com", "0337951438");
		System.out.println("Email: " + email.getKey() + " / " + "Phone Number: " + email.getPhoneNumber());
		// <id, phone number>
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0337951438");
		System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());
		// <name, phone number>
		Phone<String, String> name = new Phone<String, String>("Anh", "0337951438");
		System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
	}

	public void question8() {
		// ID là int
		Staff<Integer, String> staff1 = new Staff<Integer, String>(1, "Anh");
		System.out.println("ID : " + staff1.getId() + " / " + "Name : " + staff1.getName());
		
		Staff<Long, String> staff2 = new Staff<Long, String>(2121050133, "Anh");
		System.out.println("ID : " + staff2.getId() + " / " + "Name : " + staff2.getName());
	}
	
	private <T> void print(T a) {
		System.out.println(a);
	}

	private <T> void printArray(T[] a) {
		for (T x : a) {
			System.out.println(x);
		}
	}
}

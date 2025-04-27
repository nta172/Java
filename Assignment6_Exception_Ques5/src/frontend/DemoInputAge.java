package frontend;

import backend.InputAge;

public class DemoInputAge {
	public static void main(String[] args) {
		System.out.println("Nhập tuổi của bạn : ");
		int age = InputAge.inputAge();
		System.out.println("Tuổi của bạn là : " + age);
	}
}

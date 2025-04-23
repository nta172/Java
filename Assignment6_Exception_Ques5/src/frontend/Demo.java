package frontend;

import backend.ScannerUtils;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Nhập vào tuổi của sinh viên : ");
		int age = ScannerUtils.intPositive();
		System.out.println("Tuổi của sinh viên là : " + age);
	}
}

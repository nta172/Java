package frontend;

import java.util.Scanner;

import backend.Exercise2;

public class Demo_Exercise2 {
	public static void main(String[] args) {
		question1();
		question3();
	}
	private static void question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Nhập vào số 2 : ");
		int num2 = sc.nextInt();

		try {
			System.out.println("Kết quả phép chia 2 số là: " + Exercise2.device(num1, num2));
		} catch (Exception e) {
			System.err.println("Có lỗi khi thực hiện chia cho số 0");
		} finally {
			System.out.println("Device Completed.");
		}
	}
	private static void question3() {
		try {
			int[] numbers = {1, 2, 3};
			
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.err.println("Không tim thấy mảng phần tử nào.");
		}
	}
}

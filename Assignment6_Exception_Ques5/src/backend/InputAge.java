package backend;

import java.util.Scanner;

public class InputAge {
	private static Scanner sc = new Scanner(System.in);

	public static int inputAge() {
		while (true) {
			int inputAge = Integer.parseInt(sc.next());
			try {
				if (inputAge >= 0) {
					return inputAge;
				} else {
					System.err.println("Wrong Inputing! The age must be greater than, please input again.");
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}

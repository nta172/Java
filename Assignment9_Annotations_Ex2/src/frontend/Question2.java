package frontend;

import entity.Student;

public class Question2 {
	public static void main(String[] args) {
		Student std = new Student("Nguyen Van A");
		System.out.println(std.getIdV2());
		System.out.println(std.getName());
	}
}

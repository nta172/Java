package frontend;

import backend.HighSchoolStudent;

public class Demo {
	public static void main(String[] args) {
		question3();
	}

	public static void question3() {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
		System.out.println(highSchoolStudent);
	}
}

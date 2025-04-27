package entity;

import backend.Student;

public class Exercise4 {
	public void question4() {
		System.out.println("Demo Get Set College : ");
		Student std = new Student();
		System.out.println("College là : " + std.getCollege());
		System.out.println("Thay đổi College Đại Học Hà Nội.");
		std.setCollege("Đại Học Hà Nội");
		System.out.println("Collect là : " + std.getCollege());
	}
}

package backend;

import java.util.Scanner;

public class Student extends Person {
	private int id;
	private Float gradeAvg;
	private String email;
	
	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.println("Nhập vào mã sinh viên : ");
		this.id = sc.nextInt();
		System.out.println("Nhập vào điểm trung bình của sinh viên : ");
		this.gradeAvg = sc.nextFloat();
		System.out.println("Nhập vào email của sinh viên : ");
		this.email = sc.next();
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + "[Mã sinh viên : " + id + ", Điểm trung bình : " + gradeAvg + ", Email : " + email + "]";
	}
	
	public boolean Scholarship() {
		return gradeAvg > 8.0 ? true : false;
	}
}

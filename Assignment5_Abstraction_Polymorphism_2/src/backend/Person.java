package backend;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate birthDate;
	private String address;
	
	public enum Gender{
		FEMALE, MALE, UNKNOWN
	}
	
	//Constructor
	public Person() {
		
	}
	
	public Person(String name, Gender gender, LocalDate birthDate, String address) {
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của bạn : ");
		this.name = sc.next();
		System.out.println("Nhập giới tính của bạn : (1.Female , 2.Male , 3.Unknown)");
		int flagGender = sc.nextInt();
		switch (flagGender) {
		case 1:
			this.gender = Gender.FEMALE;
			break;
		case 2:
			this.gender = Gender.MALE;
			break;
		case 3:
			this.gender = Gender.UNKNOWN;
			break;
		default:
			break;
		}

		System.out.println("Nhập ngày sinh của bạn định dạng yyyy-MM-dd : ");
		this.birthDate = LocalDate.parse(sc.next());
		System.out.println("Nhập địa chỉ của bạn : ");
		this.address = sc.next();
	}
	public String showInfo() {
		return "Person [name = " + name + ", gender = " + gender + ", birthDate = " + birthDate + ", address = " + address + "]";
	}
}

package frontend;

import backend.PrimaryStudent;
import backend.ScannerUtils;
import backend.SecondaryStudent;
import backend.Student;

public class FinalQues3 {
	public static void main(String[] args) {
		System.out.println("Nhập ID PrimaryStudent : ");
		int id = ScannerUtils.inputInt();
		System.out.println("Nhập Name PrimaryStudent : ");
		String name = ScannerUtils.inputString();
		System.out.println("Thông tin vừa nhập vào của PrimaryStudent : ");
		PrimaryStudent priStd = new PrimaryStudent(id , name);
		System.out.println(priStd);
		priStd.study();
		
		System.out.println("Nhập ID SecondaryStudent : ");
		int id1 = ScannerUtils.inputInt();
		System.out.println("Nhập Name SecondaryStudent : ");
		String name1 = ScannerUtils.inputString();
		System.out.println("Thông tin vừa nhập vào của SecondaryStudent : ");
		SecondaryStudent secStd = new SecondaryStudent(id1 , name1);
		System.out.println(secStd);
		secStd.study();
	}
}

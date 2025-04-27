package entity;

import backend.PrimaryStudent;
import backend.SecondaryStudent;

public class Exercise6 {
	public void question6() {
		System.out.println("Khởi tạo 2 PrimaryStudent : ");
		for (int i = 0; i < 2; i++) {
			System.out.println("PrimaryStudent " + (i + 1) + ": ");
			PrimaryStudent priStd = new PrimaryStudent();
		}
		System.out.println("Khởi tạo 4 SecondaryStudent : ");
		for(int j = 0; j<4 ; j++) {
			System.out.println("SecondaryStudent " + (j + 1) + ": ");
			SecondaryStudent secStd = new SecondaryStudent();
		}
		
		System.out.println("Số lượng PrimaryStudent là " + PrimaryStudent.COUNTPri);
		System.out.println("Số lượng SecondaryStudent là : " + SecondaryStudent.COUNTSec);
	}
}

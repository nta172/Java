package entity;

import backend.MyMath;
import backend.ScannerUtils;

public class Exercise3 {
	public void question3() {
		System.out.println("Nhập vào số int1 : ");
		int a = ScannerUtils.inputInt();
		System.out.println("Nhập vào số int2 : ");
		int b = ScannerUtils.inputInt();
		
		System.out.println("Max a và b : " + MyMath.max(a, b));
		System.out.println("Min a và b : " + MyMath.min(a, b));
		System.out.println("Sum a và b : " + MyMath.sum(a, b));
	}
}	

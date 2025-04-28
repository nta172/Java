package frontend;

import backend.MyMath;
import backend.ScannerUtils;

public class FinalQues1 {
	public static void main(String[] args) {
		System.out.println("Nhập vào 1 số int : ");
		int a = ScannerUtils.inputInt();
		System.out.println("Tổng là " + MyMath.sum(a));
	}
}

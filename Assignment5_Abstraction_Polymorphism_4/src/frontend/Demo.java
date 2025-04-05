package frontend;

import java.util.Scanner;

import backend.MyMath;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath mymath = new MyMath();
		
		while (true) {
			System.out.println("Lựa chọn chức năng tính tổng.");
			System.out.println("1. Tính tổng 2 số int.");
			System.out.println("2. Tính tổng 2 số byte.");
			System.out.println("3. Tính tổng 2 số float.");
			System.out.println("4. Thoát chương trình.");
			
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Nhập số 1 int vào : ");
				int int1 = sc.nextInt();
				System.out.println("Nhập số 2 int vào : ");
				int int2 = sc.nextInt();
				
				System.out.println("Tổng 2 số int : " + mymath.getSum(int1, int2));
				break;
			case 2:
				System.out.println("Nhập số 1 byte vào : ");
				byte byte1 = sc.nextByte();
				System.out.println("Nhập số 2 byte vào : ");
				byte byte2 = sc.nextByte();
				
				System.out.println("Tổng 2 số byte : " + mymath.getSum(byte1, byte2));
				break;
			case 3:
				System.out.println("Nhập 1 số float vào : ");
				Float float1 = sc.nextFloat();
				System.out.println("Nhập 2 số float vào : ");
				Float float2 = sc.nextFloat();
				
				System.out.println("Tổng 2 số Float : " + mymath.getSum(float1, float2));
				break;
			case 4:
				return;
			default:
				System.out.println("Vui lòng nhập đúng số trên menu.");
				break;
			}
		}
	}
}

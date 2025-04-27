package entity;

import backend.HinhChuNhat;
import backend.HinhHocException;
import backend.HinhTron;
import backend.ScannerUtils;

public class Exercise8 {
	public void question8() throws HinhHocException {
		System.out.println("Tạo 4 hình chữ nhật : ");
		HinhChuNhat[] hcns = new HinhChuNhat[4];
		for(int i = 0; i < 4; i++) {
			System.out.println("Hình " + (i + 1) + ": ");
			System.out.println("Cạnh a : ");
			Float a = ScannerUtils.inputFloat();
			System.out.println("Cạnh b : ");
			Float b = ScannerUtils.inputFloat();
			HinhChuNhat hcn = new HinhChuNhat(a, b);
			hcns[i] = hcn;
			System.out.println("Chu vi hình chữ nhật " + (i + 1) + ": " + hcns[i].tinhChuVi(a, b));
			System.out.println("Diện tích hình chữ nhật " + (i + 1) + ": " + hcns[i].tinhDienTich(a, b));
		}
		System.out.println("Tạo hình tròn số 1, nhập vào bán kính ");
		Float r1 = ScannerUtils.inputFloat();
		HinhTron hinhtron1 = new HinhTron(r1, r1);
		System.out.println("Chu vi hình tròn số 1 : " + hinhtron1.tinhChuVi(r1, r1));
		System.out.println("Diện tích hình tròn số 1 : " + hinhtron1.tinhDienTich(r1, r1));
		
		System.out.println("Tạo hình tròn số 2, nhập vào bán kính ");
		Float r2 = ScannerUtils.inputFloat();
		HinhTron hinhtron2 = new HinhTron(r2, r2);
		System.out.println("Chu vi hình tròn số 2 : " + hinhtron2.tinhChuVi(r2, r2));
		System.out.println("Diện tích hình tròn số 2 : " + hinhtron2.tinhDienTich(r2, r2));
	}
}

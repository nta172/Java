package backend;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private ArrayList<ThiSinh> danhSachThiSinh;
	private Scanner sc;
	
	public TuyenSinh() {
		danhSachThiSinh = new ArrayList<ThiSinh>();
		sc = new Scanner(System.in);
	}
	
	
	@Override
	public void themThiSinh() {
		System.out.println("Nhập họ tên của thí sinh : ");
		String hoTen = sc.next();
		System.out.println("Nhập địa chỉ của thí sinh : ");
		String diaChi = sc.next();
		System.out.println("Nhập mức ưu tiên của thí sinh : ");
		int mucUuTien = sc.nextInt();
		
		System.out.println("Nhập khối mà thí sinh đăng kí (VD : A, B, C) : ");
		String khoi = sc.next();
		
		ThiSinh thisinh = new ThiSinh(hoTen, diaChi, mucUuTien, new Khoi(khoi));
		danhSachThiSinh.add(thisinh);
	}

	@Override
	public void hienThiThongTinThiSinh() {
		for (ThiSinh thisinh : danhSachThiSinh) {
			System.out.println(thisinh);
		}
	}

	@Override
	public void timKiemSoBaoDanh(int soBaoDanh) {
		for (ThiSinh thisinh : danhSachThiSinh) {
			if (thisinh.getSoBaoDanh() == soBaoDanh) {
				System.out.println(thisinh);
			}
		}
	}

}

package frontend;

import backend.NgayThangNam;
import backend.NgayThangNam.GioPhutGiay;

public class Question4 {
	public static void main(String[] args) {
		NgayThangNam date = new NgayThangNam();
		date.ngay = 31;
		date.thang = 10;
		date.nam = 2017;
		
		GioPhutGiay time = date.new GioPhutGiay();
		time.gio = 10;
		time.phut = 15;
		time.giay = 30;
		time.xuatThongTin();
	}
}

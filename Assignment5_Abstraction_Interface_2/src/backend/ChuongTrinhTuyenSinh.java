package backend;

import java.util.Scanner;

public class ChuongTrinhTuyenSinh {
	private TuyenSinh tuyenSinh;
	private Scanner sc;
	
	public ChuongTrinhTuyenSinh() {
		sc = new Scanner(System.in);
		tuyenSinh = new TuyenSinh();
	}
	
	public void DemoTuyenSinh() {
		menu();
	}

	private void menu() {
		while (true) {
			System.out.println("Lựa chọn chức năng của bạn.");
			System.out.println("1. Thêm mới thi sinh.");
			System.out.println("2. Hiển thị thông tin thí sinh.");
			System.out.println("3. Tìm kiếm số báo danh.");
			System.out.println("4. Thoát chương trình.");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				tuyenSinh.themThiSinh();
				break;
			case 2:
				tuyenSinh.hienThiThongTinThiSinh();
				break;
			case 3:
				System.out.println("Nhập vào số báo danh cần tìm : ");
				int soBaoDanh = sc.nextInt();
				tuyenSinh.timKiemSoBaoDanh(soBaoDanh);
				break;
			case 4:
				return;
			default:
				System.out.println("Vui lòng chọn lại số đúng trên menu.");
				break;
			}
		}
	}
	
	 
}

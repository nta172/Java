package backend;

public class ThiSinh {
	public static int COUNT = 0;
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	private Khoi khoi;

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public ThiSinh(String hoTen, String diaChi, int mucUuTien, Khoi khoi) {
		COUNT++;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoi = khoi;
	}

	public String toString() {
		return "ThiSinh [Số báo danh : " + soBaoDanh + ", Họ Tên : " + hoTen + ", Địa chỉ : " + diaChi 
				+ ", Mục Ưu Tiên : " + mucUuTien + ", Khối : " + khoi.getTenKhoi()
				+ ", Môn học : " + khoi.getMonHoc() + "]";
	}
}

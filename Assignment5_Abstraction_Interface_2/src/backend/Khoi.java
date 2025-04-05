package backend;

public class Khoi {
	private String tenKhoi;
	private String monHoc;
	
	public Khoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}
	
	public String getTenKhoi() {
		return tenKhoi;
	}
	
	public String getMonHoc() {
		switch (this.tenKhoi) {
		case "A":
			this.monHoc = "Toán, Lý, Hóa";
			break;
		case "B":
			this.monHoc = "Toán, Hóa, Sinh";
			break;
		case "C":
			this.monHoc = "Văn, Sử, Địa";
			break;
		}
		return this.monHoc;
	}
}

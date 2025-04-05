package backend;

public class HinhChuNhat implements IHinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	@Override
	public void tinhChuVi() {
		float tinhChuVi = (chieuDai + chieuRong) * 2;
		System.out.println("Tính chu vi theo Hình Vuông/Hình Chữ Nhật : " + tinhChuVi);
	}
	@Override
	public void tinhDienTich() {
		float tinhDienTich = chieuDai * chieuRong;
		System.out.println("Tính diện tích theo Hình Vuông/Hình Chữ Nhật : " + tinhDienTich);
	}

}

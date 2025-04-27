package backend;

public class HinhTron extends HinhHoc {

	public HinhTron(Float a, Float b) throws HinhHocException {
		super(a, b);
	}

	@Override
	public Float tinhChuVi(Float a, Float b) {
		return 2*a*(Configs.PI);
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return (float) (Configs.PI*(Math.pow(a, 2)));
	}
}

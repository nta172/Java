package backend;

public class Position {
	public static int COUNTPos = 0;
	public int id;
	public PositionName name;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}
	
	@Override
	public String toString() {
		return "Position [id = " + id + ", name = " + name + "]";
	}

	public Position() {
		super();
		COUNTPos++;
		this.id = COUNTPos;

		System.out.println("Chọn vị trí muốn nhập: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM : ");

		while (true) {
			int choosePos = ScannerUtils.intPositive();
			switch (choosePos) {
				case 1:
					this.name = PositionName.Dev;
					return;
				case 2:
					this.name = PositionName.Test;
					return;
				case 3:
					this.name = PositionName.Scrum_Master;
					return;
				case 4:
					this.name = PositionName.PM;
					return;
				default:
					System.err.println("Nhập sai, vui lòng nhập lại từ 1 đến 4:");
			}
		}
	}
}



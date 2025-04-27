package backend;

public class Position {
	public static int COUNT;
	private int id;
	private PositionName name;
	
	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}
	
	public Position() {
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhập vị trí mà bạn muốn chọn : 1.Dev, 2.Test, 3.Scrum_Master, 4.PM");
		while (true) {
			int choosePos = ScannerUtils.inputIntPositive();
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
				System.err.println("Chọn lại : ");
			}
		}
	}
	
	@Override
	public String toString() {
		return "Position [id = " + id + ", name = " + name + "]";
	}
}

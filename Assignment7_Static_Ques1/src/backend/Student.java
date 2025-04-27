package backend;

public class Student {
	public static int COUNT = 0;
	private int id;
	private String name;
	public static int moneyGroup;
	public static String college = "Đại học Bách Khoa";
	
	public Student() {
		super();
		COUNT++;
		if (COUNT > 7) {
			System.err.println("Số lượng sinh viên đã vượt quá 7. Không thể tạo thêm sinh viên.");
		} else {
			this.id = COUNT;
			System.out.println("Nhập vào tên của sinh viên : ");
			this.name = ScannerUtils.inputString();
			this.moneyGroup = moneyGroup;
		}
	}

	public int getMoneyGroup() {
		return moneyGroup;
	}

	public void setMoneyGroup(int moneyGroup) {
		this.moneyGroup = moneyGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", college = " + college + "]";
	}
}

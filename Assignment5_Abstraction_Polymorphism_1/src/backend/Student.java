package backend;

public class Student implements IStudent {
	public static int COUNT = 0;
	private int id;
	private String name;
	private int group;
	
	public Student(String name, int group) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.group = group;
	}
	
	public int getGroup() {
		return group;
	}
	
	public String toString() {
		return "Student[ID = " + id + ", Name = " + name + ", Group = " + group + "]";
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " điểm danh.");
	}

	@Override
	public void hocBai() {
		System.out.println(name + " học bài.");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println(name + " đi dọn vệ sinh.");
	}
}

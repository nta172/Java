package backend;

public class Student {
	private final int id;
	private String name;
	
	public Student(int id ,String name) {
		this.id = id;
		this.name = name;
	}

	public static void study() {
		System.out.println("Sinh viên đang học bài...");
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + "]";
	}
}

package entity;

public class Student {
	public static int COUNT = 0;
	private int id;
	private String name;

	public Student(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	/**
	 * 
	 * @deprecated replaced by {@link #getIdV2()}
	 */

	@Deprecated
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdV2() {
		return "MSV : " + id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

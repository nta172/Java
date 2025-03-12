package backend;

public class Engineer extends Staff {
	private String specialized; // specialized : ngành đào tạo.

	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		this.specialized = specialized;
	}

	@Override
	public String toString() {
		return super.toString() + "Position: Engineer [specialized = " + specialized + "]";
	}
}

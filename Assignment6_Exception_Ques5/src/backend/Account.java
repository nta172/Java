package backend;

public class Account {
	public static int COUNT = 0;
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private int age;
	
	public Account() throws InvalidAgeInputingException {
		System.out.println("Nhập thông tin Account : ");
		COUNT++;
		System.out.println("Nhập email : ");
		this.email = ScannerUtils.inputString();
		System.out.println("Nhập userName : ");
		this.userName = ScannerUtils.inputString();
		System.out.println("Nhập fullName : ");
		this.fullName = ScannerUtils.inputString();
		this.age = inputAccountAge();
	}
	
	private int inputAccountAge() throws InvalidAgeInputingException {
		System.out.println("Nhập age : ");
		while (true) {
			int intAge = ScannerUtils.inputInt();
			try {
				if (intAge <= 0) {
					throw new InvalidAgeInputingException("The age must be greater than 0");
				} else {
					if (intAge < 18) {
						System.err.println("Your age must be greater than 18");
					} else {
						return intAge;
					}
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	@Override
	public String toString(){
		return "Account [id = " + id + ", email = " + email + ", userName = " + userName + ", fullName = " + fullName + ", age = " + age + "]";
	}
}

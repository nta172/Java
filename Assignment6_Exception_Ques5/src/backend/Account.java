package backend;

public class Account {
	public static int COUNT = 0;
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private int age;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", age = " + age + "]";
	}
	
	public Account() throws InvalidAgeInputingException {
		super();
		System.out.println("Nhập thông tin Account.");
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhập email : ");
		this.email = ScannerUtils.inputString();
		System.out.println("Nhập userName : ");
		this.userName = ScannerUtils.inputString();
		System.out.println("Nhập fullName : ");
		this.fullName = ScannerUtils.inputString();
		this.age = inputAccountAge();
	}

	private int inputAccountAge() throws InvalidAgeInputingException {
		System.out.println("Nhập Age : ");
		while(true) {
			try {
				int ageInput = ScannerUtils.inputInt();
				if(ageInput <= 0) {
					throw new InvalidAgeInputingException("The age must be grater than 0, please input again.");
				} else {
					if (ageInput < 18) {
						System.err.println("Your age must be greater than 18, input again : ");;
					} else {
						return ageInput;
					}
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}

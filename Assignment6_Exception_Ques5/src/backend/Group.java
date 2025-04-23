package backend;

import java.time.LocalDate;

public class Group {
	public static int COUNT = 0;
	private int id;
	private String name;
	private Account creator;
	private LocalDate createDate;
	private Account[] accounts;
	
	public void printInforGroup() {
		System.out.println("Thông tin Group : ");
		System.out.println("Group [id = " + id + ", name = " + name + ", createDate = " + createDate + "]");
		if (accounts != null) {
			System.out.println("Số lượng Account trong Group này là : " + accounts.length);
			for (Account account : accounts) {
				System.out.println(account.toString());
			}
		}	
	}
	
	public Group() throws InvalidAgeInputingException {
		super();
		System.out.println("Nhập thông tin tạo Group.");
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhập tên Group : ");
		this.name = ScannerUtils.inputString();
		System.out.println("Nhập ngày tạo group : ");
		this.createDate = ScannerUtils.inputLocalDate();
		System.out.println("Bạn có muốn thêm Account vào Group hay không, 1.Có , 2.Không");
		while(true) {
			int chooseAddAcc = ScannerUtils.intPositive();
			switch (chooseAddAcc) {
			case 1:
				System.out.println("Nhập số lượng Account muốn thêm vào group này: ");
				int countAcc = ScannerUtils.intPositive();
				Account[] accs = new Account[countAcc];
				for (int i = 0; i < countAcc; i++) {
					System.out.println("Nhập vào acc Account thứ " + (i + 1) + ": ");
					Account acc = new Account();
					accs[i] = acc;
				}
				this.accounts = accs;
				return;
			case 2:
				return;
			default:
				System.out.println("Nhập lại : ");
				break;
			}
		}
	}
}


package frontend;

import backend.Date;
import backend.Account;
import backend.Circle;

public class Exercise4_1 {
	public static void main(String[] args) {
		System.out.println("---Demo Circle---");
		Circle circle = new Circle(2.0, "red");
		System.out.println("Diện tích hình tròn là : " + circle.getArea());

		System.out.println("---Demo Account---");
		Account acc1 = new Account("1", "acc1", 10);
		Account acc2 = new Account("2", "acc2", 20);
		System.out.println(
				"Số tiền ban đầu của : " + "\n" + "acc1 : " + acc1.getBalance() + "\n" + "acc2 : " + acc2.getBalance());

		acc1.credit(50);
		System.out.println("Balance của acc1 sau khi Credit 50 : " + acc1.getBalance());

		acc2.debit(20);
		System.out.println("Balance của acc2 sau khi Debit 20 : " + acc2.getBalance());

		System.out.println("acc1 chuyển 20 cho acc2");
		acc1.tranferTo(acc2, 20);
		System.out.println("Sau khi chuyển số tiền acc1 : " + acc1.getBalance());
		System.out.println("Sau khi nhận tiền acc2 : " + acc2.getBalance());

		System.out.println("---Demo Date---");
		Date date1 = new Date(25, 04, 1988);
		System.out.println("Bạn vừa tạo ngày: " + date1);
		System.out.println("Check năm nhuận: ");
		if (date1.isLeapYear()) {
			System.out.println("Đây là năm nhuận");
		} else {
			System.out.println("Đây không phải là năm nhuận");
		}

	}
}

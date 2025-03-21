package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	public static int ID = 0;
	private ArrayList<Document> documentList;
	private Scanner sc;

	public QuanLySach() {
		sc = new Scanner(System.in);
		documentList = new ArrayList<Document>();
	}

	public void menu() {
		while (true) {
			System.out.println("----------------Chức năng : Quản Lý Sách-----------------");
			System.out.println("1. Thêm mới tài liệu : Sách, tạp chí, báo.");
			System.out.println("2. Xóa tài liệu theo mã tài liệu.");
			System.out.println("3. Hiển thị thông tin về tài liệu.");
			System.out.println("4. Tìm kiếm tài liệu theo loại : Sách, tạp chí, báo.");
			System.out.println("5. Thoát khỏi chương trình.");
			System.out.println("---------------------------------------------------------");

			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addDocument();
				break;
			case 2:
				delDocument();
				break;
			case 3:
				printListDocument();
				break;
			case 4:
				findByCategory();
				break;
			case 5:
				System.out.println("Thoát chương trình....");
				return;
			default:
				System.out.println("Vui lòng chọn đúng số trên menu.");
				break;
			}
		}
	}

	// Thêm tài liệu.
	private void addDocument() {
		System.out.println("Thêm tài liệu : ");
		System.out.println("1. Sách.");
		System.out.println("2. Tạp chí.");
		System.out.println("3. Báo.");

		int menuDoChoose = sc.nextInt();

		switch (menuDoChoose) {
		case 1:
			// Chức năng thêm sách.
			System.out.println("Nhập tên nhà xuất bản : ");
			String publisher = sc.next();
			System.out.println("Nhập số bản phát hành : ");
			int numRelease = sc.nextInt();
			System.out.println("Nhập tên tác giả : ");
			String authorName = sc.next();
			System.out.println("Nhập số trang của sách : ");
			int numPage = sc.nextInt();
			ID++;
			Document book = new Book(ID, publisher, numRelease, authorName, numPage);
			documentList.add(book);
			System.out.println("Bạn đã thêm thành công sách.");
			break;
		case 2:
			System.out.println("Nhập tên nhà xuất bản : ");
			String publisher1 = sc.next();
			System.out.println("Nhập số bản phát hành : ");
			int numRelease1 = sc.nextInt();
			System.out.println("Số phát hành : ");
			int idRelease = sc.nextInt();
			System.out.println("Nhập ngày phát hành : ");
			int day1 = sc.nextInt();
			System.out.println("Nhập tháng phát hành : ");
			int month1 = sc.nextInt();
			System.out.println("Nhập năm phát hành : ");
			int year1 = sc.nextInt();

			LocalDate releaseMagazine = LocalDate.of(year1, month1, day1);
			ID++;
			Document mangazine = new Magazine(ID, publisher1, numRelease1, idRelease, releaseMagazine);
			documentList.add(mangazine);
			System.out.println("Bạn đã thêm thành công tạp chí.");
			break;
		case 3:
			System.out.println("Nhập tên nhà xuất bản : ");
			String publisher2 = sc.next();
			System.out.println("Nhập số bản phát hành : ");
			int numRelease2 = sc.nextInt();
			System.out.println("Nhập ngày phát hành : ");
			int day2 = sc.nextInt();
			System.out.println("Nhập tháng phát hành : ");
			int month2 = sc.nextInt();
			System.out.println("Nhập năm phát hành : ");
			int year2 = sc.nextInt();

			LocalDate releaseArticle = LocalDate.of(year2, month2, day2);
			ID++;
			Document article = new Article(ID, publisher2, numRelease2, releaseArticle);
			documentList.add(article);
			System.out.println("Bạn đã thêm báo thành công.");
			break;
		default:
			System.out.println("Vui lòng chọn đúng số trên menu.");
			break;
		}
	}

	// Chức năng xóa tài liệu.
	private void delDocument() {
		System.out.println("Nhập vào mã tài liệu muốn xóa: ");
		int idDel = sc.nextInt();
		Boolean flagCheckExists = false;
		for (Document document : documentList) {
			if (document.getId() == idDel) {
				flagCheckExists = true;
			}
		}
		if (flagCheckExists) {
			documentList.removeIf(doc -> doc.getId() == idDel);
			for (Document document : documentList) {
				System.out.println("Xóa tài liệu thành công, danh sách tài liệu còn lại : ");
				System.out.println(document);
			}
		} else {
			System.out.println("Mã tài liệu bạn nhập không có trên hệ thống.");
		}
	}

	// Chức năng in danh sách tài liệu.
	private void printListDocument() {
		for (Document document : documentList) {
			System.out.println(document);
		}
	}

	// Chức năng tìm kiếm tài liệu.
	private void findByCategory() {
		System.out.println("Bạn muốn tìm kiếm tài liệu nào : 1. Sách. , 2.Tạp chí. , 3.Báo.");
		int menuFindChoose = sc.nextInt();
		
		switch (menuFindChoose) {
		case 1:
			for (Document document : documentList) {
				if (document instanceof Book) {
					System.out.println(document);
				}
			}
			break;
		case 2:
			for (Document document : documentList) {
				if (document instanceof Magazine) {
					System.out.println(document);
				}
			}
			break;
		case 3:
			for (Document document : documentList) {
				if(document instanceof Article) {
					System.out.println(document);
				}
			}
			break;
		default:
			break;
		}
	}
}

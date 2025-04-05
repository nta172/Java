package backend;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews{
	private Scanner sc;
	private ArrayList<News> listNews;
	
	public MyNews() {
		sc = new Scanner(System.in);
		listNews = new ArrayList<News>();
	}
	
	public void News() {
		menu();
	};
	
	public void menu() {
		while (true) {
			System.out.println("Lựa chọn của bạn...");
			System.out.println("1. Insert news.");
			System.out.println("2. View list news.");
			System.out.println("3. Average rate.");
			System.out.println("4. Exit.");
			
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Nhập vào Title của News : ");
				String title = sc.next();
				System.out.println("Nhập vào PublishDate của News : ");
				String publishDate = sc.next();
				System.out.println("Nhập vào Author của News : ");
				String author = sc.next();
				System.out.println("Nhập vào Content của News : ");
				String content = sc.next();

				System.out.println("Vui lòng nhập vào đánh giá 1 : ");
				int rate1 = sc.nextInt();
				System.out.println("Vui lòng nhập vào đánh giá 2 : ");
				int rate2 = sc.nextInt();
				System.out.println("Vui lòng nhập vào đánh giá 3 : ");
				int rate3 = sc.nextInt();
				
				int[] rates = {rate1, rate2, rate3};
				News news = new News(title, publishDate, author, content, rates);
				listNews.add(news);
				break;
			case 2:
				for (News new1 : listNews) {
					new1.display();
				}
				break;
			case 3:
				System.out.println("Đánh giá trung bình rate.");
				for (News new1 : listNews) {
					System.out.println("Title : " + new1.getTitle()+ "Rate : " + new1.calculate());
				}
				break;
			case 4:
				
				return;
			default:
				System.out.println("Vui lòng bạn nhập đúng số chọn.");
				break;
			}
		}
	}
}

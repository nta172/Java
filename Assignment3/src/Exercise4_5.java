import java.util.Scanner;

public class Exercise4_5 {
    public static void main(String[] args) {
        /* Question 5 : Viết chương trình để người dùng nhập vào họ, sau đố yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập vào họ của bạn : ");
        String s1 = scanner.nextLine();
        System.out.println("Vui lòng nhập vào tên của bạn : ");
        String s2 = scanner.nextLine();

        System.out.println("Họ và tên đầy đủ của bạn là : " + s1 + " " + s2);
        scanner.close();
    }
}

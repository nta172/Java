import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] args) {
        /* Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên. */
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Vui lòng nhập vào tên của bạn : ");
        name = scanner.nextLine();
        String firstCharacter = name.substring(0, 1).toUpperCase(); // name.substring(0,1) Lấy ký tự chuỗi đầu tiên.
        String leftCharacter = name.substring(1);
        name = firstCharacter + leftCharacter;
        System.out.println(name);

        scanner.close();
    }
}

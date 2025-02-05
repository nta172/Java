import java.util.Scanner;

public class Exercise4_6 {
    public static void main(String[] args) {
        /*
         * Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ
         * thống sẽ tách ra họ, tên, tên đệm.
         * VD:
         * Người dùng nhập vào "Nguyễn Văn Nam"
         * Hệ thống sẽ in ra
         * "Họ là: Nguyễn"
         * "Tên đệm là: Văn"
         * "Tên là: Nam"
         */
        String fullName;
        String firstName = "", middleName = "", lastName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập họ tên đầy đủ : ");
        fullName = scanner.nextLine();

        fullName = fullName.trim(); // Loại bỏ khoảng trắng dư thừa đầu và cuối chuỗi.
        String[] words  = fullName.split(" "); // split tạo mảng VD "Nguyễn Văn Nam" = ["Nguyễn", "Văn", "Nam"]
        lastName = words[0];
        firstName = words[words.length - 1];
        for (int i = 1; i <= words.length - 2; i++) {
            middleName += words[i] + " ";
        }
        System.out.println("Họ là : " + lastName);
        System.out.println("Tên đệm là : " + middleName);
        System.out.println("Tên là : " + firstName);
        scanner.close();

    }
}

import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args) {
        // Exercise 4 : String
        /*
         * Question 1:
         * Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
         * thể cách nhau bằng nhiều khoảng trắng );
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng bạn nhập vào: ");
        String s = scanner.nextLine().trim(); // Loại bỏ khoảng trắng thừa ở đầu và cuối

        // Tách từ bằng regex "\\s+" để xử lý nhiều khoảng trắng liên tiếp
        String[] words = s.isEmpty() ? new String[0] : s.split("\\s+");
        System.out.println("Số lượng từ: " + words.length);

        scanner.close();
    }
}

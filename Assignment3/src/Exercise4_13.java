import java.util.Scanner;

public class Exercise4_13 {
    public static void main(String[] args) {
        /*
         * Question 13 (Optional): String not contains digit
         * Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
         * Ví dụ:
         * "abc" => true
         * "1abc", "abc1", "123", "a1bc", null => false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi : ");
        String s = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < s.length(); i++) {
            if (checkKeyNumber(s.charAt(i))) {
                System.out.println("False");
                return;
            } else {
                System.out.println("True");
                return;
            }
        }
    }

    public static boolean checkKeyNumber(char ch){
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}

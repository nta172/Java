import java.util.Scanner;

public class Exercise4_11 {
    public static void main(String[] args) {
        /*
         * Question 11 (Optional): Count special Character
         * Tìm số lần xuất hiện ký tự "a" trong chuỗi
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào chuỗi ký tự : ");
        String s = scanner.nextLine();
        scanner.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class Exercise4_12 {
    public static void main(String[] args) {
        /*
         * Question 12 (Optional): Reverse String
         * Đảo ngược chuỗi sử dụng vòng lặp
         */
        Scanner scanner = new Scanner(System.in);
        String s , reserves = "";
        System.out.println("Nhập vào chuỗi bạn muốn đảo ngược : ");
        s = scanner.nextLine();

        for (int i = s.length() - 1; i >=0; i--) {
            reserves += s.charAt(i);
        }
        System.out.println(reserves);
        scanner.close();
    }
}

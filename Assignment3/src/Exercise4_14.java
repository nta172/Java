import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {
        /*
         * Question 14 (Optional): Replace character
         * Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
         * Ví dụ:
         * "I love Java" chuyển ký tự 'e' sang '*' kết quả " I lov* Java"
         */
        Scanner scanner = new Scanner(System.in);
        String str;
        char ch1, ch2;

        System.out.println("Nhập chuỗi : ");
        str = scanner.nextLine();

        System.out.println("Nhập kí tự muốn chuyển : ");
        ch1 = scanner.nextLine().toCharArray()[0]; // Chuyển một mảng Strin sang array char, sau đó lấy phần tử thứ 0;

        System.out.println("Nhập kí tự sẽ chuyển : ");
        ch2 = scanner.nextLine().toCharArray()[0];

        scanner.close();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                str = str.replace(ch1, ch2);
            }
        }
        System.out.println("Chuỗi sau khi chuyển : " + str);
    }
}

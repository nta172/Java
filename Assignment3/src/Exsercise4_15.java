import java.util.Scanner;

public class Exsercise4_15 {
    public static void main(String[] args) {
        /*
         * Question 15 (Optional): Revert string by word
         * Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
         * Ví dụ: " I am developer " => "developer am I".
         * Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
         * Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi
         * theo dấu cách
         */
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

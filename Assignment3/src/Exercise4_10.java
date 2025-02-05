import java.util.Scanner;

public class Exercise4_10 {
    public static void main(String[] args) {
        /*
         * Question 10 (Optional):
         * Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
         * Nếu có xuất ra “OK” ngược lại “KO”.
         * Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau
         */
        Scanner scanner = new Scanner(System.in);
        String s1, s2, reverses1 = "";
        System.out.println("Vui lòng nhập vào chuối 1 : ");
        s1 = scanner.nextLine();
        System.out.println("Vui lòng nhập vào chuỗi 2 : ");
        s2 = scanner.nextLine();

        scanner.close();
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverses1 += s1.substring(i, i + 1); // substring : cắt 1 phần tử
        }        
        if (s2.equals(reverses1)) {
            System.out.println("Hai chuỗi đảo ngược nhau.");
        } else {
            System.out.println("Hai chuỗi không phải đảo ngược nhau");
        }
    }
}

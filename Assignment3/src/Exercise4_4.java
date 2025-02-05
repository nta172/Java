import java.util.Scanner;

public class Exercise4_4 {
    public static void main(String[] args) {
        /* Viêt chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra 
         * VD : 
         * Người dùng nhập vào "Nam", hệ thống sẽ in ra
         * "Ký tự thứ 1 là : N"
         * "Ký tự thứ 2 là : A"
         * "Ký tự thứ 3 là : M"
        */
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Vui lòng nhập tên của bạn : ");
        name = scanner.nextLine();
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + (i+1) +  "là " + name.charAt(i));
        }
        scanner.close();
    }
}

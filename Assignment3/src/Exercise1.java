import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /* Datatype Casting
         * Question 1 : Khai báo 2 số lương có kiểu dữ liệu là float
         * Khởi tạo Lương của Account 1 là 5240.5$
         * Khởi tạo Lương của Account 2 là 10970.055$
         * Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
         * Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
         */
        float luong1;
        float luong2;

        luong1 = 5240.5f;
        luong2 = 10970.055f;

        int a = (int) luong1;
        int b = (int) luong2;

        System.out.println("Lương nhân viên 1: " + a);
        System.out.println("Lương nhân viên 2: " + b);

        /*
         * Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ
         * thêm có số 0 ở đầu cho đủ 5 số)
         */
        // Cách 1:
        Random random = new Random();
        int c = random.nextInt(100000);
        System.out.printf("Số ngẫu nhiên là " + String.format("%05d", c));

        // Cách 2:
        int min = 0;
        int max = 99999;
        int d = (int) (Math.random() * max) + min;
        while (d < 10000) {
            d = d * 10;
        }
        System.out.println("\nSố ngẫu nhiên là: " + d);

        // Question 3 : Lấy 2 số cuối của số ở Question 2 và in ra
        int min1 = 0;
        int max1 = 99999;
        int d1 = (int) (Math.random() * max1) + min1;
        while (d1 < 10000) {
            d1 = d1 * 10;
        }
        System.out.println("Số ngẫu nhiên là :" + d1);
        System.out.println("Hai số cuối là: " + d1 % 100);

        String d2 = String.valueOf(d1);
        System.out.println("Hai số cuối là : " + d2.substring(3));

        // Question 4 : Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của
        // chúng.
        int a1 , b1;
        @SuppressWarnings("resource") // Bỏ qua cảnh báo :))
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a1 của bạn : ");
        a1 = scanner1.nextInt();

        do {
            System.out.println("Nhập vào số nguyên b1 của bạn : ");
            b1 = scanner1.nextInt();
            if (b1 == 0) {
                System.out.println("Vui lòng nhập số khác 0");
            }
        } while (b1 == 0);

        float c1 = (float) a1 / (float) b1;
        System.out.println("Thương của 2 số là : " + c1);

        // Method
        question4();
    }

    public static void question4() {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x : ");
        x = scanner.nextInt();

        do {
            System.out.println("Nhập y :");
            y = scanner.nextInt();
            if (y == 0) {
                System.out.println("Vui lòng nhập lại số khác 0");
            }
        } while (y == 0);
        scanner.close();
        System.out.println("Thương : " + (float) x / (float) y);
    }
}
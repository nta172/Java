package backend;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanApp {

    private static final String filePath = "C:\\Users\\NTA\\Desktop\\Java\\LoDe\\bin\\data\\Account.txt";

    public void TaiKhoanApp() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ dòng thừa

            switch (choice) {
                case 1:
                    dangKy(scanner);
                    break;
                case 2:
                    dangNhap(scanner);
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // Hàm đăng ký
    public static void dangKy(Scanner scanner) {
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();

        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(username + "," + password);
            writer.newLine();
            System.out.println("Đăng ký thành công!");
        } catch (IOException e) {
            System.out.println("Có lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Hàm đăng nhập
    public static void dangNhap(Scanner scanner) {
        System.out.print("Nhập username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Nhập password: ");
        String passwordInput = scanner.nextLine();

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String username = parts[0];
                    String password = parts[1];

                    if (username.equals(usernameInput) && password.equals(passwordInput)) {
                        found = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
        }

        if (found) {
            System.out.println("Đăng nhập thành công! Chào mừng " + usernameInput + "!");
        } else {
            System.out.println("Đăng nhập thất bại. Sai username hoặc password.");
        }
    }
}

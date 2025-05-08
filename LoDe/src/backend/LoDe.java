package backend;

import java.util.Random;

public class LoDe {
	//Config
	public final static int tiGiaDanhDe = 70;
    public final static float tiGiaDiem = 24.5f;
    public final static int tiGiaDanhLo = 80;
    static String userName = "NguyenVanA";
    static float taiKhoan = 1000;
    private static Random random = new Random();
    public static int[] giai7 = new int[4];
    public static int[] giai6 = new int[3];
    public static int[] giai5 = new int[6];
    public static int[] giai4 = new int[4];
    public static int[] giai3 = new int[6];
    public static int[] giai2 = new int[2];
    public static int giai1;
    public static int giaiDacBiet;
    public static boolean result;
    
    // Đề
    public static int soDe;
    public static int soTien;

    // Lô
    public static int soLo;
    public static int soDiem;
    public static int soNhay;
    
    public void LoDeProgram() {
    	System.out.println("Xin chào " + userName);
        System.out.println("Tài khoản của bạn hiện tại là: " + taiKhoan + "VNĐ");
        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("Mời bạn chọn chức năng : \n"
                    + "1. Đánh đề \n"
                    + "2. Đánh lô \n"
                    + "3. Cắm sổ đỏ \n"
                    + "4. Thoát");

            System.out.print("Nhập: ");
            int choose = ScannerUltis.inputInt();

            switch (choose) {
                case 1:
                    danhDe();
                    break;
                case 2:
                    danhLo();
                    break;
                case 3:
                    System.out.println("Bạn lựa chọn cắm sổ đỏ");
                    break;
                case 4:
                    System.out.println("Hẹn gặp bạn lần sau!");
                    return;
                default:
                    System.out.println("Bạn nhập sai, Vui lòng bạn nhập lại.");
                    break;
            }
        }
    }

    // Đánh đề.
    public static void danhDe() {
        System.out.print("Mời bạn nhập số đề: ");
        soDe = ScannerUltis.inputInt();

        System.out.print("và số tiền: ");
        soTien = ScannerUltis.inputInt();

        System.out.println("Đã tới 6h, kết quả là: ");

        randomGiai();
        printGiai();
        checkDe();

        if (result) {
            int soTienThangGiai = soTien * tiGiaDanhDe;
            taiKhoan += soTienThangGiai;

            System.out.println("\nBạn vừa trúng!");
            System.out.println("Số tiền trúng là: " + soTienThangGiai);
            System.out.println("Số dư hiện tại là: " + taiKhoan);
        } else {
            taiKhoan -= soTien;
            System.out.println("\nBạn đã tạch: ");
            System.out.println("Số dư hiện tại là: " + taiKhoan);
        }

    }

    // Đánh lô.
    public static void danhLo() {
        System.out.print("Mời bạn nhập số Lô: ");
        soLo = ScannerUltis.inputInt();;

        System.out.print("và số điểm: ");
        soDiem = ScannerUltis.inputInt();;

        System.out.println("Đã tới 6h, kết quả là: ");

        randomGiai();
        printGiai();
        checkLo();

        if (soNhay == 0) {
            taiKhoan -= soDiem * tiGiaDiem;

            System.out.println("\nBạn vừa tạch! ");
            System.out.println("Số dư hiện tại là: " + taiKhoan);
        } else {
            float soTienThangGiai = (soDiem * (tiGiaDanhLo - tiGiaDiem)) * soNhay;
            taiKhoan += soTienThangGiai;

            System.out.println("\nBạn vừa trúng!" + soNhay + " Nháy");
            System.out.println("Số tiền trúng là: " + soTienThangGiai);
            System.out.println("Số dư hiện tại là: " + taiKhoan);
        }

    }

    // RadomGiai
    public static void randomGiai() {
        // Random giải 7:
        for (int i = 0; i < giai7.length; i++) {
            // Random từ 0->99
            giai7[i] = random.nextInt(100);
        }
        // Random giải 6:
        for (int i = 0; i < giai6.length; i++) {
            // Random từ 0->999
            giai6[i] = random.nextInt(1000);
        }
        // Random giải 5:
        for (int i = 0; i < giai5.length; i++) {
            // Random từ 0->9999
            giai5[i] = random.nextInt(10000);
        }
        // Random giải 4:
        for (int i = 0; i < giai4.length; i++) {
            // Random từ 0->9999
            giai4[i] = random.nextInt(10000);
        }
        // Random giải 3:
        for (int i = 0; i < giai3.length; i++) {
            // Random từ 0->99999
            giai3[i] = random.nextInt(100000);
        }
        // Ramdon giải 2:
        for (int i = 0; i < giai2.length; i++) {
            // Random từ 0->99999
            giai2[i] = random.nextInt(100000);
        }

        // Random giải 1:
        giai1 = random.nextInt(100000);

        // Ramdom giải đặc biệt:
        giaiDacBiet = random.nextInt(100000);
    }

    // In Giải
    public static void printGiai() {
        // Random giải đặc biệt:
        System.out.printf("Giải ĐB %26s \n", String.format("%05d", giaiDacBiet));

        // Random giai1 :
        System.out.printf("Giải 1 %27s \n", String.format("%05d", giai1));

        // Random giải 2
        System.out.print("Giải 2 ");
        for (int i = 0; i < giai2.length; i++) {
            System.out.printf("%17s", String.format("%05d", giai2[i]));
            if (i < giai2.length - 1) {
                System.out.print("   ");
            }
        }

        // Random giải 3
        System.out.print("\nGiải 3 ");
        for (int i = 0; i < giai3.length; i++) {
            System.out.printf("%12s", String.format("%05d", giai3[i]));
            if (i == 2) {
                // Xuống dòng sau khi in 3 số đầu tiên
                System.out.println();
                System.out.print("       ");
            } else if (i < giai3.length - 1) {
                // Thêm khoảng cách giữa các số
                System.out.print("   ");
            }
        }
        // Random giải 4
        System.out.print("\nGiải 4");
        for (int i = 0; i < giai4.length; i++) {
            System.out.printf("%10s", String.format("%04d", giai4[i]));
            if (i < giai4.length - 1) {
                System.out.print("   ");
            }
        }
        // Random giải 5
        System.out.print("\nGiải 5 ");
        for (int i = 0; i < giai5.length; i++) {
            System.out.printf("%10s", String.format("%04d", giai5[i]));
            if (i == 2) {
                // Xuống dòng sau khi in 3 số đầu tiên
                System.out.println();
                System.out.print("       ");
            } else if (i < giai3.length - 1) {
                // Thêm khoảng cách giữa các số
                System.out.print("   ");
            }
        }
        // Random giải 6
        System.out.print("\nGiải 6");
        for (int i = 0; i < giai6.length; i++) {
            System.out.printf("%11s", String.format("%03d", giai6[i]));
            if (i < giai6.length - 1) {
                System.out.print("   ");
            }
        }
        // Random giải 7
        System.out.print("\nGiải 7");
        for (int i = 0; i < giai7.length; i++) {
            System.out.printf("%8s", String.format("%02d", giai7[i]));
            if (i < giai7.length - 1) {
                System.out.print("   ");
            }
        }
    }

    // Check đề
    public static void checkDe() {
        // Tách 2 số cuối
        int haiSoCuoi = giaiDacBiet % 100;

        // Check giải đặc biệt
        if (soDe == haiSoCuoi) {
            result = true;
        } else {
            result = false;
        }

    }

    // Check lô
    public static void checkLo() {
        soNhay = 0;
        // Check giai 7
        for (int i : giai7) {
            if (soLo == i) {
                soNhay++;
            }
        }
        // Check giai 6
        for (int i : giai6) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }
        // Check giai 5
        for (int i : giai5) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }
        // Check giai 4
        for (int i : giai4) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }
        // Check giai 3
        for (int i : giai3) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }
        // Check giai 2
        for (int i : giai2) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }
        int haiSoCuoiGiai1 = giai1 % 100;
        if (soLo == haiSoCuoiGiai1) {
            soNhay++;
        }
        int haiSoCuoiGiaiDacBiet = giaiDacBiet % 100;
        if (soLo == haiSoCuoiGiaiDacBiet) {
            soNhay++;
        }
    }
}

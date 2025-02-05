import java.util.Scanner;

public class Exercise4_7 {
    public static void main(String[] args) {
        /*
         * Question 7:
         * Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
         * a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
         * VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam"
         * b) Viết hoa chữ cái mỗi từ của người dùng
         * VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
         */
        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.println("Nhập họ tên đầy đủ");
        fullName = scanner.nextLine();
        scanner.close();

        fullName = fullName.trim();
        fullName = fullName.replaceAll("\\s+", " "); // Chuyển nhiều khoảng trắng liên tiếp thành 1 khoảng trắng duy nhất
        String[] words = fullName.split(" ");
        fullName = "";
        for (String word : words) {
            String firstCharacter = word.substring(0, 1).toUpperCase();
            String leftCharacter = word.substring(1);
            word = firstCharacter + leftCharacter;
            fullName += word + " ";
        }
        System.out.println("Họ tên sau khi chuẩn hóa : " + fullName);
    }
}

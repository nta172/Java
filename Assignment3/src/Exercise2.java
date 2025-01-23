import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        /* Default value
         * Question 1: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và
         * khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
         *  Email: "Email 1"
         *  Username: "User name 1"
         *  FullName: "Full name 1"
         *  CreateDate: now
         */
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].email = "Email " + (i+1);
            accounts[i].userName = "User name " + (i+1);
            accounts[i].fullName = "Full Name " + (i+1);
            accounts[i].localDate = LocalDate.now();
        }

        for (Account account : accounts) {
            System.out.println("Email: " + account.email);
            System.out.println("Username: " + account.userName);
            System.out.println("Fullname: " + account.fullName);
            System.out.println("CreateDate: " + account.localDate);
        }
    }
}

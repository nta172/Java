import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
            /*Question 2 : Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1*/
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng nhập vào chuối kí tự 1 : ");
            String s1 = sc.next();
            System.out.println("Vui lòng nhập vào chuỗi kí tự 2: ");
            String s2 = sc.next();
    
            System.out.println("Kết quả sau khi nối " + s1 + " " + s2);
            
            sc.close();
    }
}

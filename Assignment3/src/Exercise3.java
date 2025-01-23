public class Exercise3 {
    public static void main(String[] args) {
        // Boxing & Unboxing
        /*
         * Question 1:
         * Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
         * Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
         * float có 2 số sau dấu thập phân)
         */
        System.out.println("------Question 1-----------");
        Integer x = 5000;
        float z = x.floatValue();
        System.out.printf("%.2f \n", z);

        /*
         * Question 2:
         * Khai báo 1 String có value = "1234567"
         * Hãy convert String đó ra số int
         */
        System.out.println("------Question 2-----------");
        String a = "1234567";
        int b = Integer.parseInt(a);
        System.out.println(b);

        /*
         * Question 3:
         * Khởi tạo 1 số Integer có value là chữ "1234567"
         * Sau đó convert số trên thành datatype int
         */
        System.out.println("------Question 3-----------");
        Integer c = 1234567;
        int d = c.intValue();
        System.out.println(d);
    }
}

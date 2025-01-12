package com.vti.frontend;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        /* Question 1 : In ngẫu nhiên ra 1 số nguyên.*/
        System.out.println("-----------------Question 1------------------");
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);

        /* Question 2 : In ngẫu nhiên ra 1 số thực. */
        Random random2 = new Random();
        float y = random2.nextFloat();
        System.out.println(y);

        /* Question 3 : Khai báo 1 array bao gồm các tên của các bạn trong lớp
         * sau đó in ngẫu nhiên ra tên 1 bạn
         */
        System.out.println("-----------------Question 3------------------");
        String[] NameArray = {"Thế Anh", "Thành", "Mai", "Tuấn", "Tú"};
        int i = random.nextInt(NameArray.length);
        System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + NameArray[i]);

        /* Question 4 : Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới 20-12-1995 */
        System.out.println("-----------------Question 4------------------");
        Random random3 = new Random();

        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay(); // Lấy ra ngày nhỏ nhất
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay(); // Lấy ra ngày lớn nhất

        System.out.println("minday: " + minDay);
        System.out.println("maxday: " + maxDay);

        long randomInt = minDay + random3.nextInt(maxDay - minDay); // Lấy ra số ngày ngẫu nhiên trong khoảng thời gian

        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);

        System.out.println(randomDay);

        /* Question 5 : Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây */
        System.out.println("-----------------Question 5------------------");
        int now = (int) LocalDate.now().toEpochDay();
        int randomDate = now - random.nextInt(365);
        LocalDate resultDate = LocalDate.ofEpochDay(randomDate);
        System.out.println("Ngày ngẫu nhiên là : " + resultDate);

        /* Question 6 : Lấy ngẫu nhiên 1 ngày trong quá khứ */
        System.out.println("-----------------Question 6------------------");
        int maxDay1 = (int) LocalDate.now().toEpochDay();
        int randomDay1 = now - random.nextInt(maxDay1);
        LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay1);
        System.out.println("1 Ngày ngẫu nhiên trong quá khứ: " + resultDate1);

        /* Question 7 : Lấy ngẫu nhiên 1 số có 3 chữ số */
        System.out.println("-----------------Question 7------------------");
        Random random4 = new Random();

        int a = random4.nextInt(999 - 100 + 1) + 100; // Công thức : (số max - số min + 1) + số min
        System.out.println(a);
    }
}

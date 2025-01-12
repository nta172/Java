package com.vti.frontend;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Exercise2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";

        // Create Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;

        // Create Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";

        // Create Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "nta1@gmail.com";
        acc1.userName = "nta1";
        acc1.fullName = "Nguyen The Anh 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        Group[] groupAcc1 = {group1, group2};
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "nta2@gmail.com";
        acc2.userName = "nta2";
        acc2.fullName = "Nguyen The Anh 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2024, 2, 17);
        acc2.groups = new Group[]{group3, group2};

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "nta3@gmail.com";
        acc3.userName = "nta3";
        acc3.fullName = "Nguyen The Anh 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        // add Group Account
        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc2};

        /* Question 1 : Khai báo số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó */
        System.out.println("---------------Question 1-----------------");
        int a = 5;
        System.out.printf("%d%n", a);

        /* Question 2 : Khai báo 1 số nguyên = 100000000 và sử dụng system out printf để in ra số nguyên đó thành định dang
         * như sau : 100,000,000
         */
        System.out.println("---------------Question 2-----------------");
        int b = 100000000;
        System.out.printf(Locale.US ,"%,d%n", b);

        /* Question 3 : Khai báo 1 số thực = 5,567098 và sử dụng system out printf để in ra số thực đó 
         * chỉ bao gồm 4 số đằng sau:
         */
        System.out.println("---------------Question 3-----------------");
        float c = 5.567098f;
        System.out.printf("%.4f%n", c);

        /* Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau:
         * Họ và tên : "Nguyễn Văn A" thì sẽ in ra trên consolo như sau:
         * Tên tôi là "Nguyên Văn A" và tôi đang độc thân
         */
        System.out.println("--------------Question 4-----------------");
        String s = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"" + s + "\" và tôi đang độc thân \n");

        /* Question 5 : Lấy thời gian bây giờ và in ra theo định dạng như sau: 12/01/2025 14h:16p:20s */
        System.out.println("--------------Question 5-----------------");
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        /* Question 6 : In ra thông tin account như Question 8 phần ForEach theo định dạng table */
        System.out.println("--------------Question 6-----------------");
        System.out.printf("%-5s| %-20s| %-20s| %-10s| \n", "ID" , "Email", "FullName", "Department");
        System.out.println("---------------------------------------------------------------------------------------");
        Account[] accArray = {acc1, acc2, acc3};
        for(Account account : accArray){
            System.err.printf("%-5d| %-20s| %-20s| %-10s| \n",
                                account.id,
                                account.email,
                                account.fullName,
                                account.department.name);                  
        }
    }
}

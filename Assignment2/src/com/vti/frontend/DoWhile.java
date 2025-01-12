package com.vti.frontend;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class DoWhile {
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

        // Question 17: Làm lại các Question ở phần For bằng cách sử dụng Do-While kết hợp với lệnh break, continue.
        System.out.println("-------------------Question 17.0---------------------");
        Account[] accArray = {acc1, acc2};
        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:" );
            System.out.println("Email: " + accArray[i].id);
            System.out.println("FullName: " + accArray[i].fullName);
            System.out.println("Phòng ban: " + accArray[i].department.name);
            i++;
        } while (i < accArray.length);

        System.out.println("-------------------Question 17.1---------------------");
        Department[] depArray = {dep1, dep2};
        int j = 0;
        do {
            System.out.println("ID: " + depArray[j].id);
            System.out.println("Name: " + depArray[j].name);
            j++;
        } while (j < depArray.length);
        
        System.out.println("-------------------Question 17.2---------------------");
        Account[] accArray1 = {acc1, acc2, acc3};
        int i1 = 0;
        do {
            System.out.println("Thông tin account thứ " + (i1 + 1) + " là:" );
            System.out.println("Email: " + accArray1[i1].id);
            System.out.println("FullName: " + accArray1[i1].fullName);
            System.out.println("Phòng ban: " + accArray1[i1].department.name);
            i1++;
        } while (i1 < 2);

        System.out.println("--------------Question 17.3-----------------------");
        Account[] accArray2 = {acc1, acc2, acc3};
        int i2 = 0;
        do {
            if (i2 != 1) {
                System.out.println("Thông tin account thứ " + (i2 + 1) + " là:" );
                System.out.println("Email: " + accArray2[i2].id);
                System.out.println("FullName: " + accArray2[i2].fullName);
                System.out.println("Phòng ban: " + accArray2[i2].department.name);
            }
            i2++;
        } while (i2 < accArray2.length);

        System.out.println("--------------Question 17.4-----------------------");
        Account[] accArray3 = {acc1, acc2, acc3};
        int i3 = 0;
        do {
            if (accArray3[i3].id < 4) {
                System.out.println("Thông tin account thứ " + (i3 + 1) + " là:" );
                System.out.println("Email: " + accArray3[i3].id);
                System.out.println("FullName: " + accArray3[i3].fullName);
                System.out.println("Phòng ban: " + accArray3[i3].department.name);
            }
            i3++;
        } while (i3 < accArray3.length);

        System.out.println("--------------Question 17.5-----------------------");
        int i4 = 1;
        do {
            if (i4 % 2 == 0) {
                System.out.println(i4);
            }
            i4++;
        } while (i4 <= 20);
    }
}

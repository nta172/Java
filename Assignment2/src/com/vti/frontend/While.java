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

public class While {
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
        
        // Question 16: Làm lại các Question ở phần For bằng cách sử dụng While kết hợp với lệnh break, continue
        System.out.println("---------------Question 16.0-----------------------");
        Account[] accArray = {acc1, acc2};
        int i = 0;
        while (i < accArray.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray[i].email);
            System.out.println("FullName: " + accArray[i].fullName);
            System.out.println("Phòng ban: " + accArray[i].department.name);
            i++;
        }

        System.out.println("----------------Question 16.1------------------");
        Department[] depArray = {dep1, dep2};
        int j = 0;
        while (j < depArray.length) {
            System.out.println("ID: " + depArray[j].id);
            System.out.println("Name: " + depArray[j].name);
            j++;
        }
        // Cách 1 : Không sử dụng break
        System.out.println("----------------Question 16.2------------------");
        Account[] accArray1 = {acc1, acc2, acc3};
        i = 0;
        while (i < 2) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là");
            System.out.println("Email: " + accArray1[i].email);
            System.out.println("FullName: " + accArray1[i].fullName);
            System.out.println("Phòng ban: " + accArray1[i].department.name);
            i++;
        }
        // Cách 2 : Sử dụng break
        System.out.println("-------------------Cách 2-----------------------");
        Account[] accArray2 = {acc1, acc2, acc3};
        i = 0;
        while (i < accArray2.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là");
            System.out.println("Email: " + accArray1[i].email);
            System.out.println("FullName: " + accArray1[i].fullName);
            System.out.println("Phòng ban: " + accArray1[i].department.name);
            i++;
            if (i == 2) {
                break;
            }
        }    
        // Cách 1 : Sử dụng continue
        System.out.println("-------------------Question 16.3..................");
        Account[] accArray3 = {acc1, acc2, acc3};
        i = 0;
        while (i < accArray3.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là");
            System.out.println("Email: " + accArray3[i].email);
            System.out.println("FullName: " + accArray3[i].fullName);
            System.out.println("Phòng ban: " + accArray3[i].department.name);
            i++;
        }
        // Cách 2 : Không sử dụng continue
        System.out.println("-----------------Cách 2-------------------");
        Account[] accArray4 = {acc1, acc2, acc3};
        i = 0;
        while (i < accArray4.length) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là");
                System.out.println("Email: " + accArray4[i].email);
                System.out.println("FullName: " + accArray4[i].fullName);
                System.out.println("Phòng ban: " + accArray4[i].department.name);
            }
            i++;
        }

        System.out.println("-------------------Question 16.4---------------------");
        Account[] accArray5 = {acc1, acc2, acc3};
        i = 0;
        while (i < accArray5.length) {
            if (accArray5[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là");
                System.out.println("Email: " + accArray5[i].email);
                System.out.println("FullName: " + accArray5[i].fullName);
                System.out.println("Phòng ban: " + accArray5[i].department.name);
            }
            i++;
        }

        System.out.println("-----------------Question 16.5----------------------");
        i = 1;
        while (i <= 20) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

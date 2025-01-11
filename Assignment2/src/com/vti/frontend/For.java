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

public class For {
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

        System.out.println("-----------------Question 10---------------------");
        /* Question 10 : In ra thông tin các account bao gồm : Email,fullName và tên phòng ban của họ theo định dạng như sau 
         * Thông tin account thứ 1 là:
         * Email: NguyenVanA@gmail.com
         * Full name: Nguyễn Văn A
         * Phòng ban: Sale
        */
        Account[] accArray1 = {acc1, acc2, acc3};
        for (int i = 0; i < accArray1.length; i++){
            System.out.println("Thông tin của account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray1[i].email);
            System.out.println("fullName: " + accArray1[i].fullName);
            System.out.println("Department: " + accArray1[i].department.name);
        }

        /* Question 11 : In ra thông tin các phòng ban bao gồm : id và nam theo định dạng sau:
         * Thông tin department thứ 1 là :
         * Id : 1
         * Name : Sale
         */
        System.out.println("-----------------Question 11---------------------");
        Department[] depArray1 = {dep1, dep2, dep3};
        for (int i = 0; i < depArray1.length; i++){
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("ID: " + depArray1[i].id);
            System.out.println("Name: " + depArray1[i].name);
        }

        /*Question 12 : Chỉ in ra thông tin 2 account đầu tiên theo định dạng như Question 10 */
        System.out.println("-----------------Question 12---------------------");
        Account[] accArray2 = {acc1, acc2, acc3};
        for (int i = 0 ; i < 2; i++) {
            System.out.println("Thông tin của account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray2[i].email);
            System.out.println("fullName: " + accArray2[i].fullName);
            System.out.println("Department: " + accArray2[i].department.name);
        } 

        /*Question 13 :In ra thông tin tất cả các account ngoại trừ account thứ 2 */
        System.out.println("-----------------Question 13---------------------");
        Account[] accArray3 = {acc1, acc2, acc3};
        for (int i = 0 ; i < accArray3.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin của account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accArray3[i].email);
                System.out.println("fullName: " + accArray3[i].fullName);
                System.out.println("Department: " + accArray3[i].department.name);
            }
        } 

        /*Question 14 : In ra tất cả các account có id < 4 */
        System.out.println("-----------------Question 14---------------------");
        Account[] accArray4 = {acc1, acc2, acc3};
        for (int i = 0; i < accArray4.length; i++) {
            if (accArray4[i].id < 4) {
                System.out.println("Thông tin của account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accArray4[i].email);
                System.out.println("fullName: " + accArray4[i].fullName);
                System.out.println("Department: " + accArray4[i].department.name);
            }
        }

        /* In ra các số chẵn nhỏ hơn hoặc bằng 20 */
        System.out.println("-----------------Question 15---------------------");
        for (int i = 0; i <= 20; i+=2){
            System.out.println(i);
        }
    }
}

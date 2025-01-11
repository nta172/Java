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

public class SwitchCase {
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

        System.out.println("-----------------------Question 5--------------------------");
        /* Question 5:
         * Lấy ra só lượng account trong nhóm thứ 1 và in ra theo format sau:
         * Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
         * Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
         * Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
         * Còn lại in ra "Nhóm có nhiều thành viên"
         */
        if(group1.accounts == null){
            System.out.println("Nhóm chưa có thành viên tham gia");
        }else {
            int countGroup = group1.accounts.length;
            switch (countGroup) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3 :
                    System.out.println("Nhóm có ba thành viên");    
                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }

        System.out.println("-----------------------Question 6--------------------------");
        /* Question 6: Sử dụng swtich case để làm lại Question 2 */
        if (acc2.groups == null){
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = acc2.groups.length;
            switch (countGroup) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");   
                    break; 
                default:
                    System.out.println("Nhâ viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
        
        System.out.println("-----------------------Question 7--------------------------");
        /* Question 7 : Sử dụng switch case để làm lại Question 4 */
        switch (acc1.position.name.toString()) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;       
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }
}

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

public class FlowControl {
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

        System.out.println("-----------------------Question 1--------------------------");
        // Question 1 :
        /* Kiểm tra account thứ 2
         * Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
         * Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
         */

        if (acc2.department == null){
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nhân viên này là :" + acc2.department.name);
        }

        System.out.println("-----------------------Question 2--------------------------");
        // Question 2 :
        /* Kiểm tra account thứ 2
         * Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
            Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
            Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
            Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
         */
        int countGroup = acc2.groups.length;
        if (countGroup == 0){
            System.out.println("Nhân viên này chưa có group");
        }else {
            if (countGroup == 1 || countGroup ==2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (countGroup == 3){
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }
            if (countGroup >= 4){
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }

        System.out.println("-----------------------Question 3--------------------------");
        // Question 3 : Sử dụng toán tử Ternary để làm Question 1
        System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + acc2.department.name);

        System.out.println("-----------------------Question 4--------------------------");
        // Question 4 :
        /* Sử dụng toán tử ternary để làm yêu cầu sau:
         * Kiểm tra Position của account thứ 1
         * Nếu Position = Dev thì in ra text "Đây là Developer"
         * Nếu không phải thì in ra text "Người này không phải là Developer"
        */

        System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
    }
}

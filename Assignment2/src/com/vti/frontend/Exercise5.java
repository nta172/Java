package com.vti.frontend;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5 {
        private static void question1 () {
            /*Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình */
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào 3 số nguyên: ");
            System.out.println("Nhập vào số 1: ");
            int a = sc.nextInt();

            System.out.println("Nhập vào số 2: ");
            int b = sc.nextInt();

            System.out.println("Nhập vào số 3: ");
            int c = sc.nextInt();

            System.out.println("Số bạn vừa nhập: " + a + " " + b + " " + c + " ");
            sc.close();
        }

        private static void question2 (){
            /* Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình */
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào 2 số thực: ");
            System.out.println("Nhập vào số 1: ");
            float a = sc.nextFloat();

            System.out.println("Nhập vào số thứ 2: ");
            float b = sc.nextFloat();

            System.out.println("Số bạn vừa nhập: " + a + " " + b + " ");
            sc.close();
        }

        private static void question3() {
            /*Question 3: Viết lệnh cho phép người dùng nhập họ và tên*/
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng bạn nhập họ và tên: ");
            String s = sc.nextLine();
            System.err.println("Họ và tên: " + s);

            sc.close();
        }

        private static void question4() {
            /* Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ*/
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập ngày sinh của bạn : ");
            System.out.println("Mời bạn nhập vào năm sinh: ");
            int year = sc.nextInt();

            System.out.println("Mời bạn nhập vào tháng sinh: ");
            int month = sc.nextInt();

            System.out.println("Mời bạn nhập vào ngày sinh: ");
            int day = sc.nextInt();

            LocalDate dateBirth = LocalDate.of(year, month, day);
            System.out.println("Ngày sinh của bạn là: " + dateBirth);
        }

        public static void main(String[] args) {
            /*Nhập số chẵn từ console */
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng bạn nhập 1 số chẵn: ");
            int x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.println("Số bạn vừa nhập là: " + x);
            } else {
                System.out.println("Bạn nhập số không phải là số chẵn");
            }
        }
}


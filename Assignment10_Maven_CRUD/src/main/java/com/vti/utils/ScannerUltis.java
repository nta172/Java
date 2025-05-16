package com.vti.utils;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUltis {
	public static Scanner sc = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.next().trim());
			} catch (Exception e) {
				System.err.println("Nhập lại :");
			}
		}
	}
	
	public static int inputIntPositive() {
		while (true) {
			int intPositive = Integer.parseInt(sc.next());
			try {
				if (intPositive >= 0) {
					return intPositive;
				} else {
					System.err.println("Nhập lại : ");
				}
			} catch (Exception e) {
				System.err.println("Nhập lại : ");
			}
		}
	}
	
	public static Float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch (Exception e) {
				System.err.println("Nhập lại : ");
			}
		}
	}
	
	private static Double inputDouble(){
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				System.err.println("Nhập lại : ");
			}
		}
	}
	
	public static String inputString() {
		while (true) {
			String string = sc.next().trim();
			if (!string.isEmpty()) {
				return string;
			}else {
				System.err.println("Nhập lại : ");
			}
		}
	}
	
	public static LocalDate inputLocalDate() {
		System.out.println("Nhập theo định dạng : yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String locatdate = sc.next().trim();
			try {
				if (format.parse(locatdate) != null) {
					LocalDate lc = LocalDate.parse(locatdate);
					return lc;
				}
			} catch (Exception e) {
				System.err.println("Nhập lại : ");
			}
		}
	}
}

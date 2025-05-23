package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUltis;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| Vui lòng chọn |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Quản lý nhân viên.");
			System.out.format(leftAlignFormat, "2. Quản lý phòng ban.");
			System.out.format(leftAlignFormat, "3. Quản lý vị trí.");
			System.out.format(leftAlignFormat, "4. Thoát chương trình.");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				getMenuAccount();
				break;
			case 2:
				getMenuDepartment();
				break;
			case 3:
				getMenuPossition();
				break;
			case 4:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	private static void getMenuPossition()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| Choose please |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Lấy danh sách position.");
			System.out.format(leftAlignFormat, "2. Lấy position bằng id.");
			System.out.format(leftAlignFormat, "3. Thoát.");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				PositionFunction.getListPossition();
				break;
			case 2:
				PositionFunction.getPossitonByID();
				;
				break;
			case 3:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	private static void getMenuDepartment()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| Choose please |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Lấy danh sách department.");
			System.out.format(leftAlignFormat, "2. Lấy department bởi id.");
			System.out.format(leftAlignFormat, "3. Kiểm tra tên department tồn tại không.");
			System.out.format(leftAlignFormat, "4. Tạo department.");
			System.out.format(leftAlignFormat, "5. Thay đổi department.");
			System.out.format(leftAlignFormat, "6. Xóa department bằng id.");
			System.out.format(leftAlignFormat, "7. Thoát.");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				DepartmentFunction.getListDepartment();
				break;
			case 2:
				DepartmentFunction.getDepByID();
				break;
			case 3:
				DepartmentFunction.isDepartmentNameExists();
				break;
			case 4:
				DepartmentFunction.createDep();
				break;
			case 5:
				DepartmentFunction.updateDepartmentName();
				break;
			case 6:
				DepartmentFunction.delDepByID();
				break;
			case 7:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	private static void getMenuAccount() throws Exception {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| Chọn chức năng |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Đọc data - với danh sách");
			System.out.format(leftAlignFormat, "2. Đọc data - với id của account.");
			System.out.format(leftAlignFormat, "3. Kiểm tra tên đã tồn tại chưa.");
			System.out.format(leftAlignFormat, "4. Tạo tài khoản.");
			System.out.format(leftAlignFormat, "5. Cập nhật tài khoản.");
			System.out.format(leftAlignFormat, "6. Xóa tài khoản bằng id.");
			System.out.format(leftAlignFormat, "7. Thoát.");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				AccountFunction.getListAllAccount();
				break;
			case 2:
				AccountFunction.getAccountByID();
				break;
			case 3:
				AccountFunction.isAccNameExists();
				break;
			case 4:
				AccountFunction.createAccount();
				break;
			case 5:
				AccountFunction.updateAccount();
				break;
			case 6:
				AccountFunction.deleteById();
				break;
			case 7:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}
}

package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.PositionController;
import com.vti.entity.Position;
import com.vti.utils.ScannerUltis;

public class PositionFunction {
	public static void getListPossition()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		PositionController positionController = new PositionController();
		List<Position> listpos1 = positionController.getListPosition();
		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("| ID | Possition Name |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Position possition : listpos1) {
			System.out.format(leftAlignFormat, possition.getId(), possition.getName());
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public static void getPossitonByID()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		PositionController positionController = new PositionController();
		System.out.println("Tìm kiếm phòng theo ID: ");
		System.out.println("Nhập vào ID cần tìm kiếm: ");
		int idFind = ScannerUltis.inputIntPositive();
		Position pos = positionController.getPosByID(idFind);
		if (pos != null) {
			String leftAlignFormat = "| %-6d | %-21s |%n";
			System.out.format("+--------+-----------------------+%n");
			System.out.format("| ID | Possition Name |%n");
			System.out.format("+--------+-----------------------+%n");
			System.out.format(leftAlignFormat, pos.getId(), pos.getName());
			System.out.format("+--------+-----------------------+%n");
		} else {
			System.out.println("Không tồn tại");
		}
	}
}

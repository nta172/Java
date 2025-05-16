package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.Basic;

public class Program {
	public static void main(String[] args) throws  ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		Basic ex = new Basic();
		ex.question5();
	}
}

package frontend;

import java.io.File;

public class FileQues1 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\NTA\\Desktop\\Text.txt");
		if (file.isFile()) {
			System.out.println("File này có tồn tại.");
		} else {
			System.out.println("File này không tồn tại.");
		}
	}
}

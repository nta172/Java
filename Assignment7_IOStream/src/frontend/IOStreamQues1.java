package frontend;

import java.io.FileInputStream;
import java.io.IOException;

public class IOStreamQues1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\NTA\\Desktop\\Text.txt");
		byte[] b = new byte[1024];
		
		int length = fileInputStream.read(b);
		
		while(length > - 1) {
			String content = new String(b, 0, length);
			System.out.println(content);
			length = fileInputStream.read(b);
		}
		fileInputStream.close();
	}
}

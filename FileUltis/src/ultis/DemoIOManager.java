package ultis;

public class DemoIOManager {
	public void question_1() throws Exception {
		System.out.println("Chương trình đọc file:");
		System.out.println("Nhập vào file muốn đọc:");
		String path = ScannerUltis.inputString();
		System.out.println(IOManager.readFile(path));
		};
		public void question_2() throws Exception {
		System.out.println("Chương trình ghi file:");
		System.out.println("Nhập vào file muốn ghi:");
		String path = ScannerUltis.inputString();
		System.out.println("Nhập vào nội dung muốn ghi:");
		String content = ScannerUltis.inputString();
		IOManager.writeFile(path, true, content);
		}

}

package backend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collection_Map {
	private Map<Integer, String> colMap;
	private int COUNT = 1;

	public Collection_Map() {
		colMap = new HashMap<Integer, String>();
		System.out.println("Nhập số sinh viên mà bạn muốn tạo : ");
		int num = ScannerUtils.inputIntPositive();
		for (int i = 0; i < num; i++) {
			System.out.println("Nhập vào Student " + (i + 1) + " :");
			System.out.println("Nhập vào tên của Student : ");
			String name = ScannerUtils.inputString();
			colMap.put(COUNT++, name);
		}
		System.out.println("Đã thêm thành công " + num + " student.");
		printStudent();
	}

	public void loadMenu() {
		System.out.println("Chọn chức năng bạn muốn sử dụng.");
		System.out.println("1. In ra các key của students.");
		System.out.println("2. In ra value của students.");
		System.out.println("3. In ra danh sach students được sắp xếp theo tên của student.");
		System.out.println("4. Chuyển đổi map students sang set.");
		System.out.println("5. Thoát chương trình.");
	}

	public void question6() {
		loadMenu();
		while (true) {
			int menuChoose = ScannerUtils.inputInt();
			switch (menuChoose) {
			case 1:
				for (Map.Entry<Integer, String> studentMap : colMap.entrySet()) {
					System.out.println("Các key của students : " + studentMap.getKey());
				}
				break;
			case 2:
				for (Map.Entry<Integer, String> studentMap1 : colMap.entrySet()) {
					System.out.println("Các value của students : " + studentMap1.getValue());
				}
				break;
			case 3:
				System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên : ");
				colMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
						.forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Tên: " + entry.getValue()));
				break;
			case 4:
				// Lấy các key
				Set<Integer> keys = colMap.keySet();
				System.out.println("Key : " + keys);

				// Lấy các value
				Collection<String> values = colMap.values();
				System.out.println("Value : " + values);

				// Lấy các entry (các cặp key và value)
				Set<Entry<Integer, String>> entries = colMap.entrySet();
				for (Map.Entry<Integer, String> entry : entries) {
					System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
				}
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}

	public void printStudent() {
		for (Map.Entry<Integer, String> mapStudent : colMap.entrySet()) {
			System.out.println("ID : " + mapStudent.getKey());
			System.out.println("Name : " + mapStudent.getValue());
		}
	}
}

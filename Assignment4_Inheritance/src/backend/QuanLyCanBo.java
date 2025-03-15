package backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import backend.Staff.Gender;

public class QuanLyCanBo {
    private ArrayList<Staff> staffList;
    private Scanner sc;

    public QuanLyCanBo() {
        staffList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void QLCB() {
        menu();
    }

    public void menu() {
        while (true) {
            System.out.println("============================================");
            System.out.println("Lựa chọn chức năng bạn muốn sử dụng");
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách cán bộ.");
            System.out.println("4. Nhập tên của cán bộ và xóa cán bộ đó.");
            System.out.println("5. Thoát khỏi chương trình.");
            System.out.println("============================================");

            int menuChoose = getIntInput();
            switch (menuChoose) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    printListStaff();
                    break;
                case 4:
                    deleteByName();
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    return;
                default:
                    System.out.println("Vui lòng nhập lại đúng số trên menu.");
                    break;
            }
        }
    }

    private int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) //Xử lý lỗi khi gặp dữ không hợp lệ chuyển đổi chuỗi thành số nguyên.
            {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }

    // addStaff
    public void addStaff() {
        System.out.println("Chọn loại cán bộ.");
        System.out.println("1. Thêm Engineer.");
        System.out.println("2. Thêm Worker.");
        System.out.println("3. Thêm Employee.");
        System.out.println("---------------------------");
        
        int choose1 = getIntInput();
        switch (choose1) {
            case 1:
                addEngineer();
                break;
            case 2:
                addWorker();
                break;
            case 3:
                addEmployee();
                break;
            default:
                System.out.println("Vui lòng lựa chọn lại.");
                break;
        }
    }
    
    private void addEngineer() {
        System.out.println("Nhập tên của Engineer : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của Engineer : ");
        int age = getIntInput();
        Gender gender = getGenderInput();
        System.out.println("Nhập địa chỉ của Engineer : ");
        String address = sc.nextLine();
        System.out.println("Nhập chuyên ngành của Engineer : ");
        String specialize = sc.nextLine();
        
        Staff engineer = new Engineer(name, age, gender, address, specialize);
        staffList.add(engineer);
        System.out.println("Đã thêm Engineer thành công.");
    }

    private void addWorker() {
        System.out.println("Nhập tên của Worker : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của Worker : ");
        int age = getIntInput();
        Gender gender = getGenderInput();
        System.out.println("Nhập địa chỉ của Worker : ");
        String address = sc.nextLine();
        System.out.println("Nhập cấp bậc của Worker : ");
        int rank = getIntInput();
        
        Staff worker = new Worker(name, age, gender, address, rank);
        staffList.add(worker);
        System.out.println("Đã thêm Worker thành công.");
    }

    private void addEmployee() {
        System.out.println("Nhập tên của Employee : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của Employee : ");
        int age = getIntInput();
        Gender gender = getGenderInput();
        System.out.println("Nhập địa chỉ của Employee : ");
        String address = sc.nextLine();
        System.out.println("Nhập công việc của Employee : ");
        String task = sc.nextLine();
        
        Staff employee = new Employee(name, age, gender, address, task);
        staffList.add(employee);
        System.out.println("Đã thêm Employee thành công.");
    }

    private Gender getGenderInput() {
        System.out.println("Nhập giới tính: 1.Male, 2.Female, 3.Unknown");
        switch (getIntInput()) {
            case 1: return Gender.MALE;
            case 2: return Gender.FEMALE;
            default: return Gender.UNKNOWN;
        }
    }

    public void findByName() {
        System.out.println("Nhập vào tên bạn muốn tìm kiếm :");
        String findName = sc.nextLine();
        boolean found = false;
        for (Staff staff : staffList) {
            if (staff.getName().equalsIgnoreCase(findName)) {
                System.out.println(staff);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ nào!");
        }
    }

    public void printListStaff() {
        if (staffList.isEmpty()) {
            System.out.println("Danh sách cán bộ trống!");
        } else {
            for (Staff staff : staffList) {
                System.out.println(staff);
            }
        }
    }

    public void deleteByName() {
        System.out.println("Nhập tên cần xóa thông tin : ");
        String delName = sc.nextLine();
        Iterator<Staff> iterator = staffList.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(delName)) {
                iterator.remove();
                removed = true;
            }
        }
        if (removed) {
            System.out.println("Đã xóa cán bộ thành công.");
        } else {
            System.out.println("Không tìm thấy cán bộ để xóa!");
        }
    }
}

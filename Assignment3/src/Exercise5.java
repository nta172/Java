public class Exercise5 {
    public static void main(String[] args) {
        Department[] departments = new Department[5];

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Boss of director";

        Department department4 = new Department();
        department4.id = 4;
        department4.name = "Waiting room";

        Department department5 = new Department();
        department5.id = 5;
        department5.name = "Accounting";

        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        System.out.println("--------------Question 1 :--------------");
        // In ra thông tin của phòng ban thứ 1 (sử dụng toString())
        System.out.println(department1.toString());

        System.out.println("--------------Question 2 :--------------");
        // In ra thông tin của tất cả phòng ban (sử dụng toString())
        for (Department department : departments) {
            System.out.println(department);
        }

        System.out.println("--------------Question 3 :--------------");
        // In ra thông tin địa chỉ phòng ban thứ 1
        System.out.println(department1.hashCode());

        System.out.println("--------------Question 4 :--------------");
        // Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
        if (department1.equals("Phòng A")) {
            System.out.println("Có phải phòng A");
        } else {
            System.out.println("Không phải phòng A");
        }
        System.out.println("--------------Question 5 :--------------");
        // So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng
        // nhau khi tên của 2 phòng ban đó bằng nhau)
        if (department1.name.equals(department2)) {
            System.out.println("Có bằng nhau");
        } else {
            System.out.println("Không bằng nhau");
        }
    }
}

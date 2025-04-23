package frontend;

import java.lang.reflect.Array;
import java.util.ArrayList;

import backend.Department;

public class DemoDepartment {
	public static void main(String[] args) {
		Department dep1 = new Department("Marketing");
		Department dep2 = new Department("Sale");
		Department dep3 = new Department("Sale1");
		
		ArrayList<Department> listDep = new ArrayList<Department>(); 
		listDep.add(dep1);
		listDep.add(dep2);
		listDep.add(dep3);
		Department dep4 = new Department();
		listDep.add(dep4);
		System.out.println("Thông tin vừa nhập : ");
		for (Department department : listDep) {
			System.out.println(department);
		}
	}
}

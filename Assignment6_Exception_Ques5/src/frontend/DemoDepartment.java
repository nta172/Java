package frontend;

import java.util.ArrayList;

import backend.Department;

public class DemoDepartment {
	public static void main(String[] args) {
		Department dep1 = new Department("Dep1");
		Department dep2 = new Department("Dep2");
		Department dep3 = new Department("Dep3");
		Department dep4 = new Department();
	
		ArrayList<Department> arrayDep = new ArrayList<Department>();
		arrayDep.add(dep1);
		arrayDep.add(dep2);
		arrayDep.add(dep3);
		arrayDep.add(dep4);
		
		for (Department department : arrayDep) {
			System.out.println(department);
		}
		
	}
}

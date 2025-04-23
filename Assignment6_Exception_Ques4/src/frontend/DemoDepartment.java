package frontend;

import backend.Department;

public class DemoDepartment {
	public static void main(String[] args) {
		Department dep1 = new Department("Dep1");
		Department dep2 = new Department("Dep2");
		Department dep3 = new Department("Dep3");
		
		Department[] depArray = {dep1, dep2, dep3};
		try {
			System.out.println(depArray[10]);
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
	}
}

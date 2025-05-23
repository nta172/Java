package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.DepartmentService;
import com.vti.backend.businesslayer.IDepartmentService;
import com.vti.entity.Department;

public class DepartmentController {
	private IDepartmentService departmentService;

	public DepartmentController() throws FileNotFoundException, IOException {
		departmentService = new DepartmentService();
	}

	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {
		return departmentService.getListDepartment();
	}

	public Department getDepByID(int id) throws ClassNotFoundException, SQLException {
		return departmentService.getDepByID(id);
	}

	public Boolean isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		return departmentService.isDepartmentNameExists(name);
	}

	public boolean createDep(String name) throws ClassNotFoundException, SQLException {
		return departmentService.createDep(name);
	}

	public boolean updateDepartmentName(int id, String newName) throws ClassNotFoundException, SQLException {
		return departmentService.updateDepartmentName(id, newName);
	}

	public boolean delDepByID(int id) throws ClassNotFoundException, SQLException {
		return departmentService.delDepByID(id);
	}
}

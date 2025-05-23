package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentRepository {
	public List<Department> getListDepartment() throws SQLException, ClassNotFoundException;
	
	public Department getDepByID(int id) throws SQLException, ClassNotFoundException;
	
	public Boolean isDepartmentNameExists(String name) throws SQLException, ClassNotFoundException;
	
	public boolean createDep(String name) throws ClassNotFoundException, SQLException;
	
	public boolean updateDepartmentName(int id, String newName) throws ClassNotFoundException, SQLException;
	
	public boolean delDepByID(int id) throws ClassNotFoundException, SQLException;
}

package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;
	
	public Account getAccountbByID(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;
	
	public Boolean isAccNameExists(String name) throws ClassNotFoundException, SQLException;
	
	public boolean isAccIdExists(int id) throws ClassNotFoundException, SQLException; 
	
	public boolean createAccount(Account acc, int depId, int posId) throws ClassNotFoundException, SQLException;
	
	public boolean delAccByID(int ID) throws ClassNotFoundException, SQLException;
	
	public boolean updateByEmai(int id, String newEmail) throws ClassNotFoundException, SQLException;
	
	public boolean updateByUserName(int id, String newUserName) throws ClassNotFoundException, SQLException;
	
	public boolean updateByFullName(int id, String newFullName) throws ClassNotFoundException, SQLException;
	
	public boolean updateByDepId(int id, int idDep) throws ClassNotFoundException, SQLException;
	
	public boolean updateByPosId(int id, int idPos) throws ClassNotFoundException, SQLException;
}

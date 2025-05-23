package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.utils.JdbcUtils;

public class AccountRepository implements IAccountRepository {

	private JdbcUtils jdbc;

	public AccountRepository() throws FileNotFoundException, IOException {
		jdbc = new JdbcUtils();
	}

	@Override
	public List<Account> getListAccounts()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		String sql = "SELECT * FROM account ORDER BY AccountID";
		ResultSet resultSet = jdbc.executeQuery(sql);
		List<Account> listAcc = new ArrayList<Account>();
		while (resultSet.next()) {
			Account acc = new Account();
			acc.setID(resultSet.getInt(1));
			acc.setEmail(resultSet.getString(2));
			acc.setUsername(resultSet.getString(3));
			acc.setFullName(resultSet.getString(4));

			IDepartmentRepository depRepository = new DepartmentRepository();
			Department dep = depRepository.getDepByID(resultSet.getInt(5));
			acc.setDepartment(dep);

			IPositionRepository posRepository = new PositionRepository();
			Position pos = posRepository.getPosByID(resultSet.getInt(6));
			acc.setPosition(pos);

			LocalDate lc = Date.valueOf(resultSet.getDate(7).toString()).toLocalDate();
			acc.setCreateDate(lc);

			listAcc.add(acc);
		}
		return listAcc;
	}

	@Override
	public Account getAccountbByID(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		String sql = "SELECT * FROM account WHERE AccountID = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			Account acc = new Account();
			acc.setID(resultSet.getInt(1));
			acc.setEmail(resultSet.getString(2));
			acc.setUsername(resultSet.getString(3));
			acc.setFullName(resultSet.getString(4));

			IDepartmentRepository depDao = new DepartmentRepository();
			Department dep = depDao.getDepByID(resultSet.getInt(5));
			acc.setDepartment(dep);
			IPositionRepository posDao = new PositionRepository();
			acc.setPosition(posDao.getPosByID(resultSet.getInt(6)));
			LocalDate lcd = Date.valueOf(resultSet.getDate(7).toString()).toLocalDate();
			acc.setCreateDate(lcd);
			return acc;
		} else {
			jdbc.disConnection();
			return null;
		}
	}

	@Override
	public Boolean isAccNameExists(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM account WHERE Username = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setNString(1, name);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean isAccIdExists(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM account WHERE AccountID = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean createAccount(Account acc, int depId, int posId) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO account (Email, Username, FullName, DepartmentID,PositionID, CreateDate) VALUES (?, ?, ?,?,?,now());";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setNString(1, acc.getEmail());
		preStatement.setNString(2, acc.getUsername());
		preStatement.setNString(3, acc.getFullName());
		preStatement.setInt(4, depId);
		preStatement.setInt(5, posId);
		// preStatement.setDate(6, java.util.Date.parse(LocalDate.now().toString()) );
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}

	}

	@Override
	public boolean delAccByID(int ID) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM account WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, ID);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean updateByEmai(int id, String newEmail) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE account SET Email = ? WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, newEmail);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}

	}

	@Override
	public boolean updateByUserName(int id, String newUserName) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE account SET Username = ? WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, newUserName);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean updateByFullName(int id, String newFullName) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE account SET FullName = ? WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, newFullName);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}

	}

	@Override
	public boolean updateByDepId(int id, int idDep) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE account SET DepartmentID = ? WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, idDep);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}

	}

	@Override
	public boolean updateByPosId(int id, int idPos) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE account SET PositionID = ? WHERE (AccountID = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, idPos);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

}

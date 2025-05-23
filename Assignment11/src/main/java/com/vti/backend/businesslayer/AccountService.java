package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

public class AccountService implements IAccountService {
	private IAccountRepository accountRepository;

	public AccountService() throws FileNotFoundException, IOException {
		accountRepository = new AccountRepository();
	}

	@Override
	public List<Account> getListAccounts()
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		return accountRepository.getListAccounts();
	}

	@Override
	public Account getAccountByID(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return accountRepository.getAccountbByID(id);
	}

	@Override
	public Boolean isAccNameExists(String name) throws ClassNotFoundException, SQLException {
		return accountRepository.isAccNameExists(name);
	}

	@Override
	public boolean createAccount(Account acc, int depId, int posId) throws ClassNotFoundException, SQLException {
		return accountRepository.createAccount(acc, depId, posId);
	}

	@Override
	public boolean delAccByID(int ID) throws ClassNotFoundException, SQLException {
		return accountRepository.delAccByID(ID);
	}

	@Override
	public boolean updateByEmai(int id, String newEmail) throws ClassNotFoundException, SQLException {
		return accountRepository.updateByEmai(id, newEmail);
	}

	@Override
	public boolean updateByUserName(int id, String newUserName) throws ClassNotFoundException, SQLException {
		return accountRepository.updateByUserName(id, newUserName);
	}

	@Override
	public boolean updateByFullName(int id, String newFullName) throws ClassNotFoundException, SQLException {
		return accountRepository.updateByFullName(id, newFullName);
	}

	@Override
	public boolean updateByDepId(int id, int idDep) throws ClassNotFoundException, SQLException {
		return accountRepository.updateByDepId(id, idDep);
	}

	@Override
	public boolean updateByPosId(int id, int idPos) throws ClassNotFoundException, SQLException {
		return accountRepository.updateByPosId(id, idPos);
	}

	@Override
	public boolean isAccIdExists(int id) throws ClassNotFoundException, SQLException {
		return accountRepository.isAccIdExists(id);
	}
}

package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Position;
import com.vti.utils.JdbcUtils;

public class PositionRepository implements IPositionRepository {
	private JdbcUtils jdbc;

	public PositionRepository() throws FileNotFoundException, IOException {
		jdbc = new JdbcUtils();
	}

	@Override
	public List<Position> getListPosition() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Position> listPosition = new ArrayList<Position>();
		String sql = "SELECT * FROM position";
		ResultSet resultSet = jdbc.executeQuery(sql);
		while (resultSet.next()) {
			Position pos = new Position(resultSet.getInt(1), resultSet.getString(2));
			listPosition.add(pos);
		}
		jdbc.disConnection();
		return listPosition;
	}

	@Override
	public Position getPosByID(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM position WHERE PositionID = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			Position pos = new Position(resultSet.getInt(1), resultSet.getString(2));
			return pos;
		} else {
			jdbc.disConnection();
			return null;
		}
	}
}

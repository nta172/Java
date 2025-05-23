package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.PositionRepository;
import com.vti.entity.Position;

public class PositionService implements IPositionService {
	private PositionRepository positionRepository;

	public PositionService() throws FileNotFoundException, IOException {
		positionRepository = new PositionRepository();
	}

	@Override
	public List<Position> getListPosition() throws ClassNotFoundException, SQLException {
		return positionRepository.getListPosition();
	}

	@Override
	public Position getPosByID(int id) throws ClassNotFoundException, SQLException {
		return positionRepository.getPosByID(id);
	}
}

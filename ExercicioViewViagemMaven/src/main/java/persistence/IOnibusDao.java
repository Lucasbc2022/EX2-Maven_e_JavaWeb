package persistence;

import java.sql.SQLException;

import model.Onibus;

public interface IOnibusDao {
	
	public Onibus Consultar(Onibus o) throws SQLException, ClassNotFoundException;

}

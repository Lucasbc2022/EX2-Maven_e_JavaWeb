package persistence;

import java.sql.SQLException;

import model.Viagem;

public interface IViagemDao {
	
	public Viagem Consultar(Viagem viagem) throws SQLException, ClassNotFoundException;

}

package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Onibus;

public class OnibusDao implements IOnibusDao {

	GenericDao gDao = new GenericDao();
	
	public OnibusDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	@Override
	public Onibus Consultar(Onibus o) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT * FROM v_descricao_onibus WHERE Codigo_Viagem = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, o.getCodigo_viagem());
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			o.setCodigo_viagem(rs.getInt("Codigo_Viagem"));
			o.setNome_mot(rs.getString("Nome_do_motorista"));
			o.setPlaca(rs.getString("placa_do_onibus"));
			o.setMarca(rs.getString("Marca_do_ônibus"));
			o.setAno(rs.getInt("Ano_do_ônibus"));
			o.setDescricao(rs.getString("Descricao"));
			System.out.println(o.toString());
		}
		
		rs.close();
		ps.close();
		c.close();
		
		return o;
	}

}

package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Onibus;
import persistence.GenericDao;
import persistence.IOnibusDao;
import persistence.OnibusDao;


@WebServlet("/onibus")
public class OnibusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OnibusServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cv = request.getParameter("cv");
		String nome = request.getParameter("nome");
		String placa = request.getParameter("placa");
		String marc_oni = request.getParameter("marca_oni");
		String ano = request.getParameter("ano");
		String descricao = request.getParameter("descricao");
		String botao = request.getParameter("botao");
		
		Onibus onibus = new Onibus();
		
		GenericDao gDao = new GenericDao();
		IOnibusDao oDao = new OnibusDao(gDao);
		String erro = "";
		String saida = "";
		List<Onibus> frota_onibus = new ArrayList<Onibus>();
		
		
		try {
			
			if(botao.equals("Buscar")) {
					
				
					onibus = valido(cv, nome, placa, marc_oni, ano, descricao, botao);
					onibus = oDao.Consultar(onibus);

				
			}
			
		} catch(SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {

		
			request.setAttribute("onibus", onibus);
			request.setAttribute("frota_onibus", frota_onibus);
			request.setAttribute("erro", erro);
			request.setAttribute("saida", saida);
			RequestDispatcher rd = request.getRequestDispatcher("onibus.jsp");
            rd.forward(request, response);
			
			
		}
		
		
		
	}

	private Onibus valido(String cv, String nome, String placa, String marc_oni, String ano, String descricao, String botao) {
		
		Onibus onibus = new Onibus();
		
		if(botao.equals("Buscar")) {

				onibus.setCodigo_viagem(Integer.parseInt(cv));
			}
			
		
		
		return onibus;
	}
}

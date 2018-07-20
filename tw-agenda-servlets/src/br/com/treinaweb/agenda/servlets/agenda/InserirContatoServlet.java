package br.com.treinaweb.agenda.servlets.agenda;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.impl.ContatoRepositorioJdbc;
import br.com.treinaweb.agenda.repositorios.interfaces.AgendaRepositorio;

@WebServlet(urlPatterns = {"/agenda/incluir"})
public class InserirContatoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -781631099010348217L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/paginas/agenda/inserirContato.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaRepositorio<Contato> agendaRepositorio = new ContatoRepositorioJdbc();
		Contato novoContato = new Contato();
		novoContato.setNome(req.getParameter("nome"));
		novoContato.setIdade(Integer.parseInt(req.getParameter("idade")));
		novoContato.setTelefone(req.getParameter("telefone"));
		try {
			agendaRepositorio.inserir(novoContato);
		} catch (SQLException e) {
			req.getSession().setAttribute("mensagemErro", e.getMessage());
		}
		resp.sendRedirect(req.getContextPath() + "/agenda/listar");
	}	
}

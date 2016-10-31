package br.com.projetoNatura.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

import br.com.projetoNatura.bo.ClienteBo;
import br.com.projetoNatura.entidade.Cliente;

public class ClienteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acao = req.getParameter("acao");
		ClienteBo clienteBo = new ClienteBo();
		Cliente cliente = new Cliente();
		
		if(acao.equals("cadastrar")){				
			try {
				cliente.setNome(req.getParameter("nome"));
				cliente.setTelefone(req.getParameter("telefone"));
				cliente.setEndereco(req.getParameter("endereco"));
				cliente.setCpf(req.getParameter("cpf"));
				cliente.setEmail(req.getParameter("email"));
				clienteBo.cadastar(cliente);
				System.out.println("Cliente cadastrado:.");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Cliente nao cadastrado:.");
				resp.sendRedirect("erroCliente");
				e.printStackTrace();
			}					
			req.getRequestDispatcher("resultado/ClienteCadastrado.jsp").forward(req, resp);
			
	}
		
	}
	
}

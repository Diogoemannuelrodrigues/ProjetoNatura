package br.com.projetoNatura.bo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
//		HttpSession sessao = req.getSession();
//		sessao.setAttribute("nome", login);
		
		if(login.equals("Diogo") && senha.equals("1234")){
			//resp.sendRedirect("Menu.jsp");	
			System.out.println("Nao entrou");

		}else{
			//resp.sendRedirect("Login.jsp");
			req.getRequestDispatcher("../ProjetoNatura/Menu.jsp").forward(req, resp);
			}
		}
	}


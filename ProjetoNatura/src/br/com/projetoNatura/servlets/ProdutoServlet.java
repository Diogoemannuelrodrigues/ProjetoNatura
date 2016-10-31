package br.com.projetoNatura.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoNatura.Exception.DescricaoException;
import br.com.projetoNatura.Exception.NomeException;
import br.com.projetoNatura.bo.ProdutoBo;
import br.com.projetoNatura.entidade.Produto;

public class ProdutoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req, resp);
	
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
			Produto produto = new Produto();
			ProdutoBo produtoBo = new ProdutoBo();
		
		if(acao.equals("cadastrar")){				
				try {
					produto.setNome(req.getParameter("nome"));
					produto.setDescricao(req.getParameter("descricao"));
					produto.setPreco(Double.parseDouble(req.getParameter("preco")));
					produtoBo.cadastrarProduto(produto);
					System.out.println("Produto cadastrado:.");
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Produto nao cadastrado:.");
					e.printStackTrace();
				}					
				req.getRequestDispatcher("resultado/produtoCadastrado.jsp").forward(req, resp);
				
		}else if(acao.equals("consultarTodos")){
			try {
				List<Produto> produtos = produtoBo.produtos();
				req.setAttribute("produtos", produtos);
				System.out.println("Aqui");
				req.getRequestDispatcher("Produto/Listar.jsp").forward(req, resp);
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println(":(");
				e.printStackTrace();
			}
		
		}else if(acao.equals("consultarProduto")){
			
			//produto = produtoBo.consultarProduto(Integer.parseInt(req.getParameter("codigoProduto")));
			req.setAttribute("Produto", produto);
			req.getRequestDispatcher("Produto/Alterar.jsp").forward(req, resp);
			
		}else if(acao.equals("alterarProduto")){
			produto.setNome(req.getParameter("nome"));
			produto.setDescricao(req.getParameter("descricao"));
			produto.setCodigoProduto(Integer.parseInt(req.getParameter("codigoProduto")));
			produto.setPreco(Double.parseDouble(req.getParameter("preco")));
			
			try {
				produtoBo.alterarProduto(produto);
			} catch (ClassNotFoundException | SQLException e) {
//Comentario
				e.printStackTrace();
			}
			System.out.println("Produto cadastrado com sucesso.");
			req.getRequestDispatcher("/resultado/produtoAlterado.jsp").forward(req, resp);
			req.setAttribute("produto", produto);
		
		
		}else if(acao.equals("listar")){
			
			
			
		}
	
	}

}

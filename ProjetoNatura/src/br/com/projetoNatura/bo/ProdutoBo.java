package br.com.projetoNatura.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.projetoNatura.Dao.ProdutoDao;
import br.com.projetoNatura.Exception.DescricaoException;
import br.com.projetoNatura.Exception.NomeException;
import br.com.projetoNatura.entidade.Produto;

public class ProdutoBo {
	
	ProdutoDao produtoDao = new ProdutoDao();
	
	public void cadastrarProduto(Produto produto) throws ClassNotFoundException, SQLException {
		produtoDao.cadastrarProduto(produto);
	}

//	public Produto consultarProduto(int codigoProduto) {
//		return produtoDao.consultarProduto(codigoProduto);
//
//	}
	
	public void alterarProduto( Produto produto) throws ClassNotFoundException, SQLException{
		produtoDao.alterarProduto(produto);
	}
	
	public List<Produto> produtos () throws ClassNotFoundException, SQLException{
		return produtoDao.produtos();
	}

}

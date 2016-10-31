package br.com.projetoNatura.bo;

import java.sql.SQLException;

import br.com.projetoNatura.Dao.ClienteDao;
import br.com.projetoNatura.entidade.Cliente;

public class ClienteBo {
	
	ClienteDao dao = new ClienteDao();
	public void cadastar(Cliente cliente) throws ClassNotFoundException, SQLException {
		dao.cadastrarCliente(cliente);
	}
	
//	public void alterar(Cliente cliente){
//		dao.alterarCliente(cliente);
//	}
//
//	public Cliente consultarPorId(int id) throws SQLException {		
//		return ClienteDao.consultarPorId(id);
//	}
	
	
	
	
	
}

package br.com.projetoNatura.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.projetoNatura.conexao.Conexao;
import br.com.projetoNatura.entidade.Cliente;
import br.com.projetoNatura.entidade.Produto;

public class ClienteDao {
	
	public boolean cadastrarCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
		Connection con = Conexao.getConexao();
		String sql = "insert into Cliente (nome, telefone, endereco, cpf, email) values (?,?,?,?,?)";
		if (con != null) {
			try {
				PreparedStatement stm = con.prepareStatement(sql);
				stm.setString(1, cliente.getNome());
				stm.setString(2, cliente.getTelefone());
				stm.setString(3, cliente.getEndereco());
				stm.setString(4, cliente.getCpf());
				stm.setString(5, cliente.getEmail());
				stm.execute();
				con.close();

			} catch (SQLException e) {
				return false;
			}
		
			return false;		
		}
		return false;		
		
	}	
	
//	public static Cliente consultarPorId (int id) throws SQLException, ClassNotFoundException{
//		Connection con = Conexao.getConexao();
//		Cliente cliente = null;
//		
//		try{
//			PreparedStatement stm = con.prepareStatement("select * from cliente where id = ?");
//			stm.setInt(1, id);
//			ResultSet rSet = stm.executeQuery();
//			while(rSet.next()){
//				cliente.setId(rSet.getInt("id"));
//				cliente.setNome(rSet.getString("nome"));
//				cliente.setTelefone(rSet.getString("telefone"));
//				cliente.setEndereco(rSet.getString("endereco"));
//				cliente.setCpf(rSet.getString("cpf"));
//				cliente.setEmail(rSet.getString("email"));
//				rSet.close();
//				stm.close();
//			}
//		}catch( SQLException e){
//			e.printStackTrace();
//		}finally{
//			con.close();
//		}
//		
//		return cliente;
//	}
//	
//	
//	public static void alterarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
//		
//		Connection con = Conexao.getConexao();
//		try {
//			
//			PreparedStatement stm = con.prepareStatement("UPDATE cliente set nome = ?, id = ? , telefone = ?, "
//					+ "endereco = ?, cpf = ?, email = ? WHERE id = ?");
//			stm.setString(1, cliente.getNome());
//			stm.setInt(2, cliente.getId());
//			stm.setString(3, cliente.getTelefone());    
//			stm.setString(4, cliente.getEndereco());
//			stm.setString(5, cliente.getCpf());
//			stm.setString(6, cliente.getEmail());
//			stm.execute();
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
//	
//	
//	
//	
}
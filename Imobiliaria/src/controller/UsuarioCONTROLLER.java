package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import model.ImovelMODEL;
import model.LocadorMODEL;
import model.UsuarioMODEL;
import view.TelaPrincipalView;



public class UsuarioCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<UsuarioMODEL> lista = new ArrayList<>();
	
	public void salvarUsuario(UsuarioMODEL objUsuarioModel) {
		
		
		String sql = "INSERT INTO usuario (s_nome_usuario, s_email_usuario, s_senha_usuario) VALUES (?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objUsuarioModel.getNome());
			pstm.setString(2, objUsuarioModel.getEmail());
			pstm.setString(3, objUsuarioModel.getSenha());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioCONTROLLER salvar" + erro);
		}
	}
	
	
	public ResultSet autenticarUsuario(UsuarioMODEL objUsuarioModel) {
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
		
			String sql = "select * from usuario where s_nome_usuario = ? and s_senha_usuario = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objUsuarioModel.getNome());
			pstm.setString(2, objUsuarioModel.getSenha());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
			
		}
		return null;
		
	}
	public ArrayList<UsuarioMODEL> PesquisarUsuario(){
		String sql = "select * from usuario";
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				UsuarioMODEL objUsuarioModel = new UsuarioMODEL();
				objUsuarioModel.setUsuario_id(rs.getInt("i_usuario_usuario"));
				objUsuarioModel.setNome(rs.getString("s_nome_usuario"));
				objUsuarioModel.setEmail(rs.getString("s_email_usuario"));
				objUsuarioModel.setSenha(rs.getString("s_senha_usuario"));
				lista.add(objUsuarioModel);
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "UsuarioCONTROLLER Pesquisar" + erro);
		}
		return lista;
	}
      public void alterarUsuario(UsuarioMODEL objUsuarioModel) {
		String sql = "update usuario set s_nome_usuario = ?, s_email_usuario = ?, s_senha_usuario = ? where i_usuario_usuario = ?";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objUsuarioModel.getNome());
			pstm.setString(2, objUsuarioModel.getEmail());
			pstm.setString(3, objUsuarioModel.getSenha());
			pstm.setInt(4, objUsuarioModel.getUsuario_id());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "usuarioCONTROLLER Alterar" + erro);
		}
	}
      public void deletarUsuario(UsuarioMODEL objUsuarioModel) {
    	  String sql = "delete from usuario where i_usuario_usuario = ?";
  		
  		conn = new ConexaoCONTROLLER().conectaDB();
  		
  		try {
  			pstm = conn.prepareStatement(sql);
  			pstm.setInt(1, objUsuarioModel.getUsuario_id());
  			
  			pstm.execute();
  			pstm.close();
  			
  		} catch (SQLException erro) {
  			JOptionPane.showMessageDialog(null, "UsuarioCONTROLLER Deletar" + erro);
  		}
    	  
      }
	
}
		


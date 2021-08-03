package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.LocadorMODEL;
import model.LocatarioMODEL;


public class LocatarioCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<LocatarioMODEL> lista = new ArrayList<>();
	
	public void salvarLocatario(LocatarioMODEL objLocatarioModel) {
		
		
		String sql = "INSERT INTO locatario (s_nome_locatario, s_estado_civil_locatario, s_profissao_locatario, s_endereco_locatario, i_CPF_locatario) VALUES (?,?,?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objLocatarioModel.getNome());
			pstm.setString(2, objLocatarioModel.getEstado_civil());
			pstm.setString(3, objLocatarioModel.getProfissao());
			pstm.setString(4, objLocatarioModel.getEndereco());
			pstm.setInt(5, objLocatarioModel.getCPF());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "LocatarioCONTROLLER salvar" + erro);
		}
	}
	public ArrayList<LocatarioMODEL> PesquisarLocatario(){
		String sql = "select * from locatario";
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				LocatarioMODEL objLocatarioModel = new LocatarioMODEL();
				objLocatarioModel.setLocatario_id(rs.getInt("i_locatario_locatario"));
				objLocatarioModel.setNome(rs.getString("s_nome_locatario"));
				objLocatarioModel.setEstado_civil(rs.getString("s_estado_civil_locatario"));
				objLocatarioModel.setProfissao(rs.getString("s_profissao_locatario"));
				objLocatarioModel.setEndereco(rs.getString("s_endereco_locatario"));
				objLocatarioModel.setCPF(rs.getInt("i_CPF_locatario"));
				lista.add(objLocatarioModel);
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "LocatarioCONTROLLER Pesquisar" + erro);
		}
		return lista;
	}
	  public void alterarLocatario(LocatarioMODEL objLocatarioModel) {
			
			
			String sql = "update locatario set s_nome_locatario = ?, s_estado_civil_locatario = ?, s_profissao_locatario = ?, s_endereco_locatario = ?, i_CPF_locatario = ? where i_locatario_locatario = ?";
			
			conn = new ConexaoCONTROLLER().conectaDB();
			
			try {
				
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, objLocatarioModel.getNome());
				pstm.setString(2, objLocatarioModel.getEstado_civil());
				pstm.setString(3, objLocatarioModel.getProfissao());
				pstm.setString(4, objLocatarioModel.getEndereco());
				pstm.setInt(5, objLocatarioModel.getCPF());
				pstm.setInt(6, objLocatarioModel.getLocatario_id());
				
				pstm.execute();
				pstm.close();
				
			} catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "LocatarioCONTROLLER Alterar" + erro);
			}
		}
	  public void deletarLocatario(LocatarioMODEL objLocatarioModel) {
    	  String sql = "delete from locatario where i_locatario_locatario = ?";
  		
  		conn = new ConexaoCONTROLLER().conectaDB();
  		
  		try {
  			pstm = conn.prepareStatement(sql);
  			pstm.setInt(1, objLocatarioModel.getLocatario_id());
  			
  			pstm.execute();
  			pstm.close();
  			
  		} catch (SQLException erro) {
  			JOptionPane.showMessageDialog(null, "LocatarioCONTROLLER Deletar" + erro);
  		}
    	  
      }
}

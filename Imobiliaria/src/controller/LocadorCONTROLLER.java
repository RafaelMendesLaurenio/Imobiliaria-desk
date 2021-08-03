package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.LocadorMODEL;


public class LocadorCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<LocadorMODEL> lista = new ArrayList<>();
	
	public void salvarLocador(LocadorMODEL objLocadorModel) {
		
		
		String sql = "INSERT INTO locador (s_nome_locador, s_estado_civil_locador, s_profissao_locador, s_endereco_locador, i_CPF_locador) VALUES (?,?,?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objLocadorModel.getNome());
			pstm.setString(2, objLocadorModel.getEstado_civil());
			pstm.setString(3, objLocadorModel.getProfissao());
			pstm.setString(4, objLocadorModel.getEndereco());
			pstm.setInt(5, objLocadorModel.getCPF());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "LocadorCONTROLLER Salvar" + erro);
		}
	}
	public ArrayList<LocadorMODEL> PesquisarLocador(){
		String sql = "select * from locador";
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				LocadorMODEL objLocadorModel = new LocadorMODEL();
				objLocadorModel.setLocador_id(rs.getInt("i_locador_locador"));
				objLocadorModel.setNome(rs.getString("s_nome_locador"));
				objLocadorModel.setEstado_civil(rs.getString("s_estado_civil_locador"));
				objLocadorModel.setProfissao(rs.getString("s_profissao_locador"));
				objLocadorModel.setEndereco(rs.getString("s_endereco_locador"));
				objLocadorModel.setCPF(rs.getInt("i_CPF_locador"));
				lista.add(objLocadorModel);
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "LocadorCONTROLLER Pesquisar" + erro);
		}
		return lista;
	}
      public void alterarLocador(LocadorMODEL objLocadorModel) {
		
		
		String sql = "update locador set s_nome_locador = ?, s_estado_civil_locador = ?, s_profissao_locador = ?, s_endereco_locador = ?, i_CPF_locador = ? where i_locador_locador = ?";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objLocadorModel.getNome());
			pstm.setString(2, objLocadorModel.getEstado_civil());
			pstm.setString(3, objLocadorModel.getProfissao());
			pstm.setString(4, objLocadorModel.getEndereco());
			pstm.setInt(5, objLocadorModel.getCPF());
			pstm.setInt(6, objLocadorModel.getLocador_id());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "LocadorCONTROLLER Alterar" + erro);
		}
	}
      public void deletarLocador(LocadorMODEL objLocadorModel) {
    	  String sql = "delete from locador where i_locador_locador = ?";
  		
  		conn = new ConexaoCONTROLLER().conectaDB();
  		
  		try {
  			pstm = conn.prepareStatement(sql);
  			pstm.setInt(1, objLocadorModel.getLocador_id());
  			
  			pstm.execute();
  			pstm.close();
  			
  		} catch (SQLException erro) {
  			JOptionPane.showMessageDialog(null, "LocadorCONTROLLER Deletar" + erro);
  		}
    	  
      }
}
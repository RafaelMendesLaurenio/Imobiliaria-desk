package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ContratoMODEL;
import model.LocadorMODEL;

public class ContratoCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<ContratoMODEL> lista = new ArrayList<>();
	
	public void salvarContrato(ContratoMODEL objContratoModel) {
		
		
		String sql = "INSERT INTO contrato (i_valor_contrato, s_duracao_locacao, s_forma_pagamento, i_id_locador, i_id_locatario, i_id_imovel) VALUES (?,?,?,?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, objContratoModel.getValor());
			pstm.setString(2, objContratoModel.getDuracao());
			pstm.setString(3, objContratoModel.getPagamento());
			pstm.setInt(4, objContratoModel.getId_locador());
			pstm.setInt(5, objContratoModel.getId_locatario());
			pstm.setInt(6, objContratoModel.getId_imovel());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ContratoCONTROLLER Salvar" + erro);
		}
	}
	public ArrayList<ContratoMODEL> PesquisarContrato(){
		String sql = "select * from contrato";
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				ContratoMODEL objContratoModel = new ContratoMODEL();
				objContratoModel.setId_contrato(rs.getInt("i_contrato_contrato"));
				objContratoModel.setValor(rs.getInt("i_valor_contrato"));
				objContratoModel.setDuracao(rs.getString("s_duracao_locacao"));
				objContratoModel.setPagamento(rs.getString("s_forma_pagamento"));
				objContratoModel.setId_locador(rs.getInt("i_id_locador"));
				objContratoModel.setId_locatario(rs.getInt("i_id_locatario"));
				objContratoModel.setId_imovel(rs.getInt("i_id_imovel"));
				lista.add(objContratoModel);
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ContratoCONTROLLER Pesquisar" + erro);
		}
		return lista;
	}
      public void alterarcontrato(ContratoMODEL objContratoModel) {
		
		
		String sql = "update contrato set i_valor_contrato = ?, s_duracao_locacao = ?, s_forma_pagamento = ?, i_id_locador = ?, i_id_locatario = ?, i_id_imovel = ? where i_contrato_contrato = ?";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, objContratoModel.getValor());
			pstm.setString(2, objContratoModel.getDuracao());
			pstm.setString(3, objContratoModel.getPagamento());
			pstm.setInt(4, objContratoModel.getId_locador());
			pstm.setInt(5, objContratoModel.getId_locatario());
			pstm.setInt(6, objContratoModel.getId_imovel());
			pstm.setInt(7, objContratoModel.getId_contrato());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ContratoCONTROLLER Alterar" + erro);
		}
	}
      public void deletarContrato(ContratoMODEL objContratoModel) {
    	  String sql = "delete from contrato where i_contrato_contrato = ?";
  		
  		conn = new ConexaoCONTROLLER().conectaDB();
  		
  		try {
  			pstm = conn.prepareStatement(sql);
  			pstm.setInt(1, objContratoModel.getId_contrato());
  			
  			pstm.execute();
  			pstm.close();
  			
  		} catch (SQLException erro) {
  			JOptionPane.showMessageDialog(null, "ContratoCONTROLLER Deletar" + erro);
  		}
    	  
      }
}

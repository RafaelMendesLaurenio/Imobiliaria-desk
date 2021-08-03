package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ImovelMODEL;
import model.LocadorMODEL;
import model.LocatarioMODEL;

public class ImovelCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<ImovelMODEL> lista = new ArrayList<>();
	
	public void salvarImovel(ImovelMODEL objImovelModel) {
		
		
		String sql = "INSERT INTO imovel (s_endereco_imovel, s_estado_conservacao_imovel, s_descricao_imovel) VALUES (?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objImovelModel.getEndereco());
			pstm.setString(2, objImovelModel.getEstado_de_conservacao());
			pstm.setString(3, objImovelModel.getDescricao());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ImovelCONTROLLER salvar" + erro);
		}
	}
	public ArrayList<ImovelMODEL> PesquisarImovel(){
		String sql = "select * from imovel";
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				ImovelMODEL objImovelModel = new ImovelMODEL();
				objImovelModel.setImovel_id(rs.getInt("i_imovel_imovel"));
				objImovelModel.setEndereco(rs.getString("s_endereco_imovel"));
				objImovelModel.setEstado_de_conservacao(rs.getString("s_estado_conservacao_imovel"));
				objImovelModel.setDescricao(rs.getString("s_descricao_imovel"));
				
				lista.add(objImovelModel);
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ImovelCONTROLLER Pesquisar" + erro);
		}
		return lista;
	}
	public void alterarImovel(ImovelMODEL objImovelModel) {
		
		
		String sql = "update imovel set s_endereco_imovel = ?, s_estado_conservacao_imovel = ?, s_descricao_imovel = ? where i_imovel_imovel = ?";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objImovelModel.getEndereco());
			pstm.setString(2, objImovelModel.getEstado_de_conservacao());
			pstm.setString(3, objImovelModel.getDescricao());
			pstm.setInt(4, objImovelModel.getImovel_id());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ImovelCONTROLLER Alterar" + erro);
		}
	}
	 public void deletarImovel(ImovelMODEL objImovelModel) {
   	  String sql = "delete from imovel where i_imovel_imovel = ?";
 		
 		conn = new ConexaoCONTROLLER().conectaDB();
 		
 		try {
 			pstm = conn.prepareStatement(sql);
 			pstm.setInt(1, objImovelModel.getImovel_id());
 			
 			pstm.execute();
 			pstm.close();
 			
 		} catch (SQLException erro) {
 			JOptionPane.showMessageDialog(null, "ImovelCONTROLLER Deletar" + erro);
 		}
   	  
     }
}

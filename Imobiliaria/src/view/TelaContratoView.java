package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.ContratoCONTROLLER;
import controller.LocadorCONTROLLER;
import model.ContratoMODEL;
import model.LocadorMODEL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContratoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtDuracao_locacao;
	private JTextField txtForma_pagamento;
	private JTextField txtId_locador;
	private JTextField txtId_locatario;
	private JTextField txtId_imovel;
	private JTextField txtcodico;
	private JTable tabelaContrato;
	
	ContratoMODEL objContratoModel = new ContratoMODEL();
	ContratoCONTROLLER objContratoController = new ContratoCONTROLLER();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContratoView frame = new TelaContratoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaContratoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 794, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastroDeImovel = new JLabel("Tela de Contrato");
		lblCadastroDeImovel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeImovel.setForeground(new Color(255, 255, 255));
		lblCadastroDeImovel.setBounds(324, 26, 151, 16);
		panel.add(lblCadastroDeImovel);
		
		JLabel lblValor = new JLabel("valor:");
		lblValor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValor.setBounds(101, 153, 56, 16);
		contentPane.add(lblValor);
		
		JLabel lblDuraoDaLocao = new JLabel("dura\u00E7\u00E3o da loca\u00E7\u00E3o:");
		lblDuraoDaLocao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDuraoDaLocao.setForeground(Color.WHITE);
		lblDuraoDaLocao.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDuraoDaLocao.setBounds(9, 182, 148, 16);
		contentPane.add(lblDuraoDaLocao);
		
		JLabel lblFormaDePagamento = new JLabel("forma de pagamento:");
		lblFormaDePagamento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFormaDePagamento.setForeground(Color.WHITE);
		lblFormaDePagamento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaDePagamento.setBounds(0, 211, 157, 16);
		contentPane.add(lblFormaDePagamento);
		
		JLabel lblIdDoLocador = new JLabel("id do locador:");
		lblIdDoLocador.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdDoLocador.setForeground(Color.WHITE);
		lblIdDoLocador.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoLocador.setBounds(0, 240, 157, 16);
		contentPane.add(lblIdDoLocador);
		
		JLabel lblIdDoLocatario = new JLabel("id do locatario:");
		lblIdDoLocatario.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdDoLocatario.setForeground(Color.WHITE);
		lblIdDoLocatario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoLocatario.setBounds(0, 269, 157, 16);
		contentPane.add(lblIdDoLocatario);
		
		JLabel lblIdDoImovel = new JLabel("id do imovel:");
		lblIdDoImovel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdDoImovel.setForeground(Color.WHITE);
		lblIdDoImovel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoImovel.setBounds(0, 298, 157, 16);
		contentPane.add(lblIdDoImovel);
		
		JLabel lblIdContrato = new JLabel("id contrato:");
		lblIdContrato.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdContrato.setForeground(Color.WHITE);
		lblIdContrato.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdContrato.setBounds(0, 80, 100, 16);
		contentPane.add(lblIdContrato);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(169, 151, 268, 22);
		contentPane.add(txtValor);
		
		txtDuracao_locacao = new JTextField();
		txtDuracao_locacao.setColumns(10);
		txtDuracao_locacao.setBounds(169, 180, 268, 22);
		contentPane.add(txtDuracao_locacao);
		
		txtForma_pagamento = new JTextField();
		txtForma_pagamento.setColumns(10);
		txtForma_pagamento.setBounds(169, 209, 268, 22);
		contentPane.add(txtForma_pagamento);
		
		txtId_locador = new JTextField();
		txtId_locador.setColumns(10);
		txtId_locador.setBounds(169, 238, 67, 22);
		contentPane.add(txtId_locador);
		
		txtId_locatario = new JTextField();
		txtId_locatario.setColumns(10);
		txtId_locatario.setBounds(169, 267, 67, 22);
		contentPane.add(txtId_locatario);
		
		txtId_imovel = new JTextField();
		txtId_imovel.setColumns(10);
		txtId_imovel.setBounds(169, 296, 67, 22);
		contentPane.add(txtId_imovel);
		
		txtcodico = new JTextField();
		txtcodico.setEnabled(false);
		txtcodico.setColumns(10);
		txtcodico.setBounds(118, 78, 39, 22);
		contentPane.add(txtcodico);
		
		tabelaContrato = new JTable();
		tabelaContrato.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tabelaContrato.setBounds(440, 66, 354, 256);
		contentPane.add(tabelaContrato);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LimparCampos();
			}
		});
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBackground(new Color(255, 0, 51));
		btnLimpar.setBounds(447, 327, 97, 25);
		contentPane.add(btnLimpar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnListar.setBackground(new Color(255, 0, 51));
		btnListar.setBounds(567, 327, 97, 25);
		contentPane.add(btnListar);
		
		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipalView TprincipalV = new TelaPrincipalView();
				TprincipalV.setVisible(true);
				dispose();
			}
		});
		btnVoltar_1.setForeground(Color.BLACK);
		btnVoltar_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar_1.setBackground(new Color(255, 0, 51));
		btnVoltar_1.setBounds(685, 327, 97, 25);
		contentPane.add(btnVoltar_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main2\\Imobiliaria\\imagens\\imgTelaLocador.png"));
		lblNewLabel.setBounds(440, 66, 354, 299);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SalvarCampos();
				ListarValores();
				LimparCampos();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(new Color(255, 0, 51));
		button.setBounds(12, 327, 97, 25);
		contentPane.add(button);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarValores();
				ListarValores();
				LimparCampos();
			}
		});
		btnAtualizar.setForeground(Color.BLACK);
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAtualizar.setBackground(new Color(255, 0, 51));
		btnAtualizar.setBounds(121, 327, 97, 25);
		contentPane.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletarValores();
				ListarValores();
				LimparCampos();
			}
		});
		btnDeletar.setForeground(Color.BLACK);
		btnDeletar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeletar.setBackground(new Color(255, 0, 51));
		btnDeletar.setBounds(230, 327, 97, 25);
		contentPane.add(btnDeletar);
		
		JButton btnVoltar = new JButton("Carregar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarCampos();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBackground(new Color(255, 0, 51));
		btnVoltar.setBounds(340, 327, 97, 25);
		contentPane.add(btnVoltar);
	}
	private void ListarValores() {
		try {
			ContratoCONTROLLER objContratoC = new ContratoCONTROLLER();
			
			DefaultTableModel model = (DefaultTableModel) tabelaContrato.getModel();
			model.setNumRows(0);
			
			ArrayList<ContratoMODEL> lista = objContratoC.PesquisarContrato();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getId_contrato(),
						lista.get(num).getValor(),
						lista.get(num).getDuracao(),
						lista.get(num).getPagamento(),
						lista.get(num).getId_locador(),
						lista.get(num).getId_locatario(),
						lista.get(num).getId_imovel()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ListarValores TelaContratoView" + erro);
		}
	}
	private void carregarCampos() {
		int setar = tabelaContrato.getSelectedRow();
		
		txtcodico.setText(tabelaContrato.getModel().getValueAt(setar,0).toString());
		txtValor.setText(tabelaContrato.getModel().getValueAt(setar,1).toString());
		txtDuracao_locacao.setText(tabelaContrato.getModel().getValueAt(setar,2).toString());
		txtForma_pagamento.setText(tabelaContrato.getModel().getValueAt(setar,3).toString());
		txtId_locador.setText(tabelaContrato.getModel().getValueAt(setar,4).toString());
		txtId_locatario.setText(tabelaContrato.getModel().getValueAt(setar,5).toString());
		txtId_imovel.setText(tabelaContrato.getModel().getValueAt(setar,6).toString());
	}
	private void SalvarCampos() {
		String duracao,pagamento;
	    int id_locador,id_locatario,id_imovel,valor;
		
		duracao = txtDuracao_locacao.getText();
		id_locador = Integer.parseInt(txtId_locador.getText());
		id_locatario = Integer.parseInt(txtId_locatario.getText());
		id_imovel = Integer.parseInt(txtId_imovel.getText());
		valor = Integer.parseInt(txtValor.getText());
		pagamento = txtForma_pagamento.getText();
		
		objContratoModel = new ContratoMODEL();
		objContratoModel.setDuracao(duracao);
		objContratoModel.setId_imovel(id_imovel);
		objContratoModel.setId_locador(id_locador);
		objContratoModel.setId_locatario(id_locatario);
		objContratoModel.setPagamento(pagamento);
		objContratoModel.setValor(valor);
		
		ContratoCONTROLLER comtroll = new ContratoCONTROLLER();
		comtroll.salvarContrato(objContratoModel);
	}
	private void LimparCampos() {
		txtcodico.setText("");
		txtDuracao_locacao.setText("");
		txtForma_pagamento.setText("");
		txtId_imovel.setText("");
		txtId_locador.setText("");
		txtId_locatario.setText("");
		txtValor.setText("");
		txtValor.requestFocus();
	}
	private void AlterarValores() {
		String duracao,pagamento;
	    int id_locador,id_locatario,id_imovel,valor,id_contrato;
		
		duracao = txtDuracao_locacao.getText();
		pagamento = txtForma_pagamento.getText();
		id_locador = Integer.parseInt(txtId_locador.getText());
		id_locatario = Integer.parseInt(txtId_locatario.getText());
		id_imovel = Integer.parseInt(txtId_imovel.getText());
		valor = Integer.parseInt(txtValor.getText());
		id_contrato = Integer.parseInt(txtcodico.getText());
		
		
		objContratoModel = new ContratoMODEL();
		objContratoModel.setDuracao(duracao);
		objContratoModel.setId_imovel(id_imovel);
		objContratoModel.setId_locador(id_locador);
		objContratoModel.setId_locatario(id_locatario);
		objContratoModel.setPagamento(pagamento);
		objContratoModel.setValor(valor);
		objContratoModel.setId_contrato(id_contrato);
		
		
		
		ContratoCONTROLLER comtroll = new ContratoCONTROLLER();
		comtroll.alterarcontrato(objContratoModel);
	}
	private void DeletarValores() {
		int id;
		
		id = Integer.parseInt(txtcodico.getText());
		
		ContratoMODEL objContratoModel = new ContratoMODEL();
		objContratoModel.setId_contrato(id);
		
		ContratoCONTROLLER comtroll = new ContratoCONTROLLER();
		comtroll.deletarContrato(objContratoModel);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ImovelCONTROLLER;
import controller.LocadorCONTROLLER;
import model.ImovelMODEL;
import model.LocadorMODEL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaImovelView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEndereco;
	private JTextField txtEstado_Conservacao;
	private JTextField txtDescricao;
	
	ImovelMODEL objImovelModel = new ImovelMODEL();
	ImovelCONTROLLER objImovelController = new ImovelCONTROLLER();
	private JTextField txtcodico;
	private JTable tabelaImovel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImovelView frame = new TelaImovelView();
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
	public TelaImovelView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 370);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipalView TprincipalV = new TelaPrincipalView();
				TprincipalV.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBackground(new Color(255, 0, 51));
		btnVoltar.setBounds(740, 285, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton button_2 = new JButton("Limpar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBackground(new Color(255, 0, 51));
		button_2.setBounds(496, 285, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Listar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBackground(new Color(255, 0, 51));
		button_3.setBounds(616, 285, 97, 25);
		contentPane.add(button_3);
		
		tabelaImovel = new JTable();
		tabelaImovel.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "endereco", "conservacao", "descricao"
			}
		));
		tabelaImovel.setColumnSelectionAllowed(true);
		tabelaImovel.setCellSelectionEnabled(true);
		tabelaImovel.setBounds(492, 65, 357, 207);
		contentPane.add(tabelaImovel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main2\\Imobiliaria\\imagens\\imgTelaImovel.png"));
		lblNewLabel.setBounds(492, 64, 357, 259);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 849, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTelaDoImovel = new JLabel("Tela do Imovel");
		lblTelaDoImovel.setForeground(Color.BLACK);
		lblTelaDoImovel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblTelaDoImovel.setBounds(309, 35, 181, 16);
		panel.add(lblTelaDoImovel);
		
		JLabel lblEndereo = new JLabel("endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEndereo.setForeground(Color.WHITE);
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndereo.setBounds(109, 109, 74, 16);
		contentPane.add(lblEndereo);
		
		JLabel lblEstadoDeConservao = new JLabel("estado de conserva\u00E7\u00E3o:");
		lblEstadoDeConservao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEstadoDeConservao.setForeground(Color.WHITE);
		lblEstadoDeConservao.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstadoDeConservao.setBounds(0, 157, 183, 16);
		contentPane.add(lblEstadoDeConservao);
		
		JLabel lblDescrio = new JLabel("descri\u00E7\u00E3o:");
		lblDescrio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescrio.setBounds(0, 198, 183, 16);
		contentPane.add(lblDescrio);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(195, 107, 257, 22);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtEstado_Conservacao = new JTextField();
		txtEstado_Conservacao.setColumns(10);
		txtEstado_Conservacao.setBounds(195, 155, 257, 22);
		contentPane.add(txtEstado_Conservacao);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(195, 196, 257, 22);
		contentPane.add(txtDescricao);
		
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
		button.setBounds(12, 285, 97, 25);
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
		btnAtualizar.setBounds(130, 285, 97, 25);
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
		btnDeletar.setBounds(246, 285, 97, 25);
		contentPane.add(btnDeletar);
		
		JLabel label = new JLabel("Id:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(80, 243, 103, 16);
		contentPane.add(label);
		
		txtcodico = new JTextField();
		txtcodico.setEnabled(false);
		txtcodico.setColumns(10);
		txtcodico.setBounds(195, 241, 32, 22);
		contentPane.add(txtcodico);
		
		JButton button_1 = new JButton("Carregar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarCampos();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBackground(new Color(255, 0, 51));
		button_1.setBounds(355, 285, 97, 25);
		contentPane.add(button_1);
	}
	private void SalvarCampos() {
		 String endereco,estado_de_conservacao,descricao;
			
			descricao = txtDescricao.getText();
			estado_de_conservacao = txtEstado_Conservacao.getText();
			endereco = txtEndereco.getText();
			
			
			objImovelModel = new ImovelMODEL();
			objImovelModel.setDescricao(descricao);
			objImovelModel.setEndereco(endereco);
			objImovelModel.setEstado_de_conservacao(estado_de_conservacao);
			
			ImovelCONTROLLER comtroll = new ImovelCONTROLLER();
			comtroll.salvarImovel(objImovelModel);
	}
	private void ListarValores() {
		try {
			ImovelCONTROLLER objImovelC = new ImovelCONTROLLER();
			
			DefaultTableModel model = (DefaultTableModel) tabelaImovel.getModel();
			model.setNumRows(0);
			
			ArrayList<ImovelMODEL> lista = objImovelC.PesquisarImovel();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getImovel_id(),
						lista.get(num).getDescricao(),
						lista.get(num).getEndereco(),
						lista.get(num).getEstado_de_conservacao(),
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ListarValores TelaImovelView" + erro);
		}
	}
	private void carregarCampos() {
		int setar = tabelaImovel.getSelectedRow();
		
		txtcodico.setText(tabelaImovel.getModel().getValueAt(setar,0).toString());
		txtDescricao.setText(tabelaImovel.getModel().getValueAt(setar,1).toString());
		txtEndereco.setText(tabelaImovel.getModel().getValueAt(setar,2).toString());
		txtEstado_Conservacao.setText(tabelaImovel.getModel().getValueAt(setar,3).toString());
		
	}
	private void LimparCampos() {
		txtcodico.setText("");
		txtEndereco.setText("");
		txtDescricao.setText("");
		txtEstado_Conservacao.setText("");
		txtEndereco.requestFocus();
	}
	private void AlterarValores() {
		String descricao,estado_conservacao,endereco;
		int id;
		
		descricao = txtDescricao.getText();
		estado_conservacao = txtEstado_Conservacao.getText();
		endereco = txtEndereco.getText();
		id = Integer.parseInt(txtcodico.getText());
		
		
		objImovelModel = new ImovelMODEL();
		objImovelModel.setDescricao(descricao);
		objImovelModel.setEndereco(endereco);
		objImovelModel.setEstado_de_conservacao(estado_conservacao);
		objImovelModel.setImovel_id(id);
		
		ImovelCONTROLLER comtroll = new ImovelCONTROLLER();
		comtroll.alterarImovel(objImovelModel);
	}
	private void DeletarValores() {
		int id;
		
		id = Integer.parseInt(txtcodico.getText());
		
		ImovelMODEL objImovelModel = new ImovelMODEL();
		objImovelModel.setImovel_id(id);
		
		ImovelCONTROLLER comtroll = new ImovelCONTROLLER();
		comtroll.deletarImovel(objImovelModel);
	}
}

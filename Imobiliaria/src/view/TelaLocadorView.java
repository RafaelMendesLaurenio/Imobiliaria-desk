package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.LocadorCONTROLLER;
import controller.UsuarioCONTROLLER;
import model.LocadorMODEL;
import model.UsuarioMODEL;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TelaLocadorView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEstado_Civil;
	private JTextField txtCPF;
	private JTextField txtprofissao;
	private JTextField txtEndereco;
	
	LocadorMODEL objLocadorModel = new LocadorMODEL();
	LocadorCONTROLLER objLocadorController = new LocadorCONTROLLER();
	private JTable tabelaLocador;
	private JTextField txtcodico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLocadorView frame = new TelaLocadorView();
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
	public TelaLocadorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 896, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela do Locador");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(362, 30, 150, 16);
		panel.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipalView TprincipalV = new TelaPrincipalView();
				TprincipalV.setVisible(true);
				dispose();
			}
		});
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnListar.setBackground(new Color(255, 0, 51));
		btnListar.setBounds(626, 337, 97, 25);
		contentPane.add(btnListar);
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBackground(new Color(255, 0, 51));
		btnVoltar.setBounds(787, 337, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton btnCarregar = new JButton("Carregar");
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarCampos();
			}
		});
		btnCarregar.setForeground(Color.BLACK);
		btnCarregar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCarregar.setBackground(new Color(255, 0, 51));
		btnCarregar.setBounds(345, 337, 97, 25);
		contentPane.add(btnCarregar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBackground(new Color(255, 0, 51));
		btnLimpar.setBounds(459, 337, 97, 25);
		contentPane.add(btnLimpar);
		
		tabelaLocador = new JTable();
		tabelaLocador.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "nome", "e_civil", "cpf", "profissão", "endereço"
			}
		));
		tabelaLocador.setColumnSelectionAllowed(true);
		tabelaLocador.setCellSelectionEnabled(true);
		tabelaLocador.setBounds(449, 53, 447, 271);
		contentPane.add(tabelaLocador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:/Users/rafae/eclipse-workspace/Imobiliaria-main2/Imobiliaria/imagens/imgTelaLocador.png"));
		label.setBounds(449, 53, 447, 336);
		contentPane.add(label);
		
		JLabel lblNome = new JLabel("nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(59, 87, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEstadoCivil.setForeground(Color.WHITE);
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstadoCivil.setBounds(12, 131, 103, 16);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpf.setBounds(59, 178, 56, 16);
		contentPane.add(lblCpf);
		
		JLabel lblProfisso = new JLabel("Profiss\u00E3o:");
		lblProfisso.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProfisso.setForeground(Color.WHITE);
		lblProfisso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProfisso.setBounds(29, 224, 86, 16);
		contentPane.add(lblProfisso);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEndereo.setForeground(Color.WHITE);
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndereo.setBounds(12, 271, 103, 16);
		contentPane.add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setBounds(127, 85, 268, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEstado_Civil = new JTextField();
		txtEstado_Civil.setColumns(10);
		txtEstado_Civil.setBounds(127, 129, 268, 22);
		contentPane.add(txtEstado_Civil);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(127, 172, 268, 22);
		contentPane.add(txtCPF);
		
		txtprofissao = new JTextField();
		txtprofissao.setColumns(10);
		txtprofissao.setBounds(127, 222, 268, 22);
		contentPane.add(txtprofissao);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(127, 269, 268, 22);
		contentPane.add(txtEndereco);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(255, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SalvarCampos();
				ListarValores();
				LimparCampos();
			}
		});
		btnNewButton.setBounds(12, 337, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarValores();
				ListarValores();
				LimparCampos();
			}
		});
		btnAtualizar.setForeground(new Color(0, 0, 0));
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAtualizar.setBackground(new Color(255, 0, 51));
		btnAtualizar.setBounds(121, 337, 97, 25);
		contentPane.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletarValores();
				ListarValores();
				LimparCampos();
			}
		});
		btnDeletar.setForeground(new Color(0, 0, 0));
		btnDeletar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeletar.setBackground(new Color(255, 0, 51));
		btnDeletar.setBounds(236, 337, 97, 25);
		contentPane.add(btnDeletar);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setBounds(12, 308, 103, 16);
		contentPane.add(lblId);
		
		txtcodico = new JTextField();
		txtcodico.setEnabled(false);
		txtcodico.setColumns(10);
		txtcodico.setBounds(127, 304, 32, 22);
		contentPane.add(txtcodico);
	}
	private void ListarValores() {
		try {
			LocadorCONTROLLER objLocadorC = new LocadorCONTROLLER();
			
			DefaultTableModel model = (DefaultTableModel) tabelaLocador.getModel();
			model.setNumRows(0);
			
			ArrayList<LocadorMODEL> lista = objLocadorC.PesquisarLocador();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getLocador_id(),
						lista.get(num).getNome(),
						lista.get(num).getEstado_civil(),
						lista.get(num).getCPF(),
						lista.get(num).getProfissao(),
						lista.get(num).getEndereco()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ListarValores TelaLocadorView" + erro);
		}
	}
	private void carregarCampos() {
		int setar = tabelaLocador.getSelectedRow();
		
		txtcodico.setText(tabelaLocador.getModel().getValueAt(setar,0).toString());
		txtNome.setText(tabelaLocador.getModel().getValueAt(setar,1).toString());
		txtEstado_Civil.setText(tabelaLocador.getModel().getValueAt(setar,2).toString());
		txtCPF.setText(tabelaLocador.getModel().getValueAt(setar,3).toString());
		txtprofissao.setText(tabelaLocador.getModel().getValueAt(setar,4).toString());
		txtEndereco.setText(tabelaLocador.getModel().getValueAt(setar,5).toString());
	}
	private void SalvarCampos() {
		String nome,estado_civil,profissao,endereco,cpf;
		
		nome = txtNome.getText();
		estado_civil = txtEstado_Civil.getText();
		profissao = txtprofissao.getText();
		endereco = txtEndereco.getText();
		cpf = txtCPF.getText();
		int CPF = Integer.parseInt(cpf);
		
		objLocadorModel = new LocadorMODEL();
		objLocadorModel.setNome(nome);
		objLocadorModel.setEstado_civil(estado_civil);
		objLocadorModel.setProfissao(profissao);
		objLocadorModel.setEndereco(endereco);
		objLocadorModel.setCPF(CPF);
		
		LocadorCONTROLLER comtroll = new LocadorCONTROLLER();
		comtroll.salvarLocador(objLocadorModel);
	}
	private void LimparCampos() {
		txtcodico.setText("");
		txtCPF.setText("");
		txtEndereco.setText("");
		txtEstado_Civil.setText("");
		txtNome.setText("");
		txtprofissao.setText("");
		txtNome.requestFocus();
	}
	private void AlterarValores() {
		String nome,estado_civil,profissao,endereco;
		int id,cpf;
		
		nome = txtNome.getText();
		estado_civil = txtEstado_Civil.getText();
		profissao = txtprofissao.getText();
		endereco = txtEndereco.getText();
		cpf = Integer.parseInt(txtCPF.getText());
		id = Integer.parseInt(txtcodico.getText());
		
		
		objLocadorModel = new LocadorMODEL();
		objLocadorModel.setNome(nome);
		objLocadorModel.setEstado_civil(estado_civil);
		objLocadorModel.setProfissao(profissao);
		objLocadorModel.setEndereco(endereco);
		objLocadorModel.setCPF(cpf);
		objLocadorModel.setLocador_id(id);
		
		LocadorCONTROLLER comtroll = new LocadorCONTROLLER();
		comtroll.alterarLocador(objLocadorModel);
	}
	private void DeletarValores() {
		int id;
		
		id = Integer.parseInt(txtcodico.getText());
		
		LocadorMODEL objLocadorModel = new LocadorMODEL();
		objLocadorModel.setLocador_id(id);
		
		LocadorCONTROLLER comtroll = new LocadorCONTROLLER();
		comtroll.deletarLocador(objLocadorModel);
	}
}

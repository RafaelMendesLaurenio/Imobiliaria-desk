package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.LocadorCONTROLLER;
import controller.LocatarioCONTROLLER;
import model.LocadorMODEL;
import model.LocatarioMODEL;

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

public class TelaLocatarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEstado_Civil;
	private JTextField txtCPF;
	private JTextField txtprofissao;
	private JTextField txtEndereco;
	
	LocatarioMODEL objLocatarioModel = new LocatarioMODEL();
	LocatarioCONTROLLER objLocatarioController = new LocatarioCONTROLLER();
	private JTable tabelaLocatario;
	private JTextField txtcodico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLocatarioView frame = new TelaLocatarioView();
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
	public TelaLocatarioView() {
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
		
		JLabel lblNewLabel = new JLabel("Tela do Locatario");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(362, 30, 181, 16);
		panel.add(lblNewLabel);
		
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
		btnVoltar.setBounds(787, 337, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton button_1 = new JButton("Limpar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBackground(new Color(255, 0, 51));
		button_1.setBounds(475, 337, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Listar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBackground(new Color(255, 0, 51));
		button_2.setBounds(625, 337, 97, 25);
		contentPane.add(button_2);
		
		tabelaLocatario = new JTable();
		tabelaLocatario.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"id", "nome", "e_civil", "cpf", "profissão", "endereço"
			}
		));
		tabelaLocatario.setColumnSelectionAllowed(true);
		tabelaLocatario.setCellSelectionEnabled(true);
		tabelaLocatario.setBounds(449, 62, 447, 262);
		contentPane.add(tabelaLocatario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:/Users/rafae/eclipse-workspace/Imobiliaria-main2/Imobiliaria/imagens/imgTelaLocatario.png"));
		label.setBounds(449, 62, 447, 327);
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
			public void actionPerformed(ActionEvent arg0) {
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
		btnDeletar.setBounds(230, 337, 97, 25);
		contentPane.add(btnDeletar);
		
		JButton button = new JButton("Carregar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarCampos();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(new Color(255, 0, 51));
		button.setBounds(340, 337, 97, 25);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("Id:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(12, 300, 103, 16);
		contentPane.add(label_1);
		
		txtcodico = new JTextField();
		txtcodico.setEnabled(false);
		txtcodico.setColumns(10);
		txtcodico.setBounds(127, 298, 32, 22);
		contentPane.add(txtcodico);
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
		
		
		objLocatarioModel = new LocatarioMODEL();
		objLocatarioModel.setNome(nome);
		objLocatarioModel.setEstado_civil(estado_civil);
		objLocatarioModel.setProfissao(profissao);
		objLocatarioModel.setEndereco(endereco);
		objLocatarioModel.setCPF(cpf);
		objLocatarioModel.setLocatario_id(id);
		
		LocatarioCONTROLLER comtroll = new LocatarioCONTROLLER();
		comtroll.alterarLocatario(objLocatarioModel);
	}
	private void DeletarValores() {
		int id;
		
		id = Integer.parseInt(txtcodico.getText());
		
		LocatarioMODEL objLocatarioModel = new LocatarioMODEL();
		objLocatarioModel.setLocatario_id(id);
		
		LocatarioCONTROLLER comtroll = new LocatarioCONTROLLER();
		comtroll.deletarLocatario(objLocatarioModel);
	}
	private void ListarValores() {
		try {
			LocatarioCONTROLLER objLocatarioC = new LocatarioCONTROLLER();
			
			DefaultTableModel model = (DefaultTableModel) tabelaLocatario.getModel();
			model.setNumRows(0);
			
			ArrayList<LocatarioMODEL> lista = objLocatarioC.PesquisarLocatario();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getLocatario_id(),
						lista.get(num).getNome(),
						lista.get(num).getEstado_civil(),
						lista.get(num).getCPF(),
						lista.get(num).getProfissao(),
						lista.get(num).getEndereco()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ListarValores TelaLocatarioView" + erro);
		}
	}
	private void carregarCampos() {
		int setar = tabelaLocatario.getSelectedRow();
		
		txtcodico.setText(tabelaLocatario.getModel().getValueAt(setar,0).toString());
		txtNome.setText(tabelaLocatario.getModel().getValueAt(setar,1).toString());
		txtEstado_Civil.setText(tabelaLocatario.getModel().getValueAt(setar,2).toString());
		txtCPF.setText(tabelaLocatario.getModel().getValueAt(setar,3).toString());
		txtprofissao.setText(tabelaLocatario.getModel().getValueAt(setar,4).toString());
		txtEndereco.setText(tabelaLocatario.getModel().getValueAt(setar,5).toString());
	}
	private void SalvarCampos() {
		String nome,estado_civil,profissao,endereco,cpf;
		
		nome = txtNome.getText();
		estado_civil = txtEstado_Civil.getText();
		profissao = txtprofissao.getText();
		endereco = txtEndereco.getText();
		cpf = txtCPF.getText();
		int CPF = Integer.parseInt(cpf);
		
		objLocatarioModel = new LocatarioMODEL();
		objLocatarioModel.setNome(nome);
		objLocatarioModel.setEstado_civil(estado_civil);
		objLocatarioModel.setProfissao(profissao);
		objLocatarioModel.setEndereco(endereco);
		objLocatarioModel.setCPF(CPF);
		
		LocatarioCONTROLLER comtroll = new LocatarioCONTROLLER();
		comtroll.salvarLocatario(objLocatarioModel);
	}
}


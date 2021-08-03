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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ListaUsuariosView extends JFrame {

	private JPanel contentPane;
	private JTable tabelaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaUsuariosView frame = new ListaUsuariosView();
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
	public ListaUsuariosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 466);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 514, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Usuarios");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(181, 28, 154, 20);
		panel.add(lblNewLabel);
		
		tabelaUsuario = new JTable();
		tabelaUsuario.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		tabelaUsuario.setBounds(10, 75, 492, 276);
		contentPane.add(tabelaUsuario);
		
		JButton button = new JButton("Listar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(new Color(255, 0, 51));
		button.setBounds(206, 381, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipalView TprincipalV = new TelaPrincipalView();
				TprincipalV.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBackground(new Color(255, 0, 51));
		button_1.setBounds(405, 381, 97, 25);
		contentPane.add(button_1);
	}
	private void ListarValores() {
		try {
			UsuarioCONTROLLER objUsuarioC = new UsuarioCONTROLLER();
			
			DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
			model.setNumRows(0);
			
			ArrayList<UsuarioMODEL> lista = objUsuarioC.PesquisarUsuario();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getUsuario_id(),
						lista.get(num).getNome(),
						lista.get(num).getEmail(),
						lista.get(num).getSenha()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ListarValores TelaUsuarioView" + erro);
		}
	}
}

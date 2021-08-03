package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalView frame = new TelaPrincipalView();
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
	public TelaPrincipalView() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(106, 163, 78, 76);
		contentPane.add(label_3);
		label_3.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\icon_casa.png"));
		
		JButton btnLocatario = new JButton("locatario");
		btnLocatario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaLocatarioView TlocatarioV = new TelaLocatarioView();
				TlocatarioV.setVisible(true);
				dispose();
			}
		});
		btnLocatario.setForeground(Color.BLACK);
		btnLocatario.setBackground(new Color(220, 20, 60));
		btnLocatario.setBounds(90, 252, 106, 25);
		contentPane.add(btnLocatario);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(334, 177, 94, 63);
		contentPane.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\icon_chave.png"));
		
		JButton btnNewButton_1 = new JButton("locador");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLocadorView TlocadorV = new TelaLocadorView();
				TlocadorV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(322, 245, 106, 25);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(582, 176, 56, 66);
		contentPane.add(label_5);
		label_5.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\icon_Imovel.png"));
		
		JButton btnNewButton_2 = new JButton("imovel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaImovelView TImovelV = new TelaImovelView();
				TImovelV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(552, 245, 106, 25);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(113, 314, 82, 63);
		contentPane.add(label_6);
		label_6.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\lista_icon.png"));
		
		JButton btnNewButton_3 = new JButton("usuarios");
		btnNewButton_3.setBounds(90, 378, 106, 25);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(new Color(220, 20, 60));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaUsuariosView LusuariosV = new ListaUsuariosView();
				LusuariosV.setVisible(true);
				dispose();
			}
		});
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(351, 314, 56, 61);
		contentPane.add(label_7);
		label_7.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\icon_contrato.png"));
		
		JButton btnNewButton_4 = new JButton("contrato");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaContratoView TcontratoV = new TelaContratoView();
				TcontratoV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(321, 378, 106, 25);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(new Color(220, 20, 60));
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(574, 314, 70, 65);
		contentPane.add(label_8);
		label_8.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\icon_sobre.png"));
		
		JButton btnNewButton_5 = new JButton("Sobre");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSobreView TsobreV = new TelaSobreView();
				TsobreV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(556, 377, 106, 25);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(new Color(220, 20, 60));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 13, 767, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(25, 42, 90, 51);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\logo_mini2.png"));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(124, 13, 156, 107);
		panel.add(label_2);
		label_2.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\TituloSite.png"));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\rafae\\eclipse-workspace\\Imobiliaria-main\\Imobiliaria\\imagens\\FundoHome.png"));
		label.setBounds(0, 0, 767, 434);
		contentPane.add(label);
	}
}

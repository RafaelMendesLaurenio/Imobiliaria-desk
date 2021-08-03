package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSobreView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobreView frame = new TelaSobreView();
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
	public TelaSobreView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 470, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEquipe = new JLabel("equipe");
		lblEquipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipe.setForeground(Color.BLACK);
		lblEquipe.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblEquipe.setBounds(143, 30, 181, 28);
		panel.add(lblEquipe);
		
		JLabel lblNomeRafaelMendes = new JLabel("nome: Rafael mendes Laur\u00EAnio N\u00B0: 33");
		lblNomeRafaelMendes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeRafaelMendes.setForeground(Color.WHITE);
		lblNomeRafaelMendes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeRafaelMendes.setBounds(0, 84, 289, 16);
		contentPane.add(lblNomeRafaelMendes);
		
		JLabel lblNomeWellingtonDe = new JLabel("nome: Wellington de Sousa Silva N\u00B0: 42");
		lblNomeWellingtonDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeWellingtonDe.setForeground(Color.WHITE);
		lblNomeWellingtonDe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeWellingtonDe.setBounds(0, 113, 296, 16);
		contentPane.add(lblNomeWellingtonDe);
		
		JLabel lblNomeGustavoAugusto = new JLabel("nome: Gustavo Augusto Amaral Nascimento N\u00B0: 16");
		lblNomeGustavoAugusto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeGustavoAugusto.setForeground(Color.WHITE);
		lblNomeGustavoAugusto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeGustavoAugusto.setBounds(0, 171, 381, 16);
		contentPane.add(lblNomeGustavoAugusto);
		
		JLabel lblNomeDouglasWallace = new JLabel("nome: Douglas Wallace Lobo Parente N\u00B0: 12");
		lblNomeDouglasWallace.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDouglasWallace.setForeground(Color.WHITE);
		lblNomeDouglasWallace.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeDouglasWallace.setBounds(0, 142, 332, 16);
		contentPane.add(lblNomeDouglasWallace);
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipalView TprincipalV = new TelaPrincipalView();
				TprincipalV.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(new Color(255, 0, 51));
		button.setBounds(179, 548, 97, 25);
		contentPane.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 0, 51));
		panel_1.setBounds(0, 214, 470, 41);
		contentPane.add(panel_1);
		
		JLabel lblFunao = new JLabel("fun\u00E7ao");
		lblFunao.setBounds(140, 0, 181, 28);
		panel_1.add(lblFunao);
		lblFunao.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunao.setForeground(Color.BLACK);
		lblFunao.setFont(new Font("Arial Black", Font.PLAIN, 18));
		
		JLabel lblRafaelPlanejamentoUml = new JLabel("Rafael: planejamento, UML, Desenvolvimento");
		lblRafaelPlanejamentoUml.setHorizontalAlignment(SwingConstants.CENTER);
		lblRafaelPlanejamentoUml.setForeground(Color.WHITE);
		lblRafaelPlanejamentoUml.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRafaelPlanejamentoUml.setBounds(0, 281, 381, 16);
		contentPane.add(lblRafaelPlanejamentoUml);
		
		JLabel lblWelligtonBancoDe = new JLabel("Welligton: Banco de dados, Desenvolvimento");
		lblWelligtonBancoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelligtonBancoDe.setForeground(Color.WHITE);
		lblWelligtonBancoDe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelligtonBancoDe.setBounds(0, 311, 381, 16);
		contentPane.add(lblWelligtonBancoDe);
		
		JLabel lblGustavoUmlDesign = new JLabel("Gustavo: UML, design");
		lblGustavoUmlDesign.setHorizontalAlignment(SwingConstants.LEFT);
		lblGustavoUmlDesign.setForeground(Color.WHITE);
		lblGustavoUmlDesign.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGustavoUmlDesign.setBounds(22, 340, 381, 16);
		contentPane.add(lblGustavoUmlDesign);
		
		JLabel lblDouglasBancoDe = new JLabel("Douglas: Banco de dados, Design");
		lblDouglasBancoDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblDouglasBancoDe.setForeground(Color.WHITE);
		lblDouglasBancoDe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDouglasBancoDe.setBounds(22, 369, 381, 16);
		contentPane.add(lblDouglasBancoDe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 0, 51));
		panel_2.setBounds(0, 407, 470, 41);
		contentPane.add(panel_2);
		
		JLabel lblFerramentas = new JLabel("ferramentas");
		lblFerramentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFerramentas.setForeground(Color.BLACK);
		lblFerramentas.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblFerramentas.setBounds(140, 0, 181, 28);
		panel_2.add(lblFerramentas);
		
		JLabel lblDiadiagramas = new JLabel("DIA(diagramas)");
		lblDiadiagramas.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiadiagramas.setForeground(Color.WHITE);
		lblDiadiagramas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDiadiagramas.setBounds(33, 461, 381, 16);
		contentPane.add(lblDiadiagramas);
		
		JLabel lblJavaJava = new JLabel("Java \u00E9 java swing (Desenvolvimento)");
		lblJavaJava.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaJava.setForeground(Color.WHITE);
		lblJavaJava.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJavaJava.setBounds(33, 490, 381, 16);
		contentPane.add(lblJavaJava);
		
		JLabel lblXammpbancoDe = new JLabel("xammp (banco de dados)");
		lblXammpbancoDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblXammpbancoDe.setForeground(Color.WHITE);
		lblXammpbancoDe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblXammpbancoDe.setBounds(33, 519, 381, 16);
		contentPane.add(lblXammpbancoDe);
	}
}

package DJLV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;

public class Principal extends JFrame {
	private String LoginUsuario;
	
	
	
	public String getLoginUsuario() {
		return LoginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		LoginUsuario = loginUsuario;
	}

	Scanner scan = new Scanner(System.in);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(new Color(208, 208, 208));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		
		
	
		JButton btnCores = new JButton("");
		btnCores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resistor resistor = new Resistor();
				resistor.setVisible(true);
			}
		});
		btnCores.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0)));
		btnCores.setBounds(158, 415, 268, 254);
		btnCores.setIcon(new ImageIcon(Principal.class.getResource("/Image/ResistorTeste.png")));
		getContentPane().add(btnCores);
		
		JButton btnCalculadora = new JButton("");
		btnCalculadora.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0)));
		btnCalculadora.setBounds(806, 54, 268, 265);
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbMWatts dbMWatts = new dbMWatts();
				dbMWatts.setVisible(true);
			}
		});
		btnCalculadora.setIcon(new ImageIcon(Principal.class.getResource("/Image/CalculadoraTeste.png")));
		getContentPane().add(btnCalculadora);
		
		JButton btnLeiOhm = new JButton("");
		btnLeiOhm.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0)));
		btnLeiOhm.setBounds(1458, 415, 268, 254);
		btnLeiOhm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeiOhm lo = new LeiOhm();
				lo.setVisible(true);
			}
		});
		btnLeiOhm.setIcon(new ImageIcon(Principal.class.getResource("/Image/LEI.png")));
		getContentPane().add(btnLeiOhm);
		
		JLabel lblNewLabel_2 = new JLabel("\u2022 C\u00E1lculo de resistores por cores:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(61, 700, 353, 26);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u2022 C\u00E1lculo de SMD de resistor:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3.setBounds(1130, 700, 321, 26);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u2022 C\u00E1lculo de SMD de capacitor:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4.setBounds(437, 700, 317, 26);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u2022 C\u00E1lculo da Lei de Ohm:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_5.setBounds(1483, 700, 286, 26);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u2022 C\u00E1lculo de dBm para Watts:");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_6.setBounds(764, 698, 370, 30);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblLogoIni = new JLabel("");
		lblLogoIni.setIcon(new ImageIcon(Principal.class.getResource("/Image/LOGO2.png")));
		lblLogoIni.setBounds(688, 415, 515, 288);
		getContentPane().add(lblLogoIni);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(46, 597, 310, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBounds(109, 615, 243, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(127, 655, 243, 14);
		getContentPane().add(lblNewLabel_7);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(128, 437, 7, 20);
		getContentPane().add(textPane);
		
		JTextPane txtpnIdentificaOValor = new JTextPane();
		txtpnIdentificaOValor.setEditable(false);
		txtpnIdentificaOValor.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnIdentificaOValor.setText("Identifica o valor da resist\u00EAncia com base nas cores das faixas no resistor.\r\nCada cor representa um multiplicador espec\u00EDfico.\r\nCombina\u00E7\u00E3o das cores das faixas para determinar o valor da resist\u00EAncia.");
		txtpnIdentificaOValor.setBounds(89, 755, 310, 204);
		getContentPane().add(txtpnIdentificaOValor);
		
		JTextPane txtpnResistoresSmdSo = new JTextPane();
		txtpnResistoresSmdSo.setEditable(false);
		txtpnResistoresSmdSo.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnResistoresSmdSo.setText("Resistores SMD s\u00E3o componentes eletr\u00F4nicos de tamanho reduzido e montagem superficial.\r\nC\u00E1lculo do valor de resist\u00EAncia com base no c\u00F3digo de tr\u00EAs ou quatro d\u00EDgitos.\r\nCada d\u00EDgito no c\u00F3digo representa um valor num\u00E9rico espec\u00EDfico, e o \u00FAltimo d\u00EDgito indica o multiplicador.");
		txtpnResistoresSmdSo.setBounds(1129, 745, 322, 204);
		getContentPane().add(txtpnResistoresSmdSo);
		
		JTextPane txtpnCapacitoresSmdSo = new JTextPane();
		txtpnCapacitoresSmdSo.setEditable(false);
		txtpnCapacitoresSmdSo.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnCapacitoresSmdSo.setText("Capacitores SMD s\u00E3o componentes eletr\u00F4nicos para armazenamento de energia el\u00E9trica.\r\nC\u00E1lculo do valor de capacit\u00E2ncia com base no c\u00F3digo de tr\u00EAs ou quatro d\u00EDgitos.\r\nCada d\u00EDgito no c\u00F3digo representa um valor num\u00E9rico espec\u00EDfico, e o \u00FAltimo d\u00EDgito indica o multiplicador.");
		txtpnCapacitoresSmdSo.setBounds(437, 755, 322, 219);
		getContentPane().add(txtpnCapacitoresSmdSo);
		
		JTextPane txtpnRelaoEntreTenso = new JTextPane();
		txtpnRelaoEntreTenso.setText("Rela\u00E7\u00E3o entre tens\u00E3o, corrente e resist\u00EAncia em um circuito el\u00E9trico.\r\nF\u00F3rmula: V = I * R, onde V \u00E9 a tens\u00E3o, I \u00E9 a corrente e R \u00E9 a resist\u00EAncia.\r\nConhecendo duas das grandezas, \u00E9 poss\u00EDvel calcular a terceira usando a f\u00F3rmula.");
		txtpnRelaoEntreTenso.setBounds(962, 556, -116, 20);
		getContentPane().add(txtpnRelaoEntreTenso);
		
		JTextPane txtpnRelaoEntreTenso_1 = new JTextPane();
		txtpnRelaoEntreTenso_1.setEditable(false);
		txtpnRelaoEntreTenso_1.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnRelaoEntreTenso_1.setText("Rela\u00E7\u00E3o entre tens\u00E3o, corrente e resist\u00EAncia em um circuito el\u00E9trico.\r\nF\u00F3rmula: V = I * R, onde V \u00E9 a tens\u00E3o, I \u00E9 a corrente e R \u00E9 a resist\u00EAncia.\r\nConhecendo duas das grandezas, \u00E9 poss\u00EDvel calcular a terceira usando a f\u00F3rmula.");
		txtpnRelaoEntreTenso_1.setBounds(1483, 745, 322, 204);
		getContentPane().add(txtpnRelaoEntreTenso_1);
		
		JTextPane txtpnDbmUma = new JTextPane();
		txtpnDbmUma.setEditable(false);
		txtpnDbmUma.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnDbmUma.setText("   A dBm \u00E9 uma unidade de medida de pot\u00EAncia em eletr\u00F4nica e telecomunica\u00E7\u00F5es.\r\nConvers\u00E3o de dBm para Watts usando a f\u00F3rmula: P (W) = 10^((P (dBm) - 30) / 10).\r\nPermite converter facilmente a pot\u00EAncia entre dBm e Watts.");
		txtpnDbmUma.setBounds(764, 755, 370, 194);
		getContentPane().add(txtpnDbmUma);
		
		JButton btnCapacitor = new JButton("");
		btnCapacitor.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0)));
		btnCapacitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CEIA CEIA = new CEIA();
				CEIA.setVisible(true);
			}
		});
		btnCapacitor.setIcon(new ImageIcon(Principal.class.getResource("/Image/capacitor3.png")));
		btnCapacitor.setBounds(420, 121, 268, 254);
		getContentPane().add(btnCapacitor);
		
		JButton btnResistor_1 = new JButton("");
		btnResistor_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0), new Color(193, 0, 0)));
		btnResistor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				REIA reia = new REIA();
				reia.setVisible(true);
			}
		});
		btnResistor_1.setIcon(new ImageIcon(Principal.class.getResource("/Image/testeResistor1.png")));
		btnResistor_1.setBounds(1198, 121, 258, 254);
		getContentPane().add(btnResistor_1);
	}
}

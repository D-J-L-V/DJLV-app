package DJLV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class Resistor extends JFrame {

	private JPanel contentPane;
	private JTextField txtOlnome;
	private String ret1 = "0";
	private String ret2 = "0";
	private String ret3 = "0";
	private double tol = 0;
	private double mult = 1;
	private double result;
	private String ppm = "0ppm";
	private JTextField retornoRes;
	private JTextField retornoRes_5;
	private JTextField retornoRes_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resistor frame = new Resistor();
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
	public Resistor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String cores[] = {"Selecione uma cor", "Preto - 0", "Marrom - 1", "Vermelho - 2", "Laranja - 3", "Amarelo - 4", "Verde - 5", "Azul - 6", "Violeta - 7", "Cinza - 8", "Branco - 9"};
		String cores2[] = {"Selecione uma cor", "Preto - x1", "Marrom - x10", "Vermelho - x100", "Laranja - x1k", "Amarelo - x10k", "Verde - x100k", "Azul - x1M", "Violeta - x10M", "Cinza - x100M", "Branco - x1G", "Dourado - x0.1", "Prata - x0.01"};
		String cores3[] = {"Selecione uma cor","Marrom - ±1%", "Vermelho - ±2%", "Verde - ±0.5%", "Azul - ±0.25%", "Violeta - ±0.1%", "Cinza - ±0.05%", "Dourado - ±5%", "Prata - ±10%"};
		String cores4[] = {"Selecione uma cor", "Marrom - 100 ppm", "Vermelho - 50 ppm", "Laranja - 15 ppm", "Amarelo - 25 ppm", "Azul - 10 ppm", "Violeta - 5 ppm"};
		
		JPanel panel4B = new JPanel();
		panel4B.setBounds(18, 105, 839, 437);
		contentPane.add(panel4B);
		panel4B.setLayout(null);
		
		JPanel cor1 = new JPanel();
		cor1.setBounds(469, 120, 15, 75);
		panel4B.add(cor1);
		
		JPanel cor3 = new JPanel();
		cor3.setBounds(602, 132, 15, 53);
		panel4B.add(cor3);
		
		JPanel cor4 = new JPanel();
		cor4.setBounds(715, 120, 15, 75);
		panel4B.add(cor4);
		
		JPanel cor2 = new JPanel();
		cor2.setBounds(513, 131, 15, 53);
		panel4B.add(cor2);
		
		JComboBox selCor1 = new JComboBox(cores);
		selCor1.setForeground(new Color(0, 0, 0));
		selCor1.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor1.setBounds(27, 58, 327, 39);
		panel4B.add(selCor1);
		
		JComboBox selCor2 = new JComboBox(cores);
		selCor2.setForeground(new Color(0, 0, 0));
		selCor2.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor2.setBounds(26, 126, 327, 39);
		panel4B.add(selCor2);
		
		JComboBox multiplicador = new JComboBox(cores2);
		multiplicador.setForeground(new Color(0, 0, 0));
		multiplicador.setFont(new Font("Arial", Font.PLAIN, 16));
		multiplicador.setBounds(27, 187, 327, 39);
		panel4B.add(multiplicador);
		
		JComboBox resistencia = new JComboBox(cores3);
		resistencia.setForeground(new Color(0, 0, 0));
		resistencia.setFont(new Font("Arial", Font.PLAIN, 16));
		resistencia.setBounds(26, 249, 327, 39);
		panel4B.add(resistencia);
		
		JLabel resistorIMG = new JLabel("");
		resistorIMG.setBounds(432, 40, 364, 292);
		resistorIMG.setIcon(new ImageIcon(Resistor.class.getResource("/br/com/exemplosswing/imagens/resistor-removebg-preview (1).png")));
		panel4B.add(resistorIMG);
		
		retornoRes = new JTextField();
		retornoRes.setColumns(10);
		retornoRes.setBounds(87, 303, 199, 23);
		panel4B.add(retornoRes);
		
		JLabel retornoRes2 = new JLabel("0 Ohms 0%");
		retornoRes2.setHorizontalAlignment(SwingConstants.CENTER);
		retornoRes2.setFont(new Font("Arial", Font.BOLD, 20));
		retornoRes2.setBounds(508, 272, 199, 39);
		panel4B.add(retornoRes2);
		
		JLabel textB1 = new JLabel("1\u00B0 Banda de Cor");
		textB1.setFont(new Font("Arial", Font.PLAIN, 11));
		textB1.setBounds(27, 40, 119, 14);
		panel4B.add(textB1);
		
		JLabel txtB2 = new JLabel("2\u00B0 Banda de Cor");
		txtB2.setFont(new Font("Arial", Font.PLAIN, 11));
		txtB2.setBounds(27, 107, 119, 14);
		panel4B.add(txtB2);
		
		JLabel txtMult = new JLabel("Multiplicador");
		txtMult.setFont(new Font("Arial", Font.PLAIN, 11));
		txtMult.setBounds(27, 169, 119, 14);
		panel4B.add(txtMult);
		
		JLabel lblBandaDe_2 = new JLabel("Toler\u00E2ncia");
		lblBandaDe_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBandaDe_2.setBounds(27, 231, 119, 14);
		panel4B.add(lblBandaDe_2);
		
		selCor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha1 = selCor1.getSelectedItem().toString();
				 if(escolha1.equals("Preto - 0")) {
					cor1.setBackground(new Color(0, 0, 0));
					ret1 = "0";
					result = Double.parseDouble(ret1 + ret2) * mult;
					retornoRes.setText(result + "");
					retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Marrom - 1")) {
						cor1.setBackground(new Color(128, 64, 64));
						ret1 = "1";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Vermelho - 2")) {
						cor1.setBackground(new Color(255, 0, 0));
						ret1 = "2";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Laranja - 3")) {
						cor1.setBackground(new Color(255, 128, 64));
						ret1 = "3";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Amarelo - 4")) {
						cor1.setBackground(new Color(255, 255, 0));
						ret1 = "4";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Verde - 5")) {
						cor1.setBackground(new Color(0, 128, 64));
						ret1 = "5";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Azul - 6")) {
						cor1.setBackground(new Color(0, 0, 160));
						ret1 = "6";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Violeta - 7")) {
						cor1.setBackground(new Color(128, 0, 128));
						ret1 = "7";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Cinza - 8")) {
						cor1.setBackground(new Color(128, 128, 128));
						ret1 = "8";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Branco - 9")) {
						cor1.setBackground(new Color(255, 255, 255));
						ret1 = "9";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
			}
			
		});
		
		selCor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha2 = selCor2.getSelectedItem().toString();
				 if(escolha2.equals("Preto - 0")) {
					cor2.setBackground(new Color(0, 0, 0));
					ret2 = "0";
					result = Double.parseDouble(ret1 + ret2) * mult;
					retornoRes.setText(result + "");
					retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Marrom - 1")) {
						cor2.setBackground(new Color(128, 64, 64));
						ret2 = "1";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Vermelho - 2")) {
						cor2.setBackground(new Color(255, 0, 0));
						ret2 = "2";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Laranja - 3")) {
						cor2.setBackground(new Color(255, 128, 64));
						ret2 = "3";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Amarelo - 4")) {
						cor2.setBackground(new Color(255, 255, 0));
						ret2 = "4";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Verde - 5")) {
						cor2.setBackground(new Color(0, 128, 64));
						ret2 = "5";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Azul - 6")) {
						cor2.setBackground(new Color(0, 0, 160));
						ret2 = "6";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Violeta - 7")) {
						cor2.setBackground(new Color(128, 0, 128));
						ret2 = "7";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Cinza - 8")) {
						cor2.setBackground(new Color(128, 128, 128));
						ret2 = "8";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Branco - 9")) {
						cor2.setBackground(new Color(255, 255, 255));
						ret2 = "9";
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
			}
			
		});

		
		multiplicador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha3 = multiplicador.getSelectedItem().toString();
				 if(escolha3.equals("Preto - x1")) {
					cor3.setBackground(new Color(0, 0, 0));
					mult = 1;
					result = Double.parseDouble(ret1 + ret2) * mult;
					retornoRes.setText(result + "");
					retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Marrom - x10")) {
						cor3.setBackground(new Color(128, 64, 64));
						mult = 10;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Vermelho - x100")) {
						cor3.setBackground(new Color(255, 0, 0));
						mult = 100;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + "." + ret2 + "k Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Laranja - x1k")) {
						cor3.setBackground(new Color(255, 128, 64));
						mult = 1000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + ret2 + "k Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Amarelo - x10k")) {
						cor3.setBackground(new Color(255, 255, 0));
						mult = 10000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + ret2 + "0 Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Verde - x100k")) {
						cor3.setBackground(new Color(0, 128, 64));
						mult = 100000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + "." + ret2 + "M Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Azul - x1M")) {
						cor3.setBackground(new Color(0, 0, 160));
						mult = 1000000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + ret2 + "M Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Violeta - x10M")) {
						cor3.setBackground(new Color(128, 0, 128));
						mult = 10000000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + ret2 + "0M Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Cinza - x100M")) {
						cor3.setBackground(new Color(128, 128, 128));
						mult = 100000000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + "." + ret2 + "G Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Branco - x1G")) {
						cor3.setBackground(new Color(128, 128, 128));
						mult = 1000000000;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(ret1 + ret2 + "G Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Dourado - x0.1")) {
						cor3.setBackground(new Color(185, 153, 0));
						mult = 0.1;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha3.equals("Prata - x0.01")) {
						cor3.setBackground(new Color(192, 192, 192));
						mult = 0.01;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
			}
			
		});

		resistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha4 = resistencia.getSelectedItem().toString();
				 if(escolha4.equals("Marrom - ±1%")) {
					cor4.setBackground(new Color(128, 64, 64));
					tol = 1;
					result = Double.parseDouble(ret1 + ret2) * mult;
					retornoRes.setText(result + "");
					retornoRes2.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha4.equals("Vermelho - ±2%")) {
						cor4.setBackground(new Color(255, 0, 0));
						tol = 2;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Verde - ±0.5%")) {
						cor4.setBackground(new Color(0, 128, 64));
						tol = 0.5;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Azul - ±0.25%")) {
						cor4.setBackground(new Color(255, 0, 0));
						tol = 0.25;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Violeta - ±0.1%")) {
						cor4.setBackground(new Color(128, 0, 128));
						tol = 0.1;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Cinza - ±0.05%")) {
						cor4.setBackground(new Color(128, 128, 128));
						tol = 0.05;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Dourado - ±5%")) {
						cor4.setBackground(new Color(185, 153, 0));
						tol = 5;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Prata - ±10%")) {
						cor4.setBackground(new Color(192, 192, 192));
						tol = 10;
						result = Double.parseDouble(ret1 + ret2) * mult;
						retornoRes.setText(result + "");
						retornoRes2.setText(result + " Ohms " + tol + "%");
					 }
			}
			
		});
	
//// Fim versão de 4		

		JPanel panel5B = new JPanel();
		panel5B.setBounds(10, 105, 847, 437);
		contentPane.add(panel5B);
		panel5B.setLayout(null);
		panel5B.setVisible(false);
		
		JPanel cor1_5 = new JPanel();
		cor1_5.setBounds(469, 120, 15, 75);
		panel5B.add(cor1_5);
		
		JPanel cor2_5 = new JPanel();
		cor2_5.setBounds(513, 131, 15, 53);
		panel5B.add(cor2_5);
		
		JPanel cor3_5 = new JPanel();
		cor3_5.setBounds(538, 131, 15, 53);
		panel5B.add(cor3_5);
		
		JPanel cor4_5 = new JPanel();
		cor4_5.setBounds(602, 132, 15, 53);
		panel5B.add(cor4_5);
		
		JPanel cor5_5 = new JPanel();
		cor5_5.setBounds(715, 120, 15, 75);
		panel5B.add(cor5_5);
		
		JComboBox selCor1_5 = new JComboBox(cores);
		selCor1_5.setForeground(new Color(0, 0, 0));
		selCor1_5.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor1_5.setBounds(27, 60, 327, 39);
		panel5B.add(selCor1_5);
		
		JComboBox selCor2_5 = new JComboBox(cores);
		selCor2_5.setForeground(new Color(0, 0, 0));
		selCor2_5.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor2_5.setBounds(26, 126, 327, 39);
		panel5B.add(selCor2_5);
		
		JComboBox selCor3_5 = new JComboBox(cores);
		selCor3_5.setForeground(Color.BLACK);
		selCor3_5.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor3_5.setBounds(27, 188, 327, 39);
		panel5B.add(selCor3_5);
		
		JComboBox multiplicador_5 = new JComboBox(cores2);
		multiplicador_5.setForeground(new Color(0, 0, 0));
		multiplicador_5.setFont(new Font("Arial", Font.PLAIN, 16));
		multiplicador_5.setBounds(26, 251, 327, 39);
		panel5B.add(multiplicador_5);
		
		JComboBox resistencia_5 = new JComboBox(cores3);
		resistencia_5.setForeground(new Color(0, 0, 0));
		resistencia_5.setFont(new Font("Arial", Font.PLAIN, 16));
		resistencia_5.setBounds(25, 313, 327, 39);
		panel5B.add(resistencia_5);
		
		JLabel resistorIMG_5 = new JLabel("");
		resistorIMG_5.setBounds(432, 40, 364, 292);
		resistorIMG_5.setIcon(new ImageIcon(Resistor.class.getResource("/br/com/exemplosswing/imagens/resistor-removebg-preview (1).png")));
		panel5B.add(resistorIMG_5);

		retornoRes_5 = new JTextField();
		retornoRes_5.setColumns(10);
		retornoRes_5.setBounds(87, 367, 199, 23);
		panel5B.add(retornoRes_5);
		
		JLabel retornoRes2_5 = new JLabel("0 Ohms 0%");
		retornoRes2_5.setHorizontalAlignment(SwingConstants.CENTER);
		retornoRes2_5.setFont(new Font("Arial", Font.BOLD, 20));
		retornoRes2_5.setBounds(508, 272, 215, 39);
		panel5B.add(retornoRes2_5);
		
		JLabel textB1_5 = new JLabel("1\u00B0 Banda de Cor");
		textB1_5.setFont(new Font("Arial", Font.PLAIN, 11));
		textB1_5.setBounds(26, 40, 119, 14);
		panel5B.add(textB1_5);
		
		JLabel txtB2_5 = new JLabel("2\u00B0 Banda de Cor");
		txtB2_5.setFont(new Font("Arial", Font.PLAIN, 11));
		txtB2_5.setBounds(26, 105, 119, 14);
		panel5B.add(txtB2_5);
		
		JLabel txtB3_5 = new JLabel("3\u00B0 Banda de Cor");
		txtB3_5.setFont(new Font("Arial", Font.PLAIN, 11));
		txtB3_5.setBounds(26, 169, 119, 14);
		panel5B.add(txtB3_5);
		
		JLabel txtMult_5 = new JLabel("Multiplicador");
		txtMult_5.setFont(new Font("Arial", Font.PLAIN, 11));
		txtMult_5.setBounds(26, 233, 119, 14);
		panel5B.add(txtMult_5);
		
		JLabel lblBandaDe_2_5 = new JLabel("Toler\u00E2ncia");
		lblBandaDe_2_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBandaDe_2_5.setBounds(26, 295, 119, 14);
		panel5B.add(lblBandaDe_2_5);
		
		selCor1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha1 = selCor1_5.getSelectedItem().toString();
				 if(escolha1.equals("Preto - 0")) {
					cor1_5.setBackground(new Color(0, 0, 0));
					ret1 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_5.setText(result + "");
					retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Marrom - 1")) {
						cor1_5.setBackground(new Color(128, 64, 64));
						ret1 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Vermelho - 2")) {
						cor1_5.setBackground(new Color(255, 0, 0));
						ret1 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Laranja - 3")) {
						cor1_5.setBackground(new Color(255, 128, 64));
						ret1 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Amarelo - 4")) {
						cor1_5.setBackground(new Color(255, 255, 0));
						ret1 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Verde - 5")) {
						cor1_5.setBackground(new Color(0, 128, 64));
						ret1 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Azul - 6")) {
						cor1_5.setBackground(new Color(0, 0, 160));
						ret1 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Violeta - 7")) {
						cor1_5.setBackground(new Color(128, 0, 128));
						ret1 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Cinza - 8")) {
						cor1_5.setBackground(new Color(128, 128, 128));
						ret1 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha1.equals("Branco - 9")) {
						cor1_5.setBackground(new Color(255, 255, 255));
						ret1 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
			}
			
		});
		
		selCor2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha2 = selCor2_5.getSelectedItem().toString();
				 if(escolha2.equals("Preto - 0")) {
					cor2_5.setBackground(new Color(0, 0, 0));
					ret2 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_5.setText(result + "");
					retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Marrom - 1")) {
						cor2_5.setBackground(new Color(128, 64, 64));
						ret2 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Vermelho - 2")) {
						cor2_5.setBackground(new Color(255, 0, 0));
						ret2 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Laranja - 3")) {
						cor2_5.setBackground(new Color(255, 128, 64));
						ret2 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Amarelo - 4")) {
						cor2_5.setBackground(new Color(255, 255, 0));
						ret2 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Verde - 5")) {
						cor2_5.setBackground(new Color(0, 128, 64));
						ret2 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Azul - 6")) {
						cor2_5.setBackground(new Color(0, 0, 160));
						ret2 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Violeta - 7")) {
						cor2_5.setBackground(new Color(128, 0, 128));
						ret2 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Cinza - 8")) {
						cor2_5.setBackground(new Color(128, 128, 128));
						ret2 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha2.equals("Branco - 9")) {
						cor2_5.setBackground(new Color(255, 255, 255));
						ret2 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
			}
			
		});

		selCor3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha3 = selCor3_5.getSelectedItem().toString();
				 if(escolha3.equals("Preto - 0")) {
					cor3_5.setBackground(new Color(0, 0, 0));
					ret3 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_5.setText(result + "");
					retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Marrom - 1")) {
						cor3_5.setBackground(new Color(128, 64, 64));
						ret3 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Vermelho - 2")) {
						cor3_5.setBackground(new Color(255, 0, 0));
						ret3 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Laranja - 3")) {
						cor3_5.setBackground(new Color(255, 128, 64));
						ret3 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Amarelo - 4")) {
						cor3_5.setBackground(new Color(255, 255, 0));
						ret3 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Verde - 5")) {
						cor3_5.setBackground(new Color(0, 128, 64));
						ret3 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Azul - 6")) {
						cor3_5.setBackground(new Color(0, 0, 160));
						ret3 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Violeta - 7")) {
						cor3_5.setBackground(new Color(128, 0, 128));
						ret3 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Cinza - 8")) {
						cor3_5.setBackground(new Color(128, 128, 128));
						ret3 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha3.equals("Branco - 9")) {
						cor3_5.setBackground(new Color(255, 255, 255));
						ret3 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
			}
			
		});
		
		
		multiplicador_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha4 = multiplicador_5.getSelectedItem().toString();
				 if(escolha4.equals("Preto - x1")) {
					cor4_5.setBackground(new Color(0, 0, 0));
					mult = 1;
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_5.setText(result + "");
					retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha4.equals("Marrom - x10")) {
						cor4_5.setBackground(new Color(128, 64, 64));
						mult = 10;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Vermelho - x100")) {
						cor4_5.setBackground(new Color(255, 0, 0));
						mult = 100;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Laranja - x1k")) {
						cor4_5.setBackground(new Color(255, 128, 64));
						mult = 1000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Amarelo - x10k")) {
						cor4_5.setBackground(new Color(255, 255, 0));
						mult = 10000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Verde - x100k")) {
						cor4_5.setBackground(new Color(0, 128, 64));
						mult = 100000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result+ " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Azul - x1M")) {
						cor4_5.setBackground(new Color(0, 0, 160));
						mult = 1000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Violeta - x10M")) {
						cor4_5.setBackground(new Color(128, 0, 128));
						mult = 10000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Cinza - x100M")) {
						cor4_5.setBackground(new Color(128, 128, 128));
						mult = 100000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Branco - x1G")) {
						cor4_5.setBackground(new Color(128, 128, 128));
						mult = 1000000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Dourado - x0.1")) {
						cor4_5.setBackground(new Color(185, 153, 0));
						mult = 0.1;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha4.equals("Prata - x0.01")) {
						cor4_5.setBackground(new Color(192, 192, 192));
						mult = 0.01;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
			}
			
		});

		resistencia_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha5 = resistencia_5.getSelectedItem().toString();
				 if(escolha5.equals("Marrom - ±1%")) {
					cor5_5.setBackground(new Color(128, 64, 64));
					tol = 1;
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_5.setText(result + "");
					retornoRes2_5.setText(result + " Ohms " + tol + "%");
				 }
				 if(escolha5.equals("Vermelho - ±2%")) {
						cor5_5.setBackground(new Color(255, 0, 0));
						tol = 2;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Verde - ±0.5%")) {
						cor5_5.setBackground(new Color(0, 128, 64));
						tol = 0.5;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Azul - ±0.25%")) {
						cor5_5.setBackground(new Color(255, 0, 0));
						tol = 0.25;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Violeta - ±0.1%")) {
						cor5_5.setBackground(new Color(128, 0, 128));
						tol = 0.1;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Cinza - ±0.05%")) {
						cor5_5.setBackground(new Color(128, 128, 128));
						tol = 0.05;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Dourado - ±5%")) {
						cor5_5.setBackground(new Color(185, 153, 0));
						tol = 5;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
				 if(escolha5.equals("Prata - ±10%")) {
						cor5_5.setBackground(new Color(192, 192, 192));
						tol = 10;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_5.setText(result + "");
						retornoRes2_5.setText(result + " Ohms " + tol + "%");
					 }
			}
			
		});
		
// Fim versão de 5
		
		JPanel panel6B = new JPanel();
		panel6B.setBounds(-2, 105, 859, 434);
		contentPane.add(panel6B);
		panel6B.setLayout(null);
		panel6B.setVisible(false);
		
		JPanel cor1_6 = new JPanel();
		cor1_6.setBounds(469, 120, 15, 75);
		panel6B.add(cor1_6);
		
		JPanel cor2_6 = new JPanel();
		cor2_6.setBounds(513, 131, 15, 53);
		panel6B.add(cor2_6);
		
		JPanel cor3_6 = new JPanel();
		cor3_6.setBounds(538, 131, 15, 53);
		panel6B.add(cor3_6);
		
		JPanel cor4_6 = new JPanel();
		cor4_6.setBounds(602, 132, 15, 53);
		panel6B.add(cor4_6);
		
		JPanel cor5_6 = new JPanel();
		cor5_6.setBounds(659, 131, 15, 53);
		panel6B.add(cor5_6);
		
		JPanel cor6_6 = new JPanel();
		cor6_6.setBounds(716, 120, 15, 75);
		panel6B.add(cor6_6);
		
		JComboBox selCor1_6 = new JComboBox(cores);
		selCor1_6.setForeground(new Color(0, 0, 0));
		selCor1_6.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor1_6.setBounds(22, 31, 327, 39);
		panel6B.add(selCor1_6);
		
		JComboBox selCor2_6 = new JComboBox(cores);
		selCor2_6.setForeground(new Color(0, 0, 0));
		selCor2_6.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor2_6.setBounds(22, 97, 327, 39);
		panel6B.add(selCor2_6);
		
		JComboBox selCor3_6 = new JComboBox(cores);
		selCor3_6.setForeground(Color.BLACK);
		selCor3_6.setFont(new Font("Arial", Font.PLAIN, 16));
		selCor3_6.setBounds(22, 159, 327, 39);
		panel6B.add(selCor3_6);
		
		JComboBox multiplicador_6 = new JComboBox(cores2);
		multiplicador_6.setForeground(new Color(0, 0, 0));
		multiplicador_6.setFont(new Font("Arial", Font.PLAIN, 16));
		multiplicador_6.setBounds(22, 222, 327, 39);
		panel6B.add(multiplicador_6);
		
		JComboBox resistencia_6 = new JComboBox(cores3);
		resistencia_6.setForeground(new Color(0, 0, 0));
		resistencia_6.setFont(new Font("Arial", Font.PLAIN, 16));
		resistencia_6.setBounds(22, 284, 327, 39);
		panel6B.add(resistencia_6);
		
		JComboBox PPM_6 = new JComboBox(cores4);
		PPM_6.setForeground(Color.BLACK);
		PPM_6.setFont(new Font("Arial", Font.PLAIN, 16));
		PPM_6.setBounds(22, 346, 327, 39);
		panel6B.add(PPM_6);
		
		JLabel resistorIMG_6 = new JLabel("");
		resistorIMG_6.setBounds(432, 40, 364, 292);
		resistorIMG_6.setIcon(new ImageIcon(Resistor.class.getResource("/br/com/exemplosswing/imagens/resistor-removebg-preview (1).png")));
		panel6B.add(resistorIMG_6);
		
		retornoRes_6 = new JTextField();
		retornoRes_6.setColumns(10);
		retornoRes_6.setBounds(87, 397, 199, 23);
		panel6B.add(retornoRes_6);
		
		JLabel retornoRes2_6 = new JLabel("0 Ohms 0%");
		retornoRes2_6.setHorizontalAlignment(SwingConstants.CENTER);
		retornoRes2_6.setFont(new Font("Arial", Font.BOLD, 20));
		retornoRes2_6.setBounds(466, 272, 280, 39);
		panel6B.add(retornoRes2_6);
		
		JLabel textB1_6 = new JLabel("1\u00B0 Banda de Cor");
		textB1_6.setFont(new Font("Arial", Font.PLAIN, 11));
		textB1_6.setBounds(22, 11, 119, 14);
		panel6B.add(textB1_6);
		
		JLabel txtB2_6 = new JLabel("2\u00B0 Banda de Cor");
		txtB2_6.setFont(new Font("Arial", Font.PLAIN, 11));
		txtB2_6.setBounds(22, 76, 119, 14);
		panel6B.add(txtB2_6);
		
		JLabel txtB3_6 = new JLabel("3\u00B0 Banda de Cor");
		txtB3_6.setFont(new Font("Arial", Font.PLAIN, 11));
		txtB3_6.setBounds(22, 140, 119, 14);
		panel6B.add(txtB3_6);
		
		JLabel txtMult_6 = new JLabel("Multiplicador");
		txtMult_6.setFont(new Font("Arial", Font.PLAIN, 11));
		txtMult_6.setBounds(22, 204, 119, 14);
		panel6B.add(txtMult_6);
		
		JLabel txtTol_6 = new JLabel("Toler\u00E2ncia");
		txtTol_6.setFont(new Font("Arial", Font.PLAIN, 11));
		txtTol_6.setBounds(22, 266, 119, 14);
		panel6B.add(txtTol_6);
		
		JLabel txtPPM_6 = new JLabel("PPM");
		txtPPM_6.setFont(new Font("Arial", Font.PLAIN, 11));
		txtPPM_6.setBounds(24, 328, 119, 14);
		panel6B.add(txtPPM_6);
		
		selCor1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha1 = selCor1_6.getSelectedItem().toString();
				 if(escolha1.equals("Preto - 0")) {
					cor1_6.setBackground(new Color(0, 0, 0));
					ret1 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Marrom - 1")) {
						cor1_6.setBackground(new Color(128, 64, 64));
						ret1 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Vermelho - 2")) {
						cor1_6.setBackground(new Color(255, 0, 0));
						ret1 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Laranja - 3")) {
						cor1_6.setBackground(new Color(255, 128, 64));
						ret1 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Amarelo - 4")) {
						cor1_6.setBackground(new Color(255, 255, 0));
						ret1 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Verde - 5")) {
						cor1_6.setBackground(new Color(0, 128, 64));
						ret1 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Azul - 6")) {
						cor1_6.setBackground(new Color(0, 0, 160));
						ret1 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Violeta - 7")) {
						cor1_6.setBackground(new Color(128, 0, 128));
						ret1 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Cinza - 8")) {
						cor1_6.setBackground(new Color(128, 128, 128));
						ret1 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha1.equals("Branco - 9")) {
						cor1_6.setBackground(new Color(255, 255, 255));
						ret1 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
			}
			
		});
		
		selCor2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha2 = selCor2_6.getSelectedItem().toString();
				 if(escolha2.equals("Preto - 0")) {
					cor2_6.setBackground(new Color(0, 0, 0));
					ret2 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Marrom - 1")) {
						cor2_6.setBackground(new Color(128, 64, 64));
						ret2 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Vermelho - 2")) {
						cor2_6.setBackground(new Color(255, 0, 0));
						ret2 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Laranja - 3")) {
						cor2_6.setBackground(new Color(255, 128, 64));
						ret2 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Amarelo - 4")) {
						cor2_6.setBackground(new Color(255, 255, 0));
						ret2 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Verde - 5")) {
						cor2_6.setBackground(new Color(0, 128, 64));
						ret2 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Azul - 6")) {
						cor2_6.setBackground(new Color(0, 0, 160));
						ret2 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Violeta - 7")) {
						cor2_6.setBackground(new Color(128, 0, 128));
						ret2 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Cinza - 8")) {
						cor2_6.setBackground(new Color(128, 128, 128));
						ret2 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha2.equals("Branco - 9")) {
						cor2_6.setBackground(new Color(255, 255, 255));
						ret2 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
			}
			
		});

		selCor3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha3 = selCor3_6.getSelectedItem().toString();
				 if(escolha3.equals("Preto - 0")) {
					cor3_6.setBackground(new Color(0, 0, 0));
					ret3 = "0";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Marrom - 1")) {
						cor3_6.setBackground(new Color(128, 64, 64));
						ret3 = "1";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Vermelho - 2")) {
						cor3_6.setBackground(new Color(255, 0, 0));
						ret3 = "2";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Laranja - 3")) {
						cor3_6.setBackground(new Color(255, 128, 64));
						ret3 = "3";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Amarelo - 4")) {
						cor3_6.setBackground(new Color(255, 255, 0));
						ret3 = "4";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Verde - 5")) {
						cor3_6.setBackground(new Color(0, 128, 64));
						ret3 = "5";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Azul - 6")) {
						cor3_6.setBackground(new Color(0, 0, 160));
						ret3 = "6";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Violeta - 7")) {
						cor3_6.setBackground(new Color(128, 0, 128));
						ret3 = "7";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Cinza - 8")) {
						cor3_6.setBackground(new Color(128, 128, 128));
						ret3 = "8";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha3.equals("Branco - 9")) {
						cor3_6.setBackground(new Color(255, 255, 255));
						ret3 = "9";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
			}
			
		});
		
		
		multiplicador_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha4 = multiplicador_6.getSelectedItem().toString();
				 if(escolha4.equals("Preto - x1")) {
					cor4_6.setBackground(new Color(0, 0, 0));
					mult = 1;
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha4.equals("Marrom - x10")) {
						cor4_6.setBackground(new Color(128, 64, 64));
						mult = 10;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Vermelho - x100")) {
						cor4_6.setBackground(new Color(255, 0, 0));
						mult = 100;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Laranja - x1k")) {
						cor4_6.setBackground(new Color(255, 128, 64));
						mult = 1000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Amarelo - x10k")) {
						cor4_6.setBackground(new Color(255, 255, 0));
						mult = 10000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Verde - x100k")) {
						cor4_6.setBackground(new Color(0, 128, 64));
						mult = 100000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result+ " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Azul - x1M")) {
						cor4_6.setBackground(new Color(0, 0, 160));
						mult = 1000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Violeta - x10M")) {
						cor4_6.setBackground(new Color(128, 0, 128));
						mult = 10000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Cinza - x100M")) {
						cor4_6.setBackground(new Color(128, 128, 128));
						mult = 100000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Branco - x1G")) {
						cor4_6.setBackground(new Color(128, 128, 128));
						mult = 1000000000;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Dourado - x0.1")) {
						cor4_6.setBackground(new Color(185, 153, 0));
						mult = 0.1;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha4.equals("Prata - x0.01")) {
						cor4_6.setBackground(new Color(192, 192, 192));
						mult = 0.01;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
			}
			
		});

		resistencia_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha5 = resistencia_6.getSelectedItem().toString();
				 if(escolha5.equals("Marrom - ±1%")) {
					cor5_6.setBackground(new Color(128, 64, 64));
					tol = 1;
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha5.equals("Vermelho - ±2%")) {
						cor5_6.setBackground(new Color(255, 0, 0));
						tol = 2;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Verde - ±0.5%")) {
						cor5_6.setBackground(new Color(0, 128, 64));
						tol = 0.5;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Azul - ±0.25%")) {
						cor5_6.setBackground(new Color(255, 0, 0));
						tol = 0.25;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Violeta - ±0.1%")) {
						cor5_6.setBackground(new Color(128, 0, 128));
						tol = 0.1;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Cinza - ±0.05%")) {
						cor5_6.setBackground(new Color(128, 128, 128));
						tol = 0.05;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Dourado - ±5%")) {
						cor5_6.setBackground(new Color(185, 153, 0));
						tol = 5;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha5.equals("Prata - ±10%")) {
						cor5_6.setBackground(new Color(192, 192, 192));
						tol = 10;
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
			}
			
		});
		
		PPM_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolha6 = PPM_6.getSelectedItem().toString();
				 if(escolha6.equals("Marrom - 100 ppm")) {
					cor6_6.setBackground(new Color(128, 64, 64));
					ppm = "100ppm";
					result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
					retornoRes_6.setText(result + "");
					retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
				 }
				 if(escolha6.equals("Vermelho - 50 ppm")) {
						cor6_6.setBackground(new Color(255, 0, 0));
						ppm = "50ppm";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha6.equals("Laranja - 15 ppm")) {
						cor6_6.setBackground(new Color(255, 128, 64));
						ppm = "15ppm";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha6.equals("Amarelo - 25 ppm")) {
						cor6_6.setBackground(new Color(255, 255, 0));
						ppm = "25ppm";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha6.equals("Azul - 10 ppm")) {
						cor6_6.setBackground(new Color(0, 0, 10));
						ppm = "10ppm";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				 if(escolha6.equals("Violeta - 5 ppm")) {
						cor6_6.setBackground(new Color(128, 0, 128));
						ppm = "5ppm";
						result = Double.parseDouble(ret1 + ret2 + ret3) * mult;
						retornoRes_6.setText(result + "");
						retornoRes2_6.setText(result + " Ohms " + tol + "% " + ppm);
					 }
				
			}
			
		});
		
// Botão troca versão		
		txtOlnome = new JTextField();
		txtOlnome.setBounds(22, 11, 835, 45);
		txtOlnome.setFont(new Font("Arial", Font.BOLD, 16));
		txtOlnome.setText("Esta ferramenta \u00E9 usada para decodificar informa\u00E7\u00F5es para resistores de avan\u00E7o axial com faixas coloridas. ");
		contentPane.add(txtOlnome);
		txtOlnome.setColumns(10);
		
		JRadioButton bandas4 = new JRadioButton("4 Bandas");
		bandas4.setBackground(new Color(255, 128, 0));
		bandas4.setFont(new Font("Arial", Font.BOLD, 16));
		bandas4.setSelected(true);
		bandas4.setBounds(28, 75, 109, 23);
		contentPane.add(bandas4);
		
		JRadioButton bandas5 = new JRadioButton("5 Bandas");
		bandas5.setFont(new Font("Arial", Font.BOLD, 16));
		bandas5.setBounds(139, 75, 109, 23);
		contentPane.add(bandas5);
		
		JRadioButton bandas6 = new JRadioButton("6 Bandas");
		bandas6.setFont(new Font("Arial", Font.BOLD, 16));
		bandas6.setBounds(250, 75, 109, 23);
		contentPane.add(bandas6);
		
		ButtonGroup quant = new ButtonGroup();
		quant.add(bandas4);
		quant.add(bandas5);
		quant.add(bandas6);
		
		ActionListener numBandas = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(bandas4.isSelected()) {
					panel4B.setVisible(true);
					panel5B.setVisible(false);
					panel6B.setVisible(false);
					bandas4.setBackground(new Color(255, 128, 0));
				} else {
					bandas4.setBackground(new Color(240, 240, 240));
				}
				if(bandas5.isSelected()) {
					panel4B.setVisible(false);
					panel5B.setVisible(true);
					panel6B.setVisible(false);
					bandas5.setBackground(new Color(255, 128, 0));
				} else {
					bandas5.setBackground(new Color(240, 240, 240));
				}
				if(bandas6.isSelected()) {
					panel4B.setVisible(false);
					panel5B.setVisible(false);
					panel6B.setVisible(true);
					bandas6.setBackground(new Color(255, 128, 0));
				} else {
					bandas6.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		bandas4.addActionListener(numBandas);
		bandas5.addActionListener(numBandas);
		bandas6.addActionListener(numBandas);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(18, 104, 354, 2);
		contentPane.add(separator);
		
		
	}
}

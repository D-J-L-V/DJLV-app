package DJLV;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class CEIA extends JFrame {

	private JPanel contentPane;
	private JTextField retorno;
	private String eia1 = "0";
	private String eia2 = "0";
	private String eia3 = "0";
	private String eia4 = "0";
	private int mult = 1;
	private int div = 1;
	private double result;
	private String toler;
	private JTextField retorno_4;
	private JTextField tolerancia;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
//				try {
//				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				        if ("Nimbus".equals(info.getName())) {
//				            UIManager.setLookAndFeel(info.getClassName());
//				            break;
//				        }
//				    }
//				} catch (Exception e) {
//				    // If Nimbus is not available, you can set the GUI to another look and feel.
//				}
//				
				try {
					CEIA frame = new CEIA();
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
	public CEIA() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel3D = new JPanel();
		panel3D.setBounds(22, 105, 762, 402);
		contentPane.add(panel3D);
		panel3D.setLayout(null);
		
		JRadioButton c11 = new JRadioButton("1");
		c11.setBounds(66, 41, 41, 23);
		c11.setForeground(new Color(0, 0, 0));
		c11.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c11);
		
		JRadioButton c12 = new JRadioButton("2");
		c12.setBounds(66, 67, 41, 23);
		c12.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c12);
		
		JRadioButton c13 = new JRadioButton("3");
		c13.setBounds(66, 93, 41, 23);
		c13.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c13);
		
		JRadioButton c14 = new JRadioButton("4");
		c14.setBounds(66, 119, 41, 23);
		c14.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c14);
		
		JRadioButton c15 = new JRadioButton("5");
		c15.setBounds(66, 145, 41, 23);
		c15.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c15);
		
		JRadioButton c16 = new JRadioButton("6");
		c16.setBounds(66, 171, 41, 23);
		c16.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c16);
		
		JRadioButton c17 = new JRadioButton("7");
		c17.setBounds(66, 197, 41, 23);
		c17.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c17);
		
		JRadioButton c18 = new JRadioButton("8");
		c18.setBounds(66, 223, 41, 23);
		c18.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c18);
	
		JRadioButton c19 = new JRadioButton("9");
		c19.setBounds(66, 249, 41, 23);
		c19.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c19);
		
		ButtonGroup coluna1 = new ButtonGroup();
		coluna1.add(c11);
		coluna1.add(c12);
		coluna1.add(c13);
		coluna1.add(c14);
		coluna1.add(c15);
		coluna1.add(c16);
		coluna1.add(c17);
		coluna1.add(c18);
		coluna1.add(c19);
		
		JRadioButton c20 = new JRadioButton("0");
		c20.setFont(new Font("Arial", Font.PLAIN, 18));
		c20.setBounds(109, 41, 41, 23);
		panel3D.add(c20);
		
		JRadioButton c21 = new JRadioButton("1");
		c21.setBounds(109, 67, 41, 23);
		c21.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c21);
		
		JRadioButton c22 = new JRadioButton("2");
		c22.setBounds(109, 93, 41, 23);
		c22.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c22);

		JRadioButton c23 = new JRadioButton("3");
		c23.setBounds(109, 119, 41, 23);
		c23.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c23);

		JRadioButton c24 = new JRadioButton("4");
		c24.setBounds(109, 145, 41, 23);
		c24.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c24);

		JRadioButton c25 = new JRadioButton("5");
		c25.setBounds(109, 171, 41, 23);
		c25.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c25);

		JRadioButton c26 = new JRadioButton("6");
		c26.setBounds(109, 197, 41, 23);
		c26.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c26);

		JRadioButton c27 = new JRadioButton("7");
		c27.setBounds(109, 223, 41, 23);
		c27.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c27);

		JRadioButton c28 = new JRadioButton("8");
		c28.setBounds(109, 249, 41, 23);
		c28.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c28);

		JRadioButton c29 = new JRadioButton("9");
		c29.setBounds(109, 275, 41, 23);
		c29.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c29);

		JRadioButton c2R = new JRadioButton("R");
		c2R.setBounds(109, 301, 41, 23);
		c2R.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c2R);
		if(c2R.isSelected() == true) {
			c2R.setBackground(new Color(255, 128, 0));
			eia2 = "R";
		}
		
		ButtonGroup coluna2 = new ButtonGroup();
		coluna2.add(c20);
		coluna2.add(c21);
		coluna2.add(c22);
		coluna2.add(c23);
		coluna2.add(c24);
		coluna2.add(c25);
		coluna2.add(c26);
		coluna2.add(c27);
		coluna2.add(c28);
		coluna2.add(c29);
		coluna2.add(c2R);
		
		JRadioButton c30 = new JRadioButton("0");
		c30.setFont(new Font("Arial", Font.PLAIN, 18));
		c30.setBounds(152, 41, 41, 23);
		panel3D.add(c30);
	
		JRadioButton c31 = new JRadioButton("1");
		c31.setBounds(152, 67, 41, 23);
		c31.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c31);

		JRadioButton c32 = new JRadioButton("2");
		c32.setBounds(152, 93, 41, 23);
		c32.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c32);

		JRadioButton c33 = new JRadioButton("3");
		c33.setBounds(152, 119, 41, 23);
		c33.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c33);

		JRadioButton c34 = new JRadioButton("4");
		c34.setBounds(152, 145, 41, 23);
		c34.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c34);

		JRadioButton c35 = new JRadioButton("5");
		c35.setBounds(152, 171, 41, 23);
		c35.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c35);

		JRadioButton c36 = new JRadioButton("6");
		c36.setBounds(152, 197, 41, 23);
		c36.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c36);

		JRadioButton c37 = new JRadioButton("7");
		c37.setBounds(152, 223, 41, 23);
		c37.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c37);

		JRadioButton c38 = new JRadioButton("8");
		c38.setBounds(152, 249, 41, 23);
		c38.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c38);

		JRadioButton c39 = new JRadioButton("9");
		c39.setBounds(152, 275, 41, 23);
		c39.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c39);

		ButtonGroup coluna3 = new ButtonGroup();
		coluna3.add(c30);
		coluna3.add(c31);
		coluna3.add(c32);
		coluna3.add(c33);
		coluna3.add(c34);
		coluna3.add(c35);
		coluna3.add(c36);
		coluna3.add(c37);
		coluna3.add(c38);
		coluna3.add(c39);
		
		String medidas[] = {"µF", "mF", "nF", "pF"};
		
		JComboBox medida = new JComboBox(medidas);
		medida.setBounds(163, 331, 47, 20);
		panel3D.add(medida);
		
		medida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolhaMed = medida.getSelectedItem().toString();
				 if(escolhaMed.equals("µF")) {
					 retorno.setText(result + "");
				 }
				 if(escolhaMed.equals("mF")) {
					 retorno.setText(result / 1000 + "");
				 }
				 if(escolhaMed.equals("nF")) {
					 retorno.setText(result * 1000 + "");
				 }
				 if(escolhaMed.equals("pF")) {
					 retorno.setText(result * 1000000 + "");
				 }
			}
		});
		
		JLabel EIA = new JLabel("000\r\n");
		EIA.setFont(new Font("Arial", Font.PLAIN, 70));
		EIA.setHorizontalAlignment(SwingConstants.CENTER);
		EIA.setForeground(new Color(255, 255, 255));
		EIA.setBounds(471, 136, 134, 82);
		panel3D.add(EIA);
		EIA.setText(eia1 + eia2 + eia3);
		
		JLabel imgCapacitor = new JLabel("New label");
		imgCapacitor.setIcon(new ImageIcon(CEIA.class.getResource("/TCC/capacitorsmd.png")));
		imgCapacitor.setBounds(228, 2, 573, 360);
		panel3D.add(imgCapacitor);
		
		retorno = new JTextField();
		retorno.setBounds(56, 331, 109, 20);
		panel3D.add(retorno);
		retorno.setColumns(10);
		
		ActionListener rbC1AL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c11.isSelected()) {
					c11.setBackground(new Color(255, 128, 0));
					eia1 = "1";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c11.setBackground(new Color(240, 240, 240));
				}
				if(c12.isSelected()) {
					c12.setBackground(new Color(255, 128, 0));
					eia1 = "2";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c12.setBackground(new Color(240, 240, 240));
				}
				if(c13.isSelected()) {
					c13.setBackground(new Color(255, 128, 0));
					eia1 = "3";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c13.setBackground(new Color(240, 240, 240));
				}
				if(c14.isSelected()) {
					c14.setBackground(new Color(255, 128, 0));
					eia1 = "4";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c14.setBackground(new Color(240, 240, 240));
				}
				if(c15.isSelected()) {
					c15.setBackground(new Color(255, 128, 0));
					eia1 = "5";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c15.setBackground(new Color(240, 240, 240));
				}
				if(c16.isSelected()) {
					c16.setBackground(new Color(255, 128, 0));
					eia1 = "6";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				}  else {
					c16.setBackground(new Color(240, 240, 240));
				}
				if(c17.isSelected()) {
					c17.setBackground(new Color(255, 128, 0));
					eia1 = "7";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c17.setBackground(new Color(240, 240, 240));
				}
				if(c18.isSelected()) {
					c18.setBackground(new Color(255, 128, 0));
					eia1 = "8";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c18.setBackground(new Color(240, 240, 240));
				}
				if(c19.isSelected()) {
					c19.setBackground(new Color(255, 128, 0));
					eia1 = "9";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c19.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		ActionListener rbC2AL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c20.isSelected()) {
					c20.setBackground(new Color(255, 128, 0));
					eia2 = "0";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c20.setBackground(new Color(240, 240, 240));
				}
				if(c21.isSelected()) {
					c21.setBackground(new Color(255, 128, 0));
					eia2 = "1";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c21.setBackground(new Color(240, 240, 240));
				}
				if(c22.isSelected()) {
					c22.setBackground(new Color(255, 128, 0));
					eia2 = "2";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c22.setBackground(new Color(240, 240, 240));
				}
				if(c23.isSelected()) {
					c23.setBackground(new Color(255, 128, 0));
					eia2 = "3";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c23.setBackground(new Color(240, 240, 240));
				}
				if(c24.isSelected()) {
					c24.setBackground(new Color(255, 128, 0));
					eia2 = "4";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c24.setBackground(new Color(240, 240, 240));
				}
				if(c25.isSelected()) {
					c25.setBackground(new Color(255, 128, 0));
					eia2 = "5";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c25.setBackground(new Color(240, 240, 240));
				}
				if(c26.isSelected()) {
					c26.setBackground(new Color(255, 128, 0));
					eia2 = "6";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				}  else {
					c26.setBackground(new Color(240, 240, 240));
				}
				if(c27.isSelected()) {
					c27.setBackground(new Color(255, 128, 0));
					eia2 = "7";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c27.setBackground(new Color(240, 240, 240));
				}
				if(c28.isSelected()) {
					c28.setBackground(new Color(255, 128, 0));
					eia2 = "8";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c28.setBackground(new Color(240, 240, 240));
				}
				if(c29.isSelected()) {
					c29.setBackground(new Color(255, 128, 0));
					eia2 = "9";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c29.setBackground(new Color(240, 240, 240));
				}
				if(c2R.isSelected()) {
					c2R.setBackground(new Color(255, 128, 0));
					eia2 = "R";
					String resultR = eia1 + "." + eia3;
					retorno.setText(resultR);
					EIA.setText(eia1 + eia2 + eia3);
				} else {
					c2R.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		ActionListener rbC3AL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c30.isSelected()) {
					c30.setBackground(new Color(255, 128, 0));
					eia3 = "0";
					div = 1000000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c30.setBackground(new Color(240, 240, 240));
				}
				if(c31.isSelected()) {
					c31.setBackground(new Color(255, 128, 0));
					eia3 = "1";
					div = 100000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c31.setBackground(new Color(240, 240, 240));
				}
				if(c32.isSelected()) {
					c32.setBackground(new Color(255, 128, 0));
					eia3 = "2";
					div = 10000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c32.setBackground(new Color(240, 240, 240));
				}
				if(c33.isSelected()) {
					c33.setBackground(new Color(255, 128, 0));
					eia3 = "3";
					div = 1000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c33.setBackground(new Color(240, 240, 240));
				}
				if(c34.isSelected()) {
					c34.setBackground(new Color(255, 128, 0));
					eia3 = "4";
					div = 100;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c34.setBackground(new Color(240, 240, 240));
				}
				if(c35.isSelected()) {
					c35.setBackground(new Color(255, 128, 0));
					eia3 = "5";
					div = 10;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno.setText(result + "");
				} else {
					c35.setBackground(new Color(240, 240, 240));
				}
				if(c36.isSelected()) {
					c36.setBackground(new Color(255, 128, 0));
					eia3 = "6";
					mult = 1;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c36.setBackground(new Color(240, 240, 240));
				}
				if(c37.isSelected()) {
					c37.setBackground(new Color(255, 128, 0));
					eia3 = "7";
					mult = 10;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c37.setBackground(new Color(240, 240, 240));
				}
				if(c38.isSelected()) {
					c38.setBackground(new Color(255, 128, 0));
					eia3 = "8";
					mult = 100;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c38.setBackground(new Color(240, 240, 240));
				}
				if(c39.isSelected()) {
					c39.setBackground(new Color(255, 128, 0));
					eia3 = "9";
					mult = 1000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c39.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		c11.addActionListener(rbC1AL);
		c12.addActionListener(rbC1AL);
		c13.addActionListener(rbC1AL);
		c14.addActionListener(rbC1AL);
		c15.addActionListener(rbC1AL);
		c16.addActionListener(rbC1AL);
		c17.addActionListener(rbC1AL);
		c18.addActionListener(rbC1AL);
		c19.addActionListener(rbC1AL);
		
		c20.addActionListener(rbC2AL);
		c21.addActionListener(rbC2AL);
		c22.addActionListener(rbC2AL);
		c23.addActionListener(rbC2AL);
		c24.addActionListener(rbC2AL);
		c25.addActionListener(rbC2AL);
		c26.addActionListener(rbC2AL);
		c27.addActionListener(rbC2AL);
		c28.addActionListener(rbC2AL);
		c29.addActionListener(rbC2AL);
		c2R.addActionListener(rbC2AL);
		
		c30.addActionListener(rbC3AL);
		c31.addActionListener(rbC3AL);
		c32.addActionListener(rbC3AL);
		c33.addActionListener(rbC3AL);
		c34.addActionListener(rbC3AL);
		c35.addActionListener(rbC3AL);
		c36.addActionListener(rbC3AL);
		c37.addActionListener(rbC3AL);
		c38.addActionListener(rbC3AL);
		c39.addActionListener(rbC3AL);

// Fim versão 3
		
		
		
		JPanel panel4D = new JPanel();
		panel4D.setBounds(22, 105, 762, 402);
		contentPane.add(panel4D);
		panel4D.setVisible(false);
		panel4D.setLayout(null);
		
		JRadioButton c11_4 = new JRadioButton("1");
		c11_4.setBounds(52, 32, 41, 23);
		c11_4.setForeground(new Color(0, 0, 0));
		c11_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c11_4);
		
		JRadioButton c12_4 = new JRadioButton("2");
		c12_4.setBounds(52, 58, 41, 23);
		c12_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c12_4);
		
		JRadioButton c13_4 = new JRadioButton("3");
		c13_4.setBounds(52, 84, 41, 23);
		c13_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c13_4);
		
		JRadioButton c14_4 = new JRadioButton("4");
		c14_4.setBounds(52, 110, 41, 23);
		c14_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c14_4);
		
		JRadioButton c15_4 = new JRadioButton("5");
		c15_4.setBounds(52, 136, 41, 23);
		c15_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c15_4);
		
		JRadioButton c16_4 = new JRadioButton("6");
		c16_4.setBounds(52, 162, 41, 23);
		c16_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c16_4);
		
		JRadioButton c17_4 = new JRadioButton("7");
		c17_4.setBounds(52, 188, 41, 23);
		c17_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c17_4);
		
		JRadioButton c18_4 = new JRadioButton("8");
		c18_4.setBounds(52, 214, 41, 23);
		c18_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c18_4);
	
		JRadioButton c19_4 = new JRadioButton("9");
		c19_4.setBounds(52, 240, 41, 23);
		c19_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c19_4);
		
		ButtonGroup coluna1_4 = new ButtonGroup();
		coluna1_4.add(c11_4);
		coluna1_4.add(c12_4);
		coluna1_4.add(c13_4);
		coluna1_4.add(c14_4);
		coluna1_4.add(c15_4);
		coluna1_4.add(c16_4);
		coluna1_4.add(c17_4);
		coluna1_4.add(c18_4);
		coluna1_4.add(c19_4);
		
		JRadioButton c20_4 = new JRadioButton("0");
		c20_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c20_4.setBounds(95, 32, 41, 23);
		panel4D.add(c20_4);
		
		JRadioButton c21_4 = new JRadioButton("1");
		c21_4.setBounds(95, 58, 41, 23);
		c21_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c21_4);
		
		JRadioButton c22_4 = new JRadioButton("2");
		c22_4.setBounds(95, 84, 41, 23);
		c22_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c22_4);

		JRadioButton c23_4 = new JRadioButton("3");
		c23_4.setBounds(95, 110, 41, 23);
		c23_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c23_4);

		JRadioButton c24_4 = new JRadioButton("4");
		c24_4.setBounds(95, 136, 41, 23);
		c24_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c24_4);

		JRadioButton c25_4 = new JRadioButton("5");
		c25_4.setBounds(95, 162, 41, 23);
		c25_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c25_4);

		JRadioButton c26_4 = new JRadioButton("6");
		c26_4.setBounds(95, 188, 41, 23);
		c26_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c26_4);

		JRadioButton c27_4 = new JRadioButton("7");
		c27_4.setBounds(95, 214, 41, 23);
		c27_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c27_4);

		JRadioButton c28_4= new JRadioButton("8");
		c28_4.setBounds(95, 240, 41, 23);
		c28_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c28_4);

		JRadioButton c29_4 = new JRadioButton("9");
		c29_4.setBounds(95, 266, 41, 23);
		c29_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c29_4);

		JRadioButton c2R_4 = new JRadioButton("R");
		c2R_4.setBounds(95, 292, 41, 23);
		c2R_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c2R_4);
		if(c2R_4.isSelected() == true) {
			c2R_4.setBackground(new Color(255, 128, 0));
			eia2 = "R";
		}
		
		ButtonGroup coluna2_4 = new ButtonGroup();
		coluna2_4.add(c20_4);
		coluna2_4.add(c21_4);
		coluna2_4.add(c22_4);
		coluna2_4.add(c23_4);
		coluna2_4.add(c24_4);
		coluna2_4.add(c25_4);
		coluna2_4.add(c26_4);
		coluna2_4.add(c27_4);
		coluna2_4.add(c28_4);
		coluna2_4.add(c29_4);
		coluna2_4.add(c2R_4);
		
		JRadioButton c30_4 = new JRadioButton("0");
		c30_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c30_4.setBounds(138, 32, 41, 23);
		panel4D.add(c30_4);
	
		JRadioButton c31_4 = new JRadioButton("1");
		c31_4.setBounds(138, 58, 41, 23);
		c31_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c31_4);

		JRadioButton c32_4 = new JRadioButton("2");
		c32_4.setBounds(138, 84, 41, 23);
		c32_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c32_4);

		JRadioButton c33_4 = new JRadioButton("3");
		c33_4.setBounds(138, 110, 41, 23);
		c33_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c33_4);

		JRadioButton c34_4 = new JRadioButton("4");
		c34_4.setBounds(138, 136, 41, 23);
		c34_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c34_4);

		JRadioButton c35_4 = new JRadioButton("5");
		c35_4.setBounds(138, 162, 41, 23);
		c35_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c35_4);

		JRadioButton c36_4 = new JRadioButton("6");
		c36_4.setBounds(138, 188, 41, 23);
		c36_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c36_4);

		JRadioButton c37_4 = new JRadioButton("7");
		c37_4.setBounds(138, 214, 41, 23);
		c37_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c37_4);

		JRadioButton c38_4 = new JRadioButton("8");
		c38_4.setBounds(138, 240, 41, 23);
		c38_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c38_4);

		JRadioButton c39_4 = new JRadioButton("9");
		c39_4.setBounds(138, 266, 41, 23);
		c39_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c39_4);

		ButtonGroup coluna3_4 = new ButtonGroup();
		coluna3_4.add(c30_4);
		coluna3_4.add(c31_4);
		coluna3_4.add(c32_4);
		coluna3_4.add(c33_4);
		coluna3_4.add(c34_4);
		coluna3_4.add(c35_4);
		coluna3_4.add(c36_4);
		coluna3_4.add(c37_4);
		coluna3_4.add(c38_4);
		coluna3_4.add(c39_4);
		
		JRadioButton c4B_4 = new JRadioButton("B");
		c4B_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4B_4.setBounds(181, 32, 41, 23);
		panel4D.add(c4B_4);
		
		JRadioButton c4C_4 = new JRadioButton("C");
		c4C_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4C_4.setBounds(181, 58, 41, 23);
		panel4D.add(c4C_4);
		
		JRadioButton c4D_4 = new JRadioButton("D");
		c4D_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4D_4.setBounds(181, 84, 41, 23);
		panel4D.add(c4D_4);
		
		JRadioButton c4F_4 = new JRadioButton("F");
		c4F_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4F_4.setBounds(181, 110, 41, 23);
		panel4D.add(c4F_4);
		
		JRadioButton c4G_4 = new JRadioButton("G");
		c4G_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4G_4.setBounds(181, 136, 41, 23);
		panel4D.add(c4G_4);
		
		JRadioButton c4J_4 = new JRadioButton("J");
		c4J_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4J_4.setBounds(181, 162, 41, 23);
		panel4D.add(c4J_4);
		
		JRadioButton c4K_4 = new JRadioButton("K");
		c4K_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4K_4.setBounds(181, 188, 41, 23);
		panel4D.add(c4K_4);
			
		JRadioButton c4M_4 = new JRadioButton("M");
		c4M_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4M_4.setBounds(181, 214, 41, 23);
		panel4D.add(c4M_4);
		
		JRadioButton c4Z_4 = new JRadioButton("Z");
		c4Z_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c4Z_4.setBounds(181, 240, 41, 23);
		panel4D.add(c4Z_4);
		
		ButtonGroup coluna4_4 = new ButtonGroup();
		coluna4_4.add(c4B_4);
		coluna4_4.add(c4C_4);
		coluna4_4.add(c4D_4);
		coluna4_4.add(c4F_4);
		coluna4_4.add(c4G_4);
		coluna4_4.add(c4J_4);
		coluna4_4.add(c4K_4);
		coluna4_4.add(c4M_4);
		coluna4_4.add(c4Z_4);
		
		retorno_4 = new JTextField();
		retorno_4.setBounds(52, 322, 121, 23);
		panel4D.add(retorno_4);
		retorno_4.setColumns(10);
		
		JComboBox medida_4 = new JComboBox(medidas);
		medida_4.setBounds(168, 322, 54, 23);
		panel4D.add(medida_4);
		
		medida_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolhaMed = medida_4.getSelectedItem().toString();
				 if(escolhaMed.equals("µF")) {
					 retorno_4.setText(result + "");
				 }
				 if(escolhaMed.equals("mF")) {
					 retorno_4.setText(result / 1000 + "");
				 }
				 if(escolhaMed.equals("nF")) {
					 retorno_4.setText(result * 1000 + "");
				 }
				 if(escolhaMed.equals("pF")) {
					 retorno_4.setText(result * 1000000 + "");
				 }
			}
		});

		JLabel EIA_4 = new JLabel("000\r\n");
		EIA_4.setFont(new Font("Arial", Font.PLAIN, 70));
		EIA_4.setHorizontalAlignment(SwingConstants.CENTER);
		EIA_4.setForeground(new Color(255, 255, 255));
		EIA_4.setBounds(451, 101, 180, 148);
		panel4D.add(EIA_4);
		EIA_4.setText(eia1 + eia2 + eia3);
		
		JLabel imgCapacitor_4 = new JLabel("New label");
		imgCapacitor_4 .setIcon(new ImageIcon(CEIA.class.getResource("/TCC/capacitorsmd.png")));
		imgCapacitor_4 .setBounds(228, 2, 573, 360);
		panel4D.add(imgCapacitor_4);
		
		tolerancia = new JTextField();
		tolerancia.setColumns(10);
		tolerancia.setBounds(52, 351, 121, 23);
		panel4D.add(tolerancia);
		
		JLabel porcentagem = new JLabel("%");
		porcentagem.setHorizontalAlignment(SwingConstants.CENTER);
		porcentagem.setFont(new Font("Arial", Font.PLAIN, 18));
		porcentagem.setBounds(173, 356, 44, 21);
		panel4D.add(porcentagem);
		
		ActionListener rbC1AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c11_4.isSelected()) {
					c11_4.setBackground(new Color(255, 128, 0));
					eia1 = "1";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c11_4.setBackground(new Color(240, 240, 240));
				}
				if(c12_4.isSelected()) {
					c12_4.setBackground(new Color(255, 128, 0));
					eia1 = "2";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c12_4.setBackground(new Color(240, 240, 240));
				}
				if(c13_4.isSelected()) {
					c13_4.setBackground(new Color(255, 128, 0));
					eia1 = "3";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c13_4.setBackground(new Color(240, 240, 240));
				}
				if(c14_4.isSelected()) {
					c14_4.setBackground(new Color(255, 128, 0));
					eia1 = "4";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c14_4.setBackground(new Color(240, 240, 240));
				}
				if(c15_4.isSelected()) {
					c15_4.setBackground(new Color(255, 128, 0));
					eia1 = "5";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c15_4.setBackground(new Color(240, 240, 240));
				}
				if(c16_4.isSelected()) {
					c16_4.setBackground(new Color(255, 128, 0));
					eia1 = "6";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				}  else {
					c16_4.setBackground(new Color(240, 240, 240));
				}
				if(c17_4.isSelected()) {
					c17_4.setBackground(new Color(255, 128, 0));
					eia1 = "7";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c17_4.setBackground(new Color(240, 240, 240));
				}
				if(c18_4.isSelected()) {
					c18_4.setBackground(new Color(255, 128, 0));
					eia1 = "8";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c18_4.setBackground(new Color(240, 240, 240));
				}
				if(c19_4.isSelected()) {
					c19_4.setBackground(new Color(255, 128, 0));
					eia1 = "9";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c19_4.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		ActionListener rbC2AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c20_4.isSelected()) {
					c20_4.setBackground(new Color(255, 128, 0));
					eia2 = "0";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c20_4.setBackground(new Color(240, 240, 240));
				}
				if(c21_4.isSelected()) {
					c21_4.setBackground(new Color(255, 128, 0));
					eia2 = "1";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c21_4.setBackground(new Color(240, 240, 240));
				}
				if(c22_4.isSelected()) {
					c22_4.setBackground(new Color(255, 128, 0));
					eia2 = "2";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c22_4.setBackground(new Color(240, 240, 240));
				}
				if(c23_4.isSelected()) {
					c23_4.setBackground(new Color(255, 128, 0));
					eia2 = "3";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c23_4.setBackground(new Color(240, 240, 240));
				}
				if(c24_4.isSelected()) {
					c24_4.setBackground(new Color(255, 128, 0));
					eia2 = "4";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c24_4.setBackground(new Color(240, 240, 240));
				}
				if(c25_4.isSelected()) {
					c25_4.setBackground(new Color(255, 128, 0));
					eia2 = "5";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c25_4.setBackground(new Color(240, 240, 240));
				}
				if(c26_4.isSelected()) {
					c26_4.setBackground(new Color(255, 128, 0));
					eia2 = "6";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				}  else {
					c26_4.setBackground(new Color(240, 240, 240));
				}
				if(c27_4.isSelected()) {
					c27_4.setBackground(new Color(255, 128, 0));
					eia2 = "7";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c27_4.setBackground(new Color(240, 240, 240));
				}
				if(c28_4.isSelected()) {
					c28_4.setBackground(new Color(255, 128, 0));
					eia2 = "8";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c28_4.setBackground(new Color(240, 240, 240));
				}
				if(c29_4.isSelected()) {
					c29_4.setBackground(new Color(255, 128, 0));
					eia2 = "9";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c29_4.setBackground(new Color(240, 240, 240));
				}
				if(c2R_4.isSelected()) {
					c2R_4.setBackground(new Color(255, 128, 0));
					eia2 = "R";
					String resultR = eia1 + "." + eia3;
					retorno_4.setText(resultR);
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				} else {
					c2R_4.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		ActionListener rbC3AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c30_4.isSelected()) {
					c30_4.setBackground(new Color(255, 128, 0));
					eia3 = "0";
					div = 1000000;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c30_4.setBackground(new Color(240, 240, 240));
				}
				if(c31_4.isSelected()) {
					c31_4.setBackground(new Color(255, 128, 0));
					eia3 = "1";
					div = 100000;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c31_4.setBackground(new Color(240, 240, 240));
				}
				if(c32_4.isSelected()) {
					c32_4.setBackground(new Color(255, 128, 0));
					eia3 = "2";
					div = 10000;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c32_4.setBackground(new Color(240, 240, 240));
				}
				if(c33_4.isSelected()) {
					c33_4.setBackground(new Color(255, 128, 0));
					eia3 = "3";
					div = 1000;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c33_4.setBackground(new Color(240, 240, 240));
				}
				if(c34_4.isSelected()) {
					c34_4.setBackground(new Color(255, 128, 0));
					eia3 = "4";
					div = 100;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c34_4.setBackground(new Color(240, 240, 240));
				}
				if(c35_4.isSelected()) {
					c35_4.setBackground(new Color(255, 128, 0));
					eia3 = "5";
					div = 10;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) / div;
					retorno_4.setText(result + "");
				} else {
					c35_4.setBackground(new Color(240, 240, 240));
				}
				if(c36_4.isSelected()) {
					c36_4.setBackground(new Color(255, 128, 0));
					eia3 = "6";
					mult = 1;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c36_4.setBackground(new Color(240, 240, 240));
				}
				if(c37_4.isSelected()) {
					c37_4.setBackground(new Color(255, 128, 0));
					eia3 = "7";
					mult = 10;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c37_4.setBackground(new Color(240, 240, 240));
				}
				if(c38_4.isSelected()) {
					c38_4.setBackground(new Color(255, 128, 0));
					eia3 = "8";
					mult = 100;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c38_4.setBackground(new Color(240, 240, 240));
				}
				if(c39_4.isSelected()) {
					c39_4.setBackground(new Color(255, 128, 0));
					eia3 = "9";
					mult = 1000;
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c39_4.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		ActionListener rbC4AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c4B_4.isSelected()) {
					c4B_4.setBackground(new Color(255, 128, 0));
					eia4 = "B";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "0.1";
					tolerancia.setText(toler);
				} else {
					c4B_4.setBackground(new Color(240, 240, 240));
				}
				if(c4C_4.isSelected()) {
					c4C_4.setBackground(new Color(255, 128, 0));
					eia4 = "C";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "0.25";
					tolerancia.setText(toler);
				} else {
					c4C_4.setBackground(new Color(240, 240, 240));
				}
				if(c4D_4.isSelected()) {
					c4D_4.setBackground(new Color(255, 128, 0));
					eia4 = "D";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "0.5";
					tolerancia.setText(toler);
				} else {
					c4D_4.setBackground(new Color(240, 240, 240));
				}
				if(c4F_4.isSelected()) {
					c4F_4.setBackground(new Color(255, 128, 0));
					eia4 = "F";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "1";
					tolerancia.setText(toler);
				} else {
					c4F_4.setBackground(new Color(240, 240, 240));
				}
				if(c4G_4.isSelected()) {
					c4G_4.setBackground(new Color(255, 128, 0));
					eia4 = "G";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "2";
					tolerancia.setText(toler);
				} else {
					c4G_4.setBackground(new Color(240, 240, 240));
				}
				if(c4J_4.isSelected()) {
					c4J_4.setBackground(new Color(255, 128, 0));
					eia4 = "J";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "5";
					tolerancia.setText(toler);
				}  else {
					c4J_4.setBackground(new Color(240, 240, 240));
				}
				if(c4K_4.isSelected()) {
					c4K_4.setBackground(new Color(255, 128, 0));
					eia4 = "K";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "10";
					tolerancia.setText(toler);
				} else {
					c4K_4.setBackground(new Color(240, 240, 240));
				}
				if(c4M_4.isSelected()) {
					c4M_4.setBackground(new Color(255, 128, 0));
					eia4 = "M";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "20";
					tolerancia.setText(toler);
				} else {
					c4M_4.setBackground(new Color(240, 240, 240));
				}
				if(c4Z_4.isSelected()) {
					c4Z_4.setBackground(new Color(255, 128, 0));
					eia4 = "Z";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					toler = "+80/-20";
					tolerancia.setText(toler);
				} else {
					c4Z_4.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		c11_4.addActionListener(rbC1AL_4);
		c12_4.addActionListener(rbC1AL_4);
		c13_4.addActionListener(rbC1AL_4);
		c14_4.addActionListener(rbC1AL_4);
		c15_4.addActionListener(rbC1AL_4);
		c16_4.addActionListener(rbC1AL_4);
		c17_4.addActionListener(rbC1AL_4);
		c18_4.addActionListener(rbC1AL_4);
		c19_4.addActionListener(rbC1AL_4);
		
		c20_4.addActionListener(rbC2AL_4);
		c21_4.addActionListener(rbC2AL_4);
		c22_4.addActionListener(rbC2AL_4);
		c23_4.addActionListener(rbC2AL_4);
		c24_4.addActionListener(rbC2AL_4);
		c25_4.addActionListener(rbC2AL_4);
		c26_4.addActionListener(rbC2AL_4);
		c27_4.addActionListener(rbC2AL_4);
		c28_4.addActionListener(rbC2AL_4);
		c29_4.addActionListener(rbC2AL_4);
		c2R_4.addActionListener(rbC2AL_4);
		
		c30_4.addActionListener(rbC3AL_4);
		c31_4.addActionListener(rbC3AL_4);
		c32_4.addActionListener(rbC3AL_4);
		c33_4.addActionListener(rbC3AL_4);
		c34_4.addActionListener(rbC3AL_4);
		c35_4.addActionListener(rbC3AL_4);
		c36_4.addActionListener(rbC3AL_4);
		c37_4.addActionListener(rbC3AL_4);
		c38_4.addActionListener(rbC3AL_4);
		c39_4.addActionListener(rbC3AL_4);
		
		c4B_4.addActionListener(rbC4AL_4);
		c4C_4.addActionListener(rbC4AL_4);
		c4D_4.addActionListener(rbC4AL_4);
		c4F_4.addActionListener(rbC4AL_4);
		c4G_4.addActionListener(rbC4AL_4);
		c4J_4.addActionListener(rbC4AL_4);
		c4K_4.addActionListener(rbC4AL_4);
		c4M_4.addActionListener(rbC4AL_4);
		c4Z_4.addActionListener(rbC4AL_4);
		
		
		
// Botão troca versão		
		JTextArea txtrACalculadoraDe = new JTextArea();
		txtrACalculadoraDe.setFont(new Font("Arial", Font.BOLD, 16));
		txtrACalculadoraDe.setText("A calculadora de c\u00F3digo de capacitor de montagem em superf\u00EDcie pode determinar o valor e toler\u00E2ncia da \r\ncapacit\u00E2ncia, inserindo o c\u00F3digo alfanum\u00E9rico, ou de 3/4 d\u00EDgitos, encontrado no dispositivo.");
		txtrACalculadoraDe.setBounds(22, 11, 833, 45);
		contentPane.add(txtrACalculadoraDe);
		
		JRadioButton eia3d = new JRadioButton("EIA de 3 D\u00EDgitos");
		eia3d.setBackground(new Color(255, 128, 0));
		eia3d.setSelected(true);
		eia3d.setBounds(22, 75, 109, 23);
		contentPane.add(eia3d);
		
		JRadioButton eia4d = new JRadioButton("EIA de 4 D\u00EDgitos");
		eia4d.setBounds(150, 75, 109, 23);
		contentPane.add(eia4d);
		
		ButtonGroup tipo = new ButtonGroup();
		tipo.add(eia3d);
		tipo.add(eia4d);
		
		ActionListener tipoCalc = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(eia3d.isSelected()) {
					panel3D.setVisible(true);
					panel4D.setVisible(false);	
					eia3d.setBackground(new Color(255, 128, 0));
				} else {
					eia3d.setBackground(new Color(240, 240, 240));
				}
				if(eia4d.isSelected() ) {
					panel3D.setVisible(false);
					panel4D.setVisible(true);
					eia4d.setBackground(new Color(255, 128, 0));
				} else {
					eia4d.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		eia3d.addActionListener(tipoCalc);
		eia4d.addActionListener(tipoCalc);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 104, 273, 2);
		contentPane.add(separator);
		
		
		}
}

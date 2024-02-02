package DJLV;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
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
import javax.swing.ImageIcon;

public class REIA extends JFrame {

	private JPanel contentPane;
	private JTextField retorno;
	private String eia1 = "0";
	private String eia2 = "0";
	private String eia3 = "0";
	private String eia4 = "0";
	private int mult = 1;
	private double result;
	private JTextField retorno_4;
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
					REIA frame = new REIA();
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
	public REIA() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel3D = new JPanel();
		panel3D.setBounds(22, 107, 899, 422);
		contentPane.add(panel3D);
		panel3D.setLayout(null);
		
		JRadioButton c10 = new JRadioButton("0");
		c10.setBounds(59, 45, 41, 23);
		c10.setForeground(Color.BLACK);
		c10.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c10);
		
		JRadioButton c11 = new JRadioButton("1");
		c11.setBounds(59, 71, 41, 23);
		c11.setForeground(new Color(0, 0, 0));
		c11.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c11);
		
		JRadioButton c12 = new JRadioButton("2");
		c12.setBounds(59, 96, 41, 23);
		c12.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c12);
		
		JRadioButton c13 = new JRadioButton("3");
		c13.setBounds(59, 122, 41, 23);
		c13.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c13);
		
		JRadioButton c14 = new JRadioButton("4");
		c14.setBounds(59, 148, 41, 23);
		c14.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c14);
		
		JRadioButton c15 = new JRadioButton("5");
		c15.setBounds(59, 172, 41, 23);
		c15.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c15);
		
		JRadioButton c16 = new JRadioButton("6");
		c16.setBounds(59, 198, 41, 23);
		c16.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c16);
		
		JRadioButton c17 = new JRadioButton("7");
		c17.setBounds(59, 224, 41, 23);
		c17.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c17);
		
		JRadioButton c18 = new JRadioButton("8");
		c18.setBounds(59, 250, 41, 23);
		c18.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c18);
	
		JRadioButton c19 = new JRadioButton("9");
		c19.setBounds(59, 279, 41, 23);
		c19.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c19);
		
		ButtonGroup coluna1 = new ButtonGroup();
		coluna1.add(c10);
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
		c20.setBounds(102, 45, 41, 23);
		c20.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c20);
		
		JRadioButton c21 = new JRadioButton("1");
		c21.setBounds(102, 71, 41, 23);
		c21.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c21);
		
		JRadioButton c22 = new JRadioButton("2");
		c22.setBounds(102, 96, 41, 23);
		c22.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c22);

		JRadioButton c23 = new JRadioButton("3");
		c23.setBounds(102, 122, 41, 23);
		c23.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c23);

		JRadioButton c24 = new JRadioButton("4");
		c24.setBounds(102, 148, 41, 23);
		c24.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c24);

		JRadioButton c25 = new JRadioButton("5");
		c25.setBounds(102, 172, 41, 23);
		c25.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c25);

		JRadioButton c26 = new JRadioButton("6");
		c26.setBounds(102, 198, 41, 23);
		c26.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c26);

		JRadioButton c27 = new JRadioButton("7");
		c27.setBounds(102, 224, 41, 23);
		c27.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c27);

		JRadioButton c28 = new JRadioButton("8");
		c28.setBounds(102, 250, 41, 23);
		c28.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c28);

		JRadioButton c29 = new JRadioButton("9");
		c29.setBounds(102, 279, 41, 23);
		c29.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c29);

		JRadioButton c2R = new JRadioButton("R");
		c2R.setBounds(102, 305, 41, 23);
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
		c30.setBounds(145, 45, 41, 23);
		c30.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c30);
	
		JRadioButton c31 = new JRadioButton("1");
		c31.setBounds(145, 71, 41, 23);
		c31.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c31);

		JRadioButton c32 = new JRadioButton("2");
		c32.setBounds(145, 96, 41, 23);
		c32.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c32);

		JRadioButton c33 = new JRadioButton("3");
		c33.setBounds(145, 122, 41, 23);
		c33.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c33);

		JRadioButton c34 = new JRadioButton("4");
		c34.setBounds(145, 148, 41, 23);
		c34.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c34);

		JRadioButton c35 = new JRadioButton("5");
		c35.setBounds(145, 172, 41, 23);
		c35.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c35);

		JRadioButton c36 = new JRadioButton("6");
		c36.setBounds(145, 198, 41, 23);
		c36.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c36);

		JRadioButton c37 = new JRadioButton("7");
		c37.setBounds(145, 224, 41, 23);
		c37.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c37);

		JRadioButton c38 = new JRadioButton("8");
		c38.setBounds(145, 250, 41, 23);
		c38.setFont(new Font("Arial", Font.PLAIN, 18));
		panel3D.add(c38);

		JRadioButton c39 = new JRadioButton("9");
		c39.setBounds(145, 279, 41, 23);
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
		
		String medidas[] = {"Ω", "kΩ", "MΩ"};
		
		JComboBox medida = new JComboBox(medidas);
		medida.setBounds(145, 335, 41, 20);
		panel3D.add(medida);
		
		JLabel EIA = new JLabel("000\r\n");
		EIA.setBounds(466, 136, 129, 82);
		EIA.setFont(new Font("Arial", Font.PLAIN, 70));
		EIA.setHorizontalAlignment(SwingConstants.CENTER);
		EIA.setForeground(new Color(255, 255, 255));
		panel3D.add(EIA);
		EIA.setText(eia1 + eia2 + eia3);
		
		retorno = new JTextField();
		retorno.setBounds(50, 335, 96, 20);
		panel3D.add(retorno);
		retorno.setColumns(10);	
		
		JLabel imgResistor = new JLabel("New label");
		imgResistor.setIcon(new ImageIcon(REIA.class.getResource("/TCC/resistorsmd.png")));
		imgResistor.setBounds(228, 2, 573, 360);
		panel3D.add(imgResistor);
		
		ActionListener rbC1AL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c10.isSelected()) {
					c10.setBackground(new Color(255, 128, 0));
					eia1 = "0";
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c10.setBackground(new Color(240, 240, 240));
				}
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
					mult = 1;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c30.setBackground(new Color(240, 240, 240));
				}
				if(c31.isSelected()) {
					c31.setBackground(new Color(255, 128, 0));
					eia3 = "1";
					mult = 10;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c31.setBackground(new Color(240, 240, 240));
				}
				if(c32.isSelected()) {
					c32.setBackground(new Color(255, 128, 0));
					eia3 = "2";
					mult = 100;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c32.setBackground(new Color(240, 240, 240));
				}
				if(c33.isSelected()) {
					c33.setBackground(new Color(255, 128, 0));
					eia3 = "3";
					mult = 1000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c33.setBackground(new Color(240, 240, 240));
				}
				if(c34.isSelected()) {
					c34.setBackground(new Color(255, 128, 0));
					eia3 = "4";
					mult = 10000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c34.setBackground(new Color(240, 240, 240));
				}
				if(c35.isSelected()) {
					c35.setBackground(new Color(255, 128, 0));
					eia3 = "5";
					mult = 100000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c35.setBackground(new Color(240, 240, 240));
				}
				if(c36.isSelected()) {
					c36.setBackground(new Color(255, 128, 0));
					eia3 = "6";
					mult = 1000000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c36.setBackground(new Color(240, 240, 240));
				}
				if(c37.isSelected()) {
					c37.setBackground(new Color(255, 128, 0));
					eia3 = "7";
					mult = 10000000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c37.setBackground(new Color(240, 240, 240));
				}
				if(c38.isSelected()) {
					c38.setBackground(new Color(255, 128, 0));
					eia3 = "8";
					mult = 100000000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c38.setBackground(new Color(240, 240, 240));
				}
				if(c39.isSelected()) {
					c39.setBackground(new Color(255, 128, 0));
					eia3 = "9";
					mult = 1000000000;
					EIA.setText(eia1 + eia2 + eia3);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno.setText(result + "");
				} else {
					c39.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		medida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolhaMed = medida.getSelectedItem().toString();
				 if(escolhaMed.equals("Ω")) {
					 retorno.setText(result + "");
				 }
				 if(escolhaMed.equals("kΩ")) {
					 retorno.setText(result / 1000 + "");
				 }
				 if(escolhaMed.equals("MΩ")) {
					 retorno.setText(result / 1000000 + "");
				 }
			}
		});
		
		c10.addActionListener(rbC1AL);
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
		
		JTextArea txtrACalculadoraDe = new JTextArea();
		txtrACalculadoraDe.setFont(new Font("Arial", Font.BOLD, 16));
		txtrACalculadoraDe.setText("A calculadora de c\u00F3digo do resistor de montagem em superf\u00EDcie pode ser usada para \r\ndeterminar o valor de resist\u00EAncia de um resistor SMD usando as marca\u00E7\u00F5es encontradas no dispositivo.");
		txtrACalculadoraDe.setBounds(22, 11, 833, 45);
		contentPane.add(txtrACalculadoraDe);
	
// Fim versão 3		
		
		
		
		JPanel panel4D = new JPanel();
		panel4D.setBounds(22, 107, 899, 422);
		contentPane.add(panel4D);
		panel4D.setVisible(false);	
		panel4D.setLayout(null);
		
		JRadioButton c10_4 = new JRadioButton("0");
		c10_4.setForeground(Color.BLACK);
		c10_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c10_4.setBounds(52, 57, 41, 23);
		panel4D.add(c10_4);
		
		JRadioButton c11_4 = new JRadioButton("1");
		c11_4.setBounds(52, 83, 41, 23);
		c11_4.setForeground(new Color(0, 0, 0));
		c11_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c11_4);
		
		JRadioButton c12_4 = new JRadioButton("2");
		c12_4.setBounds(52, 109, 41, 23);
		c12_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c12_4);
		
		JRadioButton c13_4 = new JRadioButton("3");
		c13_4.setBounds(52, 135, 41, 23);
		c13_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c13_4);
		
		JRadioButton c14_4 = new JRadioButton("4");
		c14_4.setBounds(52, 161, 41, 23);
		c14_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c14_4);
		
		JRadioButton c15_4 = new JRadioButton("5");
		c15_4.setBounds(52, 187, 41, 23);
		c15_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c15_4);
		
		JRadioButton c16_4 = new JRadioButton("6");
		c16_4.setBounds(52, 213, 41, 23);
		c16_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c16_4);
		
		JRadioButton c17_4 = new JRadioButton("7");
		c17_4.setBounds(52, 239, 41, 23);
		c17_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c17_4);
		
		JRadioButton c18_4 = new JRadioButton("8");
		c18_4.setBounds(52, 265, 41, 23);
		c18_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c18_4);
	
		JRadioButton c19_4 = new JRadioButton("9");
		c19_4.setBounds(52, 291, 41, 23);
		c19_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c19_4);
		
		ButtonGroup coluna1_4 = new ButtonGroup();
		coluna1_4.add(c10_4);
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
		c20_4.setBounds(95, 57, 41, 23);
		panel4D.add(c20_4);
		
		JRadioButton c21_4 = new JRadioButton("1");
		c21_4.setBounds(95, 83, 41, 23);
		c21_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c21_4);
		
		JRadioButton c22_4 = new JRadioButton("2");
		c22_4.setBounds(95, 109, 41, 23);
		c22_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c22_4);

		JRadioButton c23_4 = new JRadioButton("3");
		c23_4.setBounds(95, 135, 41, 23);
		c23_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c23_4);

		JRadioButton c24_4 = new JRadioButton("4");
		c24_4.setBounds(95, 161, 41, 23);
		c24_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c24_4);

		JRadioButton c25_4 = new JRadioButton("5");
		c25_4.setBounds(95, 187, 41, 23);
		c25_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c25_4);

		JRadioButton c26_4 = new JRadioButton("6");
		c26_4.setBounds(95, 213, 41, 23);
		c26_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c26_4);

		JRadioButton c27_4 = new JRadioButton("7");
		c27_4.setBounds(95, 239, 41, 23);
		c27_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c27_4);

		JRadioButton c28_4 = new JRadioButton("8");
		c28_4.setBounds(95, 265, 41, 23);
		c28_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c28_4);

		JRadioButton c29_4 = new JRadioButton("9");
		c29_4.setBounds(95, 291, 41, 23);
		c29_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c29_4);

		JRadioButton c2R_4 = new JRadioButton("R");
		c2R_4.setBounds(95, 317, 41, 23);
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
		c30_4.setBounds(138, 57, 41, 23);
		panel4D.add(c30_4);
	
		JRadioButton c31_4 = new JRadioButton("1");
		c31_4.setBounds(138, 83, 41, 23);
		c31_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c31_4);

		JRadioButton c32_4 = new JRadioButton("2");
		c32_4.setBounds(138, 109, 41, 23);
		c32_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c32_4);

		JRadioButton c33_4 = new JRadioButton("3");
		c33_4.setBounds(138, 135, 41, 23);
		c33_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c33_4);

		JRadioButton c34_4 = new JRadioButton("4");
		c34_4.setBounds(138, 161, 41, 23);
		c34_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c34_4);

		JRadioButton c35_4 = new JRadioButton("5");
		c35_4.setBounds(138, 187, 41, 23);
		c35_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c35_4);

		JRadioButton c36_4 = new JRadioButton("6");
		c36_4.setBounds(138, 213, 41, 23);
		c36_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c36_4);

		JRadioButton c37_4 = new JRadioButton("7");
		c37_4.setBounds(138, 239, 41, 23);
		c37_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c37_4);

		JRadioButton c38_4 = new JRadioButton("8");
		c38_4.setBounds(138, 265, 41, 23);
		c38_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c38_4);

		JRadioButton c39_4 = new JRadioButton("9");
		c39_4.setBounds(138, 291, 41, 23);
		c39_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel4D.add(c39_4);
		
		JRadioButton c3R_4 = new JRadioButton("R");
		c3R_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c3R_4.setBounds(138, 317, 41, 23);
		panel4D.add(c3R_4);

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
		coluna3_4.add(c3R_4);
		
		JRadioButton c40_4 = new JRadioButton("0");
		c40_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c40_4.setBounds(181, 57, 41, 23);
		panel4D.add(c40_4);
		
		JRadioButton c41_4 = new JRadioButton("1");
		c41_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c41_4.setBounds(181, 83, 41, 23);
		panel4D.add(c41_4);
		
		JRadioButton c42_4 = new JRadioButton("2");
		c42_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c42_4.setBounds(181, 109, 41, 23);
		panel4D.add(c42_4);
		
		JRadioButton c43_4 = new JRadioButton("3");
		c43_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c43_4.setBounds(181, 135, 41, 23);
		panel4D.add(c43_4);
		
		JRadioButton c44_4 = new JRadioButton("4");
		c44_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c44_4.setBounds(181, 161, 41, 23);
		panel4D.add(c44_4);
		
		JRadioButton c45_4 = new JRadioButton("5");
		c45_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c45_4.setBounds(181, 187, 41, 23);
		panel4D.add(c45_4);
		
		JRadioButton c46_4 = new JRadioButton("6");
		c46_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c46_4.setBounds(181, 213, 41, 23);
		panel4D.add(c46_4);
		
		JRadioButton c47_4 = new JRadioButton("7");
		c47_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c47_4.setBounds(181, 239, 41, 23);
		panel4D.add(c47_4);
		
		JRadioButton c48_4 = new JRadioButton("8");
		c48_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c48_4.setBounds(181, 265, 41, 23);
		panel4D.add(c48_4);
		
		JRadioButton c49_4 = new JRadioButton("9");
		c49_4.setFont(new Font("Arial", Font.PLAIN, 18));
		c49_4.setBounds(181, 291, 41, 23);
		panel4D.add(c49_4);
		
		ButtonGroup coluna4_4 = new ButtonGroup();
		coluna4_4.add(c40_4);
		coluna4_4.add(c41_4);
		coluna4_4.add(c42_4);
		coluna4_4.add(c43_4);
		coluna4_4.add(c44_4);
		coluna4_4.add(c45_4);
		coluna4_4.add(c46_4);
		coluna4_4.add(c47_4);
		coluna4_4.add(c48_4);
		coluna4_4.add(c49_4);
		
		retorno_4 = new JTextField();
		retorno_4.setBounds(62, 347, 109, 23);
		panel4D.add(retorno_4);
		retorno_4.setColumns(10);
		
		JComboBox medida_4 = new JComboBox(medidas);
		medida_4.setBounds(171, 347, 47, 23);
		panel4D.add(medida_4);
		
		medida_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String escolhaMed = medida_4.getSelectedItem().toString();
				 if(escolhaMed.equals("Ω")) {
					 retorno_4.setText(result + "");
				 }
				 if(escolhaMed.equals("kΩ")) {
					 retorno_4.setText(result / 1000 + "");
				 }
				 if(escolhaMed.equals("MΩ")) {
					 retorno_4.setText(result / 1000000 + "");
				 }
			}
		});


		JLabel EIA_4 = new JLabel("000\r\n");
		EIA_4.setFont(new Font("Arial", Font.PLAIN, 70));
		EIA_4.setHorizontalAlignment(SwingConstants.CENTER);
		EIA_4.setForeground(new Color(255, 255, 255));
		EIA_4.setBounds(446, 107, 180, 148);
		panel4D.add(EIA_4);
		EIA_4.setText(eia1 + eia2 + eia3 + eia4);
		
		JLabel imgResistor_4 = new JLabel("New label");
		imgResistor_4.setIcon(new ImageIcon(REIA.class.getResource("/TCC/resistorsmd.png")));
		imgResistor_4.setBounds(228, 2, 573, 360);
		panel4D.add(imgResistor_4);
		
		ActionListener rbC1AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c10_4.isSelected()) {
					c10_4.setBackground(new Color(255, 128, 0));
					eia1 = "0";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c10_4.setBackground(new Color(240, 240, 240));
				}
				if(c11_4.isSelected()) {
					c11_4.setBackground(new Color(255, 128, 0));
					eia1 = "1";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c11_4.setBackground(new Color(240, 240, 240));
				}
				if(c12_4.isSelected()) {
					c12_4.setBackground(new Color(255, 128, 0));
					eia1 = "2";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c12_4.setBackground(new Color(240, 240, 240));
				}
				if(c13_4.isSelected()) {
					c13_4.setBackground(new Color(255, 128, 0));
					eia1 = "3";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c13_4.setBackground(new Color(240, 240, 240));
				}
				if(c14_4.isSelected()) {
					c14_4.setBackground(new Color(255, 128, 0));
					eia1 = "4";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c14_4.setBackground(new Color(240, 240, 240));
				}
				if(c15_4.isSelected()) {
					c15_4.setBackground(new Color(255, 128, 0));
					eia1 = "5";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c15_4.setBackground(new Color(240, 240, 240));
				}
				if(c16_4.isSelected()) {
					c16_4.setBackground(new Color(255, 128, 0));
					eia1 = "6";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				}  else {
					c16_4.setBackground(new Color(240, 240, 240));
				}
				if(c17_4.isSelected()) {
					c17_4.setBackground(new Color(255, 128, 0));
					eia1 = "7";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c17_4.setBackground(new Color(240, 240, 240));
				}
				if(c18_4.isSelected()) {
					c18_4.setBackground(new Color(255, 128, 0));
					eia1 = "8";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c18_4.setBackground(new Color(240, 240, 240));
				}
				if(c19_4.isSelected()) {
					c19_4.setBackground(new Color(255, 128, 0));
					eia1 = "9";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
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
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c20_4.setBackground(new Color(240, 240, 240));
				}
				if(c21_4.isSelected()) {
					c21_4.setBackground(new Color(255, 128, 0));
					eia2 = "1";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c21_4.setBackground(new Color(240, 240, 240));
				}
				if(c22_4.isSelected()) {
					c22_4.setBackground(new Color(255, 128, 0));
					eia2 = "2";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c22_4.setBackground(new Color(240, 240, 240));
				}
				if(c23_4.isSelected()) {
					c23_4.setBackground(new Color(255, 128, 0));
					eia2 = "3";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c23_4.setBackground(new Color(240, 240, 240));
				}
				if(c24_4.isSelected()) {
					c24_4.setBackground(new Color(255, 128, 0));
					eia2 = "4";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c24_4.setBackground(new Color(240, 240, 240));
				}
				if(c25_4.isSelected()) {
					c25_4.setBackground(new Color(255, 128, 0));
					eia2 = "5";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c25_4.setBackground(new Color(240, 240, 240));
				}
				if(c26_4.isSelected()) {
					c26_4.setBackground(new Color(255, 128, 0));
					eia2 = "6";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				}  else {
					c26_4.setBackground(new Color(240, 240, 240));
				}
				if(c27_4.isSelected()) {
					c27_4.setBackground(new Color(255, 128, 0));
					eia2 = "7";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c27_4.setBackground(new Color(240, 240, 240));
				}
				if(c28_4.isSelected()) {
					c28_4.setBackground(new Color(255, 128, 0));
					eia2 = "8";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c28_4.setBackground(new Color(240, 240, 240));
				}
				if(c29_4.isSelected()) {
					c29_4.setBackground(new Color(255, 128, 0));
					eia2 = "9";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c29_4.setBackground(new Color(240, 240, 240));
				}
				if(c2R_4.isSelected()) {
					c2R_4.setBackground(new Color(255, 128, 0));
					eia2 = "R";
					c3R_4.setEnabled(false);;
					String resultR = eia1 + "." + eia3 + eia4;
					retorno_4.setText(resultR);
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				} else {
					c3R_4.setEnabled(true);
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
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c30_4.setBackground(new Color(240, 240, 240));
				}
				if(c31_4.isSelected()) {
					c31_4.setBackground(new Color(255, 128, 0));
					eia3 = "1";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c31_4.setBackground(new Color(240, 240, 240));
				}
				if(c32_4.isSelected()) {
					c32_4.setBackground(new Color(255, 128, 0));
					eia3 = "2";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c32_4.setBackground(new Color(240, 240, 240));
				}
				if(c33_4.isSelected()) {
					c33_4.setBackground(new Color(255, 128, 0));
					eia3 = "3";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2) * mult;
					retorno_4.setText(result + "");
				} else {
					c33_4.setBackground(new Color(240, 240, 240));
				}
				if(c34_4.isSelected()) {
					c34_4.setBackground(new Color(255, 128, 0));
					eia3 = "4";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c34_4.setBackground(new Color(240, 240, 240));
				}
				if(c35_4.isSelected()) {
					c35_4.setBackground(new Color(255, 128, 0));
					eia3 = "5";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c35_4.setBackground(new Color(240, 240, 240));
				}
				if(c36_4.isSelected()) {
					c36_4.setBackground(new Color(255, 128, 0));
					eia3 = "6";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c36_4.setBackground(new Color(240, 240, 240));
				}
				if(c37_4.isSelected()) {
					c37_4.setBackground(new Color(255, 128, 0));
					eia3 = "7";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c37_4.setBackground(new Color(240, 240, 240));
				}
				if(c38_4.isSelected()) {
					c38_4.setBackground(new Color(255, 128, 0));
					eia3 = "8";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c38_4.setBackground(new Color(240, 240, 240));
				}
				if(c39_4.isSelected()) {
					c39_4.setBackground(new Color(255, 128, 0));
					eia3 = "9";
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
					result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
					retorno_4.setText(result + "");
				} else {
					c39_4.setBackground(new Color(240, 240, 240));
				}
				if(c3R_4.isSelected()) {
					c3R_4.setBackground(new Color(255, 128, 0));
					eia3 = "R";
					c2R_4.setEnabled(false);;
					String resultR = eia1 + eia2 + "." + eia4;
					retorno_4.setText(resultR);
					EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				} else {
					c2R_4.setEnabled(true);
					c3R_4.setBackground(new Color(240, 240, 240));
				}
			}
			
		};
		
		ActionListener rbC4AL_4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c40_4.isSelected()) {
				c40_4.setBackground(new Color(255, 128, 0));
				eia4 = "0";
				mult = 1;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c40_4.setBackground(new Color(240, 240, 240));
			}
			if(c41_4.isSelected()) {
				c41_4.setBackground(new Color(255, 128, 0));
				eia4 = "1";
				mult = 10;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c41_4.setBackground(new Color(240, 240, 240));
			}
			if(c42_4.isSelected()) {
				c42_4.setBackground(new Color(255, 128, 0));
				eia4 = "2";
				mult = 100;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c42_4.setBackground(new Color(240, 240, 240));
			}
			if(c43_4.isSelected()) {
				c43_4.setBackground(new Color(255, 128, 0));
				eia4 = "3";
				mult = 1000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c43_4.setBackground(new Color(240, 240, 240));
			}
			if(c44_4.isSelected()) {
				c44_4.setBackground(new Color(255, 128, 0));
				eia4 = "4";
				mult = 10000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c44_4.setBackground(new Color(240, 240, 240));
			}
			if(c45_4.isSelected()) {
				c45_4.setBackground(new Color(255, 128, 0));
				eia4 = "5";
				mult = 100000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c45_4.setBackground(new Color(240, 240, 240));
			}
			if(c46_4.isSelected()) {
				c46_4.setBackground(new Color(255, 128, 0));
				eia4 = "6";
				mult = 1000000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			}  else {
				c46_4.setBackground(new Color(240, 240, 240));
			}
			if(c47_4.isSelected()) {
				c47_4.setBackground(new Color(255, 128, 0));
				eia4 = "7";
				mult = 10000000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c47_4.setBackground(new Color(240, 240, 240));
			}
			if(c48_4.isSelected()) {
				c48_4.setBackground(new Color(255, 128, 0));
				eia4 = "8";
				mult = 100000000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c48_4.setBackground(new Color(240, 240, 240));
			}
			if(c49_4.isSelected()) {
				c49_4.setBackground(new Color(255, 128, 0));
				eia4 = "9";
				mult = 1000000000;
				EIA_4.setText(eia1 + eia2 + eia3 + eia4);
				result = Double.parseDouble(eia1 + eia2 + eia3) * mult;
				retorno_4.setText(result + "");
			} else {
				c49_4.setBackground(new Color(240, 240, 240));
			}
				
			}
			
		};
				
		
		c10_4.addActionListener(rbC1AL_4);
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
		c3R_4.addActionListener(rbC3AL_4);
		
		c40_4.addActionListener(rbC4AL_4);
		c41_4.addActionListener(rbC4AL_4);
		c42_4.addActionListener(rbC4AL_4);
		c43_4.addActionListener(rbC4AL_4);
		c44_4.addActionListener(rbC4AL_4);
		c45_4.addActionListener(rbC4AL_4);
		c46_4.addActionListener(rbC4AL_4);
		c47_4.addActionListener(rbC4AL_4);
		c48_4.addActionListener(rbC4AL_4);
		c49_4.addActionListener(rbC4AL_4);
		
// Botão troca versão		
		JRadioButton eia3d = new JRadioButton("EIA de 3 D\u00EDgitos");
		eia3d.setFont(new Font("Arial", Font.BOLD, 14));
		eia3d.setBackground(new Color(255, 128, 0));
		eia3d.setSelected(true);
		eia3d.setBounds(22, 75, 139, 23);
		contentPane.add(eia3d);
		
		JRadioButton eia4d = new JRadioButton("EIA de 4 D\u00EDgitos");
		eia4d.setFont(new Font("Arial", Font.BOLD, 14));
		eia4d.setBounds(164, 75, 139, 23);
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
				if(eia4d.isSelected()) {
					panel4D.setVisible(true);
					panel3D.setVisible(false);
					eia4d.setBackground(new Color(255, 128, 0));
				} else {
					eia4d.setBackground(new Color(240, 240, 240));
				}
				
			}
			
		};
		
		eia3d.addActionListener(tipoCalc);
		eia4d.addActionListener(tipoCalc);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 104, 299, 3);
		contentPane.add(separator);
		
		}
}

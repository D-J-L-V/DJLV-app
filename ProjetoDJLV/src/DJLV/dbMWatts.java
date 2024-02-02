package DJLV;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class dbMWatts extends JFrame {

	private JPanel contentPane;
	private JTextField entrada;
	private JTextField saida;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dbMWatts frame = new dbMWatts();
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
	public dbMWatts() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1292, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrOConversordBm = new JTextArea();
		txtrOConversordBm.setFont(new Font("Arial", Font.BOLD, 16));
		txtrOConversordBm.setText("Esta ferramenta converte medi\u00E7\u00F5es de pot\u00EAncia entre unidades de decib\u00E9is-miliwatts (dBmW) e watts (W).");
		txtrOConversordBm.setBounds(21, 24, 833, 45);
		contentPane.add(txtrOConversordBm);
		
		entrada = new JTextField();
		entrada.setBounds(37, 129, 294, 37);
		contentPane.add(entrada);
		entrada.setColumns(10);
		
		JLabel lblDecibelmilliwatt = new JLabel("Decibel-milliwatt");
		lblDecibelmilliwatt.setFont(new Font("Arial", Font.BOLD, 18));
		lblDecibelmilliwatt.setBounds(37, 98, 210, 31);
		contentPane.add(lblDecibelmilliwatt);
		
		JLabel lblWatt = new JLabel("Watt");
		lblWatt.setFont(new Font("Arial", Font.BOLD, 18));
		lblWatt.setBounds(37, 240, 210, 31);
		contentPane.add(lblWatt);
		
		saida = new JTextField();
		saida.setColumns(10);
		saida.setBounds(37, 271, 294, 37);
		contentPane.add(saida);
		
		JLabel lblNewLabel = new JLabel("Para");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 197, 49, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(dbMWatts.class.getResource("/Image/formula.png")));
		lblNewLabel_1.setBounds(387, 129, 784, 331);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dBmValor = entrada.getText();
				double dBm = Double.parseDouble(dBmValor);
				double watts = Math.pow(10, (dBm/10));
				saida.setText(String.format("%.3f watts", watts))
				;
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 16));
		btnCalcular.setBounds(106, 333, 151, 37);
		contentPane.add(btnCalcular);
		
		
	}

}

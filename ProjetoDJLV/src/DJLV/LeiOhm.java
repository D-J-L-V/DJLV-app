package DJLV;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeiOhm extends JFrame {

    private JPanel contentPane;
    private JTextField txtTensao;
    private JTextField txtCorrente;
    private JTextField txtResistencia;
    private JButton btnCalcular;
    private JButton btnReiniciar;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeiOhm frame = new LeiOhm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LeiOhm() {
    	setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1033, 523);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtTensao = new JTextField();
        txtTensao.setBounds(10, 60, 200, 30);
        txtTensao.setFont(new Font("Arial", Font.BOLD, 16));
        contentPane.add(txtTensao);
        txtTensao.setColumns(10);

        txtCorrente = new JTextField();
        txtCorrente.setBounds(10, 110, 200, 30);
        txtCorrente.setFont(new Font("Arial", Font.BOLD, 16));
        contentPane.add(txtCorrente);
        txtCorrente.setColumns(10);

        txtResistencia = new JTextField();
        txtResistencia.setBounds(10, 160, 200, 30);
        txtResistencia.setFont(new Font("Arial", Font.BOLD, 16));
        contentPane.add(txtResistencia);
        txtResistencia.setColumns(10);

        JLabel lblTensao = new JLabel("Tensão (V)");
        lblTensao.setBounds(220, 60, 150, 30);
        lblTensao.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblTensao);

        JLabel lblCorrente = new JLabel("Corrente (A)");
        lblCorrente.setBounds(220, 110, 150, 30);
        lblCorrente.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblCorrente);

        JLabel lblResistencia = new JLabel("Resistência (Ω)");
        lblResistencia.setBounds(220, 160, 150, 30);
        lblResistencia.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblResistencia);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 254, 120, 30);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(btnCalcular);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(163, 254, 120, 30);
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(btnReiniciar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(10, 201, 400, 30);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        contentPane.add(lblResultado);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(LeiOhm.class.getResource("/Image/ohm.png")));
        lblNewLabel.setBounds(359, 11, 534, 437);
        contentPane.add(lblNewLabel);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularLeisOhm();
            }
        });

        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarCalculadora();
            }
        });
    }

    private void calcularLeisOhm() {
        double tensao = 0;
        double corrente = 0;
        double resistencia = 0;

        try {
            tensao = Double.parseDouble(txtTensao.getText());
            corrente = Double.parseDouble(txtCorrente.getText());
            resistencia = Double.parseDouble(txtResistencia.getText());

            if (tensao == 0 && corrente == 0) {
                lblResultado.setText("Informe a Tensão ou a Corrente.");
            } else if (tensao == 0) {
                // Calcula a Tensão
                double resultado = corrente * resistencia;
                lblResultado.setText("Tensão (V) = " + resultado);
            } else if (corrente == 0) {
                // Calcula a Corrente
                double resultado = tensao / resistencia;
                lblResultado.setText("Corrente (A) = " + resultado);
            } else {
                // Calcula a Resistência
                double resultado = tensao / corrente;
                lblResultado.setText("Resistência (Ω) = " + resultado);
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Informe valores numéricos válidos.");
        }
    }

    private void reiniciarCalculadora() {
        txtTensao.setText("");
        txtCorrente.setText("");
        txtResistencia.setText("");
        lblResultado.setText("");
    }
}
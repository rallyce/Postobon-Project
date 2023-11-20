/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postobonproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class welpos extends JFrame implements ActionListener {

    private JLabel logo, LB1, LB2, LB3, LB4;
    private JTextField tf1;
    private JButton b1;
    public static String tx = "";

    public welpos() {
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 81, 151));
        setIconImage(new ImageIcon(getClass().getResource("Images/Icon.png")).getImage());

        ImageIcon img1 = new ImageIcon("src/Images/Logo_white-2.png");
        logo = new JLabel(img1);
        logo.setBounds(95, 15, 300, 150);
        add(logo);

        LB1 = new JLabel("Sistema de Control Vacacional");
        LB1.setFont(new Font("PT Sans Regular", 1, 24));
        LB1.setForeground(new Color(255, 255, 255));
        LB1.setBounds(65, 170, 400, 30);
        add(LB1);

        LB2 = new JLabel("Ingrese su nombre:");
        LB2.setFont(new Font("PT Sans Regular", 1, 18));
        LB2.setForeground(new Color(255, 255, 255));
        LB2.setBounds(90, 300, 300, 30);
        add(LB2);

        tf1 = new JTextField();
        tf1.setBounds(90, 330, 300, 30);
        tf1.setFont(new Font("PT Sans Regular", 1, 14));
        tf1.setForeground(new Color(255, 81, 151));
        add(tf1);

        LB3 = new JLabel("© 2023 Postobon");
        LB3.setBounds(185, 450, 250, 30);
        LB3.setFont(new Font("PT Sans Regular", 1, 13));
        LB3.setForeground(new Color(255, 255, 255));
        add(LB3);

        b1 = new JButton("Ingresar");
        b1.setBounds(190, 370, 100, 30);
        b1.setFont(new Font("PT Sans Regular", 1, 14));
        b1.setBackground(new Color(255, 255, 255));
        b1.setForeground(new Color(255, 81, 151));
        b1.addActionListener(this);
        add(b1);

    }

    @Override
    public void actionPerformed(ActionEvent memo1) {
        if (memo1.getSource() == b1) {
            tx = tf1.getText().trim();
            if (tx.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre.");

            } else {
                tandc face2 = new tandc();
                face2.setBounds(0, 0, 700, 450);
                face2.setVisible(true);
                face2.setLocationRelativeTo(null);
                face2.setResizable(false);
                face2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.setVisible(false);

            }
        }

    }

    public static void main(String args[]) {
        welpos face1 = new welpos();
        face1.setBounds(0, 0, 500, 550);
        face1.setVisible(true);
        face1.setLocationRelativeTo(null);
        face1.setResizable(false);
        face1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postobonproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class mepos extends JFrame implements ActionListener {

    private JLabel logo, LB1, LB2, LB3, LB4, LB5, LB6, LB7, LB8, LB9;
    private JTextField tf1, tf2, tf3;
    private JComboBox cb1, cb2;
    private JTextArea ta1;
    private JScrollPane sp1;
    private JMenuBar mb1;
    private JMenu me1, me2, me3, me4;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7;
    String name = "";

    public mepos() {
        setLayout(null);
        setTitle("Pantalla Principal.");
        welpos venWelpos = new welpos();
        name = venWelpos.tx;

        mb1 = new JMenuBar();
        mb1.setBackground(new Color(255, 81, 151));
        setJMenuBar(mb1);

        setIconImage(new ImageIcon(getClass().getResource("Images/Icon.png")).getImage());
        getContentPane().setBackground(new Color(255, 81, 151));

        me1 = new JMenu("Opciones");
        me1.setForeground(new Color(255, 255, 255));
        me1.setFont(new Font("PT Sans Regular", 1, 14));
        mb1.add(me1);

        me2 = new JMenu("Color de fondo");
        me1.add(me2);

        mi1 = new JMenuItem("Rosado");
        mi1.addActionListener(this);
        me2.add(mi1);

        mi2 = new JMenuItem("Rojo");
        mi2.addActionListener(this);
        me2.add(mi2);

        mi3 = new JMenuItem("Morado");
        mi3.addActionListener(this);
        me2.add(mi3);

        mi4 = new JMenuItem("Nuevo");
        mi4.addActionListener(this);
        me1.add(mi4);

        mi5 = new JMenuItem("Salir");
        mi5.addActionListener(this);
        me1.add(mi5);

        me3 = new JMenu("Calcular");
        me3.setFont(new Font("PT Sans Regular", 1, 14));
        me3.setForeground(new Color(255, 255, 255));
        mb1.add(me3);

        mi6 = new JMenuItem("Vacaciones");
        mi6.addActionListener(this);
        me3.add(mi6);

        me4 = new JMenu("Acerca de");
        me4.setForeground(new Color(255, 255, 255));
        me4.setFont(new Font("PT Sans Regular", 1, 14));
        mb1.add(me4);

        mi7 = new JMenuItem("El creador");
        mi7.addActionListener(this);
        me4.add(mi7);

        ImageIcon img1 = new ImageIcon("src/Images/Logo_white-2.png");
        logo = new JLabel(img1);
        logo.setBounds(360, 10, 300, 150);
        add(logo);

        LB1 = new JLabel("Bienvenido " + name);
        LB1.setBounds(10, 70, 350, 50);
        LB1.setForeground(new Color(255, 255, 255));
        LB1.setFont(new Font("PT Sans Regular", 1, 36));
        add(LB1);

        LB2 = new JLabel("Datos del trabajador para el calculo de vacaciones");
        LB2.setBounds(60, 170, 600, 30);
        LB2.setForeground(new Color(255, 255, 255));
        LB2.setFont(new Font("PT Sans Regular", 0, 24));
        add(LB2);

        LB3 = new JLabel("Nombre completo:");
        LB3.setBounds(20, 220, 200, 30);
        LB3.setForeground(new Color(255, 255, 255));
        LB3.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB3);

        tf1 = new JTextField();
        tf1.setBounds(20, 250, 200, 30);
        tf1.setFont(new Font("PT Sans Regular", 1, 14));
        add(tf1);

        LB4 = new JLabel("Primer Apellido:");
        LB4.setBounds(20, 300, 200, 30);
        LB4.setForeground(new Color(255, 255, 255));
        LB4.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB4);

        tf2 = new JTextField();
        tf2.setBounds(20, 330, 200, 30);
        tf2.setFont(new Font("PT Sans Regular", 1, 14));
        add(tf2);

        LB5 = new JLabel("Segundo Apellido:");
        LB5.setBounds(20, 380, 200, 30);
        LB5.setForeground(new Color(255, 255, 255));
        LB5.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB5);

        tf3 = new JTextField();
        tf3.setBounds(20, 410, 200, 30);
        tf3.setFont(new Font("PT Sans Regular", 1, 14));
        add(tf3);

        LB6 = new JLabel("Seleccione su Departamento:");
        LB6.setBounds(280, 220, 230, 30);
        LB6.setForeground(new Color(255, 255, 255));
        LB6.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB6);

        cb1 = new JComboBox();
        cb1.setBounds(280, 250, 200, 30);
        cb1.setFont(new Font("PT Sans Regular", 1, 14));
        add(cb1);
        cb1.addItem("");
        cb1.addItem("Atencion al Cliente");
        cb1.addItem("Logistica");
        cb1.addItem("Gerencia");

        LB7 = new JLabel("Seleccione Antiguedad:");
        LB7.setBounds(280, 300, 230, 30);
        LB7.setForeground(new Color(255, 255, 255));
        LB7.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB7);

        cb2 = new JComboBox();
        cb2.setBounds(280, 330, 200, 30);
        cb2.setFont(new Font("PT Sans Regular", 1, 14));
        add(cb2);
        cb2.addItem("");
        cb2.addItem("1 ano");
        cb2.addItem("2 a 6 anos");
        cb2.addItem("+7 anos");

        LB8 = new JLabel("Resultado del Calculo de Vacaciones:");
        LB8.setBounds(280, 380, 280, 30);
        LB8.setForeground(new Color(255, 255, 255));
        LB8.setFont(new Font("PT Sans Regular", 1, 14));
        add(LB8);

        ta1 = new JTextArea();
        ta1.setEditable(false);
        ta1.setFont(new Font("PT Sans Regular", 1, 14));
        sp1 = new JScrollPane(ta1);
        sp1.setBounds(280, 410, 350, 150);
        add(sp1);

        LB9 = new JLabel("©2023 Postobon | Todos los Derechos Reservados.");
        LB9.setBounds(165, 600, 360, 30);
        LB9.setFont(new Font("PT Sans Regular", 1, 14));
        LB9.setForeground(new Color(255, 255, 255));
        add(LB9);

    }
    
   

    @Override
    public void actionPerformed(ActionEvent memo1) {

        if (memo1.getSource() == mi6) {
            String namewo = tf1.getText();
            String fn = tf2.getText();
            String Sn = tf3.getText();
            String de = cb1.getSelectedItem().toString();
            String an = cb2.getSelectedItem().toString();

            if (namewo.equals("") || fn.equals("") || Sn.equals("") || de.equals("") || an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (namewo.equals("") && fn.equals("") && Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (!namewo.equals("") && fn.equals("") && Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (namewo.equals("") && !fn.equals("") && Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (!namewo.equals("") && fn.equals("") && !Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (!namewo.equals("") && !fn.equals("") && Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (namewo.equals("") && !fn.equals("") && !Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (!namewo.equals("") && fn.equals("") && !Sn.equals("") && !de.equals("") && !an.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los espacios requeridos.");

            } else if (de.equals("Atencion al Cliente") && an.equals("1 ano")) {

                ta1.setText("\n \n \n Usted tiene derecho a 6 dias de vacaciones");

            } else if (de.equals("Atencion al Cliente") && an.equals("2 a 6 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 14 dias de vacaciones");

            } else if (de.equals("Atencion al Cliente") && an.equals("+7 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 20 dias de vacaciones");

            } else if (de.equals("Logistica") && an.equals("1 ano")) {

                ta1.setText("\n \n \n Usted tiene derecho a 7 dias de vacaciones");

            } else if (de.equals("Logistica") && an.equals("2 a 6 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 15 dias de vacaciones");

            } else if (de.equals("Logistica") && an.equals("+7 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 22 dias de vacaciones");

            } else if (de.equals("Gerencia") && an.equals("1 ano")) {

                ta1.setText("\n \n \n Usted tiene derecho a 10 dias de vacaciones");

            } else if (de.equals("Gerencia") && an.equals("2 a 6 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 20 dias de vacaciones");

            } else if (de.equals("Gerencia") && an.equals("+7 anos")) {

                ta1.setText("\n \n \n Usted tiene derecho a 30 dias de vacaciones");

            }

        } else if (memo1.getSource() == mi1) {
            getContentPane().setBackground(new Color(255, 81, 151));
        } else if (memo1.getSource() == mi2) {
            getContentPane().setBackground(new Color(255, 0, 0));
        } else if (memo1.getSource() == mi3) {
            getContentPane().setBackground(new Color(102, 0, 153));
        } else if (memo1.getSource() == mi4) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            ta1.setText("");

        } else if (memo1.getSource() == mi5) {
            welpos face1 = new welpos();
            face1.setBounds(0, 0, 500, 550);
            face1.setVisible(true);
            face1.setLocationRelativeTo(null);
            face1.setResizable(false);
            face1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(false);

        } else if (memo1.getSource() == mi7) {
            JOptionPane.showMessageDialog(null, "Creado por Rallyce.");

        }

    }

    public static void main(String args[]) {
        mepos face3 = new mepos();
        face3.setBounds(0, 0, 700, 700);
        face3.setVisible(true);
        face3.setLocationRelativeTo(null);
        face3.setResizable(false);
        face3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}

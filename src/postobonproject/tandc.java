/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postobonproject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class tandc extends JFrame implements ActionListener, ChangeListener {

    private JLabel logo, LB1, LB2;
    private JTextArea ta1;
    private JScrollPane sp1;
    private JButton b1, b2;
    private JCheckBox cb1;
    String name = "";

    public tandc() {
        setLayout(null);

        setTitle("Licencia de Uso.");
        setIconImage(new ImageIcon(getClass().getResource("Images/Icon.png")).getImage());
        welpos venWelpos = new welpos();
        name = venWelpos.tx;

        LB1 = new JLabel("TERMINOS Y CONDICIONES");
        LB1.setBounds(215, 15, 300, 30);
        LB1.setFont(new Font("PT Sans Regular", 1, 18));
        add(LB1);

        ta1 = new JTextArea();
        ta1.setText("\n\n        Terminos y condiciones"
                + "\n\n        El usuario puede elegir y cambiar la clave para su acceso de administración"
                + "\n        de la cuenta en cualquier momento, en caso de que se haya registrado y"
                + "\n        que sea necesario para la compra de alguno de nuestros productos."
                + "\n  "
                + "\n        Senor/a: " + name
                + "\n  "
                + "\n        Es requisito necesario para la adquisición de los productos que se ofrecen en"
                + "\n        este sitio, que lea y acepte los siguientes Términos y Condiciones que a continuación"
                + "\n        se redactan.");
        ta1.setFont(new Font("PT Sans Regular", 0, 14));
        ta1.setEditable(false);
        sp1 = new JScrollPane(ta1);
        sp1.setBounds(10, 55, 665, 215);
        add(sp1);

        ImageIcon img1 = new ImageIcon("src/Images/Pink-2.png");
        LB2 = new JLabel(img1);
        LB2.setBounds(0, 260, 300, 150);
        add(LB2);

        cb1 = new JCheckBox("Yo acepto");
        cb1.setBounds(575, 280, 100, 30);
        cb1.setFont(new Font("PT Sans Regular", 1, 14));
        cb1.addChangeListener(this);
        add(cb1);

        b1 = new JButton("Continuar");
        b1.setFont(new Font("PT Sans Regular", 1, 14));
        b1.setBounds(350, 330, 150, 40);
        b1.addActionListener(this);
        b1.setEnabled(false);
        add(b1);

        b2 = new JButton("No acepto");
        b2.setFont(new Font("PT Sans Regular", 1, 14));
        b2.setBounds(520, 330, 150, 40);
        b2.addActionListener(this);
        b2.setEnabled(true);
        add(b2);
    }

    @Override
    public void stateChanged(ChangeEvent memo1) {
        boolean val1 = false;
        boolean val2 = true;

        if (cb1.isSelected()) {
            val1 = true;
            val2 = false;
        }
        b1.setEnabled(val1);
        b2.setEnabled(val2);
    }

    @Override
    public void actionPerformed(ActionEvent memo2) {
        if (memo2.getSource() == b1) {
            mepos face3 = new mepos();
            face3.setBounds(0, 0, 700, 700);
            face3.setVisible(true);
            face3.setLocationRelativeTo(null);
            face3.setResizable(false);
            face3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(false);
        } else if (memo2.getSource() == b2) {
            welpos face1 = new welpos();
            face1.setBounds(0, 0, 500, 550);
            face1.setVisible(true);
            face1.setLocationRelativeTo(null);
            face1.setResizable(false);
            face1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(false);

        }

    }

    public static void main(String args[]) {
        tandc face2 = new tandc();
        face2.setBounds(0, 0, 700, 450);
        face2.setVisible(true);
        face2.setLocationRelativeTo(null);
        face2.setResizable(false);
        face2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}

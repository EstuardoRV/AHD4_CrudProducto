
package codigo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Formulario {
    JFrame f = new JFrame();
    JPanel p1 = new JPanel();
    
    
    public void form(){
        f.setTitle("TIENDA!!!");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setBounds(50, 175, 400, 400);
        f.setVisible(true);
        
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(null);
        f.add(p1);
        
        JLabel l1 = new JLabel("Codigo:");
        l1.setBounds(50, 50, 100, 25);
        p1.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 100, 25);
        p1.add(t1);
        
        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(50, 125, 100, 25);
        p1.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(150, 125, 100, 25);
        p1.add(t2);
        
        JLabel l3 = new JLabel("Cantidad:");
        l3.setBounds(50, 200, 100, 25);
        p1.add(l3);
        
        JTextField t3 = new JTextField();
        t3.setBounds(150, 200, 100, 25);
        p1.add(t3);
        
        JLabel l4 = new JLabel("Lugar:");
        l4.setBounds(50, 275, 100, 25);
        p1.add(l4);
        
        JTextField t4 = new JTextField();
        t4.setBounds(150, 275, 100, 25);
        p1.add(t4);
        
        JButton b1 = new JButton("Guardar");
        b1.setBounds(125, 325, 100, 25);
        p1.add(b1);
        
        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funcion f = new Funcion();
                f.insertar(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(), t4.getText());
            }
        };
 
        b1.addActionListener(guardar);
    }
    
    public static void main(String[] args) {
        Formulario f = new Formulario();
        f.form();
    }
}

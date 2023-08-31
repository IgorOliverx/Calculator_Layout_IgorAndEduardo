package Calculadora_1.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

/**
 * FlowLayoutCalc
 */
public class FlowLayoutCalc extends JFrame {
    public FlowLayoutCalc() {
        super("Calculadora FlowLayout");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);

       
        // adcionar componentes 
        this.add(new JTextField("Digite Aqui", 15));
        for (int i = 0; i < 10; i++) {
            this.add(new JButton("" + i));
        }  
        
        this.setVisible(true);

    }

}
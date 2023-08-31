package Calculadora_1.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

/**
 * FlowLayoutCalc
 */
public class FlowLayoutCalc extends JFrame {
    public FlowLayoutCalc() {
        super("Calculadora FlowLayout");
        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        BorderLayout border = new BorderLayout(); 
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER); 
        this.setLayout(flow); 
     
        this.add(new JTextField("teste", 15)); 

        JLabel texto1 = new JLabel("Calculadora Simples");
        JPanel painel1 = new JPanel();
        this.add(painel1);
        painel1.add(texto1);

        // adcionar componentes
        // this.add(new JTextField(15));
        // this.add(new JButton("0"));
        // this.add(new JButton("1"));
        // this.add(new JButton("2"));
        // this.add(new JButton("-"));
        // this.add(new JButton("3"));
        // this.add(new JButton("4"));
        // this.add(new JButton("5"));
        // this.add(new JButton("+"));
        // this.add(new JButton("6"));
        // this.add(new JButton("7"));
        // this.add(new JButton("8"));
        // this.add(new JButton("x"));
        // this.add(new JButton("9"));
        // this.add(new JButton("10"));
        // this.add(new JButton("="));
        // this.add(new JButton("%"));

        // Botões

        JButton botao1 = new JButton("1");
        painel1.add(botao1);
        JButton botao2 = new JButton("2");
        painel1.add(botao2);
        JButton botao3 = new JButton("3");
        painel1.add(botao3);

        this.setVisible(true);
        // cliquesdebotão
    }

}
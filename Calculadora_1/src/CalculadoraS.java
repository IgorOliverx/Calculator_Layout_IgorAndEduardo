package Calculadora_1.src;

import javax.swing.*;
import java.awt.*;

public class CalculadoraS extends JFrame {
    public CalculadoraS() {
        super("CALCULADORA S");
        // add um Jpanel
        BorderLayout border = new BorderLayout();
        this.setLayout(border);

        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();

        this.add(painel3, BorderLayout.SOUTH);
        this.add(painel, BorderLayout.CENTER);
        this.add(painel2, BorderLayout.NORTH);

        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 4);
        FlowLayout flow = new FlowLayout();

        painel.setLayout(grid);
        painel2.setLayout(flow);
        painel3.setLayout(flow);

        // criando "visor" bem simples
        JTextField texto = new JTextField("Resultado");
        texto.setColumns(30); // Defina o número de colunas desejado
        painel2.add(texto);
        texto.setPreferredSize(new Dimension(100, 50));

        // criando botões de numeros
        String valoresm[] = { "7", "8", "9" };
        for (int i = 0; i < valoresm.length; i++) {
            painel.add(new JButton(valoresm[i]));
        }

        // criando botões de operações diferentes pois queria udar a cor
        JButton multi = new JButton("X");
        painel.add(multi);
        Color seila = new Color(220, 220, 220); // para mudar a cor necessitava criar um obj e dar o set para esse obj
        multi.setBackground(seila);

        // comentarios da primeira parte são aplicads para as demais partes

        String valoresM[] = { "4", "5", "6" };
        for (int i = 0; i < valoresM.length; i++) {
            painel.add(new JButton(valoresM[i]));
            // set border null
        }

        JButton menos = new JButton("-");
        painel.add(menos);
        Color seilam = new Color(220, 220, 220);
        menos.setBackground(seilam);

        String valoresMa[] = { "3", "2", "1" };
        for (int i = 0; i < valoresMa.length; i++) {
            painel.add(new JButton(valoresMa[i]));
        }

        JButton mais = new JButton("+");
        painel.add(mais);
        Color seilamais = new Color(220, 220, 220);
        mais.setBackground(seilamais);

        JButton maismenos = new JButton("+/-");
        painel.add(maismenos);

        JButton ponto = new JButton(".");
        painel.add(ponto);

        JButton apagar = new JButton("C");
        painel.add(apagar);
        Color apaagar = new Color(178, 34, 34);
        apagar.setBackground(apaagar);

        JButton div = new JButton("/");
        painel.add(div);
        Color seiladiv = new Color(220, 220, 220);
        div.setBackground(seiladiv);   


        JButton igual = new JButton("=");
        painel3.add(igual); 
        igual.setPreferredSize(new Dimension(250, 50));



        this.setDefaultCloseOperation(2);
        this.setVisible(true);
        // cliquesdebotão

    }
}

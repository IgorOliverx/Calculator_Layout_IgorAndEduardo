package Calculator.src;

import javax.swing.*;
import java.awt.*;

/**
 * FlowLayoutCalc
 */
public class JFrameMain extends JFrame {
    public JFrameMain() {
        super("Calculadora FlowLayout");

        //instanciando classe JFRAME para criar o objeto de minha janela
        JFrame janela01 = new JFrame();
        //Aqui eu criei um container principal para alocar os componentes
        JPanel painel1 = new JPanel();
        this.add(painel1);

      JButton btn = new JButton("12");
        JButton btn1 = new JButton("12");
          JButton btn2 = new JButton("12");
            JButton btn3 = new JButton("12");

            painel1.add(btn2, btn3);






        //algumas funções que a janela seguira
        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
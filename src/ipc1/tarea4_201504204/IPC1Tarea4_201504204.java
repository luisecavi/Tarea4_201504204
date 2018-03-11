package ipc1.tarea4_201504204;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luis Caballeros
 */
public class IPC1Tarea4_201504204 implements ActionListener {

    JFrame ventana = new JFrame();
    JButton botonmas = new JButton();
    JButton botonmenos = new JButton();
    JButton botonpor = new JButton();
    JButton botondiv = new JButton();
    JButton botonigual = new JButton();
    JTextField texto1 = new JTextField();
    JTextField texto2 = new JTextField();
    JTextField texto3 = new JTextField();
    String numero1, numero2;

    public static void main(String[] args) {
        IPC1Tarea4_201504204 vent = new IPC1Tarea4_201504204();
        vent.Ventana();
    }

    public void Ventana() {

        ventana.setTitle("Calculadora");
        ventana.setSize(400, 300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        texto1.setBounds(30, 20, 100, 40);
        ventana.add(texto1);

        texto2.setBounds(140, 20, 100, 40);
        ventana.add(texto2);

        texto3.setBounds(250, 20, 100, 40);
        ventana.add(texto3);

        botonmas.setBounds(50, 90, 75, 50);
        botonmas.setText("+");
        ventana.add(botonmas);

        botonmenos.setBounds(150, 90, 75, 50);
        botonmenos.setText("-");
        ventana.add(botonmenos);

        botonpor.setBounds(50, 170, 75, 50);
        botonpor.setText("*");
        ventana.add(botonpor);

        botondiv.setBounds(150, 170, 75, 50);
        botondiv.setText("/");
        ventana.add(botondiv);

        botonigual.setBounds(260, 130, 75, 50);
        botonigual.setText("=");
        ventana.add(botonigual);

        //accion click
        botonmas.addActionListener(this);
        botonmenos.addActionListener(this);
        botonpor.addActionListener(this);
        botondiv.addActionListener(this);
        botonigual.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent clic) {
        
        numero1 = texto1.getText();
        numero2 = texto2.getText();
        int num1, num2, resultado;
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(numero2);

        if (clic.getSource() == botonmas) {
            resultado = num1 + num2;
            texto3.setText(String.valueOf(resultado));
        }
        if (clic.getSource() == botonmenos) {
            resultado = num1 - num2;
            texto3.setText(String.valueOf(resultado));
        }
        if (clic.getSource() == botonpor) {
            resultado = num1 * num2;
            texto3.setText(String.valueOf(resultado));
        }
        if (clic.getSource() == botondiv) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese nuevamente numero 2");
            } else {
                resultado = num1 / num2;
                texto3.setText(String.valueOf(resultado));
            }

        }
        if (clic.getSource() == botonigual) {
            if (num1 == num2) {
                texto3.setText("Son iguales");
            } else {
                texto3.setText("No son iguales");
            }

        }
    }

}

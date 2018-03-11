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

    

}

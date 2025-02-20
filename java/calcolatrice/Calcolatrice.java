import java.awt.*;
import javax.swing.*;


public class Calcolatrice extends JFrame {
    protected JPanel pan=new JPanel();
    protected JPanel pan1=new JPanel();
    protected JLabel lab1=new JLabel("Numero 1: ");
    protected JLabel lab2=new JLabel("Numero 2: ");
    protected JLabel lab3=new JLabel("Risultato: ");
    protected JTextField text1 = new JTextField(30);
    protected JTextField text2 = new JTextField(30);
    protected JTextField text3 = new JTextField(30);
    protected JButton b1 = new JButton("+");
    protected JButton b2 = new JButton("-");
    protected JButton b3 = new JButton("*");
    protected JButton b4 = new JButton("/");
    protected JButton b5 = new JButton("=");
    protected JButton b6 = new JButton("C");
    public Calcolatrice(){
        super("Calcolatrice di Franzz");
        Container cont=this.getContentPane();

        pan1.setLayout(new GridLayout(3,1));
        pan1.add(lab1);
        pan1.add(text1);
        pan1.add(lab2);
        pan1.add(text2);
        pan1.add(lab3);
        pan1.add(text3);
        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        cont.add(pan1);
        cont.add(pan);
        cont.setLayout(new GridLayout(2,1));
    }
}

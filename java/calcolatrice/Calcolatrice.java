import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Calcolatrice extends JFrame implements ActionListener{
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
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            text3.setText(""+(Double.parseDouble(text1.getText())+Double.parseDouble(text2.getText())));
        }
        if(e.getSource()==b2){
            text3.setText(""+(Double.parseDouble(text1.getText())-Double.parseDouble(text2.getText())));
        }
        if(e.getSource()==b3){
            text3.setText(""+(Double.parseDouble(text1.getText())*Double.parseDouble(text2.getText())));
        }
        if(e.getSource()==b4){
            text3.setText(""+(Double.parseDouble(text1.getText())/Double.parseDouble(text2.getText())));
        }
        if(e.getSource()==b5){
            text1.setText(text3.getText());
            text2.setText("");
            text3.setText("");
        }
        if(e.getSource()==b6){
            text1.setText("");
            text2.setText("");
            text3.setText("");
        }
    }
}

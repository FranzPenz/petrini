import javax.swing.*;
import java.awt.*;
public class Negozio extends JFrame{
    protected JPanel pan=new JPanel();
    protected JPanel pan1=new JPanel();
    protected JLabel lab1=new JLabel("Prezzo: ");
    protected JLabel lab2=new JLabel("Sconto: ");
    protected JTextField text1 = new JTextField("€", 30);
    protected JTextField text2 = new JTextField("%", 30);
    protected JButton b1 = new JButton("10%");
    protected JButton b2 = new JButton("20%");
    protected JButton b3 = new JButton("30%");
    protected JButton b4 = new JButton("40%");
    protected JButton b5 = new JButton("Canc.");
    public Negozio(){
        super("Benvenuto nel Negozio!");
        Container cont=this.getContentPane();

        pan1.setLayout(new GridLayout(3,1));
        pan1.add(lab1);
        pan1.add(text1);
        pan1.add(lab2);
        pan1.add(text2);
        text1.setBackground(Color.yellow);
        text2.setBackground(Color.green);
        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        cont.add(pan1);
        cont.add(pan);
        cont.setLayout(new GridLayout(2,1));
    }
}
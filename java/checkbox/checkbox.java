import java.awt.*;
import javax.swing.*;

public class checkbox extends JFrame {
    
    protected JLabel name = new JLabel("Name: ");
    protected JLabel surname = new JLabel("Surname: ");
    protected JTextField text1 = new JTextField("name", 10);
    protected JTextField text2 = new JTextField("surname", 10);
    protected JComboBox<String> nationality = new JComboBox<String>();
    protected JComboBox<String> phone = new JComboBox<String>();
    protected JCheckBox check1 = new JCheckBox("worker");
    protected JCheckBox check2 = new JCheckBox("student");
    protected JPanel p1 = new JPanel();
    protected JPanel p2 = new JPanel();
    protected JButton b1 = new JButton("accept");
    protected JButton b2 = new JButton("cancel");

    public checkbox() {
        super("Modulo");
        Container c = this.getContentPane();
        
        
        p1.setLayout(new FlowLayout());
        p1.add(name);
        p1.add(text1);
        p1.add(surname);
        p1.add(text2);

        
        phone.addItem("+39");
        phone.addItem("+1");
        phone.addItem("+33");
        phone.addItem("+49");
        phone.addItem("+44");
        phone.addItem("+34");
        p1.add(phone);
        p1.add(new JTextField(20));

        
        nationality.addItem("Italian");
        nationality.addItem("American");
        nationality.addItem("French");
        nationality.addItem("German");
        nationality.addItem("English");
        nationality.addItem("Spanish");
        p1.add(nationality);
        p1.add(check1);
        p1.add(check2);

        c.add(p1);
        c.add(p2);
        c.add(b1);
        c.add(b2);

        
        c.add(p1);
        c.add(p2);
        c.add(b1);
        c.add(b2);

        
        c.setLayout(new GridLayout(4, 1));
    }
}

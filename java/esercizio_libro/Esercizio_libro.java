
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Esercizio_libro extends JFrame implements ActionListener{
    private String testo="";
    private int vocali=0;
    private int spazi=0;

    protected JPanel p = new JPanel();
    
    protected JLabel input = new JLabel("Inserisci una frase: ");
    protected JTextField inputField = new JTextField();
    protected JButton b = new JButton("Analizza");
    protected JLabel resultVocali = new JLabel("Num. vocali: ");
    protected JLabel resultSpazi = new JLabel("Num. spazi: ");
    protected JTextField resultVocaliField = new JTextField();
    protected JTextField resultSpaziField = new JTextField();

    public Esercizio_libro(){
        super("Analizzatore Frasi");
        Container c = this.getContentPane();
        resultVocaliField.setEditable(false);
        resultSpaziField.setEditable(false);
        p.add(input);
        p.add(inputField);
        p.add(b);
        p.add(resultVocali);
        p.add(resultVocaliField);
        p.add(resultSpazi);
        p.add(resultSpaziField);
        p.setLayout(new GridLayout(10,5));
        c.add(p);
        c.setLayout(new GridLayout(2,1));
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String frase = inputField.getText();
        resultVocaliField.setText("Vocali: "+ analizza_vocali(frase)+" %");
        resultSpaziField.setText("Spazi: "+ analizza_spazi(frase)+" %");
    }
    public double analizza_vocali(String t){
        char carattere;
        testo = t;
        testo = testo.toLowerCase();

        for(int i=0; i<testo.length(); i++){
            carattere = testo.charAt(i);
            if(carattere=='a' || carattere=='e' || carattere=='i' || carattere=='o' || carattere=='u'){
                vocali++;
            }
        }
        double perc=(double)vocali/testo.length()*100;
        return perc;
    }
    public double analizza_spazi(String t){
        char carattere;
        testo = t;
        testo = testo.toLowerCase();

        for(int i=0; i<testo.length(); i++){
            carattere = testo.charAt(i);
            if(carattere==' '){
                spazi++;
            }
        }
        double perc=(double)spazi/testo.length()*100;
        return perc;
    }
}

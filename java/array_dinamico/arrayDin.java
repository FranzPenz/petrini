
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class arrayDin extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;
    private JButton addButton, checkButton;
    private ArrayList<String> parole;

    public arrayDin(){
        setTitle("contatore di parole con lettera A");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        parole = new ArrayList<>(10);

        inputField = new JTextField(20);
        addButton = new JButton("Aggiungi Parola");
        checkButton = new JButton("Conta Parole con A");
        resultArea = new JTextArea(10,30);

        add(new JLabel("Inserisci una parola:"));
        add(inputField);
        add(addButton);
        add(checkButton);
        add(resultArea);
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String parola = inputField.getText().trim();
                if (!parola.isEmpty() && parole.size()<10) {
                    parole.add(parola);
                    resultArea.setText("Parola aggiunta: " + parola + "\n");
                    inputField.setText("");
                } else if ((parole.size() >= 10) && !parola.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "sei arrivato a 10 parole!");
                }
            }
        });
        checkButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int cont = 0;
                for(String parola:parole){
                    if (parola.length() > 0 && (parola.charAt(0) == 'a' || parola.charAt(0) == 'A')) {
                        cont++;
                    }
                }
                resultArea.append("Numero di parole che iniziano con 'a' o 'A': " + cont + "\n");
            }
        });
    }
}

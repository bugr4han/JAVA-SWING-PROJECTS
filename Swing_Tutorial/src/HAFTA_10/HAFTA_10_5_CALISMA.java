package HAFTA_10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HAFTA_10_5_CALISMA implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;
    
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    
    public HAFTA_10_5_CALISMA() {
        frame = new JFrame("Hesap Makinesi");
        frame.setSize(420, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }
        
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);    
        
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new HAFTA_10_5_CALISMA();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        
        if(e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        
        if(e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='+';
            textfield.setText("");
        }
        
        if (e.getSource() == subButton) {
            if (textfield.getText().equals("")) {
                textfield.setText("-");
            } else {
                num1 = Double.parseDouble(textfield.getText());
                operator = '-';
                textfield.setText("");
            }
        }
        
        if(e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='*';
            textfield.setText("");
        }
        
        if(e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='/';
            textfield.setText("");
        }
        
        if(e.getSource() == equButton) {
            num2=Double.parseDouble(textfield.getText());

            switch(operator) {
            case'+':
                    result=num1+num2;
                    break;
            case'-':
                    result=num1-num2;
                    break;
            case'*':
                    result=num1*num2;
                    break;
            case'/':
                    result=num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        
        if(e.getSource()==clrButton) {
            textfield.setText("");
        }
        
        if(e.getSource() == delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i = 0; i < string.length() - 1; i++) {
                    textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
    }
}
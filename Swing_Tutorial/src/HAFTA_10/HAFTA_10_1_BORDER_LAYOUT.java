package HAFTA_10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HAFTA_10_1_BORDER_LAYOUT extends JFrame implements ActionListener {
    public HAFTA_10_1_BORDER_LAYOUT() {
        setLayout(new BorderLayout());
        
        for(int i = 0; i < 5; i++) {
            JButton myButton = new JButton();
            myButton.setText(String.valueOf(i));
            myButton.addActionListener(this);
            
            if(i == 0)
                add(myButton, BorderLayout.PAGE_START);
            else if(i == 1)
                add(myButton, BorderLayout.LINE_START);
            else if(i == 2)
                add(myButton, BorderLayout.CENTER);
            else if(i == 3)
                add(myButton, BorderLayout.LINE_END);
            else if(i == 4)
                add(myButton, BorderLayout.PAGE_END);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HAFTA_10_1_BORDER_LAYOUT();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource().getClass() == JButton.class) {
            JButton b = (JButton) evt.getSource();
            System.out.println(b.getText());
        }
    }
}
package HAFTA_10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HAFTA_10_2_GRID_LAYOUT extends JFrame implements ActionListener  {
    public HAFTA_10_2_GRID_LAYOUT() {
        setLayout(new GridLayout(5, 2));
        
        for(int i = 0; i < 10; i++) {
            JButton myButton = new JButton(i + " nolu");
            myButton.addActionListener(this);
            add(myButton);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HAFTA_10_2_GRID_LAYOUT();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource().getClass() == JButton.class) {
            JButton b = (JButton) evt.getSource();
            System.out.println(b.getText());
        }
    } 
}
package HAFTA_10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HAFTA_10_0_DERS implements ActionListener {
    final JFrame myFrame = new JFrame("Dinamik Test");
    JButton myButton = new JButton();
    
    public HAFTA_10_0_DERS() {
        myFrame.setLayout(new GridLayout(0, 1));
        myButton.setText("Click to add");
        myFrame.add(myButton);
        myButton.addActionListener(this);
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new HAFTA_10_0_DERS();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == myButton) {
            myFrame.add(new JLabel("Bla bla"));
            myFrame.revalidate();
            myFrame.repaint();
        }
    }
}
package HAFTA_10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HAFTA_10_3_FLOW_LAYOUT extends JFrame implements ActionListener {
    int sayi;
    public HAFTA_10_3_FLOW_LAYOUT() {
        FlowLayout myLayout = new FlowLayout();
        myLayout.setAlignment(FlowLayout.CENTER);
        setLayout(myLayout);
        
        for(sayi = 0; sayi < 10; sayi++) {
            JButton myButton = new JButton(sayi + " nolu");
            myButton.addActionListener(this);
            add(myButton);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HAFTA_10_3_FLOW_LAYOUT();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource().getClass() == JButton.class) {
            JButton b = (JButton) evt.getSource();
            System.out.println(b.getText());
            
            JButton myButton = new JButton(sayi + " nolu");
            myButton.addActionListener(this);
            add(myButton);
            sayi++;
        }
        
        revalidate();
        repaint();
    }
}
package HAFTA_10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HAFTA_10_4_CALISMA extends JFrame implements ActionListener {
    
    public HAFTA_10_4_CALISMA() {
        setTitle("Dinamik Border Layout");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        button1.setPreferredSize(new Dimension(100,100));
        button2.setPreferredSize(new Dimension(100,100));
        button3.setPreferredSize(new Dimension(100,100));
        button4.setPreferredSize(new Dimension(100,100));
        button5.setPreferredSize(new Dimension(100,100));

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.WEST);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.CENTER);
        add(button5, BorderLayout.SOUTH);

        // ActionListener ekliyoruz
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource().getClass() == JButton.class) {
            JButton b = (JButton) evt.getSource();
            System.out.println(b.getText());
        }
    }

    public static void main(String[] args) {
        new HAFTA_10_4_CALISMA();
    }
}
package HAFTA_10;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HAFTA_10_6_CALISMA {
    JFrame frame;
    int count = 0, row = 0, column = 0;
    String[] bilgiler = new String[3];
    
    public HAFTA_10_6_CALISMA() {
        frame = new JFrame();
        frame.setTitle("Quiz için Çalışma Projesi");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Dosyalar/hafta10_satir.txt"));
            String line = br.readLine();
            int i = 0;
            while(line != null) {
                bilgiler[i] = line;
                line = br.readLine();
                i++;
            }
            count = Integer.parseInt(bilgiler[0]);
            row = Integer.parseInt(bilgiler[1]);
            column = Integer.parseInt(bilgiler[2]);
            
        } catch (FileNotFoundException ex) {
            System.out.println("HATA!");
        } catch (IOException ex) {
            System.out.println("HATA!");
        }
        
        frame.setLayout(new GridLayout(row, column));
        for(int i = 0; i < count; i++) {
            JLabel label = new JLabel("" + i);
            label.setHorizontalAlignment(SwingConstants.CENTER); 
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(150,150));
            frame.add(label);
        }
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new HAFTA_10_6_CALISMA();
    }
}

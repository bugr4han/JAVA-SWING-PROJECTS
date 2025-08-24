package HAFTA_11;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class HAFTA_11_2_CALISMA implements ActionListener {
    
    JFrame frame;
    JPanel kontrolPaneli, sayiPaneli;
    JButton Button_Uret, Button_Bul;
    JTextField TextField;
    
    public HAFTA_11_2_CALISMA() {
        frame = new JFrame("Deneme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        // Sayi Paneli
        sayiPaneli = new JPanel();
        sayiPaneli.setBounds(200,0,400,600);
        sayiPaneli.setLayout(new GridLayout(0,5,5,5));
        sayiPaneli.setBackground(Color.WHITE);
        
        // Kontrol Paneli işlemleri
        kontrolPaneli = new JPanel();
        kontrolPaneli.setBounds(0, 0, 200, 600);
        kontrolPaneli.setLayout(new FlowLayout());
        kontrolPaneli.setBackground(Color.LIGHT_GRAY);
        
        Button_Uret = new JButton("Sayı Üret");
        Button_Uret.setPreferredSize(new Dimension(150,50));
        Button_Uret.addActionListener(this);
        kontrolPaneli.add(Button_Uret);
        
        Button_Bul = new JButton("Sayı Bul");
        Button_Bul.setPreferredSize(new Dimension(150,50));
        Button_Bul.addActionListener(this);
        
        TextField = new JTextField();
        TextField.setPreferredSize(new Dimension(180,50));
        
        kontrolPaneli.add(TextField);
        kontrolPaneli.add(Button_Bul);
        
        frame.add(kontrolPaneli);
        frame.add(sayiPaneli);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new HAFTA_11_2_CALISMA();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Button_Uret) {
            sayiUret();
        } else if(e.getSource() == Button_Bul) {
            sayiBul();
        }
    }
    
    private void sayiUret() {
        sayiPaneli.removeAll();
        try {
            FileReader fr = new FileReader("Dosyalar/hafta11_calisma2_sayiMiktar.txt");
            BufferedReader br = new BufferedReader(fr);
            
            int miktar = Integer.parseInt(br.readLine());
            Random random = new Random();
            for(int i = 0; i < miktar; i++) {
                int sayi = random.nextInt(100);
                JLabel tmp = new JLabel(String.valueOf(sayi), SwingConstants.CENTER);
                tmp.setName(String.valueOf(sayi));
                sayiPaneli.add(tmp);
            }
            frame.revalidate();
            frame.repaint();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
    
    private void sayiBul() {
        
        try {
            int ArananSayi = Integer.parseInt(TextField.getText());

            for(Component comp : sayiPaneli.getComponents()) {
                if(comp instanceof JLabel lbl) {
                    int lblSayisi = Integer.parseInt(lbl.getName());
                    lbl.setForeground(Color.BLACK);
                    lbl.setBorder(null);
                    if(ArananSayi == lblSayisi) {
                        lbl.setForeground(Color.red);
                        lbl.setBorder(new LineBorder(Color.RED));
                    }
                }
            }
            
        } catch (Exception e) {
        
        }
    }
    
}

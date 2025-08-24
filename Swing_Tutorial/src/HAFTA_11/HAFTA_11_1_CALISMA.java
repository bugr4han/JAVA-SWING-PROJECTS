package HAFTA_11;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class HAFTA_11_1_CALISMA implements ActionListener {
    JFrame frame;
    JPanel kontrolPanel, sayiPanel;
    JTextField TextField_Adet, TextField_Ara;
    JButton Button_Uret, Button_Bul, Button_TekSayilar, Button_CiftSayilar;
    JLabel Label_Bilgi, Label_Adet, Label_Ara;
    JLabel Label_TekSayilar, Label_CiftSayilar;
    
    public HAFTA_11_1_CALISMA() {
        // Ana Frame
        frame = new JFrame("Sayı Bulma Oyunu");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        // Sayı Paneli İşlemleri
        sayiPanel = new JPanel();
        sayiPanel.setBounds(200, 0, 383, 560);
        sayiPanel.setBackground(Color.WHITE);
        sayiPanel.setLayout(new GridLayout(0, 5, 5, 5));

        // Kontrol Paneli İşlemleri
        kontrolPanel = new JPanel();
        kontrolPanel.setBounds(0, 0, 200, 600);
        kontrolPanel.setLayout(new FlowLayout());
        kontrolPanel.setBackground(Color.LIGHT_GRAY);

        // Label İşlemleri
        Label_Adet = new JLabel("Kaç sayı üretilecek?");
        Label_Ara = new JLabel("Sayıyı ara:");
        Label_Bilgi = new JLabel("");
        Label_Bilgi.setPreferredSize(new Dimension(180, 30));
        Label_Bilgi.setForeground(Color.RED);
        Label_Bilgi.setHorizontalAlignment(JLabel.CENTER);
        Label_TekSayilar = new JLabel("Tek Sayıları Bul");
        Label_CiftSayilar = new JLabel("Çift Sayıları Bul");
        
        // TextField İşlemleri
        TextField_Adet = new JTextField();
        TextField_Adet.setPreferredSize(new Dimension(180, 30));
        TextField_Ara = new JTextField();
        TextField_Ara.setPreferredSize(new Dimension(180, 30));
        TextField_Ara.setEnabled(false);

        // Buton İşlemleri
        Button_Uret = new JButton("Sayıları Üret");
        Button_Bul = new JButton("Sayıyı Bul");
        Button_TekSayilar = new JButton("Tek Sayılar");
        Button_CiftSayilar = new JButton("Çift Sayılar");
        Button_Uret.setPreferredSize(new Dimension(180, 30));
        Button_Bul.setPreferredSize(new Dimension(180, 30));
        Button_TekSayilar.setPreferredSize(new Dimension(180, 30));
        Button_CiftSayilar.setPreferredSize(new Dimension(180, 30));
        Button_Uret.addActionListener(this);
        Button_Bul.addActionListener(this);
        Button_TekSayilar.addActionListener(this);
        Button_CiftSayilar.addActionListener(this);
        
        // Güzel Görünsün Diye Boşlukları Boyutlandırıyorum
        JLabel bosluk1 = new JLabel("");
        JLabel bosluk2 = new JLabel("");
        JLabel bosluk3 = new JLabel("");
        JLabel bosluk4 = new JLabel("");
        JLabel bosluk5 = new JLabel("");
        bosluk1.setPreferredSize(new Dimension(150,50));
        bosluk2.setPreferredSize(new Dimension(150,30));
        bosluk3.setPreferredSize(new Dimension(150,30));
        bosluk4.setPreferredSize(new Dimension(150,30));
        bosluk5.setPreferredSize(new Dimension(150,30));
        
        // Elementleri Panele Ekleme İşlemleri
        kontrolPanel.add(bosluk1);
        kontrolPanel.add(Label_Adet);
        kontrolPanel.add(TextField_Adet);
        kontrolPanel.add(Button_Uret);
        // ------------------------------------
        kontrolPanel.add(bosluk2);
        kontrolPanel.add(Label_Ara);
        kontrolPanel.add(TextField_Ara);
        kontrolPanel.add(Button_Bul);
        // ------------------------------------
        kontrolPanel.add(bosluk3);
        kontrolPanel.add(Label_TekSayilar);
        kontrolPanel.add(Button_TekSayilar);
        // ------------------------------------
        kontrolPanel.add(bosluk4);
        kontrolPanel.add(Label_CiftSayilar);
        kontrolPanel.add(Button_CiftSayilar);
        // ------------------------------------
        kontrolPanel.add(bosluk5);
        kontrolPanel.add(Label_Bilgi);

        // Frame'e Panelleri Ekle
        frame.add(kontrolPanel);
        frame.add(sayiPanel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
      new HAFTA_11_1_CALISMA();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button_Uret) {
            sayiUret();
        } else if (e.getSource() == Button_Bul) {
            sayiBul();
        } else if (e.getSource() == Button_TekSayilar) {
            sayilariIsaretle(true);
        } else if (e.getSource() == Button_CiftSayilar) {
            sayilariIsaretle(false);
        }
    }

    private void sayiUret() {
        sayiPanel.removeAll();
        try {
            int miktar = Integer.parseInt(TextField_Adet.getText().trim());
            if (miktar <= 0) {
                Label_Bilgi.setText("Pozitif sayı girin.");
                return;
            }

            Random random = new Random();
            for (int i = 0; i < miktar; i++) {
                int randSayi = random.nextInt(100);
                JLabel sayiLabel = new JLabel(String.valueOf(randSayi), SwingConstants.CENTER);
                sayiLabel.setName(String.valueOf(randSayi));
                sayiPanel.add(sayiLabel);
            }

            TextField_Ara.setEnabled(true);
            Label_Bilgi.setText("Sayılar üretildi.");
            frame.revalidate();
            frame.repaint();

        } catch (NumberFormatException ex) {
            Label_Bilgi.setText("Geçerli bir sayı giriniz!");
        }
    }

    private void sayiBul() {
        try {
            int hedef = Integer.parseInt(TextField_Ara.getText().trim());
            boolean bulundu = false;

            for (Component comp : sayiPanel.getComponents()) {
                if (comp instanceof JLabel lbl) {
                    int sayi = Integer.parseInt(lbl.getName());
                    lbl.setForeground(Color.BLACK);
                    lbl.setBorder(null);

                    if (sayi == hedef) {
                        lbl.setForeground(Color.RED);
                        lbl.setBorder(new LineBorder(Color.RED));
                        bulundu = true;
                    }
                }
            }

            Label_Bilgi.setText(bulundu ? "Sayı bulundu!" : "Sayı bulunamadı.");
        } catch (NumberFormatException ex) {
            Label_Bilgi.setText("Aranacak sayı geçersiz!");
        }
    }

    private void sayilariIsaretle(boolean tekMi) {
        int sayac = 0;
        for (Component comp : sayiPanel.getComponents()) {
            if (comp instanceof JLabel lbl) {
                int sayi = Integer.parseInt(lbl.getName());
                lbl.setForeground(Color.BLACK);
                lbl.setBorder(null);

                if (tekMi && sayi % 2 != 0) {
                    lbl.setForeground(Color.BLUE);
                    lbl.setBorder(new LineBorder(Color.BLUE));
                    sayac++;
                } else if (!tekMi && sayi % 2 == 0) {
                    lbl.setForeground(Color.GREEN.darker());
                    lbl.setBorder(new LineBorder(Color.GREEN.darker()));
                    sayac++;
                }
            }
        }
        Label_Bilgi.setText((tekMi ? "Tek" : "Çift") + " sayı(lar) işaretlendi: " + sayac);
    }
}
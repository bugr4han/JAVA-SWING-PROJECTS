package HAFTA_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class HAFTA_10_7_QUIZ implements ActionListener {
    static double num1 = 0;
    static double num2 = 0;
    static String karakter = "";
    static String[] icerik;

    static JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz");
        frame.setSize(400, 170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();

        try {
            FileReader fr = new FileReader("Dosyalar/hafta10_hesap_makinesi.txt");
            BufferedReader br = new BufferedReader(fr);

            int satir = Integer.parseInt(br.readLine());
            int sutun = Integer.parseInt(br.readLine());
            String ucuncusatirdegerler = br.readLine();
            br.close();

            panel.setLayout(new GridLayout(satir, sutun, 3, 3));

            icerik = ucuncusatirdegerler.split(",");
            HAFTA_10_7_QUIZ listener = new HAFTA_10_7_QUIZ(); // Güncellenmiş sınıf adı

            for (String i : icerik) {
                JButton button = new JButton(i);
                button.addActionListener(listener);
                panel.add(button);
            }

        } catch (Exception ex) {
            System.out.println("HATA!");
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton myClickedButton = (JButton) e.getSource();
        mybuttonClickedMethodum(myClickedButton.getText());
    }

    public static void mybuttonClickedMethodum(String text) {
        if (text.equals("*") || text.equals("/")) {
            karakter = text;
            System.out.println("Girilen: " + karakter);
        } 
        else if (!text.equals("=")) {
            try {
                double number = Double.parseDouble(text);
                if (karakter.isEmpty()) {
                    num1 = number;
                    System.out.println("Girilen: " + num1);
                } 
                else {
                    num2 = number;
                    System.out.println("Girilen: " + num2);
                }
            } catch (NumberFormatException ex) {
                System.out.println("HATA");
            }
        } 
        else if (text.equals("=")) {
            double result = 0;
            if (karakter.equals("*")) {
                result = num1 * num2;
                System.out.println("Carpma Sonuc: " + result);
            } 
            else if (karakter.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Bolme Sonuc: " + result);
                } else {
                    System.out.println("0'a Bölme HATASI!");
                }
            } 
            else {
                System.out.println("ISLEM SECILMEDI!");
            }
            karakter = "";
        }
    }
}

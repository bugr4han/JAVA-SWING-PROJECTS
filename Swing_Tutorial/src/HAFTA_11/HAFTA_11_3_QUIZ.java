package HAFTA_11;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HAFTA_11_3_QUIZ extends javax.swing.JFrame {
    JLabel lbl1, lbl2, lbl3, lbl4;
    JComboBox box1, box2, box3, box4;
    public HAFTA_11_3_QUIZ() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CevapPaneli = new javax.swing.JPanel();
        jPanel_AnketPaneli = new javax.swing.JPanel();
        jButton_AdSoyadEkle = new javax.swing.JButton();
        jButton_Sifirla = new javax.swing.JButton();
        jButton_Gonder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_CevapPaneli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cevaplayan Bilgileri", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        javax.swing.GroupLayout jPanel_CevapPaneliLayout = new javax.swing.GroupLayout(jPanel_CevapPaneli);
        jPanel_CevapPaneli.setLayout(jPanel_CevapPaneliLayout);
        jPanel_CevapPaneliLayout.setHorizontalGroup(
            jPanel_CevapPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_CevapPaneliLayout.setVerticalGroup(
            jPanel_CevapPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jPanel_AnketPaneli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Anket Formu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        javax.swing.GroupLayout jPanel_AnketPaneliLayout = new javax.swing.GroupLayout(jPanel_AnketPaneli);
        jPanel_AnketPaneli.setLayout(jPanel_AnketPaneliLayout);
        jPanel_AnketPaneliLayout.setHorizontalGroup(
            jPanel_AnketPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_AnketPaneliLayout.setVerticalGroup(
            jPanel_AnketPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        jButton_AdSoyadEkle.setText("Ad Soyad Ekle");
        jButton_AdSoyadEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AdSoyadEkleActionPerformed(evt);
            }
        });

        jButton_Sifirla.setText("Anketi Sıfırla");
        jButton_Sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SifirlaActionPerformed(evt);
            }
        });

        jButton_Gonder.setText("Formu Gönder");
        jButton_Gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GonderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_CevapPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_AnketPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Gonder, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(152, 152, 152)
                                    .addComponent(jButton_AdSoyadEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(138, 138, 138)
                                    .addComponent(jButton_Sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CevapPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AdSoyadEkle)
                .addGap(7, 7, 7)
                .addComponent(jPanel_AnketPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Sifirla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Gonder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AdSoyadEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AdSoyadEkleActionPerformed
        jPanel_CevapPaneli.setLayout(new GridLayout(2,1));
        JLabel ad = new JLabel("Ad");
        JLabel soyad = new JLabel("Soyad");
        JTextField TextField1 = new JTextField();
        JTextField TextField2 = new JTextField();
        
        jPanel_CevapPaneli.add(ad);
        jPanel_CevapPaneli.add(TextField1);
        jPanel_CevapPaneli.add(soyad);
        jPanel_CevapPaneli.add(TextField2);
        jPanel_CevapPaneli.revalidate();
        jPanel_CevapPaneli.repaint();
    }//GEN-LAST:event_jButton_AdSoyadEkleActionPerformed

    private void jButton_SifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SifirlaActionPerformed
        jPanel_CevapPaneli.removeAll();
        jPanel_CevapPaneli.setPreferredSize(new Dimension(10,212));
        lbl1.setForeground(Color.BLACK);
        lbl2.setForeground(Color.BLACK);
        lbl3.setForeground(Color.BLACK);
        lbl4.setForeground(Color.BLACK);

        String[] sil = {"", "", ""};
        box1.removeAllItems();
        box2.removeAllItems();
        box3.removeAllItems();
        box4.removeAllItems();
        
        jPanel_CevapPaneli.repaint();
    }//GEN-LAST:event_jButton_SifirlaActionPerformed

    private void jButton_GonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GonderActionPerformed
        Component[] components = jPanel_CevapPaneli.getComponents();
        boolean AdSoyadKontrol = false;
        String ad = "";
        String soyad = "";

        //for (int i =0; i < components.length; i++) {
        //  Component comp = (JTextField)components[i];
        for (Component comp : components) {
            if (comp instanceof JTextField) {
                AdSoyadKontrol = true;
                if (ad.isEmpty()) {
                    ad = ((JTextField) comp).getText();
                } else {
                    soyad = ((JTextField) comp).getText();
                }
            }
        }
    
        int secim1 = Integer.parseInt((String) box1.getSelectedItem());
        int secim2 = Integer.parseInt((String) box2.getSelectedItem());
        int secim3 = Integer.parseInt((String) box3.getSelectedItem());
        int secim4 = Integer.parseInt((String) box4.getSelectedItem());

        if(secim1 == 1) {
            lbl1.setForeground(Color.RED);
        } else if(secim1 == 2) {
            lbl1.setForeground(Color.BLUE);
        } else if(secim1 == 3) {
            lbl1.setForeground(Color.GREEN);
        }
        
        if(secim2 == 1) {
            lbl2.setForeground(Color.RED);
        } else if(secim2 == 2) {
            lbl2.setForeground(Color.BLUE);
        } else if(secim2 == 3) {
            lbl2.setForeground(Color.GREEN);
        }
        
        if(secim3 == 1) {
            lbl3.setForeground(Color.RED);
        } else if(secim3 == 2) {
            lbl3.setForeground(Color.BLUE);
        } else if(secim3 == 3) {
            lbl3.setForeground(Color.GREEN);
        }
        if(secim4 == 1) {
            lbl4.setForeground(Color.RED);
        } else if(secim4 == 2) {
            lbl4.setForeground(Color.BLUE);
        } else if(secim4 == 3) {
            lbl4.setForeground(Color.GREEN);
        }

        
        String message = "Ad: " + ad + "\n" +
                         "Soyad: " + soyad + "\n" +
                         "Cevaplar: " + secim1 +  ", " + secim2 + ", " + secim3 +  ", " + secim4;

        JOptionPane.showMessageDialog(this, 
            message, 
            "Anket Sonuçları", 
            JOptionPane.INFORMATION_MESSAGE);
        
        jPanel_AnketPaneli.revalidate();
        jPanel_AnketPaneli.repaint();
    }//GEN-LAST:event_jButton_GonderActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPanel_AnketPaneli.setLayout(new GridLayout(4,2));
        try {
            /*
            FileReader fr = new FileReader("anket.txt");
            BufferedReader br = new BufferedReader(fr);
            */
            FileInputStream fis = new FileInputStream("Dosyalar/hafta11_anket.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            
            String soru1 = br.readLine();
            String soru2 = br.readLine();
            String soru3 = br.readLine();
            String soru4 = br.readLine();
            br.close();
 
            lbl1  = new JLabel(soru1);
            lbl2  = new JLabel(soru2);
            lbl3  = new JLabel(soru3);
            lbl4  = new JLabel(soru4);
            
            String[] items = {"1", "2", "3"};
            box1 = new JComboBox<>(items);
            box2 = new JComboBox<>(items);
            box3 = new JComboBox<>(items);
            box4 = new JComboBox<>(items);
            
            jPanel_AnketPaneli.add(lbl1);
            jPanel_AnketPaneli.add(box1);            
            jPanel_AnketPaneli.add(lbl2);
            jPanel_AnketPaneli.add(box2);           
            jPanel_AnketPaneli.add(lbl3);
            jPanel_AnketPaneli.add(box3);           
            jPanel_AnketPaneli.add(lbl4);
            jPanel_AnketPaneli.add(box4);
            
            jPanel_AnketPaneli.revalidate();
            jPanel_AnketPaneli.repaint();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_3_QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_3_QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_3_QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_3_QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_11_3_QUIZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AdSoyadEkle;
    private javax.swing.JButton jButton_Gonder;
    private javax.swing.JButton jButton_Sifirla;
    private javax.swing.JPanel jPanel_AnketPaneli;
    private javax.swing.JPanel jPanel_CevapPaneli;
    // End of variables declaration//GEN-END:variables
}

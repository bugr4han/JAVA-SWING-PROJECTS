package HAFTA_07;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class HAFTA_7_1_ODEV extends javax.swing.JFrame {
    public HAFTA_7_1_ODEV() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_YaziAlani = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_DosyaAc = new javax.swing.JMenuItem();
        jMenuItem_DosyaKaydet = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_YeniSayfa = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_RenkDegistir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_Arial = new javax.swing.JMenuItem();
        jMenuItem_TimesNewRoman = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_size14 = new javax.swing.JMenuItem();
        jMenuItem_size18 = new javax.swing.JMenuItem();
        jMenuItem_size32 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad Ödevi");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("7.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea_YaziAlani.setColumns(20);
        jTextArea_YaziAlani.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextArea_YaziAlani.setRows(5);
        jScrollPane1.setViewportView(jTextArea_YaziAlani);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Dosya");

        jMenuItem_DosyaAc.setText("Dosya Aç");
        jMenuItem_DosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DosyaAcActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_DosyaAc);

        jMenuItem_DosyaKaydet.setText("Dosya Kaydet");
        jMenuItem_DosyaKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DosyaKaydetActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_DosyaKaydet);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Düzenle");

        jMenuItem_YeniSayfa.setText("Yeni Sayfa");
        jMenuItem_YeniSayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_YeniSayfaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_YeniSayfa);

        jMenu3.setText("Renk");

        jMenuItem_RenkDegistir.setText("Renk Değiştir");
        jMenuItem_RenkDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RenkDegistirActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_RenkDegistir);

        jMenu2.add(jMenu3);

        jMenu4.setText("Yazı Tipi");

        jMenuItem_Arial.setText("Arial");
        jMenuItem_Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ArialActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_Arial);

        jMenuItem_TimesNewRoman.setText("Times New Roman");
        jMenuItem_TimesNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TimesNewRomanActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_TimesNewRoman);

        jMenu2.add(jMenu4);

        jMenu5.setText("Yazı Boyutu");

        jMenuItem_size14.setText("14");
        jMenuItem_size14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_size14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_size14);

        jMenuItem_size18.setText("18");
        jMenuItem_size18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_size18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_size18);

        jMenuItem_size32.setText("32");
        jMenuItem_size32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_size32ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_size32);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_DosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DosyaAcActionPerformed
        JFileChooser fc = new JFileChooser();
        int i = fc.showOpenDialog(this);
        if(i == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
                String icerik = "";
                while(scanner.hasNextLine()) {
                    icerik += scanner.nextLine() + "\n";
                }
                jTextArea_YaziAlani.setText(icerik);
            } catch (FileNotFoundException ex) {
                System.out.println("FileNotFoundException");
            }
        }
    }//GEN-LAST:event_jMenuItem_DosyaAcActionPerformed

    private void jMenuItem_DosyaKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DosyaKaydetActionPerformed
        JFileChooser fc = new JFileChooser();
        int cevap = fc.showSaveDialog(this);
        
        if(cevap == JFileChooser.APPROVE_OPTION) {
            String dosyaYolu = fc.getSelectedFile().getPath();
            try(FileWriter writer = new FileWriter(dosyaYolu)) {
                writer.write(jTextArea_YaziAlani.getText());
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }
    }//GEN-LAST:event_jMenuItem_DosyaKaydetActionPerformed

    private void jMenuItem_RenkDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RenkDegistirActionPerformed
        Color color = JColorChooser.showDialog(this, "Renk Seçin", Color.RED);
        jTextArea_YaziAlani.setForeground(color);
    }//GEN-LAST:event_jMenuItem_RenkDegistirActionPerformed

    private void jMenuItem_ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ArialActionPerformed
        Font font = new Font("Arial",Font.PLAIN,20);
        jTextArea_YaziAlani.setFont(font);
    }//GEN-LAST:event_jMenuItem_ArialActionPerformed

    private void jMenuItem_TimesNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TimesNewRomanActionPerformed
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        jTextArea_YaziAlani.setFont(font);
    }//GEN-LAST:event_jMenuItem_TimesNewRomanActionPerformed

    private void jMenuItem_YeniSayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_YeniSayfaActionPerformed
        jTextArea_YaziAlani.setText("");
    }//GEN-LAST:event_jMenuItem_YeniSayfaActionPerformed

    private void jMenuItem_size14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_size14ActionPerformed
        Font mevcutFont = jTextArea_YaziAlani.getFont();
        jTextArea_YaziAlani.setFont(mevcutFont.deriveFont(14f));
    }//GEN-LAST:event_jMenuItem_size14ActionPerformed

    private void jMenuItem_size18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_size18ActionPerformed
        Font mevcutFont = jTextArea_YaziAlani.getFont();
        jTextArea_YaziAlani.setFont(mevcutFont.deriveFont(18f));
    }//GEN-LAST:event_jMenuItem_size18ActionPerformed

    private void jMenuItem_size32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_size32ActionPerformed
        Font mevcutFont = jTextArea_YaziAlani.getFont();
        jTextArea_YaziAlani.setFont(mevcutFont.deriveFont(32f));
    }//GEN-LAST:event_jMenuItem_size32ActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_7_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_7_1_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Arial;
    private javax.swing.JMenuItem jMenuItem_DosyaAc;
    private javax.swing.JMenuItem jMenuItem_DosyaKaydet;
    private javax.swing.JMenuItem jMenuItem_RenkDegistir;
    private javax.swing.JMenuItem jMenuItem_TimesNewRoman;
    private javax.swing.JMenuItem jMenuItem_YeniSayfa;
    private javax.swing.JMenuItem jMenuItem_size14;
    private javax.swing.JMenuItem jMenuItem_size18;
    private javax.swing.JMenuItem jMenuItem_size32;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_YaziAlani;
    // End of variables declaration//GEN-END:variables

}
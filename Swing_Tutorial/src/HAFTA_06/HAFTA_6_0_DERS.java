package HAFTA_06;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HAFTA_6_0_DERS extends javax.swing.JFrame {
    public HAFTA_6_0_DERS() {
        initComponents();
        baslik = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField_AnaTitle = new javax.swing.JTextField();
        jButton_Uygula = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_Kopyala = new javax.swing.JMenuItem();
        jMenuItem_Yapistir = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem_Kopyala2 = new javax.swing.JMenuItem();
        jMenuItem_Yapistir2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Isim = new javax.swing.JTextField();
        jButton_JDialogAc = new javax.swing.JButton();
        jButton_DosyaYolu = new javax.swing.JButton();
        jButton_RenkSec = new javax.swing.JButton();
        jButton_YaziyiParcala = new javax.swing.JButton();
        jButton_KelimeDegistir = new javax.swing.JButton();
        jButton_AramaYap = new javax.swing.JButton();

        jDialog1.setBounds(new java.awt.Rectangle(150, 150, 400, 150));
        jDialog1.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JDialog Penceresi");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Ana Pencere Başlığı için isim giriniz: ");

        jTextField_AnaTitle.setComponentPopupMenu(jPopupMenu2);

        jButton_Uygula.setText("Uygula");
        jButton_Uygula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UygulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Uygula, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jTextField_AnaTitle))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_AnaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Uygula)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTextField_AnaTitle.getAccessibleContext().setAccessibleParent(jDialog1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuItem_Kopyala.setText("Kopyala");
        jMenuItem_Kopyala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KopyalaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_Kopyala);

        jMenuItem_Yapistir.setText("Yapıştır");
        jMenuItem_Yapistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_YapistirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_Yapistir);

        jMenuItem_Kopyala2.setText("Kopyala 2");
        jMenuItem_Kopyala2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Kopyala2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem_Kopyala2);

        jMenuItem_Yapistir2.setText("Yapıştır 2");
        jMenuItem_Yapistir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Yapistir2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem_Yapistir2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ColorChooser, FileChooser");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("6.HAFTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_Isim.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Isim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TextField Alanına İsim Giriniz!", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jButton_JDialogAc.setText("TextField'deki isimde JDialog Aç");
        jButton_JDialogAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JDialogAcActionPerformed(evt);
            }
        });

        jButton_DosyaYolu.setText("TextField yazısı için dosya yolu belirt");
        jButton_DosyaYolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaYoluActionPerformed(evt);
            }
        });

        jButton_RenkSec.setText("TextField yazısı için renk seç");
        jButton_RenkSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RenkSecActionPerformed(evt);
            }
        });

        jButton_YaziyiParcala.setText("TextField'deki yazıyı parcala");
        jButton_YaziyiParcala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YaziyiParcalaActionPerformed(evt);
            }
        });

        jButton_KelimeDegistir.setText("TextField'de kelime degistir");
        jButton_KelimeDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KelimeDegistirActionPerformed(evt);
            }
        });

        jButton_AramaYap.setText("TextField'de arama yap");
        jButton_AramaYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AramaYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Isim)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_JDialogAc, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jButton_RenkSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_KelimeDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_YaziyiParcala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_AramaYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DosyaYolu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Isim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_JDialogAc)
                    .addComponent(jButton_DosyaYolu))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_RenkSec)
                    .addComponent(jButton_YaziyiParcala))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_KelimeDegistir)
                    .addComponent(jButton_AramaYap))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Form açıldığında TextField üzerinde çalışan bir PopupMenu oluşturuluyor
        jTextField_Isim.setComponentPopupMenu(jPopupMenu1);
    }//GEN-LAST:event_formWindowOpened

    private void jButton_JDialogAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JDialogAcActionPerformed
        jTextField_AnaTitle.setText("Ana Pencere Başlığı");
        jDialog1.setVisible(true);  
    }//GEN-LAST:event_jButton_JDialogAcActionPerformed

    private void jButton_DosyaYoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaYoluActionPerformed
        int secim = jFileChooser1.showOpenDialog(null);
        if(secim == JFileChooser.APPROVE_OPTION)
            jTextField_Isim.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_jButton_DosyaYoluActionPerformed

    private void jButton_RenkSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RenkSecActionPerformed
        Color cl = jColorChooser1.showDialog(null, "Başlık", Color.ORANGE);
        jTextField_Isim.setForeground(cl);
        jTextField_Isim.setForeground(jColorChooser1.showDialog(null, "Başlık", Color.GREEN));
    }//GEN-LAST:event_jButton_RenkSecActionPerformed

    private void jButton_YaziyiParcalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YaziyiParcalaActionPerformed
        String s = jTextField_Isim.getText().substring(0, 3);
        JOptionPane.showMessageDialog(this, s);
    }//GEN-LAST:event_jButton_YaziyiParcalaActionPerformed

    private void jButton_KelimeDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KelimeDegistirActionPerformed
        String s = jTextField_Isim.getText().replaceAll("deneme", "");
        JOptionPane.showMessageDialog(this, s);
    }//GEN-LAST:event_jButton_KelimeDegistirActionPerformed

    private void jButton_AramaYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AramaYapActionPerformed
        int i = jTextField_Isim.getText().indexOf("deneme");
        JOptionPane.showMessageDialog(this, i);
    }//GEN-LAST:event_jButton_AramaYapActionPerformed
    
    String baslik;
    private void jMenuItem_KopyalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KopyalaActionPerformed
        //Ana Pencere TextField üzerinde çalışan PopupMenu'de ilk seçenek (kopyala) seçildiğinde çalışır
        baslik = jTextField_Isim.getText();
        JOptionPane.showMessageDialog(this, "kopyalandı");
    }//GEN-LAST:event_jMenuItem_KopyalaActionPerformed

    private void jMenuItem_YapistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_YapistirActionPerformed
        //Ana Pencere TextField üzerinde çalışan PopupMenu'de ikinci seçenek (yapıştır) seçildiğinde çalışır
        jTextField_Isim.setText(baslik);
    }//GEN-LAST:event_jMenuItem_YapistirActionPerformed

    private void jMenuItem_Kopyala2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Kopyala2ActionPerformed
        //Dialog Penceresi TextField üzerinde çalışan PopupMenu'de ilk seçenek (kopyala) seçildiğinde çalışır
        baslik = jTextField_AnaTitle.getSelectedText();
        JOptionPane.showMessageDialog(this, "kopyalandı");
    }//GEN-LAST:event_jMenuItem_Kopyala2ActionPerformed

    private void jMenuItem_Yapistir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Yapistir2ActionPerformed
        //Dialog Penceresi TextField üzerinde çalışan PopupMenu'de ikinci seçenek (yapıştır) seçildiğinde çalışır
        jTextField_AnaTitle.setText(baslik);
    }//GEN-LAST:event_jMenuItem_Yapistir2ActionPerformed

    private void jButton_UygulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UygulaActionPerformed
        //JDialog'daki buton için
        this.setTitle(jTextField_AnaTitle.getText());
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton_UygulaActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_6_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_6_0_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AramaYap;
    private javax.swing.JButton jButton_DosyaYolu;
    private javax.swing.JButton jButton_JDialogAc;
    private javax.swing.JButton jButton_KelimeDegistir;
    private javax.swing.JButton jButton_RenkSec;
    private javax.swing.JButton jButton_Uygula;
    private javax.swing.JButton jButton_YaziyiParcala;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem_Kopyala;
    private javax.swing.JMenuItem jMenuItem_Kopyala2;
    private javax.swing.JMenuItem jMenuItem_Yapistir;
    private javax.swing.JMenuItem jMenuItem_Yapistir2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_AnaTitle;
    private javax.swing.JTextField jTextField_Isim;
    // End of variables declaration//GEN-END:variables

}
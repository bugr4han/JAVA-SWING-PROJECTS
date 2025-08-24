package HAFTA_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HAFTA_7_2_CALISMA extends javax.swing.JFrame {
    public HAFTA_7_2_CALISMA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField_GecmeNotu = new javax.swing.JTextField();
        jButton_Sonuclar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Oku = new javax.swing.JMenuItem();
        jMenuItem_Kaydet = new javax.swing.JMenuItem();
        jMenuItem_Cikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HAFTA 7 - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ÖĞRENCİ BİLGİLERİ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SONUÇLAR");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Geçme Notu Girin:");

        jTextField_GecmeNotu.setEnabled(false);

        jButton_Sonuclar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton_Sonuclar.setText("Sonuçlar");
        jButton_Sonuclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SonuclarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_GecmeNotu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Sonuclar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_GecmeNotu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Sonuclar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jMenu1.setText("DOSYA");

        jMenuItem_Oku.setText("Öğrenci Listesi Oku");
        jMenuItem_Oku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OkuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Oku);

        jMenuItem_Kaydet.setText("Bölüme Göre Kaydet");
        jMenuItem_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KaydetActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Kaydet);

        jMenuItem_Cikis.setText("Çıkış");
        jMenuItem_Cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CikisActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Cikis);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
    
    String DosyaYolu = "";
    String bilgiler = "";
    String[] parcalanmisBilgier;
    String[] stringNotDizisi;
    String kaydetmeYolu = "";
    
    private void jMenuItem_OkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OkuActionPerformed
        if(jFileChooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            DosyaYolu = jFileChooser1.getSelectedFile().getAbsolutePath();
            
            try {
                FileReader fr = new FileReader(DosyaYolu);
                BufferedReader br = new BufferedReader(fr);
                // BufferedReader br = new BufferedReader(new FileReader(DosyaYolu));
                
                String satir;
                while ((satir = br.readLine()) != null) {
                    jTextArea1.append(satir + "\n");
                    bilgiler += satir + ",";
                }
                
                parcalanmisBilgier = bilgiler.split(",");
                jTextField_GecmeNotu.setEnabled(true);
                
                JOptionPane.showMessageDialog(this, "Dosyadan Başarıyla Okundu!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                br.close();  
            } catch (FileNotFoundException ex) {
                System.out.println("HATA 1!");
            } catch (IOException ex) {
                System.out.println("HATA 2!");
            }
        }
    }//GEN-LAST:event_jMenuItem_OkuActionPerformed

    private void jButton_SonuclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SonuclarActionPerformed
        jTextArea2.setText("");
        int GecmeNotu = Integer.parseInt(jTextField_GecmeNotu.getText());
        for(int i = 0; i < parcalanmisBilgier.length; i++) {
            if(3*i+1 < parcalanmisBilgier.length) {
                if(Integer.parseInt(parcalanmisBilgier[3*i+1]) >= GecmeNotu) {
                    jTextArea2.append(parcalanmisBilgier[3*i] + ",");
                    jTextArea2.append(parcalanmisBilgier[3*i+1] + ",");
                    jTextArea2.append(parcalanmisBilgier[3*i+2] + "\n");
                }
            }
        }
    }//GEN-LAST:event_jButton_SonuclarActionPerformed
        
    private void jMenuItem_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KaydetActionPerformed
        jFileChooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(jFileChooser1.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            kaydetmeYolu = jFileChooser1.getSelectedFile().getAbsolutePath();
            if(!kaydetmeYolu.contains(".txt")) {
                kaydetmeYolu += ".txt";
            }
            try {
                FileWriter fw = new FileWriter(kaydetmeYolu);
                BufferedWriter bw = new BufferedWriter(fw);
                if (!jTextArea2.getText().trim().isEmpty())
                    bw.write(jTextArea2.getText());
                bw.close();
            } catch (IOException ex) {
                System.out.println("HATA 3!");
            }
        }
    }//GEN-LAST:event_jMenuItem_KaydetActionPerformed

    private void jMenuItem_CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_CikisActionPerformed

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
            java.util.logging.Logger.getLogger(HAFTA_7_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_7_2_CALISMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Sonuclar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Cikis;
    private javax.swing.JMenuItem jMenuItem_Kaydet;
    private javax.swing.JMenuItem jMenuItem_Oku;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField_GecmeNotu;
    // End of variables declaration//GEN-END:variables

}

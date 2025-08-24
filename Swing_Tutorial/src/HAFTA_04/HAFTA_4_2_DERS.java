package HAFTA_04;

import javax.swing.table.DefaultTableModel;

public class HAFTA_4_2_DERS extends javax.swing.JFrame {
    
    DefaultTableModel myModel;
    public HAFTA_4_2_DERS() {
        initComponents();
        myModel = (DefaultTableModel) jTable_Table.getModel();
        jTable_Table.setModel(myModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Table = new javax.swing.JTable();
        jFormattedTextField_telefon = new javax.swing.JFormattedTextField();
        jPasswordField_sifre = new javax.swing.JPasswordField();
        jTextField_adSoyad = new javax.swing.JTextField();
        jButton_ekle = new javax.swing.JButton();
        jButton_duzenle = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel_bilgilendirme = new javax.swing.JLabel();
        jButton_sil = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField_dogumTarihi = new javax.swing.JFormattedTextField();
        jButton_Temizle = new javax.swing.JButton();
        jTextField_email = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton_ProgressBarEtki = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPasswordField, JFormattedField, JTable");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"admin", "admin@gmail.com", "admin123", "555-555-5555", "01.01.1881"}
            },
            new String [] {
                "Ad Soyad", "E-Mail", "Şifre", "Telefon Numarası", "Doğum Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Table.setToolTipText("");
        jTable_Table.getTableHeader().setResizingAllowed(false);
        jTable_Table.getTableHeader().setReorderingAllowed(false);
        jTable_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Table);

        jFormattedTextField_telefon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefon Numarası", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        try {
            jFormattedTextField_telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_telefon.setText("");
        jFormattedTextField_telefon.setToolTipText("Telefon Numaranızı Giriniz! (555-555-5555)");
        jFormattedTextField_telefon.setPreferredSize(new java.awt.Dimension(64, 43));

        jPasswordField_sifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField_sifre.setToolTipText("Şifrenizi Giriniz!");
        jPasswordField_sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Şifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jTextField_adSoyad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_adSoyad.setToolTipText("İsminizi ve Soyisminizi Giriniz!");
        jTextField_adSoyad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ad Soyad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jButton_ekle.setText("Ekle");
        jButton_ekle.setFocusable(false);
        jButton_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ekleActionPerformed(evt);
            }
        });

        jButton_duzenle.setText("Düzenle");
        jButton_duzenle.setFocusable(false);
        jButton_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_duzenleActionPerformed(evt);
            }
        });

        jProgressBar.setStringPainted(true);

        jLabel_bilgilendirme.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_bilgilendirme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_sil.setText("Sil");
        jButton_sil.setFocusable(false);
        jButton_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_silActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4.HAFTA - SENIOR LEVEL");

        jFormattedTextField_dogumTarihi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Doğum Tarihi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        try {
            jFormattedTextField_dogumTarihi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton_Temizle.setText("Temizle");
        jButton_Temizle.setFocusable(false);
        jButton_Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TemizleActionPerformed(evt);
            }
        });

        jTextField_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "E-Mail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jButton_ProgressBarEtki.setText("Progress Bar Dene");
        jButton_ProgressBarEtki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProgressBarEtkiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField_telefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField_dogumTarihi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_adSoyad)
                            .addComponent(jPasswordField_sifre)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_bilgilendirme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_ProgressBarEtki, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_duzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Temizle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_bilgilendirme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_ProgressBarEtki)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField_dogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private boolean emailControl(String email) {
        for(int i = 0; i<myModel.getRowCount(); i++) {
            if(myModel.getValueAt(i, 1).equals(email)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean emailControl2(String email, int secilenSatir) {
        for(int i = 0; i<myModel.getRowCount(); i++) {
            if(myModel.getValueAt(i, 1).equals(email)) {
                if(i == secilenSatir) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private void clearComponents() {
        jTextField_adSoyad.setText(null);
        jTextField_email.setText(null);
        jPasswordField_sifre.setText(null);
        jFormattedTextField_telefon.setText(null);
        jFormattedTextField_dogumTarihi.setText(null);
    }
    
    private void ProgressBarEkle(int ms) {
        jProgressBar.setValue(0);
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException ex) {
                System.out.println("Hata!");
            }
            jProgressBar.setValue(i);
            jProgressBar.update(jProgressBar.getGraphics());
        }
    }
 
    private void jButton_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ekleActionPerformed
        String[] yeniSatir = new String[5];
        yeniSatir[0] = jTextField_adSoyad.getText();
        yeniSatir[1] = jTextField_email.getText();
        yeniSatir[2] = new String(jPasswordField_sifre.getPassword());
        yeniSatir[3] = jFormattedTextField_telefon.getText();
        yeniSatir[4] = jFormattedTextField_dogumTarihi.getText();
        
        boolean mecvutEmail = emailControl(yeniSatir[1]);
        if(!mecvutEmail) {
            if(yeniSatir[0].equals("") || yeniSatir[1].equals("") || yeniSatir[2].equals("") || yeniSatir[3].equals("   -   -    ") || yeniSatir[4].equals("  .  .    ")) {
                jLabel_bilgilendirme.setText("Tüm Bilgiler Girilmelidir, Boş Bırakılamaz!");
            } else {
                ProgressBarEkle(5);
                myModel.addRow(yeniSatir);
                jLabel_bilgilendirme.setText("Başarıyla Eklendi!");
            }
        } else {
            jLabel_bilgilendirme.setText("Mevcut E-Posta Adresi!");
        }
        
    }//GEN-LAST:event_jButton_ekleActionPerformed

    private void jButton_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_duzenleActionPerformed
        if(jTable_Table.getSelectedRow() >= 0) {
            String[] yeniSatir = new String[5];
            yeniSatir[0] = jTextField_adSoyad.getText();
            yeniSatir[1] = jTextField_email.getText();
            yeniSatir[2] = new String(jPasswordField_sifre.getPassword());
            yeniSatir[3] = jFormattedTextField_telefon.getText();
            yeniSatir[4] = jFormattedTextField_dogumTarihi.getText();

            int secilenSatir = jTable_Table.getSelectedRow();
            boolean mecvutEmail = emailControl2(yeniSatir[1],secilenSatir);

            if(!mecvutEmail) {
                ProgressBarEkle(5);
                myModel.setValueAt(yeniSatir[0],secilenSatir,0);
                myModel.setValueAt(yeniSatir[1],secilenSatir,1);
                myModel.setValueAt(yeniSatir[2],secilenSatir,2);
                myModel.setValueAt(yeniSatir[3],secilenSatir,3);
                myModel.setValueAt(yeniSatir[4],secilenSatir,4);
                jLabel_bilgilendirme.setText("Başarıyla Düzenlendi!");
                jTable_Table.clearSelection();
                clearComponents();
            } else {
                jLabel_bilgilendirme.setText("Mevcut E-Posta Adresi!");
            }
        } else {
            jLabel_bilgilendirme.setText("Düzenlenecek Satırı Seçiniz!");
        }

    }//GEN-LAST:event_jButton_duzenleActionPerformed

    private void jTable_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TableMouseClicked
        int secilenSatir = jTable_Table.getSelectedRow();
        jTextField_adSoyad.setText((String) jTable_Table.getValueAt(secilenSatir, 0));
        jTextField_email.setText((String) jTable_Table.getValueAt(secilenSatir, 1));
        jPasswordField_sifre.setText((String)jTable_Table.getValueAt(secilenSatir, 2));
        jFormattedTextField_telefon.setText((String)jTable_Table.getValueAt(secilenSatir, 3));
        jFormattedTextField_dogumTarihi.setText((String)jTable_Table.getValueAt(secilenSatir, 4));
    }//GEN-LAST:event_jTable_TableMouseClicked

    private void jButton_TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TemizleActionPerformed
        ProgressBarEkle(2);
        clearComponents();
        jLabel_bilgilendirme.setText("Başarıyla Temizlendi!");
        jTable_Table.clearSelection();
    }//GEN-LAST:event_jButton_TemizleActionPerformed

    private void jButton_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_silActionPerformed
        if(jTable_Table.getSelectedRowCount() > 0) {
            ProgressBarEkle(5);
            myModel.removeRow(jTable_Table.getSelectedRow());
            jLabel_bilgilendirme.setText("Başarıyla Silindi!");
            jTable_Table.clearSelection();
            clearComponents();
        } else {
            jLabel_bilgilendirme.setText("Silinecek Satırı Seçiniz!");
        }
    }//GEN-LAST:event_jButton_silActionPerformed

    private void jButton_ProgressBarEtkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProgressBarEtkiActionPerformed
        jLabel_bilgilendirme.setText("Progress Bar Deneniyor!");
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(50);
        jProgressBar.setValue(0);
        
        for(int i = 0; i < 50; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException!: " + ex.getMessage());
            }
            jProgressBar.setValue(jProgressBar.getValue() + 1);
            jProgressBar.setString("% " + 100 * i / 50);
            jProgressBar.update(jProgressBar.getGraphics());
        }
        jProgressBar.setString("İşlem Tamam.");
    }//GEN-LAST:event_jButton_ProgressBarEtkiActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_4_2_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_2_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_2_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_2_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_4_2_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ProgressBarEtki;
    private javax.swing.JButton jButton_Temizle;
    private javax.swing.JButton jButton_duzenle;
    private javax.swing.JButton jButton_ekle;
    private javax.swing.JButton jButton_sil;
    private javax.swing.JFormattedTextField jFormattedTextField_dogumTarihi;
    private javax.swing.JFormattedTextField jFormattedTextField_telefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_bilgilendirme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_sifre;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_Table;
    private javax.swing.JTextField jTextField_adSoyad;
    private javax.swing.JTextField jTextField_email;
    // End of variables declaration//GEN-END:variables

}
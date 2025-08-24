package HAFTA_04;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class HAFTA_4_3_ODEV extends javax.swing.JFrame {
    
    DefaultTableModel myModel;
    public HAFTA_4_3_ODEV() {
        initComponents();
        myModel = (DefaultTableModel) jTable_Table.getModel();
        jTable_Table.setModel(myModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jTextField_isim = new javax.swing.JTextField();
        jTextField_Soyisim = new javax.swing.JTextField();
        jFormattedTextField_Maas = new javax.swing.JFormattedTextField();
        jFormattedTextField_iseGirisTarihi = new javax.swing.JFormattedTextField();
        jPasswordField_Sifre = new javax.swing.JPasswordField();
        jButton_KayitEkle = new javax.swing.JButton();
        jFormattedTextField_AranacakTarih = new javax.swing.JFormattedTextField();
        jButton_Listele = new javax.swing.JButton();
        jLabel_bilgilendirme = new javax.swing.JLabel();
        jButton_Düzenle = new javax.swing.JButton();
        jButton_KayitSil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_List = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çalışanlar Ödevi");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_isim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_isim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "İsim", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jTextField_isim.setPreferredSize(new java.awt.Dimension(75, 45));

        jTextField_Soyisim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Soyisim", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jFormattedTextField_Maas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Maaş", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jFormattedTextField_iseGirisTarihi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "İşe Giriş Tarihi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        try {
            jFormattedTextField_iseGirisTarihi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPasswordField_Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Şifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jButton_KayitEkle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_KayitEkle.setText("Kayıt Ekle");
        jButton_KayitEkle.setFocusable(false);
        jButton_KayitEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KayitEkleActionPerformed(evt);
            }
        });

        jFormattedTextField_AranacakTarih.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tarih", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        try {
            jFormattedTextField_AranacakTarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton_Listele.setText("Listele");
        jButton_Listele.setFocusable(false);
        jButton_Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListeleActionPerformed(evt);
            }
        });

        jLabel_bilgilendirme.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_bilgilendirme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bilgilendirme.setText("BİLGİLENDİRME KISMI");

        jButton_Düzenle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Düzenle.setText("Düzenle");
        jButton_Düzenle.setFocusable(false);
        jButton_Düzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DüzenleActionPerformed(evt);
            }
        });

        jButton_KayitSil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_KayitSil.setText("Kayıt Sil");
        jButton_KayitSil.setFocusable(false);
        jButton_KayitSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KayitSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_isim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Soyisim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField_Maas)
                    .addComponent(jFormattedTextField_iseGirisTarihi)
                    .addComponent(jPasswordField_Sifre)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField_AranacakTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel_bilgilendirme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_KayitEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Düzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_KayitSil, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextField_Soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jFormattedTextField_Maas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jFormattedTextField_iseGirisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPasswordField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton_KayitSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Düzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_KayitEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField_AranacakTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Listele))
                .addGap(22, 22, 22)
                .addComponent(jLabel_bilgilendirme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jList_List);

        jTable_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"admin", "admin", "admin123", "99999999", "01.01.2001"}
            },
            new String [] {
                "Ad", "Soyad", "Şifre", "Maaş", "İşe Giriş Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Table.getTableHeader().setResizingAllowed(false);
        jTable_Table.getTableHeader().setReorderingAllowed(false);
        jTable_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void clearComponents() {
        jTextField_isim.setText(null);
        jTextField_Soyisim.setText(null);
        jPasswordField_Sifre.setText(null);
        jFormattedTextField_Maas.setText(null);
        jFormattedTextField_iseGirisTarihi.setText(null);
    }
    
    private void jButton_KayitEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KayitEkleActionPerformed
        String[] yeniSatir = new String[5];
        yeniSatir[0] = jTextField_isim.getText();
        yeniSatir[1] = jTextField_Soyisim.getText();
        yeniSatir[2] = new String(jPasswordField_Sifre.getPassword());
        yeniSatir[3] = jFormattedTextField_Maas.getText();
        yeniSatir[4] = jFormattedTextField_iseGirisTarihi.getText();
        if(yeniSatir[0].equals("") || yeniSatir[1].equals("")) {
            jLabel_bilgilendirme.setText("İsim ya da Soyisim Boş Bırakılamaz!");
        } else {
            jLabel_bilgilendirme.setText("Başarıyla Eklendi!");
            myModel.addRow(yeniSatir);
        }
        clearComponents();
    }//GEN-LAST:event_jButton_KayitEkleActionPerformed

    private void jTable_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TableMouseClicked
        int secilenSatir = jTable_Table.getSelectedRow();
        jTextField_isim.setText((String) jTable_Table.getValueAt(secilenSatir, 0));
        jTextField_Soyisim.setText((String) jTable_Table.getValueAt(secilenSatir, 1));
        jPasswordField_Sifre.setText((String)jTable_Table.getValueAt(secilenSatir, 2));
        jFormattedTextField_Maas.setText((String)jTable_Table.getValueAt(secilenSatir, 3));
        jFormattedTextField_iseGirisTarihi.setText((String)jTable_Table.getValueAt(secilenSatir, 4));
    }//GEN-LAST:event_jTable_TableMouseClicked

    private void jButton_DüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DüzenleActionPerformed
        if(jTable_Table.getSelectedRow() >= 0) {
            String[] yeniSatir = new String[5];
            yeniSatir[0] = jTextField_isim.getText();
            yeniSatir[1] = jTextField_Soyisim.getText();
            yeniSatir[2] = new String(jPasswordField_Sifre.getPassword());
            yeniSatir[3] = jFormattedTextField_Maas.getText();
            yeniSatir[4] = jFormattedTextField_iseGirisTarihi.getText();
            
            int secilenSatir = jTable_Table.getSelectedRow();

            myModel.setValueAt(yeniSatir[0],secilenSatir,0);
            myModel.setValueAt(yeniSatir[1],secilenSatir,1);
            myModel.setValueAt(yeniSatir[2],secilenSatir,2);
            myModel.setValueAt(yeniSatir[3],secilenSatir,3);
            myModel.setValueAt(yeniSatir[4],secilenSatir,4);
            jLabel_bilgilendirme.setText("Başarıyla Düzenlendi!");
            jTable_Table.clearSelection();
            clearComponents();
            
        } else {
            jLabel_bilgilendirme.setText("Düzenlenecek Satırı Seçiniz!");
        }
    }//GEN-LAST:event_jButton_DüzenleActionPerformed

    private void jButton_KayitSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KayitSilActionPerformed
        if(jTable_Table.getSelectedRowCount() > 0) {
            myModel.removeRow(jTable_Table.getSelectedRow());
            jLabel_bilgilendirme.setText("Başarıyla Silindi!");
            jTable_Table.clearSelection();
            clearComponents();
        } else {
            jLabel_bilgilendirme.setText("Silinecek Satırı Seçiniz!");
        }
    }//GEN-LAST:event_jButton_KayitSilActionPerformed
    
    ListModel listModel;
    DefaultListModel myListModel;
    
    private void modelGetir() {                                         
        listModel = jList_List.getModel();
        myListModel = new DefaultListModel();
        
        for (int i = 0; i < listModel.getSize(); i++) {
            myListModel.addElement(listModel.getElementAt(i));
        }
    }
    private void jButton_ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListeleActionPerformed
        if (myListModel == null) {
            myListModel = new DefaultListModel<>();
        } else {
            myListModel.clear(); // Listeyi temizle
        }
        
        int rowCount = jTable_Table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            if(jFormattedTextField_AranacakTarih.getText().equals(jTable_Table.getValueAt(i, 4))) {
                modelGetir();
                String yazdir = "" + jTable_Table.getValueAt(i, 0) + " " + jTable_Table.getValueAt(i, 1);
                myListModel.addElement(yazdir);
                jList_List.setModel(myListModel);
            }
        }
        jLabel_bilgilendirme.setText("Listelendi!");
    }//GEN-LAST:event_jButton_ListeleActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_4_3_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_3_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_3_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_4_3_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_4_3_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Düzenle;
    private javax.swing.JButton jButton_KayitEkle;
    private javax.swing.JButton jButton_KayitSil;
    private javax.swing.JButton jButton_Listele;
    private javax.swing.JFormattedTextField jFormattedTextField_AranacakTarih;
    private javax.swing.JFormattedTextField jFormattedTextField_Maas;
    private javax.swing.JFormattedTextField jFormattedTextField_iseGirisTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_bilgilendirme;
    private javax.swing.JList<String> jList_List;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_Sifre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Table;
    private javax.swing.JTextField jTextField_Soyisim;
    private javax.swing.JTextField jTextField_isim;
    // End of variables declaration//GEN-END:variables

}
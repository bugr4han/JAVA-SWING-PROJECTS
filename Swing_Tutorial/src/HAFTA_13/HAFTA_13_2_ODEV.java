package HAFTA_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HAFTA_13_2_ODEV extends javax.swing.JFrame {
    public HAFTA_13_2_ODEV() {
        initComponents();
    }
    
    public Connection myAccessConnection() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String strdatabase = "jdbc:ucanaccess://Dosyalar/calisanlar.accdb";
            con = DriverManager.getConnection(strdatabase);
        } catch(ClassNotFoundException | SQLException e) {        
            JOptionPane.showMessageDialog(null, e.toString(), "Veri tabanı bağlantı hatası", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Arama = new javax.swing.JTextField();
        jTextField_Ad = new javax.swing.JTextField();
        jTextField_Soyad = new javax.swing.JTextField();
        jTextField_Departman = new javax.swing.JTextField();
        jTextField_Maas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Duzenle = new javax.swing.JButton();
        jButton_Sil = new javax.swing.JButton();
        jButton_ZamYap = new javax.swing.JButton();
        jButton_Ekle = new javax.swing.JButton();
        jLabel_Bilgilendirme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("13.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_Arama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Arama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Arama.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ARAMA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jTextField_Arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_AramaKeyReleased(evt);
            }
        });

        jTextField_Ad.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Ad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jTextField_Soyad.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Soyad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SOYAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jTextField_Departman.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Departman.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DEPARTMAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jTextField_Maas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Maas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MAAŞ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD", "SOYAD", "DEPARTMAN", "MAAŞ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton_Duzenle.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Duzenle.setText("DÜZENLE");
        jButton_Duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DuzenleActionPerformed(evt);
            }
        });

        jButton_Sil.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Sil.setText("SİL");
        jButton_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SilActionPerformed(evt);
            }
        });

        jButton_ZamYap.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_ZamYap.setText("ZAM YAP");
        jButton_ZamYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ZamYapActionPerformed(evt);
            }
        });

        jButton_Ekle.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Ekle.setText("EKLE");
        jButton_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EkleActionPerformed(evt);
            }
        });

        jLabel_Bilgilendirme.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Bilgilendirme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_Bilgilendirme.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Bilgilendirme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Bilgilendirme.setText("BİLGİLENDİRME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jTextField_Arama)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Maas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_Departman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addComponent(jTextField_Soyad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Ad, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Duzenle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jButton_Sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_ZamYap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel_Bilgilendirme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Arama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Departman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Maas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_ZamYap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Bilgilendirme)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
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
        //Tüm kayıtları gösterme
        try {      
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM calisanlar");
            rs.next(); // ResultSet'in ilk satırına geçiş yapılıyor
            int rowCount = rs.getInt("satirsayi");
            rs.close();  // İlk ResultSet'i kapat

            // İkinci sorgu: Kişi listesini al
            rs = stmt.executeQuery("SELECT * FROM calisanlar");
            Object[][] verilerim = new Object[rowCount][5];
            int sayac = 0;
            while (rs.next()) {
                verilerim[sayac][0] = rs.getString("ID");
                verilerim[sayac][1] = rs.getString("AD");
                verilerim[sayac][2] = rs.getString("SOYAD");
                verilerim[sayac][3] = rs.getString("DEPARTMAN");
                verilerim[sayac][4] = rs.getString("MAAS");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat

            stmt.close();  // Statement'i kapat (Sorguyu Kapatıyoruz)
            con.close();   // Bağlantıyı kapat

            // Verileri tabloya aktar
            String[] tablobaslik = new String[] { "ID", "AD", "SOYAD", "DEPARTMAN", "MAAŞ"};
            jTable1.setModel(new DefaultTableModel(verilerim, tablobaslik));
            jLabel_Bilgilendirme.setText("Veriler Yazdırıldı!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EkleActionPerformed

    private void jButton_DuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DuzenleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DuzenleActionPerformed

    private void jButton_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SilActionPerformed

    private void jButton_ZamYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ZamYapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ZamYapActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTextField_AramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AramaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AramaKeyReleased
   
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
            java.util.logging.Logger.getLogger(HAFTA_13_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_13_2_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Duzenle;
    private javax.swing.JButton jButton_Ekle;
    private javax.swing.JButton jButton_Sil;
    private javax.swing.JButton jButton_ZamYap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Bilgilendirme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Ad;
    private javax.swing.JTextField jTextField_Arama;
    private javax.swing.JTextField jTextField_Departman;
    private javax.swing.JTextField jTextField_Maas;
    private javax.swing.JTextField jTextField_Soyad;
    // End of variables declaration//GEN-END:variables

}

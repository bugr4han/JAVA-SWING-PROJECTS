package HAFTA_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HAFTA_12_1_ODEV extends javax.swing.JFrame {
    public HAFTA_12_1_ODEV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton_TumKayitlariGetir = new javax.swing.JButton();
        jButton_GecenleriListele = new javax.swing.JButton();
        jButton_CinsiyeteGoreGetir = new javax.swing.JButton();
        jRadioButton_Erkek = new javax.swing.JRadioButton();
        jRadioButton_Kadin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("12.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("KAYITLAR");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("İŞLEMLER");
        jLabel3.setToolTipText("");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jButton_TumKayitlariGetir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_TumKayitlariGetir.setText("TÜM KAYITLARI GETİR");
        jButton_TumKayitlariGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TumKayitlariGetirActionPerformed(evt);
            }
        });

        jButton_GecenleriListele.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_GecenleriListele.setText("DERSİ GEÇENLERİ LİSTELE");
        jButton_GecenleriListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GecenleriListeleActionPerformed(evt);
            }
        });

        jButton_CinsiyeteGoreGetir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_CinsiyeteGoreGetir.setText("CİNSİYETE GÖRE GETİR");
        jButton_CinsiyeteGoreGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CinsiyeteGoreGetirActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Erkek);
        jRadioButton_Erkek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton_Erkek.setText("ERKEK");

        buttonGroup1.add(jRadioButton_Kadin);
        jRadioButton_Kadin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton_Kadin.setText("KADIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jButton_TumKayitlariGetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_GecenleriListele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_CinsiyeteGoreGetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioButton_Erkek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Kadin)
                                .addGap(73, 73, 73)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_TumKayitlariGetir)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_GecenleriListele)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_CinsiyeteGoreGetir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Kadin)
                            .addComponent(jRadioButton_Erkek)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
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
    
    public Connection myAccessConnection() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String strdatabase = "jdbc:ucanaccess://Dosyalar/NO.accdb";
            con = DriverManager.getConnection(strdatabase);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Veri tabanı bağlantı hatası", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    private void jButton_TumKayitlariGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TumKayitlariGetirActionPerformed
        try {
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
           
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM OGRENCI");
            rs.next();
            int rowCount = rs.getInt("satirsayi");
            rs.close(); // İlk ResultSet'i kapat
            
            // İkinci sorgu
            rs = stmt.executeQuery("SELECT * FROM OGRENCI");
            Object[][] kayit = new Object[rowCount][4];
            int sayac = 0;
            while (rs.next()) {
                kayit[sayac][0] = rs.getString("AD");
                kayit[sayac][1] = rs.getString("SOYAD");
                kayit[sayac][2] = rs.getString("CINSIYET");
                kayit[sayac][3] = rs.getInt("ORTALAMA");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat

            stmt.close();  // Statement'i kapat (Sorguyu Kapatıyoruz)
            con.close();   // Bağlantıyı kapat

            // Verileri tabloya aktar
            String[] tablobaslik = new String[]{"AD", "SOYAD", "CİNSİYET", "ORTALAMA"};
            jTable1.setModel(new javax.swing.table.DefaultTableModel(kayit,tablobaslik));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton_TumKayitlariGetirActionPerformed

    private void jButton_GecenleriListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GecenleriListeleActionPerformed
       try {
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM OGRENCI");
            rs.next();
            int rowCount = rs.getInt("satirsayi");
            rs.close();
            
            // İkinci sorgu
            rs = stmt.executeQuery("SELECT * FROM OGRENCI WHERE ORTALAMA > 60");
            Object[][] kayit = new Object[rowCount][4];
            
            int sayac = 0;
            while (rs.next()) {
                kayit[sayac][0] = rs.getString("AD");
                kayit[sayac][1] = rs.getString("SOYAD");
                kayit[sayac][2] = rs.getString("CINSIYET");
                kayit[sayac][3] = rs.getInt("ORTALAMA");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat

            stmt.close();  // Statement'i kapat (Sorguyu Kapatıyoruz)
            con.close();   // Bağlantıyı kapat

            // Verileri tabloya aktar
            String[] tablobaslik = new String[]{"AD", "SOYAD", "CİNSİYET", "ORTALAMA"};
            jTable1.setModel(new javax.swing.table.DefaultTableModel(kayit,tablobaslik));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton_GecenleriListeleActionPerformed

    private void jButton_CinsiyeteGoreGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CinsiyeteGoreGetirActionPerformed
        String cinsiyetText;
        if (jRadioButton_Erkek.isSelected()) {
            cinsiyetText = jRadioButton_Erkek.getText();
        } else if (jRadioButton_Kadin.isSelected()) {
            cinsiyetText = jRadioButton_Kadin.getText();
        } else {
            return;
        }
        
        try {
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM OGRENCI");
            rs.next();
            int rowCount = rs.getInt("satirsayi");
            rs.close();
            
            // İkinci sorgu
            rs = stmt.executeQuery("SELECT * FROM OGRENCI WHERE CINSIYET = " + "'" + cinsiyetText + "'");
            Object[][] kayit = new Object[rowCount][4];
            int sayac = 0;

            while (rs.next()) {
                kayit[sayac][0] = rs.getString("AD");
                kayit[sayac][1] = rs.getString("SOYAD");
                kayit[sayac][2] = rs.getString("CINSIYET");
                kayit[sayac][3] = rs.getInt("ORTALAMA");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat

            stmt.close();  // Statement'i kapat (Sorguyu Kapatıyoruz)
            con.close();   // Bağlantıyı kapat

            // Verileri tabloya aktar
            String[] tablobaslik = new String[]{"AD", "SOYAD", "CİNSİYET", "ORTALAMA"};
            jTable1.setModel(new javax.swing.table.DefaultTableModel(kayit,tablobaslik));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton_CinsiyeteGoreGetirActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_12_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_12_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_12_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_12_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_12_1_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_CinsiyeteGoreGetir;
    private javax.swing.JButton jButton_GecenleriListele;
    private javax.swing.JButton jButton_TumKayitlariGetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_Erkek;
    private javax.swing.JRadioButton jRadioButton_Kadin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

package HAFTA_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HAFTA_13_0_DERS extends javax.swing.JFrame {
    public HAFTA_13_0_DERS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_Sil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_TumKayitlariGoster = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton_YastanBuyukleriGoster = new javax.swing.JButton();

        jMenuItem_Sil.setText("SİL");
        jMenuItem_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_Sil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("13.HAFTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        jButton_TumKayitlariGoster.setText("Tüm Kayıtları Göster");
        jButton_TumKayitlariGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TumKayitlariGosterActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Yaş Giriniz!", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jButton_YastanBuyukleriGoster.setText("Girilen Yaş Değerinden Büyük Olanları Listele");
        jButton_YastanBuyukleriGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YastanBuyukleriGosterActionPerformed(evt);
            }
        });

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_TumKayitlariGoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jButton_YastanBuyukleriGoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_TumKayitlariGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_YastanBuyukleriGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
    
    public Connection myAccessConnection() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String strdatabase = "jdbc:ucanaccess://Dosyalar/veritabani2021.accdb";
            con = DriverManager.getConnection(strdatabase);
        } catch(ClassNotFoundException | SQLException e) {        
            JOptionPane.showMessageDialog(null, e.toString(), "Veri tabanı bağlantı hatası", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    private void jButton_TumKayitlariGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TumKayitlariGosterActionPerformed
        //Tüm kayıtları gösterme
        try {      
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM KISI");
            rs.next(); // bir sonraki kaydı getirir (ilk çalıştırmada tablonun ilk kaydını göster)
            int rowCount = rs.getInt("satirsayi");
            rs.close();  // İlk ResultSet'i kapat

            // İkinci sorgu: Kişi listesini al
            rs = stmt.executeQuery("SELECT * FROM KISI");
            Object[][] verilerim = new Object[rowCount][3];
            int sayac = 0;
            while (rs.next()) {
                verilerim[sayac][0] = sayac + 1;
                verilerim[sayac][1] = rs.getString("AD");
                verilerim[sayac][2] = rs.getString("YAS");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat

            stmt.close();  // Statement'i kapat
            con.close();   // Bağlantıyı kapat

            // Verileri tabloya aktar
            String[] tablobaslik = new String[] { "ID", "Ad Soyad", "Yaş" };
            jTable1.setModel(new DefaultTableModel(verilerim, tablobaslik)); 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_jButton_TumKayitlariGosterActionPerformed

    private void jButton_YastanBuyukleriGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YastanBuyukleriGosterActionPerformed
        //Girilen yaş sınırından büyük olanları göster
        try {      
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
           
            // İlk sorgu: Kişi sayısını bul
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM KISI where YAS > " + jTextField1.getText());
            rs.next(); // ResultSet'in ilk satırına geçiş yapılıyor
            int rowCount = rs.getInt("satirsayi") ;
            rs.close() ;// İlk ResultSet'i kapat
            
            // İkinci sorgu: Kişi listesini al
            rs = stmt.executeQuery("SELECT * FROM KISI where YAS > " + jTextField1.getText());
            Object[][] verilerim = new Object [rowCount][3];
            int sayac = 0;
            while ( rs.next() ) {
                verilerim[sayac][0] = sayac + 1;
                verilerim[sayac][1] = rs.getString("AD");
                verilerim[sayac][2] = rs.getString("YAS");
                sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat
            
            stmt.close();  // Statement'i kapat
            con.close();   // Bağlantıyı kapat
            
            // Verileri tabloya aktar
            String[] tablobaslik = new String [] { "ID", "Ad Soyad", "Yaş" };
            jTable1.setModel(new DefaultTableModel(verilerim, tablobaslik)); 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_jButton_YastanBuyukleriGosterActionPerformed

    private void jMenuItem_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SilActionPerformed
        //Popup menü ile Silme
        try {
            // Bağlantıyı ve sorguyu oluştur
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            if (jTable1.getSelectedRow() == -1) {
                return;
            }
            int secilisatir = jTable1.getSelectedRow();
            String ad = String.valueOf(jTable1.getValueAt(secilisatir, 1));
            System.out.println(ad);
            
            // İlk Sorgu
            stmt.execute("DELETE FROM KISI where AD = '" + ad + "'");
            rs = stmt.executeQuery("SELECT COUNT(*) AS satirsayi FROM KISI"); //tablodaki kayıtlar (kayıt sayısı) getiriliyor.
            rs.next(); // bir sonraki kaydı getirir (ilk çalıştırmada tablonun ilk kaydını göster)
            // rs.first(); ->  ilk kayıta git   |   rs.previous();  ->  bir önceki kayda git 
            // rs.last();  ->  son kayıta git   |   rs.absolute(3); ->  3. kayda git
            int iCount = rs.getInt("satirsayi") ; //satır sayısını al
            rs.close() ;// İlk ResultSet'i kapat   
            
            // İkinci Sorgu
            rs = stmt.executeQuery("SELECT * FROM KISI"); //tabloadaki tüm verileri al    
            Object[][] obj= new Object [iCount][3];//tablodaki satır sayısı kadar veriyi ve verilere ait 3 sütun bilgisini al
            int sayac = 0;
            while ( rs.next() ) {
                    obj[sayac][0] = sayac + 1;
                    obj[sayac][1] = rs.getString("AD");
                    obj[sayac][2] = rs.getString("YAS");
                    sayac++;
            }
            rs.close();  // İkinci ResultSet'i kapat
            
            stmt.close();  // Statement'i kapat (Sorguyu Kapatıyoruz)
            con.close();   // Bağlantıyı kapat
            
            // Verileri tabloya aktar
            String[] tablobaslik = new String [] { "ID", "Ad Soyad", "Yaş" };
            jTable1.setModel(new DefaultTableModel(obj, tablobaslik));
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_jMenuItem_SilActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_13_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_13_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_13_0_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_TumKayitlariGoster;
    private javax.swing.JButton jButton_YastanBuyukleriGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem_Sil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}

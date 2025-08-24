package HAFTA_03;

import java.util.ArrayList;
import java.util.List;

public class HAFTA_3_1_ODEV extends javax.swing.JFrame {
    public HAFTA_3_1_ODEV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jButton_filmSec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Sinemalar = new javax.swing.JList<>();
        jComboBox_Yillar = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton_Yerli = new javax.swing.JRadioButton();
        jRadioButton_Yabanci = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox_Gerilim = new javax.swing.JCheckBox();
        jCheckBox_Romantik = new javax.swing.JCheckBox();
        jCheckBox_RomantikKomedi = new javax.swing.JCheckBox();
        jCheckBox_Komedi = new javax.swing.JCheckBox();
        jCheckBox_Drama = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinema Ödevi");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton_filmSec.setText("Film Seç");
        jButton_filmSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_filmSecActionPerformed(evt);
            }
        });

        jList_Sinemalar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SİNEMA 1", "SİNEMA 2", "SİNEMA 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList_Sinemalar);

        jComboBox_Yillar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010 - 2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        jComboBox_Yillar.setSelectedIndex(9);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        buttonGroup1.add(jRadioButton_Yerli);
        jRadioButton_Yerli.setText("Yerli");

        buttonGroup1.add(jRadioButton_Yabanci);
        jRadioButton_Yabanci.setText("Yabancı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton_Yabanci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRadioButton_Yerli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButton_Yerli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Yabanci)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox_Gerilim.setText("Gerilim");

        jCheckBox_Romantik.setText("Romantik");

        jCheckBox_RomantikKomedi.setText("Romantik Komedi");

        jCheckBox_Komedi.setText("Komedi");

        jCheckBox_Drama.setText("Dram");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckBox_Gerilim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_Romantik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_RomantikKomedi, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jCheckBox_Komedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_Drama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCheckBox_Gerilim)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Romantik)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_RomantikKomedi)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Komedi)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Drama)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Film Seçimi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_Yillar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton_filmSec, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Yillar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_filmSec))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_filmSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_filmSecActionPerformed
        String secilenFilmTuru = "";
        if (jRadioButton_Yerli.isSelected()) {
            secilenFilmTuru = "Yerli";
        } else if (jRadioButton_Yabanci.isSelected()) {
            secilenFilmTuru = "Yabancı";
        }        
        
        List<String> turler = new ArrayList<>();
        if (jCheckBox_Gerilim.isSelected())  
            turler.add("Gerilim");
        if (jCheckBox_Romantik.isSelected()) 
            turler.add("Romantik");
        if (jCheckBox_RomantikKomedi.isSelected()) 
            turler.add("Romantik Komedi");
        if (jCheckBox_Komedi.isSelected())   
            turler.add("Komedi");
        if (jCheckBox_Drama.isSelected())     
            turler.add("Drama");
        String secilenTurler = String.join(" + ", turler);
        
        int[] a = jList_Sinemalar.getSelectedIndices();
        for (int index : a) {
            System.out.println("Listeden Secilen index: " + index);
        }
        System.out.println(secilenFilmTuru + " / " + secilenTurler + " / " + jComboBox_Yillar.getSelectedItem() 
        + " / " + jList_Sinemalar.getSelectedValuesList());

    }//GEN-LAST:event_jButton_filmSecActionPerformed

/*  NURDAN HOCAMIN KODLARI:
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //System.out.println(buttonGroup1.getSelection().getActionCommand());
        String orijin = "";
        String tercih = "";
        String sonuc = "";
        
        //Köken seçimi
        if (jRadioButton1.isSelected()) {
            orijin = "YERLİ";
        }
        if (jRadioButton2.isSelected()) {
            orijin = "YABANCI";
        }
        //Tür seçimi
        if (jCheckBox1.isSelected()) {
            tercih = "GERİLİM";
        }
        if (jCheckBox2.isSelected()) {
            tercih = tercih + " + " + "ROMANTİK";
        }
        if (jCheckBox3.isSelected()) {
            tercih = tercih + " + " + "ROMANTİK KOMEDİ";
        }
        if (jCheckBox4.isSelected()) {
            tercih = tercih + " + " + "KOMEDİ";
        }
        if (jCheckBox5.isSelected()) {
            tercih = tercih + " + " + "DRAM";
        }
        //Yıl seçimi
        Object yil = jComboBox1.getSelectedItem();

        //Sinema salonu listesi
        int sinema_liste[] = jList1.getSelectedIndices();
        for (int sayi = 0; sayi < sinema_liste.length; sayi++) {
            System.out.println("Listeden seçilen elemanın index no:" + " " + String.valueOf(sinema_liste[sayi]));
        }

        //Sinema salonu seçimi
        List liste = jList1.getSelectedValuesList();
        
        //Seçme sonuçlarının birleştirilerek, ekrana yazılması
        sonuc = orijin + " / " + tercih + " / " + yil + " / " + liste;
        System.out.println(sonuc);
    } 
*/

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
            java.util.logging.Logger.getLogger(HAFTA_3_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_3_1_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_filmSec;
    private javax.swing.JCheckBox jCheckBox_Drama;
    private javax.swing.JCheckBox jCheckBox_Gerilim;
    private javax.swing.JCheckBox jCheckBox_Komedi;
    private javax.swing.JCheckBox jCheckBox_Romantik;
    private javax.swing.JCheckBox jCheckBox_RomantikKomedi;
    private javax.swing.JComboBox<String> jComboBox_Yillar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList_Sinemalar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_Yabanci;
    private javax.swing.JRadioButton jRadioButton_Yerli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
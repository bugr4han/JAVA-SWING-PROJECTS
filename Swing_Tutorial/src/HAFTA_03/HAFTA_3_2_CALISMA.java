package HAFTA_03;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class HAFTA_3_2_CALISMA extends javax.swing.JFrame {

    public HAFTA_3_2_CALISMA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox_Marka = new javax.swing.JCheckBox();
        jCheckBox_Hafiza = new javax.swing.JCheckBox();
        jCheckBox_Kamera = new javax.swing.JCheckBox();
        jCheckBox_EkranBoyutu = new javax.swing.JCheckBox();
        jCheckBox_Fiyat = new javax.swing.JCheckBox();
        jComboBox_Telefonlar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton_ListeyeEkle = new javax.swing.JRadioButton();
        jRadioButton_YeniTelefonEkle = new javax.swing.JRadioButton();
        jButton_Uygula = new javax.swing.JButton();
        jTextField_yeniGiris = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Liste = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Telefon Ödevi");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox_Marka.setText("Marka");

        jCheckBox_Hafiza.setText("Hafıza");

        jCheckBox_Kamera.setText("Kamera");

        jCheckBox_EkranBoyutu.setText("Ekran Boyutu");

        jCheckBox_Fiyat.setText("Fiyat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_Marka)
                    .addComponent(jCheckBox_Hafiza)
                    .addComponent(jCheckBox_Kamera)
                    .addComponent(jCheckBox_EkranBoyutu)
                    .addComponent(jCheckBox_Fiyat))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Marka)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Hafiza)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Kamera)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_EkranBoyutu)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox_Fiyat)
                .addGap(0, 0, 0))
        );

        jComboBox_Telefonlar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple 64GB 12MP 6.1\" 5000", "Huawei 128GB 48MP 6.4\" 4000", "Samsung 128GB 64MP 6.7\" 3500", "Vestel 128GB 12MP 6.1\" 3000", "Samsung 128GB 12MP 6.7\" 4500", "Huawei 64GB 12MP 6.4\" 2500" }));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonGroup1.add(jRadioButton_ListeyeEkle);
        jRadioButton_ListeyeEkle.setText("Listeye Ekle");

        buttonGroup1.add(jRadioButton_YeniTelefonEkle);
        jRadioButton_YeniTelefonEkle.setText("Yeni Telefon Ekle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_YeniTelefonEkle)
                    .addComponent(jRadioButton_ListeyeEkle))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jRadioButton_ListeyeEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_YeniTelefonEkle)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton_Uygula.setText("Uygula");
        jButton_Uygula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UygulaActionPerformed(evt);
            }
        });

        jTextField_yeniGiris.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(jList_Liste);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Uygula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_yeniGiris)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Telefonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox_Telefonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_yeniGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Uygula)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void jButton_UygulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UygulaActionPerformed
        String telefon = "";
        telefon=(String)jComboBox_Telefonlar.getSelectedItem();
        String[] bltelefon=telefon.split(" ");
        String eklenecek= "";
        if (jRadioButton_ListeyeEkle.isSelected()==true){
            if (jCheckBox_Marka.isSelected()==true){
                eklenecek=bltelefon[0];
            }
            if (jCheckBox_Hafiza.isSelected()==true){
                eklenecek=eklenecek + " " + bltelefon[1];
            }
            if (jCheckBox_Kamera.isSelected()==true){
                eklenecek=eklenecek + " " + bltelefon[2];
            }
            if (jCheckBox_EkranBoyutu.isSelected()==true){
                eklenecek=eklenecek + " " + bltelefon[3];
            }
            if (jCheckBox_Fiyat.isSelected()==true){
                eklenecek=eklenecek + " " + bltelefon[4];
            }
            String[] bleklenecek=eklenecek.split(" ");
            DefaultListModel demoList = new DefaultListModel();
            JList jList1 = new JList(demoList);
            for (int i = 0; i < bleklenecek.length; i++) {
                demoList.add(i, bleklenecek[i]);
            }
        }
        DefaultListModel myModel = new DefaultListModel();
        jList_Liste.setModel(myModel);
        myModel.addElement(eklenecek);
                
        if (jRadioButton_YeniTelefonEkle.isSelected()==true){
            String neweklenecek="";
            String newtelefon =jTextField_yeniGiris.getText();
            String[] blnewtelefon=newtelefon.split(" ");
            jComboBox_Telefonlar.addItem(newtelefon);
        }
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
            java.util.logging.Logger.getLogger(HAFTA_3_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_3_2_CALISMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_3_2_CALISMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Uygula;
    private javax.swing.JCheckBox jCheckBox_EkranBoyutu;
    private javax.swing.JCheckBox jCheckBox_Fiyat;
    private javax.swing.JCheckBox jCheckBox_Hafiza;
    private javax.swing.JCheckBox jCheckBox_Kamera;
    private javax.swing.JCheckBox jCheckBox_Marka;
    private javax.swing.JComboBox<String> jComboBox_Telefonlar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList_Liste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_ListeyeEkle;
    private javax.swing.JRadioButton jRadioButton_YeniTelefonEkle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_yeniGiris;
    // End of variables declaration//GEN-END:variables

}
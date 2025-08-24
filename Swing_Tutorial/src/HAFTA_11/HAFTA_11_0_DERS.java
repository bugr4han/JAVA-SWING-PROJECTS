package HAFTA_11;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HAFTA_11_0_DERS extends javax.swing.JFrame {
    public HAFTA_11_0_DERS() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Baslik = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_LabelVeCheckBoxDegistir = new javax.swing.JButton();
        jButton_PanelUzerindeLabelDegistir = new javax.swing.JButton();
        jButton_NameAdDegistir = new javax.swing.JButton();
        jButton_PaneldeLabelOlustur = new javax.swing.JButton();
        jButton_PaneldeNameDnmkLabelDegistir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_Baslik.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel_Baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Baslik.setText("11.HAFTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton_LabelVeCheckBoxDegistir.setText("Frame Üzerindeki Label ve CheckBoxları Değiştir");
        jButton_LabelVeCheckBoxDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LabelVeCheckBoxDegistirActionPerformed(evt);
            }
        });

        jButton_PanelUzerindeLabelDegistir.setText("Panel Üzerindeki Labelları Değiştir");
        jButton_PanelUzerindeLabelDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PanelUzerindeLabelDegistirActionPerformed(evt);
            }
        });

        jButton_NameAdDegistir.setText("Name:(\"ad\") Olan TextField İçeriğini Değiştir");
        jButton_NameAdDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NameAdDegistirActionPerformed(evt);
            }
        });

        jButton_PaneldeLabelOlustur.setText("Panelde Dinamik Label Oluştur");
        jButton_PaneldeLabelOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PaneldeLabelOlusturActionPerformed(evt);
            }
        });

        jButton_PaneldeNameDnmkLabelDegistir.setText("Panelde Name:(\"Dnmk 1\") Olan Label Değiştir");
        jButton_PaneldeNameDnmkLabelDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PaneldeNameDnmkLabelDegistirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Label 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Label 2");

        jCheckBox1.setText("CheckBox");

        jRadioButton1.setText("RadioButton");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Label Set", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TextField Set", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField1.setText("jTextField1");
        jTextField1.setName("ad"); // NOI18N

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dinamik", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        jButton6.setText("Buton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Baslik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_LabelVeCheckBoxDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_PanelUzerindeLabelDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_NameAdDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_PaneldeLabelOlustur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_PaneldeNameDnmkLabelDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_Baslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LabelVeCheckBoxDegistir)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jRadioButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_PanelUzerindeLabelDegistir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_NameAdDegistir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_PaneldeLabelOlustur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_PaneldeNameDnmkLabelDegistir))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LabelVeCheckBoxDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LabelVeCheckBoxDegistirActionPerformed
        //Sadece ana Frame üstündeki labelların ismini değiştirir
        Component[] c = this.getContentPane().getComponents(); // çalışılan JFrame üstündeki tüm komponentleri diziye at
        for (int i=0; i<c.length; i++) {
            if (c[i] instanceof JLabel) { //c dizisindeki elemanlardan JLabel sınıfından olanlar için yap 
                JLabel tmp = (JLabel) c[i];
                if(tmp != jLabel_Baslik) {
                    tmp.setForeground(Color.BLUE);
                    tmp.setText("Frame Label");
                }
            } else if (c[i] instanceof JCheckBox) { //c dizisindeki elemanlardan JCheckBox sınıfından olanlar için yap
                JCheckBox tmp2 = (JCheckBox) c[i];
                tmp2.setForeground(Color.GREEN);
                tmp2.setText("New CheckBox");
            }
        }
    }//GEN-LAST:event_jButton_LabelVeCheckBoxDegistirActionPerformed

    private void jButton_PanelUzerindeLabelDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PanelUzerindeLabelDegistirActionPerformed
        //Frame üstündeki Panelde bulunan labelların ismini değiştirir
        Component[] c = jPanel1.getComponents();
        for (int i=0; i<c.length; i++)
            if (c[i] instanceof JLabel) {
                JLabel tmp = (JLabel) c[i];
                tmp.setForeground(Color.RED);
                tmp.setText("Panel Label");
            }
    }//GEN-LAST:event_jButton_PanelUzerindeLabelDegistirActionPerformed

    private void jButton_NameAdDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NameAdDegistirActionPerformed
        //Name=ad özelliğindeki textfield içeriğini değiştirir.
        Component[] c = jPanel2.getComponents();
        for (int i=0; i<c.length; i++)
            if (c[i].getName() != null)
                if (c[i] instanceof JTextField && c[i].getName().equals("ad")) {
                     JTextField tmp = (JTextField) c[i];
                     tmp.setForeground(Color.RED);
                     tmp.setText("Gorsel");
                }
    }//GEN-LAST:event_jButton_NameAdDegistirActionPerformed

    private void jButton_PaneldeLabelOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PaneldeLabelOlusturActionPerformed
        //Paneli temizleyip üstüne dinamik Label ekler
        jPanel3.removeAll(); // Panel içerisindeki mevcut bileşenler kaldırılıyor.
        jPanel3.setPreferredSize(jPanel3.getSize()); // Panel2'in mevcut boyutu korunuyor.
        jPanel3.setLayout(new GridLayout(2,1));
        
        for(int sayi=0; sayi<2; sayi++) {           
            JLabel tmp = new JLabel("Dinamik Label");
            tmp.setName("Dnmk " + sayi); 
            //oluşturulan dinamik JLabel isim verildi. Sonrasında bu isimlerle oluşturulan JLabel'lara erişim yapılabilsin. 
            //isimler:dnmk1 ve dnmk2 oldu. istenilene bu isimlerle erişilebilsin
            tmp.setForeground(Color.red);
            jPanel3.add(tmp);
        }       
        jPanel3.validate();
        jPanel3.repaint();
        this.repaint();
    }//GEN-LAST:event_jButton_PaneldeLabelOlusturActionPerformed

    private void jButton_PaneldeNameDnmkLabelDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PaneldeNameDnmkLabelDegistirActionPerformed
        //Panel üstünde dinamik olan ve name=dnmk olan Label için text değiştirir
        Component[] c = jPanel3.getComponents();
        //jPanel2'teki tüm componentleri diziye al
        for (int i=0; i<c.length; i++)
            if (c[i].getName() != null)
                if (c[i] instanceof JLabel && c[i].getName().equals("Dnmk 1")) {
                    //c dizisindeki JLabel olan ve öncesinde oluşturulan dnmk1 isimli JLabel seçiliyro 
                     JLabel tmp = (JLabel) c[i];
                     tmp.setText("BULDUM");
                }
    }//GEN-LAST:event_jButton_PaneldeNameDnmkLabelDegistirActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_11_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_11_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_11_0_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_LabelVeCheckBoxDegistir;
    private javax.swing.JButton jButton_NameAdDegistir;
    private javax.swing.JButton jButton_PanelUzerindeLabelDegistir;
    private javax.swing.JButton jButton_PaneldeLabelOlustur;
    private javax.swing.JButton jButton_PaneldeNameDnmkLabelDegistir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Baslik;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
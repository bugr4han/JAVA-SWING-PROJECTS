package HAFTA_05;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class HAFTA_5_2_ODEV extends javax.swing.JFrame {
    public HAFTA_5_2_ODEV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel_MarketIsmi = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton_SiparisEkle = new javax.swing.JButton();
        jButton_SiparisCikar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_YeniSiparis = new javax.swing.JMenuItem();
        jMenuItem_Ayarlar = new javax.swing.JMenuItem();
        jMenuItem_Cikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market Ödevi");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("5.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Meyve Sebze");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Domates");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Patates");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Elma");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Günlük");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Süt");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ekmek");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setRootVisible(false);
        jScrollPane1.setViewportView(jTree1);

        jLabel_MarketIsmi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_MarketIsmi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MarketIsmi.setText("MARKET");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree2.setRootVisible(false);
        jScrollPane2.setViewportView(jTree2);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KAPICI SİPARİŞ LİSTESİ");

        jButton_SiparisEkle.setText("Seçileni Sipariş Olarak Ekle");
        jButton_SiparisEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SiparisEkleActionPerformed(evt);
            }
        });

        jButton_SiparisCikar.setText("Seçileni Siparişten Çıkar");
        jButton_SiparisCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SiparisCikarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_MarketIsmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SiparisEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jButton_SiparisCikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator3)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_MarketIsmi, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_SiparisEkle)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SiparisCikar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Dosya");

        jMenuItem_YeniSiparis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_YeniSiparis.setText("Yeni Sipariş");
        jMenuItem_YeniSiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_YeniSiparisActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_YeniSiparis);

        jMenuItem_Ayarlar.setText("Ayarlar");
        jMenuItem_Ayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AyarlarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Ayarlar);

        jMenuItem_Cikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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

    private void jMenuItem_CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_CikisActionPerformed

    private void jMenuItem_YeniSiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_YeniSiparisActionPerformed
        Object[] options = {"Evet",
                            "Hayır, teşekkürler",
                            "İptal Et"};
        int onay = JOptionPane.showOptionDialog(null, // gösterileceği konum için parent seçiliyor, null olursa ekranın ortasında gösteriliyor
                                             "Siparişler Tamamlandı. Yeni Sipariş Listesi Alınsın mı?", //MESAJ
                                             "Sipariş Listesi",              //Pencere başlığı
                                             JOptionPane.YES_NO_CANCEL_OPTION, //Hangi butonlar
                                             JOptionPane.QUESTION_MESSAGE, //mesaj tipi
                                             null,          // icon
                                             options,                       //tanımlanmış options
                                             options[0]);                   //defaultta hangi buton aktif
        if (onay == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yeni Sipariş Almaya Devam Edebilirisiniz!", "Yeni Sipariş", JOptionPane.PLAIN_MESSAGE);
            DefaultTreeModel treeModelfor2 = (DefaultTreeModel) jTree2.getModel();
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModelfor2.getRoot();
            root.removeAllChildren();

            String[] daireler = {"1.Daire", "2.Daire", "3.Daire", "4.Daire", "5.Daire"};

            for (String daire : daireler) {
                treeModelfor2.insertNodeInto(new DefaultMutableTreeNode(daire), root, root.getChildCount());
            }
            
            treeModelfor2.reload(root);
        } else if (onay == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "İşlem reddedildi!.", "Bilgi", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "İşlem iptal edildi!", "Bilgi", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem_YeniSiparisActionPerformed

    private void jMenuItem_AyarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AyarlarActionPerformed
        HAFTA_5_3_EKPENCERE yeniFrame = new HAFTA_5_3_EKPENCERE();
        yeniFrame.parent = this;
        yeniFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AyarlarActionPerformed

    private void jButton_SiparisEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SiparisEkleActionPerformed
        DefaultTreeModel treeModel1 = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode SecilenUrun = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        String SecilenUrunAdi = (SecilenUrun != null) ? SecilenUrun.toString() : ""; // Seçilen düğümün ismini al

        DefaultTreeModel treeModel2 = (DefaultTreeModel) jTree2.getModel();
        DefaultMutableTreeNode Siparis = new DefaultMutableTreeNode(SecilenUrunAdi);
        DefaultMutableTreeNode SecilenDaire = (DefaultMutableTreeNode) jTree2.getLastSelectedPathComponent();
        
        if (SecilenDaire != null) {
            treeModel2.insertNodeInto(Siparis, SecilenDaire, SecilenDaire.getChildCount());
        }
    }//GEN-LAST:event_jButton_SiparisEkleActionPerformed

    private void jButton_SiparisCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SiparisCikarActionPerformed
        DefaultMutableTreeNode selected_node = (DefaultMutableTreeNode) jTree2.getLastSelectedPathComponent();
        DefaultTreeModel tree_model = (DefaultTreeModel) jTree2.getModel();

        if (selected_node != null) {
            if (selected_node.toString().contains("Daire")) {
                JOptionPane.showMessageDialog(null, "Daireler silinemez!", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {
                tree_model.removeNodeFromParent(selected_node); 
            }
        }
    }//GEN-LAST:event_jButton_SiparisCikarActionPerformed
    
    public void MarketAdıDegistirmeMethodu(String isim) {
        jLabel_MarketIsmi.setText(isim + " MARKET");
    }
    
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
            java.util.logging.Logger.getLogger(HAFTA_5_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_2_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_5_2_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SiparisCikar;
    private javax.swing.JButton jButton_SiparisEkle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_MarketIsmi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Ayarlar;
    private javax.swing.JMenuItem jMenuItem_Cikis;
    private javax.swing.JMenuItem jMenuItem_YeniSiparis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables

}
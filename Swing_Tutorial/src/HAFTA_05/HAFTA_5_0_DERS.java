package HAFTA_05;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class HAFTA_5_0_DERS extends javax.swing.JFrame {
    public HAFTA_5_0_DERS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextField_Ekle = new javax.swing.JTextField();
        jButton_Ekle = new javax.swing.JButton();
        jButton_Sil = new javax.swing.JButton();
        jButton_ElemanSayisi = new javax.swing.JButton();
        jLabel_ElemanSayisi = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton_JOptionPane1 = new javax.swing.JButton();
        jButton_JOptionPane2 = new javax.swing.JButton();
        jButton_JOptionPane3 = new javax.swing.JButton();
        jButton_JOptionPane4 = new javax.swing.JButton();
        jButton_JOptionPane5 = new javax.swing.JButton();
        jButton_JOptionPane6 = new javax.swing.JButton();
        jButton_YeniFrame = new javax.swing.JButton();
        jButton_JOptionPane7 = new javax.swing.JButton();
        jButton_JOptionPane8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JTree, Menu, JOptionPane, Yeni Pencere");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("5.HAFTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tree");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ekleme İşlemi");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Silme İşlemi");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eleman Sayısı");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jButton_Ekle.setText("Ekle");
        jButton_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EkleActionPerformed(evt);
            }
        });

        jButton_Sil.setText("Sil");
        jButton_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SilActionPerformed(evt);
            }
        });

        jButton_ElemanSayisi.setText("Secilenlerin Sayisi");
        jButton_ElemanSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ElemanSayisiActionPerformed(evt);
            }
        });

        jLabel_ElemanSayisi.setText("Eleman Sayısı:");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("JOptionPane");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Yeni Frame Penceresi");

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jButton_JOptionPane1.setText("1");
        jButton_JOptionPane1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane1ActionPerformed(evt);
            }
        });

        jButton_JOptionPane2.setText("2");
        jButton_JOptionPane2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane2ActionPerformed(evt);
            }
        });

        jButton_JOptionPane3.setText("3");
        jButton_JOptionPane3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane3ActionPerformed(evt);
            }
        });

        jButton_JOptionPane4.setText("4");
        jButton_JOptionPane4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane4ActionPerformed(evt);
            }
        });

        jButton_JOptionPane5.setText("5");
        jButton_JOptionPane5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane5ActionPerformed(evt);
            }
        });

        jButton_JOptionPane6.setText("6");
        jButton_JOptionPane6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane6ActionPerformed(evt);
            }
        });

        jButton_YeniFrame.setText("Yeni Frame Penceresi Aç");
        jButton_YeniFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YeniFrameActionPerformed(evt);
            }
        });

        jButton_JOptionPane7.setText("7");
        jButton_JOptionPane7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane7ActionPerformed(evt);
            }
        });

        jButton_JOptionPane8.setText("8");
        jButton_JOptionPane8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JOptionPane8ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jSeparator3)
                                    .addComponent(jTextField_Ekle)
                                    .addComponent(jButton_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButton_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator5)
                                    .addComponent(jButton_ElemanSayisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_ElemanSayisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_JOptionPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_JOptionPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_JOptionPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_JOptionPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_JOptionPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_JOptionPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_JOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_JOptionPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jSeparator8)
                                    .addComponent(jButton_YeniFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Sil)
                            .addComponent(jButton_ElemanSayisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Ekle)
                            .addComponent(jLabel_ElemanSayisi))
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_JOptionPane1)
                            .addComponent(jButton_JOptionPane2)
                            .addComponent(jButton_YeniFrame))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_JOptionPane3)
                            .addComponent(jButton_JOptionPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_JOptionPane5)
                            .addComponent(jButton_JOptionPane6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_JOptionPane7)
                            .addComponent(jButton_JOptionPane8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("1.Menu");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator9);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator10);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator11);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("2.Menu");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jMenu2.add(jCheckBoxMenuItem1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);

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

    private void jButton_ElemanSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ElemanSayisiActionPerformed
        String secim = String.valueOf(jTree1.getSelectionCount());  
        jLabel_ElemanSayisi.setText("Eleman Sayisi: " + secim);
    }//GEN-LAST:event_jButton_ElemanSayisiActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        TreePath dizin = (evt.getNewLeadSelectionPath()); //seçimden sonra oluşan durumu alıp, dizin değişkenine atar.
        System.out.println(dizin); 
        DefaultMutableTreeNode selectednode = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        if (selectednode.isLeaf()) {
            System.out.println("YAPRAK Secildi!");  
            System.out.println("Cocuk Sayisi: " + "" + selectednode.getChildCount());
        } else if   (selectednode.isRoot()) {
            System.out.println("Ana Kok Secildi!");
            System.out.println("Cocuk Sayisi: " + "" + selectednode.getChildCount());
        } else {
            System.out.println("Alt Kok Secildi!");
            System.out.println("Cocuk Sayisi: " + "" + selectednode.getChildCount());
        }  
    }//GEN-LAST:event_jTree1ValueChanged

    private void jButton_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EkleActionPerformed
        // Tree_Item_Ekle butonuna basılınca
        DefaultMutableTreeNode new_child = new DefaultMutableTreeNode(jTextField_Ekle.getText());//textfield'dan gelen isimle yeni bir eleman tanımlanıyor
        DefaultMutableTreeNode selected_node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent(); //hangi düğümün seçildiğini alıyor
        DefaultTreeModel tree_model = (DefaultTreeModel)jTree1.getModel(); //jtree'ye DefaultTreeModel yükleniyor
        if(selected_node!=null) {
            tree_model.insertNodeInto(new_child, selected_node, selected_node.getChildCount());
        }
    }//GEN-LAST:event_jButton_EkleActionPerformed

    private void jButton_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SilActionPerformed
        DefaultMutableTreeNode selected_node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        DefaultTreeModel tree_model = (DefaultTreeModel)jTree1.getModel();
        if(selected_node!=null) {
            tree_model.removeNodeFromParent(selected_node);
        }  
    }//GEN-LAST:event_jButton_SilActionPerformed
    public void baslik_degistir(String s) {
        this.setTitle(s);
    }
    private void jButton_YeniFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YeniFrameActionPerformed
        HAFTA_5_1_EKPENCERE yeni_pencere = new HAFTA_5_1_EKPENCERE();
        yeni_pencere.jtext_degistir("gorsel");
        yeni_pencere.parent = this; //içinde bulunan sınıfa tanımlanıyor
        yeni_pencere.setVisible(true);
    }//GEN-LAST:event_jButton_YeniFrameActionPerformed

    private void jButton_JOptionPane1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane1ActionPerformed
        // Bilgilendirme Mesajı
        JOptionPane.showMessageDialog(null, "Bu bir bilgi mesajıdır.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton_JOptionPane1ActionPerformed

    private void jButton_JOptionPane2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane2ActionPerformed
        // Hata Mesajı
        JOptionPane.showMessageDialog(null, "Bir hata oluştu!", "Hata", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton_JOptionPane2ActionPerformed

    private void jButton_JOptionPane3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane3ActionPerformed
        // Uyarı Mesajı
        JOptionPane.showMessageDialog(null, "Dikkat! İşleminizi tekrar gözden geçirin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton_JOptionPane3ActionPerformed

    private void jButton_JOptionPane4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane4ActionPerformed
        // Soru Mesajı
        JOptionPane.showMessageDialog(null, "Bir soru mesajı gösterildi.", "Soru", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_jButton_JOptionPane4ActionPerformed

    private void jButton_JOptionPane5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane5ActionPerformed
        int onay = JOptionPane.showConfirmDialog(null, "Devam etmek istiyor musunuz?", "Onay", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (onay == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Devam ediliyor...", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else if (onay == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "İşlem iptal edildi.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "İşlem duraklatıldı.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_JOptionPane5ActionPerformed

    private void jButton_JOptionPane6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane6ActionPerformed
        Object[] options = {"Evet, lütfen",
                            "Hayır, teşekkürler",
                            "İptal, tercih yok"};
        int n = JOptionPane.showOptionDialog(null, // gösterileceği konum için parent seçiliyor, null olursa ekranın ortasında gösteriliyor
                                             "Çayına şeker ister misin?", //MESAJ
                                             "Şeker Sorusu",              //Pencere başlığı
                                             JOptionPane.YES_NO_CANCEL_OPTION, //Hangi butonlar
                                             JOptionPane.QUESTION_MESSAGE, //mesaj tipi
                                             null,          // icon
                                             options,                       //tanımlanmış options
                                             options[0]);                   //defaultta hangi buton aktif
        System.out.println(n);// Basit Kullanıcı Girişi Alma
    }//GEN-LAST:event_jButton_JOptionPane6ActionPerformed

    private void jButton_JOptionPane7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane7ActionPerformed
        String isim = JOptionPane.showInputDialog(null, "Adınızı girin:", "Giriş", JOptionPane.QUESTION_MESSAGE);
        if (isim != null) {
            JOptionPane.showMessageDialog(null, "Merhaba, " + isim + "!", "Hoş Geldiniz", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_JOptionPane7ActionPerformed

    private void jButton_JOptionPane8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JOptionPane8ActionPerformed
        String[] renkler = {"Kırmızı", "Mavi", "Yeşil", "Sarı"};
        String secilenRenk = (String) JOptionPane.showInputDialog(
                null, 
                "Bir renk seçin:", 
                "Renk Seçimi", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                renkler, 
                renkler[0] // Varsayılan olarak ilk seçenek seçili gelir
        );
        JOptionPane.showMessageDialog(null, "Seçtiğiniz renk: " + secilenRenk);
    }//GEN-LAST:event_jButton_JOptionPane8ActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_5_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_5_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_5_0_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ekle;
    private javax.swing.JButton jButton_ElemanSayisi;
    private javax.swing.JButton jButton_JOptionPane1;
    private javax.swing.JButton jButton_JOptionPane2;
    private javax.swing.JButton jButton_JOptionPane3;
    private javax.swing.JButton jButton_JOptionPane4;
    private javax.swing.JButton jButton_JOptionPane5;
    private javax.swing.JButton jButton_JOptionPane6;
    private javax.swing.JButton jButton_JOptionPane7;
    private javax.swing.JButton jButton_JOptionPane8;
    private javax.swing.JButton jButton_Sil;
    private javax.swing.JButton jButton_YeniFrame;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_ElemanSayisi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextField jTextField_Ekle;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

}
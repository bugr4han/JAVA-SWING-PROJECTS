package HAFTA_06;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class HAFTA_6_1_ODEV extends javax.swing.JFrame {
    public HAFTA_6_1_ODEV() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_SepeteEkle = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem_SepettenCikar = new javax.swing.JMenuItem();
        jMenuItem_SepetiTemizle = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_AyarlarTexti = new javax.swing.JTextField();
        jButton_MarketAdiDegistir = new javax.swing.JButton();
        jButton_ListeRenginiDegistir = new javax.swing.JButton();
        jButton_DosyaYolunuYazdir = new javax.swing.JButton();
        jButton_DialogPenceresiniKapat = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_SepetIslemleriTexti = new javax.swing.JTextField();
        jButton_AramaYap = new javax.swing.JButton();
        jButton_AdAyir = new javax.swing.JButton();
        jButton_UrunAdDegistir = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_MarketAdi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel_Sepet = new javax.swing.JLabel();
        jButton_Ayarlar = new javax.swing.JButton();
        jButton_SepetIslemleri = new javax.swing.JButton();

        jMenuItem_SepeteEkle.setText("Sepete Ekle");
        jMenuItem_SepeteEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SepeteEkleActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_SepeteEkle);

        jMenuItem_SepettenCikar.setText("Sepetten Çıkar");
        jMenuItem_SepettenCikar.setToolTipText("");
        jMenuItem_SepettenCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SepettenCikarActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem_SepettenCikar);

        jMenuItem_SepetiTemizle.setText("Sepeti Temizle");
        jMenuItem_SepetiTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SepetiTemizleActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem_SepetiTemizle);

        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setBounds(new java.awt.Rectangle(800, 500, 250, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JDialog Penceresi - Ayarlar");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_AyarlarTexti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_MarketAdiDegistir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_MarketAdiDegistir.setText("Market İsmi Değiştir");
        jButton_MarketAdiDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MarketAdiDegistirActionPerformed(evt);
            }
        });

        jButton_ListeRenginiDegistir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_ListeRenginiDegistir.setText("Listelerin Yazı Rengini Değiştir");
        jButton_ListeRenginiDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListeRenginiDegistirActionPerformed(evt);
            }
        });

        jButton_DosyaYolunuYazdir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_DosyaYolunuYazdir.setText("Dosya Yolunu Yazdır");
        jButton_DosyaYolunuYazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaYolunuYazdirActionPerformed(evt);
            }
        });

        jButton_DialogPenceresiniKapat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_DialogPenceresiniKapat.setText("Dialog Penceresini Kapat");
        jButton_DialogPenceresiniKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DialogPenceresiniKapatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jTextField_AyarlarTexti)
                    .addComponent(jButton_MarketAdiDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_ListeRenginiDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jButton_DosyaYolunuYazdir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_DialogPenceresiniKapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_AyarlarTexti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_MarketAdiDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_ListeRenginiDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_DosyaYolunuYazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_DialogPenceresiniKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog2.setBounds(new java.awt.Rectangle(800, 500, 300, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JDialog Penceresi - Sepet İşlemleri");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_SepetIslemleriTexti.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jButton_AramaYap.setText("Sepette Arama Yap");
        jButton_AramaYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AramaYapActionPerformed(evt);
            }
        });

        jButton_AdAyir.setText("Sepetteki Ürünlerin İsimlerini Ayır");
        jButton_AdAyir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AdAyirActionPerformed(evt);
            }
        });

        jButton_UrunAdDegistir.setText("Sepetteki Ürünlerin İsimlerini Değiştir");
        jButton_UrunAdDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UrunAdDegistirActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jTextField_SepetIslemleriTexti)
                    .addComponent(jButton_AramaYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_UrunAdDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jButton_AdAyir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_SepetIslemleriTexti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton_AramaYap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_UrunAdDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_AdAyir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market Ödevi");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("6.HAFTA - ÖDEV");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_MarketAdi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel_MarketAdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MarketAdi.setText("X MARKET");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MeyveSebze/Domates", "MeyveSebze/Salatalık", "MeyveSebze/Elma", "Günlük/Süt", "Günlük/Ekmek" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jList1);

        jList2.setComponentPopupMenu(jPopupMenu2);
        jScrollPane2.setViewportView(jList2);

        jLabel_Sepet.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel_Sepet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sepet.setText("SEPET");

        jButton_Ayarlar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Ayarlar.setText("Ayarlar");
        jButton_Ayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AyarlarActionPerformed(evt);
            }
        });

        jButton_SepetIslemleri.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_SepetIslemleri.setText("Sepet İşlemleri");
        jButton_SepetIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SepetIslemleriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_Ayarlar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_MarketAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel_Sepet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_SepetIslemleri, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
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
                    .addComponent(jLabel_MarketAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel_Sepet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Ayarlar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jButton_SepetIslemleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    ListModel listModel;
    DefaultListModel myModel;
    
    private void modelGetir() {                                         
        listModel = jList2.getModel();
        myModel = new DefaultListModel();
        
        for (int i = 0; i < listModel.getSize(); i++) {
            myModel.addElement(listModel.getElementAt(i));
        }
    }
    
    private void jMenuItem_SepeteEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SepeteEkleActionPerformed
        modelGetir();
        String secilenUrun = jList1.getSelectedValue();
        if(secilenUrun == null) {
            JOptionPane.showMessageDialog(this, "Lütfen Bir Ürün Seçiniz!", "Hata!", JOptionPane.ERROR_MESSAGE);
        } else {
            myModel.addElement(secilenUrun);
            jList2.setModel(myModel);
        }

    }//GEN-LAST:event_jMenuItem_SepeteEkleActionPerformed

    private void jMenuItem_SepettenCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SepettenCikarActionPerformed
        modelGetir();
        int secilenSatir = jList2.getSelectedIndex();
        if(myModel.getSize() == 0) {
            JOptionPane.showMessageDialog(this, "Önce Sepete Ürün Eklemelisiniz!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if(secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Sepetten Çıkarmak İstediğiniz Ürünü Seçiniz!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {
            if(secilenSatir >= 0 && secilenSatir < myModel.getSize()) {
                myModel.removeElementAt(secilenSatir);
                jList2.setModel(myModel);
            }
        }
    }//GEN-LAST:event_jMenuItem_SepettenCikarActionPerformed

    private void jMenuItem_SepetiTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SepetiTemizleActionPerformed
        modelGetir();
        myModel.removeAllElements();
        jList2.setModel(myModel);
    }//GEN-LAST:event_jMenuItem_SepetiTemizleActionPerformed

    private void jButton_AyarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AyarlarActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton_AyarlarActionPerformed

    private void jButton_SepetIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SepetIslemleriActionPerformed
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton_SepetIslemleriActionPerformed

    private void jButton_MarketAdiDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MarketAdiDegistirActionPerformed
        String ad = jTextField_AyarlarTexti.getText();
        jLabel_MarketAdi.setText(ad.toUpperCase() + " MARKET");
    }//GEN-LAST:event_jButton_MarketAdiDegistirActionPerformed

    private void jButton_ListeRenginiDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListeRenginiDegistirActionPerformed
        Color cl = jColorChooser1.showDialog(null, "Başlık", Color.GREEN);
        jList1.setForeground(cl);
        jList2.setForeground(cl);
    }//GEN-LAST:event_jButton_ListeRenginiDegistirActionPerformed

    private void jButton_DosyaYolunuYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaYolunuYazdirActionPerformed
        jFileChooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Dosyaları ve Klasörleri Seçmeye Yarar
        int secim = jFileChooser1.showOpenDialog(null);
        if(secim == JFileChooser.APPROVE_OPTION) {
           jTextField_AyarlarTexti.setText(jFileChooser1.getSelectedFile().getAbsolutePath()); 
        } else if(secim == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Seçim İptal Edildi!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Seçim Kapatıldı!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_DosyaYolunuYazdirActionPerformed

    private void jButton_DialogPenceresiniKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DialogPenceresiniKapatActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton_DialogPenceresiniKapatActionPerformed

    private void jButton_AramaYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AramaYapActionPerformed
        String aranacakString = jTextField_SepetIslemleriTexti.getText().toLowerCase();
        modelGetir();
        int satirSayisi = myModel.getSize();
        String nerde = "";
        for(int i = 0; i < satirSayisi; i++) {
            if(myModel.getElementAt(i).toString().toLowerCase().contains(aranacakString)){
                nerde += (i+1) + "   ";
            }
        }
        JOptionPane.showMessageDialog(this, "Aradığınız Ürünün Listedeki Konumları: " + nerde, "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton_AramaYapActionPerformed

    private void jButton_AdAyirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AdAyirActionPerformed
        modelGetir();
        int sayi = myModel.getSize();
        boolean eslesme = false;
        String sadeceAdlar[] = new String[sayi];
        for(int i = 0; i < sayi; i++) {
            if(myModel.getElementAt(i).toString().contains("Meyve")) {
                int harfSayisi = myModel.getElementAt(i).toString().length();
                sadeceAdlar[i] = myModel.getElementAt(i).toString().substring(11,harfSayisi);
                eslesme = true;
            } else if (myModel.getElementAt(i).toString().contains("Günlük")) {
                int harfSayisi = myModel.getElementAt(i).toString().length();
                sadeceAdlar[i] = myModel.getElementAt(i).toString().substring(7,harfSayisi);
                eslesme = true;
            } else {
                System.out.println("YOK");
                eslesme = false;
            }
        }
        if(eslesme) {
            myModel.removeAllElements();
            for (String sadeceAdlar1 : sadeceAdlar) {
                myModel.addElement(sadeceAdlar1);
            }
            jList2.setModel(myModel);
        } else {
            JOptionPane.showMessageDialog(this, "Kapatıp Tekrar Çalıştırarak Deneyin!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_AdAyirActionPerformed

    private void jButton_UrunAdDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UrunAdDegistirActionPerformed
        modelGetir();
        int sayi = myModel.getSize();
        for(int i = 0; i < sayi; i++) {
            String yeniAd = myModel.getElementAt(i).toString().replaceAll("MeyveSebze", "Ürün İsmi");
            myModel.setElementAt(yeniAd, i);            
            String yeniAd2 = myModel.getElementAt(i).toString().replaceAll("Günlük", "Ürün Adı");
            myModel.setElementAt(yeniAd2, i);
        }
        jList2.setModel(myModel);
    }//GEN-LAST:event_jButton_UrunAdDegistirActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_6_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_6_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_6_1_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AdAyir;
    private javax.swing.JButton jButton_AramaYap;
    private javax.swing.JButton jButton_Ayarlar;
    private javax.swing.JButton jButton_DialogPenceresiniKapat;
    private javax.swing.JButton jButton_DosyaYolunuYazdir;
    private javax.swing.JButton jButton_ListeRenginiDegistir;
    private javax.swing.JButton jButton_MarketAdiDegistir;
    private javax.swing.JButton jButton_SepetIslemleri;
    private javax.swing.JButton jButton_UrunAdDegistir;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_MarketAdi;
    private javax.swing.JLabel jLabel_Sepet;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuItem jMenuItem_SepeteEkle;
    private javax.swing.JMenuItem jMenuItem_SepetiTemizle;
    private javax.swing.JMenuItem jMenuItem_SepettenCikar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField_AyarlarTexti;
    private javax.swing.JTextField jTextField_SepetIslemleriTexti;
    // End of variables declaration//GEN-END:variables

}
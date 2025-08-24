package HAFTA_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HAFTA_7_0_DERS extends javax.swing.JFrame {
    public HAFTA_7_0_DERS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_DosyaAc = new javax.swing.JButton();
        jButton_DosyaByteOku = new javax.swing.JButton();
        jButton_DosyaKarakterOku = new javax.swing.JButton();
        jButton_DosyaKarakterYaz = new javax.swing.JButton();
        jButton_DosyaKarakterYenidenYaz = new javax.swing.JButton();
        jButton_DosyaByteYaz = new javax.swing.JButton();
        jButton_DosyaByteYenidenYaz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Area - Dosya İşlemleri");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("7.HAFTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton_DosyaAc.setText("Dosya Aç");
        jButton_DosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaAcActionPerformed(evt);
            }
        });

        jButton_DosyaByteOku.setText("Dosya Byte Oku");
        jButton_DosyaByteOku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaByteOkuActionPerformed(evt);
            }
        });

        jButton_DosyaKarakterOku.setText("Dosya Karakter Oku");
        jButton_DosyaKarakterOku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaKarakterOkuActionPerformed(evt);
            }
        });

        jButton_DosyaKarakterYaz.setText("Dosyaya Karakter Yaz");
        jButton_DosyaKarakterYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaKarakterYazActionPerformed(evt);
            }
        });

        jButton_DosyaKarakterYenidenYaz.setText("Dosyaya Karakter Yeniden Yaz");
        jButton_DosyaKarakterYenidenYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaKarakterYenidenYazActionPerformed(evt);
            }
        });

        jButton_DosyaByteYaz.setText("Dosyaya Byte Yaz");
        jButton_DosyaByteYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaByteYazActionPerformed(evt);
            }
        });

        jButton_DosyaByteYenidenYaz.setText("Dosyaya Byte Yeniden Yaz");
        jButton_DosyaByteYenidenYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DosyaByteYenidenYazActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_DosyaAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_DosyaKarakterOku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_DosyaByteOku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_DosyaByteYaz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DosyaKarakterYaz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DosyaKarakterYenidenYaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DosyaByteYenidenYaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_DosyaAc)
                    .addComponent(jButton_DosyaKarakterOku)
                    .addComponent(jButton_DosyaByteOku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_DosyaKarakterYaz)
                    .addComponent(jButton_DosyaKarakterYenidenYaz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_DosyaByteYaz)
                    .addComponent(jButton_DosyaByteYenidenYaz))
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void jButton_DosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaAcActionPerformed
        //Dosya Aç butonunda, seçilen dosyanın path bilgisi ekrana yazdırılır
        int i = jFileChooser1.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION)
            jTextArea1.append(jFileChooser1.getSelectedFile().getAbsolutePath() + "\n\n");
        else
            jTextArea1.append("Dosya açma işlemi iptal edildi\n\n");   
    }//GEN-LAST:event_jButton_DosyaAcActionPerformed

    private void jButton_DosyaKarakterOkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaKarakterOkuActionPerformed
        //Dosya Oku butonunda, seçilen dosyanın içeriği TextArea içine yazılır;
        if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //BufferedReader br = null;
            try {
                jTextArea1.setText("");
                FileReader fr = new FileReader(jFileChooser1.getSelectedFile().getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);
                //BufferedReader br = new BufferedReader(new FileReader("Dosyalar/hafta7_metin.txt"));
                String line = br.readLine();
                while (line != null) {
                    jTextArea1.append(line+"\n");
                    line = br.readLine();
                }
                jTextArea1.append("\n");
                br.close();
            } catch (IOException ee) {
                JOptionPane.showMessageDialog(null, ee.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_DosyaKarakterOkuActionPerformed

    private void jButton_DosyaByteOkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaByteOkuActionPerformed
        //Türkçe oku butonunda, seçilen dosyanın içindeki türkçe karakterlerin okunması sağlanır
        if (jFileChooser1.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
            try {
                jTextArea1.setText("");
                FileInputStream fr = new FileInputStream(jFileChooser1.getSelectedFile().getAbsolutePath());
                InputStreamReader isr = new InputStreamReader(fr,Charset.forName("ISO-8859-9"));
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();
                while (line != null) {
                    jTextArea1.append(line+"\n");
                    line = br.readLine();
                }
                jTextArea1.append("\n");
                br.close();
            } catch (IOException ee) {
                JOptionPane.showMessageDialog(null, ee.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_DosyaByteOkuActionPerformed

    private void jButton_DosyaKarakterYazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaKarakterYazActionPerformed
        //Dosyaya yaz butonuna basılınca, textarea içindeki bilgiler seçilen dosyanın sonuana yazılır, önceki bilgiler silinmez
        if (jFileChooser1.showSaveDialog(this)==JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter wr = new FileWriter(jFileChooser1.getSelectedFile().getAbsolutePath(),true);
                //true: Dosya daha önceden varsa sonuna ekleme yapılır
                String[] satirlar = jTextArea1.getText().split("\n");
                for(int i=0;i<satirlar.length;i++)
                    wr.write(satirlar[i]+"\n");
                wr.close();
                JOptionPane.showMessageDialog(null, "DOSYAYA YAZILDI", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ee) {
            }
        }
    }//GEN-LAST:event_jButton_DosyaKarakterYazActionPerformed

    private void jButton_DosyaKarakterYenidenYazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaKarakterYenidenYazActionPerformed
        //Dosyaya yeniden yaz butonuna basılınca, seçilen dosyadaki bilgiler silip, TextArea'daki bilgileri yazar
        if (jFileChooser1.showSaveDialog(this)==jFileChooser1.APPROVE_OPTION)
        {
            try {
                FileWriter wr = new FileWriter(jFileChooser1.getSelectedFile().getAbsolutePath(),false);
                //String as = jTextArea1.getText() ;                
                //wr.write(as.toString(),0, as.length());//(metin,başlangıç offset no,uzunluk) // as olarak okunan metni arka arkasına yazar
                String[] satirlar = jTextArea1.getText().split("\n");
                for(int i=0;i<satirlar.length;i++)
                    wr.write(satirlar[i]+"\t\n");            
                wr.close();
                JOptionPane.showMessageDialog(null, "DOSYAYA YAZILDI", "", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ee) {
            }
        }
    }//GEN-LAST:event_jButton_DosyaKarakterYenidenYazActionPerformed

    private void jButton_DosyaByteYazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaByteYazActionPerformed
        if (jFileChooser1.showSaveDialog(this)==JFileChooser.APPROVE_OPTION) {
            try {
                FileOutputStream fr = new FileOutputStream(jFileChooser1.getSelectedFile().getAbsolutePath(), true);
                OutputStreamWriter osr = new OutputStreamWriter(fr,Charset.forName("ISO-8859-9"));
                BufferedWriter wr = new BufferedWriter(osr);
                String[] satirlar = jTextArea1.getText().split("\n");
                for(int i=0;i<satirlar.length;i++)
                    wr.write(satirlar[i]+"\n");
                wr.close();
                JOptionPane.showMessageDialog(null, "DOSYAYA YAZILDI", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ee) {
                JOptionPane.showMessageDialog(null, ee.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_DosyaByteYazActionPerformed

    private void jButton_DosyaByteYenidenYazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DosyaByteYenidenYazActionPerformed
        if (jFileChooser1.showSaveDialog(this)==JFileChooser.APPROVE_OPTION) {
            try {
                FileOutputStream fr = new FileOutputStream(jFileChooser1.getSelectedFile().getAbsolutePath(), false);
                OutputStreamWriter osr = new OutputStreamWriter(fr,Charset.forName("ISO-8859-9"));
                String[] satirlar = jTextArea1.getText().split("\n");
                for(int i=0;i<satirlar.length;i++)
                    osr.write(satirlar[i]+"\n");
                osr.close();
                JOptionPane.showMessageDialog(null, "DOSYAYA YAZILDI", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ee) {
                JOptionPane.showMessageDialog(null, ee.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_DosyaByteYenidenYazActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_7_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_7_0_DERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_7_0_DERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DosyaAc;
    private javax.swing.JButton jButton_DosyaByteOku;
    private javax.swing.JButton jButton_DosyaByteYaz;
    private javax.swing.JButton jButton_DosyaByteYenidenYaz;
    private javax.swing.JButton jButton_DosyaKarakterOku;
    private javax.swing.JButton jButton_DosyaKarakterYaz;
    private javax.swing.JButton jButton_DosyaKarakterYenidenYaz;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
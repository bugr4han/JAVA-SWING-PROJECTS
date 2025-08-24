package HAFTA_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HAFTA_9_1_ODEV extends javax.swing.JFrame {
    public HAFTA_9_1_ODEV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton_KaydetVeCik = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_TextAreaEkle = new javax.swing.JMenuItem();
        jMenuItem_TextAreaSil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField_Ad = new javax.swing.JTextField();
        jTextField_Soyad = new javax.swing.JTextField();
        jFormattedTextField_Telefon = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Adres = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioButton_Erkek = new javax.swing.JRadioButton();
        jRadioButton_Kadin = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Yas = new javax.swing.JTextField();
        jButton_UyelikSecim = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Program = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Ac = new javax.swing.JMenuItem();
        jMenuItem_Kaydet = new javax.swing.JMenuItem();
        jMenuItem_Cikis = new javax.swing.JMenuItem();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 250, 335));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Üyelik Seçimi");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jButton_KaydetVeCik.setText("KAYDET VE ÇIK");
        jButton_KaydetVeCik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KaydetVeCikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(jScrollPane3)
                    .addComponent(jButton_KaydetVeCik, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton_KaydetVeCik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuItem_TextAreaEkle.setText("Ekle");
        jMenuItem_TextAreaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TextAreaEkleActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_TextAreaEkle);

        jMenuItem_TextAreaSil.setText("Sil");
        jMenuItem_TextAreaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TextAreaSilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_TextAreaSil);

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
        jLabel1.setText("9.HAFTA - ÖDEV");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "KAYIT İŞLEMLERİ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 25));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        try {
            jFormattedTextField_Telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 - ###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AD");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SOYAD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TELEFON");

        jTextArea_Adres.setColumns(20);
        jTextArea_Adres.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Adres);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADRES");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cinsiyet");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(jRadioButton_Erkek);
        jRadioButton_Erkek.setText("Erkek");

        buttonGroup1.add(jRadioButton_Kadin);
        jRadioButton_Kadin.setText("Kadın");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Yaş");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jButton_UyelikSecim.setText("Üyelik Süresi Seç");
        jButton_UyelikSecim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UyelikSecimActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Üyelik Süresi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Ad)
                    .addComponent(jTextField_Soyad)
                    .addComponent(jFormattedTextField_Telefon)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jSeparator3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jRadioButton_Erkek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton_Kadin)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(jTextField_Yas)))
                    .addComponent(jButton_UyelikSecim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jTextField_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTextField_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jFormattedTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton_Erkek)
                        .addComponent(jRadioButton_Kadin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_UyelikSecim)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ANTRENMAN PROGRAMI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Bölgeler ve Hareketler");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea_Program.setEditable(false);
        jTextArea_Program.setColumns(20);
        jTextArea_Program.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Program);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("DOSYA");

        jMenuItem_Ac.setText("AÇ");
        jMenuItem_Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AcActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Ac);

        jMenuItem_Kaydet.setText("KAYDET");
        jMenuItem_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KaydetActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Kaydet);

        jMenuItem_Cikis.setText("ÇIKIŞ");
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
    
    public String[] vucutBolgeleri;
    Vector<Integer> vucutBolgeKodlari;
    public DefaultComboBoxModel vucutBolgeleri_MDL;
    public DefaultComboBoxModel[] sporHareketleri_MDL;
    public DefaultComboBoxModel tekrarSayilari_MDL;
    public DefaultListModel uyelikSure;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            vucutBolgeleri = new String[10];
            vucutBolgeKodlari = new Vector<>();
            vucutBolgeleri_MDL = new DefaultComboBoxModel<>();
            sporHareketleri_MDL = new DefaultComboBoxModel[10];
            uyelikSure = new DefaultListModel<>();
            tekrarSayilari_MDL = new DefaultComboBoxModel<>();
            
            FileReader fr = new FileReader("Dosyalar/hafta9_spor.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                String[] parcala = line.split("//");
                switch(parcala[0]) {
                    case "Karın":
                    case "Göğüs":
                    case "Biceps":
                    case "Triceps":
                    case "Omuz":
                    case "Sırt":
                    case "Bacak":
                        int bolgeIndex = Integer.valueOf(parcala[1]);
                        if (sporHareketleri_MDL[bolgeIndex] == null) {
                            sporHareketleri_MDL[bolgeIndex] = new DefaultComboBoxModel<>();
                        }
                        sporHareketleri_MDL[bolgeIndex].addElement(parcala[2]);
                        vucutBolgeleri[bolgeIndex] = parcala[0]; 
                        break;
                    case "Tekrar":
                        tekrarSayilari_MDL.addElement(parcala[1]);// ComboBox'a eklenmesi
                        break;
                    case "Süre":
                        uyelikSure.addElement(parcala[1]);// Listeye ekliyoruz
                        break;
                    default:
                        System.out.println("Bilinmeyen bölge: " + parcala[0]);
                        break;
                }
                line = br.readLine();
            }
            br.close();

            // Vücut bölgelerini ComboBoxModel'e ekliyoruz
            for (int i = 0; i < vucutBolgeleri.length; i++) {
                if (vucutBolgeleri[i] != null) {
                    vucutBolgeleri_MDL.addElement(vucutBolgeleri[i]);
                    vucutBolgeKodlari.add(i);
                }
            }

            // ComboBox1'e vücut bölgelerini ekliyoruz
            jComboBox1.setModel(vucutBolgeleri_MDL);

            // Seçilen vücut bölgesine göre spor hareketi modelini set ediyoruz
            int secilikod = vucutBolgeKodlari.get(jComboBox1.getSelectedIndex());
            if (sporHareketleri_MDL[secilikod] != null) {
                jComboBox2.setModel(sporHareketleri_MDL[secilikod]);
            }

            // Tekrar sayıları ComboBox3'e ekliyoruz
            jComboBox3.setModel(tekrarSayilari_MDL);

            // Süre listelerini jList1'e set ediyoruz
            jList1.setModel(uyelikSure);

            // jTextArea'ya pop-up menü ekliyoruz
            jTextArea_Program.setComponentPopupMenu(jPopupMenu1);

        } catch (IOException ee) {
            JOptionPane.showMessageDialog(null, "Dosya bulunamadı", "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(null, "Dosya formatını kontrol edin", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int secilikod = vucutBolgeKodlari.get(jComboBox1.getSelectedIndex());
        jComboBox2.setModel(sporHareketleri_MDL[secilikod]);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton_UyelikSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UyelikSecimActionPerformed
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton_UyelikSecimActionPerformed

    private void jButton_KaydetVeCikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KaydetVeCikActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton_KaydetVeCikActionPerformed

    private void jMenuItem_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KaydetActionPerformed
        if (jFileChooser1.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                //**********************************************
                String cinsiyet = "";
                int yas = 0;
                if (jRadioButton_Erkek.isSelected())
                    cinsiyet = "Erkek";
                if (jRadioButton_Kadin.isSelected())
                    cinsiyet = "Kadın";
                //**********************************************
                int[] secilenler = jList1.getSelectedIndices();
                String sc = "";
                for(int i = 0; i < secilenler.length; i++)
                    sc += secilenler[i] + "//";      
                //**********************************************
                FileWriter wr = new FileWriter(jFileChooser1.getSelectedFile().getAbsolutePath(),false);
                BufferedWriter yaz = new BufferedWriter(wr);
                
                yaz.write("ad//"+jTextField_Ad.getText()+ "\n");
                yaz.write("soyad//"+jTextField_Soyad.getText()+ "\n");
                yaz.write("tel//"+jFormattedTextField_Telefon.getText()+ "\n");
                yaz.write("adres//"+jTextArea_Adres.getText().replaceAll("\n", "\t")+"\n");
                yaz.write("program//"+jTextArea_Program.getText().replaceAll("\n", "\t")+"\n");
                yaz.write("cinsiyet//"+cinsiyet+"\n");  
                yaz.write("yas//" + jTextField_Yas.getText() + "\n"); 
                yaz.write("süre//"+sc+"\n");
                yaz.write("bolge//"+jComboBox1.getSelectedIndex()+"\n");
                yaz.write("hareket//"+jComboBox2.getSelectedIndex()+"\n");
                yaz.close();
                
                JOptionPane.showMessageDialog(null, "Kayıt başarı ile gerçekleşti.", "Kayıt", JOptionPane.INFORMATION_MESSAGE);
                
                buttonGroup1.clearSelection();
                jTextArea_Adres.setText("");
                jTextArea_Program.setText("");
                jTextField_Ad.setText("");
                jTextField_Soyad.setText("");
                jFormattedTextField_Telefon.setText("");
                jTextField_Yas.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jList1.clearSelection();
            } catch (IOException ee) {
                System.out.println("HATA!");
            }
        }
    }//GEN-LAST:event_jMenuItem_KaydetActionPerformed

    private void jMenuItem_AcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AcActionPerformed
       if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {    
                FileReader fr = new FileReader(jFileChooser1.getSelectedFile().getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);
                
                String line = br.readLine();

                while (line != null) {
                    String[] parcala = line.split("//");
                    switch(parcala[0]) {
                        case "ad":
                            jTextField_Ad.setText(parcala[1]);
                            break;
                        case "soyad":
                            jTextField_Soyad.setText(parcala[1]);
                            break;
                        case "tel":
                            jFormattedTextField_Telefon.setText(parcala[1]);
                            break; 
                        case "adres":
                            jTextArea_Adres.setText(parcala[1].replaceAll("\t", "\n"));
                            break; 
                        case "program":
                            jTextArea_Program.setText(parcala[1].replaceAll("\t", "\n"));
                            break;
                        case "bolge":
                            jComboBox1.setSelectedIndex(Integer.valueOf(parcala[1]));
                            break;
                        case "hareket":
                            jComboBox2.setSelectedIndex(Integer.valueOf(parcala[1]));
                            break;
                        case "cinsiyet":
                            if (parcala[1].equals("Erkek"))
                                jRadioButton_Erkek.setSelected(true);
                            else
                                jRadioButton_Kadin.setSelected(true);
                            break;
                        case "yas":
                            jTextField_Yas.setText(parcala[1]);
                            break;
                        case "süre":
                            int[] secilenler = new int[parcala.length-1]; 
                            for(int i = 1; i < parcala.length; i++)
                                secilenler[i-1] = Integer.valueOf(parcala[i]);
                            
                            jList1.setSelectedIndices(secilenler);
                            break;
                    }
                    line = br.readLine();
                }
                br.close();
            } catch (IOException ee) {
                JOptionPane.showMessageDialog(null, "Hata", "Dosya bulunamadı", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException  ee) {
                JOptionPane.showMessageDialog(null, "Hata", "Dosya formatını kontrol edin", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem_AcActionPerformed

    private void jMenuItem_CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_CikisActionPerformed

    private void jMenuItem_TextAreaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TextAreaSilActionPerformed
        jTextArea_Program.setText("");
    }//GEN-LAST:event_jMenuItem_TextAreaSilActionPerformed

    private void jMenuItem_TextAreaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TextAreaEkleActionPerformed
        jTextArea_Program.append( jComboBox1.getSelectedItem() + 
                            "/" + jComboBox2.getSelectedItem() + 
                            "/" + jComboBox3.getSelectedItem() + "\n");
    }//GEN-LAST:event_jMenuItem_TextAreaEkleActionPerformed
    
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
            java.util.logging.Logger.getLogger(HAFTA_9_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAFTA_9_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAFTA_9_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAFTA_9_1_ODEV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAFTA_9_1_ODEV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_KaydetVeCik;
    private javax.swing.JButton jButton_UyelikSecim;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField_Telefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Ac;
    private javax.swing.JMenuItem jMenuItem_Cikis;
    private javax.swing.JMenuItem jMenuItem_Kaydet;
    private javax.swing.JMenuItem jMenuItem_TextAreaEkle;
    private javax.swing.JMenuItem jMenuItem_TextAreaSil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton_Erkek;
    private javax.swing.JRadioButton jRadioButton_Kadin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea_Adres;
    private javax.swing.JTextArea jTextArea_Program;
    private javax.swing.JTextField jTextField_Ad;
    private javax.swing.JTextField jTextField_Soyad;
    private javax.swing.JTextField jTextField_Yas;
    // End of variables declaration//GEN-END:variables

}

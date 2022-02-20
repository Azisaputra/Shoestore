/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shoestore;
/**
 *
 * @author Muhammad Azis Saputra - 2301974313
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Shoestore extends javax.swing.JFrame {

    String Tanggal;
    private DefaultTableModel model;
    
    public void totalBiaya(){
        int jumlahBaris = jTable1.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            hargaBarang = Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        GrandTot.setText(String.valueOf(totalBiaya));
        GrandTot.setText("Rp "+ totalBiaya +",00");
    }
    public void loadData(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            
            ShoesID.getSelectedItem(),
            ShoesName.getText(),
            Qty.getText(),
            Price.getText(),
            GrandTot.getText()
        });
    }
    public void utama(){
        purchaseID.setText("");
        ShoesName.setText("");
        Qty.setText("");
        Price.setText("");
    }
     public void clear(){
        purchaseID.setText("");
        tanggal.setCalendar(null);
        VendorCode.setText("");
        CustName.setText("");
        VendorReff.setText("");
        
    }
    public void clear2(){
        ShoesID.getSelectedItem();
        ShoesName.setText("");
        Qty.setText("");
        Price.setText("");
    }
    
    public void tambahTransaksi(){
        int jumlah, harga, total;
        
        jumlah = Integer.valueOf(Qty.getText());
        harga = Integer.valueOf(Price.getText());
        total = jumlah * harga;
        
        GrandTot.setText(String.valueOf(total));
        
        loadData();
        totalBiaya();
        clear2();
        ShoesID.requestFocus();
    }
    public void kosong(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        while (model.getRowCount()>0) {
            model.removeRow(0);
        }
    }
    public Shoestore() {
        initComponents();
        ShoesCombo();
        
        //Create Table
        model = new DefaultTableModel();
        
        jTable1.setModel(model);
        model.addColumn("No");
        model.addColumn("Nama Sepatu");
        model.addColumn("Qty");
        model.addColumn("Price");
        model.addColumn("Sub Total");
        
        utama();
        
        GrandTot.setText("0");
        ShoesID.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnSimpan = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ShoesID = new javax.swing.JComboBox<>();
        ShoesName = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnHapus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        GrandTot = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        purchaseID = new javax.swing.JTextField();
        VendorCode = new javax.swing.JTextField();
        VendorReff = new javax.swing.JTextField();
        BtnViewCust = new javax.swing.JButton();
        CustName = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(jTable1);

        BtnSimpan.setBackground(new java.awt.Color(102, 153, 255));
        BtnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BtnSimpan.setText("Simpan");
        BtnSimpan.setActionCommand("");
        BtnSimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnKeluar.setBackground(new java.awt.Color(255, 0, 51));
        BtnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        BtnKeluar.setText("Keluar");
        BtnKeluar.setActionCommand("");
        BtnKeluar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setAlignmentX(1.0F);
        jPanel5.setAlignmentY(1.0F);

        ShoesID.setBackground(new java.awt.Color(255, 255, 255));
        ShoesID.setForeground(new java.awt.Color(0, 0, 0));
        ShoesID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih ID Sepatu---" }));
        ShoesID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesIDActionPerformed(evt);
            }
        });

        ShoesName.setBackground(new java.awt.Color(255, 255, 255));
        ShoesName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ShoesName.setForeground(new java.awt.Color(0, 0, 0));
        ShoesName.setEnabled(false);
        ShoesName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesNameActionPerformed(evt);
            }
        });

        Qty.setBackground(new java.awt.Color(255, 255, 255));
        Qty.setForeground(new java.awt.Color(0, 0, 0));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });

        Price.setBackground(new java.awt.Color(255, 255, 255));
        Price.setForeground(new java.awt.Color(0, 0, 0));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        BtnTambah.setBackground(new java.awt.Color(102, 153, 255));
        BtnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTambah.setForeground(new java.awt.Color(255, 255, 255));
        BtnTambah.setText("+");
        BtnTambah.setActionCommand("");
        BtnTambah.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Shoes ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Sepatu");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");

        BtnHapus.setBackground(new java.awt.Color(255, 0, 51));
        BtnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapus.setText("-");
        BtnHapus.setActionCommand("");
        BtnHapus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(ShoesID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShoesName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShoesID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShoesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTambah)
                    .addComponent(BtnHapus))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Shoes Store");

        GrandTot.setBackground(new java.awt.Color(255, 153, 51));
        GrandTot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GrandTot.setForeground(new java.awt.Color(0, 0, 0));
        GrandTot.setText("Grand total");
        GrandTot.setEnabled(false);
        GrandTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrandTotActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 102));
        jPanel3.setForeground(new java.awt.Color(153, 255, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" Purchase ID    :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tanggal            :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vendor RefNo :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Kode Vendor   :");

        purchaseID.setBackground(new java.awt.Color(255, 255, 255));
        purchaseID.setForeground(new java.awt.Color(0, 0, 0));

        VendorCode.setBackground(new java.awt.Color(255, 255, 255));
        VendorCode.setForeground(new java.awt.Color(0, 0, 0));

        VendorReff.setBackground(new java.awt.Color(255, 255, 255));
        VendorReff.setForeground(new java.awt.Color(0, 0, 0));
        VendorReff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorReffActionPerformed(evt);
            }
        });

        BtnViewCust.setBackground(new java.awt.Color(255, 153, 51));
        BtnViewCust.setForeground(new java.awt.Color(0, 0, 0));
        BtnViewCust.setText("View");
        BtnViewCust.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnViewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewCustActionPerformed(evt);
            }
        });

        CustName.setBackground(new java.awt.Color(255, 255, 255));
        CustName.setForeground(new java.awt.Color(0, 0, 0));
        CustName.setEnabled(false);

        tanggal.setBackground(new java.awt.Color(255, 255, 255));
        tanggal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VendorReff, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VendorCode, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(BtnViewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(purchaseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VendorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnViewCust)
                    .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VendorReff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(GrandTot, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(GrandTot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewCustActionPerformed
        // TODO add your handling code here:
        String cust_name = null;
        String vendorcode = VendorCode.getText();
        
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "Select customer_name from customer where customer_id = '" + vendorcode + "'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {                
              cust_name = rs.getString(1);  
            }
            if(cust_name != null){
                CustName.setText(cust_name+"");
            }else{
                CustName.setText("Customer Belum Terdaftar");
            }
            
            
        } catch (Exception e) {
            System.out.println("Cari Data 1 Error");
        }finally{
        }
    }//GEN-LAST:event_BtnViewCustActionPerformed

    private void GrandTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrandTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GrandTotActionPerformed
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
        if(date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        return null;
    }
    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      
        String sales_id = purchaseID.getText();
        Date tgl = tanggal.getDate();
        String customer_id = VendorCode.getText();
        String customer_refno = VendorReff.getText();
     
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "INSERT INTO sales VALUES (?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, sales_id);
            p.setDate(2, convertUtilDateToSqlDate(tanggal.getDate()));
            p.setString(3, customer_id);
            p.setString(4, customer_refno);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            System.out.println("simpan penjualan error");
        }
        
        try {
            Connection c = koneksi.getKoneksi();
            int baris = jTable1.getRowCount();
            
            for (int i = 0; i < baris; i++) {
                String sql = "INSERT INTO sales_detail(sales_id, shoes_id, qty, price) VALUES('"
                        + sales_id +"','"+ jTable1.getValueAt(i, 0) +"','"+ jTable1.getValueAt(i, 2) 
                        +"','"+ jTable1.getValueAt(i, 3)+"');";
                String sqlstock = "UPDATE shoes,"
                        + "(SELECT a.stock as stock "
                        + "FROM shoes a WHERE a.shoes_id = '"+ jTable1.getValueAt(i, 0) +"') s"
                        + " SET shoes.stock = s.stock-"+ jTable1.getValueAt(i, 2) 
                        +" WHERE shoes_id = '"+ jTable1.getValueAt(i, 0) +"'";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate();
                p.close();
                
                PreparedStatement r = c.prepareStatement(sqlstock);
                r.executeUpdate();
                r.close();
                
                
//               
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        clear();
        utama();
        kosong();
        GrandTot.setText("Rp. 0");
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        // TODO add your handling code here:
        System.out.println("Berhasil keluar dari program");
        System.exit(0);
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void VendorReffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorReffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendorReffActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
            // TODO add your handling code here:
        clear2();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        tambahTransaksi();
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
           // TODO add your handling code here:
           
           tambahTransaksi();
    }//GEN-LAST:event_PriceActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void ShoesNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShoesNameActionPerformed
    public void ShoesCombo(){
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "Select shoes_id from shoes";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) { 
              ShoesID.addItem(rs.getString(1));
               
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
            
            
        } catch (Exception e) {
//            System.out.println("Cari Data Error");
        }finally{
        }
    }
    private void ShoesIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesIDActionPerformed
        // TODO add your handling code here:
        
        String shoes_id,shoes_nama = null;
        shoes_id = String.valueOf(ShoesID.getSelectedItem());
        
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "Select * from shoes where shoes_id like '%" + shoes_id + "%'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {                
              shoes_nama = rs.getString(2);  
            }
            
            ShoesName.setText(""+shoes_nama);
            
        } catch (Exception e) {
            System.out.println("Cari Data 1 Error");
        }finally{
        }
    }//GEN-LAST:event_ShoesIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Shoestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shoestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shoestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shoestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shoestore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnViewCust;
    private javax.swing.JTextField CustName;
    private javax.swing.JTextField GrandTot;
    public static javax.swing.JTextField Price;
    private javax.swing.JTextField Qty;
    public static javax.swing.JComboBox<String> ShoesID;
    public static javax.swing.JTextField ShoesName;
    public javax.swing.JTextField VendorCode;
    private javax.swing.JTextField VendorReff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField purchaseID;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}

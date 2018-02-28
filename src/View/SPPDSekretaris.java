/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Util.SPPDUtil;
import static Util.SPPDUtil.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stu
 */
public class SPPDSekretaris extends javax.swing.JFrame {

    /**
     * Creates new form SPPD
     */
    public SPPDSekretaris() {
        initComponents();
        keKomboNIP();
        keKomboWilayah();
        keKomboTarif();
        keKomboTransportasi();
        keKomboKegiatan();
        semuadata();
    }
    public void keKomboNIP(){
        try {
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            String query = "SELECT * FROM pegawai";
            ResultSet rs = statement.executeQuery(query);
             
            while (rs.next()) {                
                comboNIP.addItem(rs.getString("nip"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();   
        } catch (SQLException e) {
        }
    }
    public void keKomboWilayah(){
        try {
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            String query = "SELECT * FROM wilayah";
            ResultSet rs = statement.executeQuery(query);
             
            while (rs.next()) {                
                comboWilayah.addItem(rs.getString("kodeWilayah"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();   
        } catch (SQLException e) {
        }
    }
    public void keKomboTransportasi(){
        try {
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            String query = "SELECT * FROM transportasi";
            ResultSet rs = statement.executeQuery(query);
             
            while (rs.next()) {                
                comboTransportasi.addItem(rs.getString("kodeTransportasi"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();   
        } catch (SQLException e) {
        }
    }
    public void keKomboTarif(){
        try {
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            String query = "SELECT * FROM tarif";
            ResultSet rs = statement.executeQuery(query);
             
            while (rs.next()) {                
                comboTarif.addItem(rs.getString("kodeTarif"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();   
        } catch (SQLException e) {
        }
    }   
    public void keKomboKegiatan(){
        try {
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            String query = "SELECT * FROM kegiatan";
            ResultSet rs = statement.executeQuery(query);
             
            while (rs.next()) {                
                comboKegiatan.addItem(rs.getString("kodeKegiatan"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();   
        } catch (SQLException e) {
        }
    }   
    public void save(){
        try {
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = String.valueOf(fm.format(dateBerangkat.getDate()));
            String tanggal1 = String.valueOf(fm.format(dateKembali.getDate()));

            if (txtNomorSPPD.getText().equals("")&&("").equals(comboNIP.getSelectedItem())&&("").equals(comboWilayah.getSelectedItem())&&("").equals(comboTarif.getSelectedItem())&&("").equals(comboTransportasi.getSelectedItem())&&("").equals(comboKegiatan.getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Data Tidak lengkap");
            } else {
                Statement statement = (Statement) SPPDUtil.getConnection().createStatement();        
                String query = "insert into formsppd values ('"+txtNomorSPPD.getText()+"','"+comboNIP.getSelectedItem()+"','"+tanggal+"','"+tanggal1+"','"+comboWilayah.getSelectedItem() +"','"+comboTransportasi.getSelectedItem()+"','"+comboTarif.getSelectedItem()+"','"+comboKegiatan.getSelectedItem()+"','Belum diverifikasi'"+")";
                
                int res = statement.executeUpdate(query);
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Insert Data Sukses !");
                    
                }
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        semuadata();
    }

    private void semuadata(){
            DefaultTableModel data = new DefaultTableModel();
            data.addColumn("Nomor SPPD");
            data.addColumn("NIP");
            data.addColumn("Tanggal Berangkat");
            data.addColumn("Tanggal Kembali");
            data.addColumn("Kode Wilayah");
            data.addColumn("Kode Transportasi");
            data.addColumn("Kode Tarif");
            data.addColumn("Kode Kegiatan");
            data.addColumn("Status");
             try{
                 getConnection();
                String sql = "Select * from formsppd";
                Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
                ResultSet hasil = statement.executeQuery(sql);
                while(hasil.next()){
                    data.addRow(new Object[]{hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5),hasil.getString(6),hasil.getString(7),hasil.getString(8),hasil.getString(9)});
                } 
                    tabelSPPD.setModel(data);
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error :"+e.getMessage());
        }
    }
    private void reset(){
        txtNomorSPPD.setText("");
        //txtNama.setText("");
        comboNIP.setSelectedItem(null);
        comboWilayah.setSelectedItem(null);
        comboTransportasi.setSelectedItem(null);
        comboTarif.setSelectedItem(null);
        comboKegiatan.setSelectedItem(null);
    }
    private void edit(){
        try {
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = String.valueOf(fm.format(dateBerangkat.getDate()));
            String tanggal1 = String.valueOf(fm.format(dateKembali.getDate()));
            String sql ="UPDATE formsppd SET nomorSPPD = '"+txtNomorSPPD.getText()+"', nip = '"+comboNIP.getSelectedItem()+"', tanggalBerangkat = '"+tanggal+"', tanggalKembali = '"+tanggal1+"', kodeWilayah = '"+comboWilayah.getSelectedItem()+"', kodeTransportasi = '"+comboTransportasi.getSelectedItem()+"', kodeTarif = '"+comboTarif.getSelectedItem()+"', kodeKegiatan = '"+comboKegiatan.getSelectedItem()+"'WHERE nomorSPPD = '"+txtNomorSPPD.getText()+"'";
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            int res = statement.executeUpdate(sql);
            if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Perubahan Data Sukses !");
                    
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        semuadata();
        reset();
    }
    private void hapus(){
        try {
            String sql ="delete from formSPPD WHERE nomorSPPD = '"+txtNomorSPPD.getText()+"'";
            Statement statement = (Statement) SPPDUtil.getConnection().createStatement();
            int res = statement.executeUpdate(sql);
            if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Hapus Data Sukses !");
                    
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hapus Data Gagal"+e.getMessage());
        }
        semuadata();
        reset();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboTarif = new javax.swing.JComboBox<>();
        comboTransportasi = new javax.swing.JComboBox<>();
        comboWilayah = new javax.swing.JComboBox<>();
        dateKembali = new com.toedter.calendar.JDateChooser();
        dateBerangkat = new com.toedter.calendar.JDateChooser();
        comboNIP = new javax.swing.JComboBox<>();
        txtNomorSPPD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboKegiatan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSPPD = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("DFKai-SB", 1, 24)); // NOI18N
        jLabel2.setText("SPPD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(482, 482, 482))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        comboTarif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Silahkan Pilih Kode Tarif--" }));

        comboTransportasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Silahkan Pilih Kode Transportasi--" }));

        comboWilayah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Silahakan Pilih Kode Wilayah--" }));
        comboWilayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboWilayahActionPerformed(evt);
            }
        });

        comboNIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Silahkan pilih NIP Pegawai--" }));
        comboNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNIPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("NIP");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tanggal Berangkat");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Tanggal Kembali");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Kode Wilayah");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Kode Transportasi");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Kode Tarif");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Kode Kegiatan");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Nomor SPPD");

        comboKegiatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Silahkan Pilih Kode Kegiatan--" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTarif, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboTransportasi, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboWilayah, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(dateBerangkat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboNIP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomorSPPD)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(comboKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomorSPPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(dateBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboWilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboTransportasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tabelSPPD.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelSPPD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSPPDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSPPD);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnReset)
                    .addComponent(btnKembali))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboWilayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboWilayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboWilayahActionPerformed

    private void comboNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNIPActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       edit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        HomeBuatSekretaris a = new HomeBuatSekretaris();
        a.setVisible(true); 
        this.dispose();       
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tabelSPPDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSPPDMouseClicked
        int baris = tabelSPPD.rowAtPoint(evt.getPoint());
        String nomor =tabelSPPD.getValueAt(baris, 0).toString();
        txtNomorSPPD.setText(nomor);
        String nip = tabelSPPD.getValueAt(baris, 1).toString();
        comboNIP.setSelectedItem(nip);
        String wilayah = tabelSPPD.getValueAt(baris, 4).toString();
        comboWilayah.setSelectedItem(wilayah);
        String transportasi = tabelSPPD.getValueAt(baris, 5).toString();
        comboTransportasi.setSelectedItem(transportasi);
        String tarif = tabelSPPD.getValueAt(baris, 6).toString();
        comboTarif.setSelectedItem(tarif);
        String kegiatan = tabelSPPD.getValueAt(baris, 7).toString();
        comboKegiatan.setSelectedItem(kegiatan);
    }//GEN-LAST:event_tabelSPPDMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        HomeBuatSekretaris a = new HomeBuatSekretaris();
        a.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(SPPDSekretaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPPDSekretaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPPDSekretaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPPDSekretaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPPDSekretaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboKegiatan;
    private javax.swing.JComboBox<String> comboNIP;
    private javax.swing.JComboBox<String> comboTarif;
    private javax.swing.JComboBox<String> comboTransportasi;
    private javax.swing.JComboBox<String> comboWilayah;
    private com.toedter.calendar.JDateChooser dateBerangkat;
    private com.toedter.calendar.JDateChooser dateKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelSPPD;
    private javax.swing.JTextField txtNomorSPPD;
    // End of variables declaration//GEN-END:variables
}

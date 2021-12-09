/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Class.CoPhieu;
import Frame.FrAddCP;
import Frame.FrMain;

import static Frame.FrMain.jPanelMQLCP;
import static Frame.FrMain.ketNoi;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelCoPhieu extends javax.swing.JPanel {

    private String maCP;
    
    public void layDataTTCP() {

        DefaultTableModel dtm = (DefaultTableModel) jTableTTCP.getModel();
        dtm.setNumRows(0);
       
        Vector vt;
        String sql = "select * from CoPhieu";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CoPhieu tknh = new CoPhieu(rs.getString("MaCP"), rs.getString("TenCT"), rs.getString("DiaChi"), rs.getString("SDT"), rs.getString("Email"), rs.getInt("SLCoPhieu"),rs.getFloat("GiaNiemYet"));

                vt = new Vector();
                vt.add(tknh.getMaCP());
                vt.add(tknh.getTenCT());
                vt.add(tknh.getDiaChi());
                vt.add(tknh.getSDT());
                vt.add(tknh.getEmail());
                vt.add(tknh.getSoLg());
                vt.add(tknh.getGiaNiemYet());

                dtm.addRow(vt);
            }
            jTableTTCP.setModel(dtm);
            rs.close();
            ps.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public PanelCoPhieu() {
        initComponents();
       
        layDataTTCP();
        //jTableTTCP.setRowSelectionInterval(-1, -1);
    }

    public void xoaCP(String maCP) {
        String sql = "delete from GiaThamChieu where MaCP = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maCP);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "delete from CoPhieu where MaCP = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maCP);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTTCP = new javax.swing.JTable();
        jButtonAddCP = new javax.swing.JButton();
        jButtonEditCP = new javax.swing.JButton();
        jButtonDelCP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        
        setBackground(new java.awt.Color(0, 0, 0));

        jTableTTCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableTTCP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã CP", "Tên Công Ty", "Địa chỉ","Số điện thoại", "Email", "Số Lượng cổ phiếu", "Gía niêm yết"
            }
        ));
        jTableTTCP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableTTCP.setFillsViewportHeight(true);
        jTableTTCP.setFocusable(false);
        jTableTTCP.setRowHeight(30);
        jTableTTCP.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTableTTCP.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableTTCP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTTCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTTCPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableTTCP);
        jTableTTCP.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        jTableTTCP.getTableHeader().setForeground(Color.BLACK);

        jButtonAddCP.setText("Add");
        jButtonAddCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCPActionPerformed(evt);
            }
        });

        jButtonEditCP.setText("Edit");
        jButtonEditCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditCPActionPerformed(evt);
            }
        });

        jButtonDelCP.setText("Delete");
        jButtonDelCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelCPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("THÔNG TIN CỔ PHIẾU");

     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(582, 582, 582))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(595, 595, 595)
                        .addComponent(jButtonAddCP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditCP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelCP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelCP)
                    .addComponent(jButtonEditCP)
                    .addComponent(jButtonAddCP))
                .addGap(0, 81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTTCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTTCPMouseClicked
        // TODO add your handling code here:
        maCP= jTableTTCP.getValueAt(jTableTTCP.getSelectedRow(), 0).toString();
        
    }//GEN-LAST:event_jTableTTCPMouseClicked

    private void jButtonAddCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCPActionPerformed
        // TODO add your handling code here:
        new FrAddCP().setVisible(true);
        jPanelMQLCP.removeAll();
        jPanelMQLCP.add(new PanelCoPhieu());
        jPanelMQLCP.repaint();
        jPanelMQLCP.revalidate();

    }//GEN-LAST:event_jButtonAddCPActionPerformed

    private void jButtonEditCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditCPActionPerformed
        // TODO add your handling code here:
        if("".equals(maCP))
        {
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Cổ Phiếu");
            return;
        }
       new FrAddCP(2, maCP).setVisible(true);
    }//GEN-LAST:event_jButtonEditCPActionPerformed
    
   
    private void jButtonDelCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelCPActionPerformed
        // TODO add your handling code here:
        if("".equals(maCP))
        {
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Cổ Phiếu");
            return;
        }
        
        int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xoá?", "Xác nhận", 0);
        if (ret == JOptionPane.CANCEL_OPTION) {

        } else if (ret == JOptionPane.OK_OPTION) {
            xoaCP(maCP);
            JOptionPane.showMessageDialog(this, "Xóa cổ phiếu thành công");
            layDataTTCP();
        }
    }//GEN-LAST:event_jButtonDelCPActionPerformed
    
    private javax.swing.JButton jButtonAddCP;
    private javax.swing.JButton jButtonDelCP;
    private javax.swing.JButton jButtonEditCP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableTTCP;
    // End of variables declaration//GEN-END:variables
}

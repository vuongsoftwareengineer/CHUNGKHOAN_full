/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Class.SoHuu;
import static Frame.FrMain.ketNoi;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class PanelSoHuu extends javax.swing.JPanel {

    public PanelSoHuu() {
        initComponents();
        layDataLK();
    }

    public void layDataLK() {

        DefaultTableModel dtm = (DefaultTableModel) jTableSoHuu.getModel();
        dtm.setNumRows(0);

       
        Vector vt;
        String sql = "select * from SoHuu";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SoHuu cp = new SoHuu(rs.getString("MaTK"), rs.getString("MaCP"), rs.getInt("SoLuong"));
                vt = new Vector();
                vt.add(cp.getMaTK());
                vt.add(cp.getMaCP());
                vt.add(cp.getSoLuong());
                dtm.addRow(vt);
            }
            jTableSoHuu.setModel(dtm);
            rs.close();
            ps.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(PanelSoHuu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTableSoHuu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jTableSoHuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableSoHuu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MãTK", "MãCP","SốLượng"
            }
        ));
        jTableSoHuu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableSoHuu.setFillsViewportHeight(true);
        jTableSoHuu.setRowHeight(30);
        jTableSoHuu.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableSoHuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSoHuuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableSoHuu);
        jTableSoHuu.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        jTableSoHuu.getTableHeader().setOpaque(false);
        jTableSoHuu.getTableHeader().setBackground(Color.BLUE);
        jTableSoHuu.getTableHeader().setForeground(new Color(0,0,0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DANH SÁCH SỞ HỮU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(226)
        					.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(435)
        					.addComponent(jLabel6)))
        			.addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(62)
        			.addComponent(jLabel6)
        			.addGap(38)
        			.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
        			.addGap(222))
        );
        this.setLayout(layout);
    }
    
    private void jTableSoHuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSoHuuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSoHuuMouseClicked

    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableSoHuu;
    // End of variables declaration//GEN-END:variables
}

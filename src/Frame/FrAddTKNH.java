/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Frame.SQLCommand;
import Class.TKNH;
/**
 *
 * @author dgleu
 */
public class FrAddTKNH extends javax.swing.JFrame {

    /**
     * Creates new form TaomoiTKNH
     */
    public FrAddTKNH() {
        initComponents();
    }
    private static TKNH t= new TKNH();
    private static SQLCommand SQL = new SQLCommand();
    public void GetInput(){
        t.setMaTKNH(MaTKNH_TF.getText());
        t.setMaTK(MaTK_TF.getText());
        t.setMaNH(MaNH_TF.getText());
        t.setSoTien(SoTien_TF.getText());
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        MaTKNH_L = new javax.swing.JLabel();
        MaTK_L = new javax.swing.JLabel();
        MaNH_L = new javax.swing.JLabel();
        SoTien_L = new javax.swing.JLabel();
        MaTKNH_TF = new javax.swing.JTextField();
        MaTK_TF = new javax.swing.JTextField();
        MaNH_TF = new javax.swing.JTextField();
        SoTien_TF = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setText("Tao moi TKNH");

        MaTKNH_L.setText("Ma TKNH");

        MaTK_L.setText("Ma TK");

        MaNH_L.setText("Ma NH");

        SoTien_L.setText("So Tien");

        MaTK_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaTK_TFActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaTKNH_L)
                            .addComponent(MaTK_L)
                            .addComponent(MaNH_L)
                            .addComponent(SoTien_L))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoTien_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNH_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaTK_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaTKNH_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(OKButton)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaTKNH_L)
                    .addComponent(MaTKNH_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaTK_L)
                    .addComponent(MaTK_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaNH_L)
                    .addComponent(MaNH_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoTien_L)
                    .addComponent(SoTien_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        GetInput();
        if (SQL.setTKNH(t)==1){
            JOptionPane.showMessageDialog(rootPane, "Dang ky thanh cong");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Dang ky that bai! Vui long kiem tra lai");
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void MaTK_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaTK_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaTK_TFActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JLabel MaNH_L;
    private javax.swing.JTextField MaNH_TF;
    private javax.swing.JLabel MaTKNH_L;
    private javax.swing.JTextField MaTKNH_TF;
    private javax.swing.JLabel MaTK_L;
    private javax.swing.JTextField MaTK_TF;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel SoTien_L;
    private javax.swing.JTextField SoTien_TF;
    // End of variables declaration//GEN-END:variables
}

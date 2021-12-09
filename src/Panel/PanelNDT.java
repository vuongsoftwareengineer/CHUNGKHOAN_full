package Panel;

import javax.swing.JOptionPane;

import Frame.FrAddNDT;
import Frame.FrSuaNDT;
import Frame.SQLCommand;
import Class.NhaDauTu;


public class PanelNDT extends javax.swing.JFrame {

    private static NhaDauTu NDT = new NhaDauTu();
    private static SQLCommand SQL = new SQLCommand();
    public PanelNDT() {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BT_Them = new javax.swing.JButton();
        BT_Xoa = new javax.swing.JButton();
        BT_Sua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nha Dau Tu");

        BT_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BT_Them.setText("Them Moi");
        BT_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThemActionPerformed(evt);
            }
        });

        BT_Xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BT_Xoa.setText("Xoa");
        BT_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_XoaActionPerformed(evt);
            }
        });

        BT_Sua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BT_Sua.setText("Sua");
        BT_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SuaActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BT_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(BT_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThemActionPerformed
        // TODO add your handling code here:
        new FrAddNDT().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_ThemActionPerformed

    private void BT_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_XoaActionPerformed
//        // TODO add your handling code here:
        String input = null;
        input =(String) JOptionPane.showInputDialog(rootPane,
                "Nhap MaTK muon xoa",
                "XOA",
                JOptionPane.PLAIN_MESSAGE);
        //input=input.trim();
        System.out.println(input);
        if(SQL.deleteNDT(input)==1)
        {
            JOptionPane.showMessageDialog(rootPane, "Xoa thanh cong");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Xoa that bai! Vui long kiem tra lai");
        }

    }//GEN-LAST:event_BT_XoaActionPerformed

    private void BT_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SuaActionPerformed
        // TODO add your handling code here:
        
        //
        this.dispose();
        new FrSuaNDT().setVisible(true);
        
        
        
    }//GEN-LAST:event_BT_SuaActionPerformed

    private javax.swing.JButton BT_Sua;
    private javax.swing.JButton BT_Them;
    private javax.swing.JButton BT_Xoa;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

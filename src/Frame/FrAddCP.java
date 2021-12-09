package Frame;

import Class.CoPhieu;
import static Frame.FrMain.jPanelMQLCP;
import static Frame.FrMain.ketNoi;
import Panel.PanelNDT;
import Panel.PanelCoPhieu;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrAddCP extends javax.swing.JFrame {

    public int kt=1;

    public CoPhieu layDataCP(String maCP) {
        
        CoPhieu tknh=null;
        Vector vt;
        String sql = "select * from CoPhieu WHERE MaCP='"+maCP+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tknh = new CoPhieu(rs.getString("MaCP"), rs.getString("TenCT"), rs.getString("DiaChi"), rs.getString("SDT"), rs.getString("Email"), rs.getInt("SLCoPhieu"),rs.getFloat("GiaNiemYet"));

            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tknh;
    }
    
    public FrAddCP() {
        initComponents();
    }

    public FrAddCP(int kt, String maCP) throws HeadlessException {
        this.kt = kt;
        initComponents();
        CoPhieu cp=layDataCP(maCP);
        this.jTextFieldCongTy.setText(cp.getTenCT());
        this.jTextFieldDiaChi.setText(cp.getDiaChi());
        this.jTextFieldEmail.setText(cp.getEmail());
        this.jTextFieldMCP.setText(cp.getMaCP());
       this.jTextFieldSDT.setText(cp.getSDT());
        this.jTextFieldSoLg.setText(String.valueOf(cp.getSoLg()));
        this.jTextFieldGiaNiemYet.setText(String.valueOf(cp.getGiaNiemYet()));
       
        if(kt==2)
        {
            jTextFieldMCP.setEditable(false);
            jTextFieldGiaNiemYet.setEditable(false);
        }
    }
     
    public void addCoPhieu(CoPhieu cp) {
       
        String sql = "INSERT INTO CoPhieu VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, cp.getMaCP());
            ps.setString(2, cp.getTenCT());
            ps.setString(3, cp.getDiaChi());
            ps.setString(4,cp.getSDT()) ;
            ps.setString(5, cp.getEmail());
            ps.setInt(6, cp.getSoLg());
            ps.setFloat(7, cp.getGiaNiemYet());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrAddCP.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void updateCP(CoPhieu cp) {
       
        String sql = " UPDATE CoPhieu SET MaSan=?,TenCT=?,DiaChi=?,SDT=?,Fax=?,DiaChiWeb=?,Email=?,SLCoPhieu=? WHERE MaCP='" + cp.getMaCP()+ "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, cp.getTenCT());
            ps.setString(2, cp.getDiaChi());
            ps.setString(3,cp.getSDT()) ;
            ps.setString(4, cp.getEmail());
            ps.setInt(5, cp.getSoLg());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FrAddCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean testMaCP()
    {
        boolean tonTai = false;
        String sql = "select * from CoPhieu where MaCP ='" + jTextFieldMCP.getText() + "'" ;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tonTai = true;
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelNDT.class.getName()).log(Level.SEVERE, null, ex);

        }
        return tonTai;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMCP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCongTy = new javax.swing.JTextField();
        jTextFieldDiaChi = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSoLg = new javax.swing.JTextField();
        jButtonXN = new javax.swing.JButton();
        jButtonCa = new javax.swing.JButton();
        jTextFieldSDT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldGiaNiemYet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("SĐT:");

        jTextFieldMCP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldMCP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        jTextFieldMCP.setPreferredSize(new java.awt.Dimension(0, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Số Lượng Niêm Yết:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Mã Cổ Phiếu:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tên Công Ty:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Địa Chỉ");

        jTextFieldCongTy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCongTy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldCongTy.setPreferredSize(new java.awt.Dimension(0, 25));

        jTextFieldDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldDiaChi.setPreferredSize(new java.awt.Dimension(0, 25));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(0, 25));

        jTextFieldSoLg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldSoLg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldSoLg.setPreferredSize(new java.awt.Dimension(0, 25));

        jButtonXN.setBackground(new java.awt.Color(0, 0, 0));
        jButtonXN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXN.setText("Xác Nhận");
        jButtonXN.setBorder(null);
        jButtonXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXNActionPerformed(evt);
            }
        });

        jButtonCa.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCa.setText("Cancel");
        jButtonCa.setBorder(null);
        jButtonCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaActionPerformed(evt);
            }
        });

        jTextFieldSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldSDT.setPreferredSize(new java.awt.Dimension(0, 25));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ĐĂNG KÍ CỔ PHIẾU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel16)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTextFieldGiaNiemYet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldGiaNiemYet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldGiaNiemYet.setOpaque(false);
        jTextFieldGiaNiemYet.setPreferredSize(new java.awt.Dimension(0, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Giá Niêm Yết");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(78)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel1)
        							.addComponent(jLabel3, Alignment.TRAILING))
        						.addComponent(jLabel5)
        						.addComponent(jLabel4)
        						.addComponent(jLabel8))
        					.addGap(75)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldDiaChi, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldSDT, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldCongTy, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldMCP, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel9)
        						.addComponent(jLabel10))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextFieldGiaNiemYet, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldSoLg, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(119, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(369)
        			.addComponent(jButtonXN, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(72)
        			.addComponent(jButtonCa, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextFieldMCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextFieldCongTy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5)
        				.addComponent(jTextFieldSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(jLabel4)
        					.addGap(27)
        					.addComponent(jLabel8))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jTextFieldDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(31)
        					.addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(29)
        					.addComponent(jLabel9))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jTextFieldSoLg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel10)
        				.addComponent(jTextFieldGiaNiemYet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonCa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonXN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(243))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(18))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCaActionPerformed

    private void jButtonXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXNActionPerformed
        // TODO add your handling code here:
        if(kt==3)
        {
            this.setVisible(false);
        }
        else if(kt==1)
        {
            if (testMaCP()) {
                JOptionPane.showMessageDialog(this, "MaCP Đã Tồn Tại");
                return;
            }
            
           
            addCoPhieu(new CoPhieu(jTextFieldMCP.getText(),jTextFieldCongTy.getText(), jTextFieldDiaChi.getText(), jTextFieldSDT.getText(), jTextFieldEmail.getText(), Integer.valueOf(jTextFieldSoLg.getText()),Float.valueOf(jTextFieldGiaNiemYet.getText())));
            System.out.println(jTextFieldMCP.getText());
            JOptionPane.showMessageDialog(this, "SUCCES");
            this.setVisible(false);

            jPanelMQLCP.removeAll();
            jPanelMQLCP.add(new PanelCoPhieu());
            jPanelMQLCP.repaint();
            jPanelMQLCP.revalidate();
        }
        else
        {
            
            updateCP(new CoPhieu(jTextFieldMCP.getText(), jTextFieldCongTy.getText(), jTextFieldDiaChi.getText(), jTextFieldSDT.getText(), jTextFieldEmail.getText(), Integer.valueOf(jTextFieldSoLg.getText()),Float.valueOf(jTextFieldGiaNiemYet.getText())));
            JOptionPane.showMessageDialog(this, "Thanh cong");
            this.setVisible(false);
           
            jPanelMQLCP.removeAll();
            jPanelMQLCP.add(new PanelCoPhieu());
            jPanelMQLCP.repaint();
            jPanelMQLCP.revalidate();
        }
    }
    
    private javax.swing.JButton jButtonCa;
    private javax.swing.JButton jButtonXN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCongTy;
    private javax.swing.JTextField jTextFieldDiaChi;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGiaNiemYet;
    private javax.swing.JTextField jTextFieldMCP;
    private javax.swing.JTextField jTextFieldSDT;
    private javax.swing.JTextField jTextFieldSoLg;
    // End of variables declaration//GEN-END:variables
}

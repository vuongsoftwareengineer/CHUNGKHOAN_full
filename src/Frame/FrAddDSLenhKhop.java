package Frame;

import Class.LenhKhop;
import static Frame.FrMain.jPanelMQLGD;
import static Frame.FrMain.ketNoi;

import Panel.PanelDSLenhKhop;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FrAddDSLenhKhop extends javax.swing.JFrame {

    public int kt=1;

    public LenhKhop layDataLenhKhop(String maLenh) {
        
        LenhKhop lenhKhop=null;
        Vector vt;
        String sql = "select * from LenhKhop WHERE MaLenh='"+maLenh+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lenhKhop = new LenhKhop(rs.getString("MaLenh"), rs.getTimestamp("Ngay"), rs.getFloat("Gia"), rs.getInt("SoLuong"), rs.getString("TrangThai"));

            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lenhKhop;
    }
    
    public FrAddDSLenhKhop() {
        initComponents();
    }

    public FrAddDSLenhKhop(int kt, String maLenh) throws HeadlessException {
        this.kt = kt;
        initComponents();
        LenhKhop lenhKhop=layDataLenhKhop(maLenh);
        this.jTextFieldMalenh.setText(lenhKhop.getMaLenh());
        setNgayGio();
        this.textFieldGiaKhop.setText(String.valueOf(lenhKhop.getGia()));
        this.textFieldSoLuong.setText(String.valueOf(lenhKhop.getSoLuong()));
        this.jTextFieldTrangthai.setText(lenhKhop.getTrangThai()); 
        
        if(kt==2)
        {
            jTextFieldMalenh.setEditable(false);
           }
        
    }
    
    private void setNgayGio() {
		// TODO Auto-generated method stub
    	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	}
     
    public void addLenhKhop(LenhKhop lenhKhop) {
       
        String sql = "INSERT INTO LenhKhop VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, lenhKhop.getMaLenh());
            ps.setTimestamp(2, lenhKhop.getNgay());
            ps.setFloat(3, lenhKhop.getGia());
            ps.setInt(4,lenhKhop.getSoLuong()) ;
            ps.setString(5, lenhKhop.getTrangThai());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrAddDSLenhKhop.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void updateLenhKhop(LenhKhop lenhKhop) {
       
        String sql = " UPDATE LenhKhop SET Ngay=?,Gia=?,SoLuong=?,TrangThai=? WHERE MaLenh='" + lenhKhop.getMaLenh()+ "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setTimestamp(1, lenhKhop.getNgay());
            ps.setFloat(2, lenhKhop.getGia());
            ps.setInt(3,lenhKhop.getSoLuong()) ;
            ps.setString(4, lenhKhop.getTrangThai());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FrAddDSLenhKhop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean testMaLenh()
    {
        boolean tonTai = false;
        String sql = "select * from LenhKhop where MaLenh ='" + jTextFieldMalenh.getText() + "'" ;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tonTai = true;
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelDSLenhKhop.class.getName()).log(Level.SEVERE, null, ex);

        }
        return tonTai;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelGiakhop = new javax.swing.JLabel();
        jTextFieldMalenh = new javax.swing.JTextField();
        jLabelTrangthai = new javax.swing.JLabel();
        jLabelMaLenh = new javax.swing.JLabel();
        jLabelNgaykhop = new javax.swing.JLabel();
        jLabelSoluong = new javax.swing.JLabel();
        jTextFieldTrangthai = new javax.swing.JTextField();
        jButtonXN = new javax.swing.JButton();
        jButtonCa = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelGiakhop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGiakhop.setText("Giá khớp");

        jTextFieldMalenh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldMalenh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        jTextFieldMalenh.setPreferredSize(new java.awt.Dimension(0, 25));

        jLabelTrangthai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTrangthai.setText("Trạng thái");

        jLabelMaLenh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMaLenh.setText("Mã Lệnh");

        jLabelNgaykhop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNgaykhop.setText("Ngày Khớp");

        jLabelSoluong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSoluong.setText("Số lượng");

        jTextFieldTrangthai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldTrangthai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        jTextFieldTrangthai.setPreferredSize(new java.awt.Dimension(0, 25));

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
        
        JLabel jLabel16 = new JLabel();
        jLabel16.setText("CẬP NHẬT LỆNH KHỚP");
        jLabel16.setForeground(Color.ORANGE);
        jLabel16.setFont(new Font("Tahoma", Font.PLAIN, 36));
        jLabel16.setBackground(Color.GRAY);
        
        jTextFieldNgayKhop = new JTextField();
        jTextFieldNgayKhop.setText("2021-07-19 15:36:55");
        jTextFieldNgayKhop.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTextFieldNgayKhop.setEditable(false);
        
        textFieldGiaKhop = new JTextField();
        textFieldGiaKhop.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        textFieldGiaKhop.setColumns(10);
        
        textFieldSoLuong = new JTextField();
        textFieldSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        textFieldSoLuong.setColumns(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(78)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelSoluong)
        						.addComponent(jLabelNgaykhop)
        						.addComponent(jLabelGiakhop)
        						.addComponent(jLabelTrangthai)
        						.addComponent(jLabelMaLenh))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        							.addGap(26)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextFieldTrangthai, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jTextFieldNgayKhop, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        									.addGroup(Alignment.LEADING, jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(textFieldSoLuong, Alignment.LEADING)
        										.addComponent(textFieldGiaKhop, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        									.addComponent(jTextFieldMalenh, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))))
        						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButtonXN, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        							.addGap(32)
        							.addComponent(jButtonCa, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(65)
        			.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(39)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelMaLenh)
        				.addComponent(jTextFieldMalenh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelNgaykhop)
        				.addComponent(jTextFieldNgayKhop, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelGiakhop)
        				.addComponent(textFieldGiaKhop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelSoluong)
        				.addComponent(textFieldSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jTextFieldTrangthai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(38)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButtonXN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButtonCa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jLabelTrangthai))
        			.addGap(296))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(23)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(194, Short.MAX_VALUE))
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
            if (testMaLenh()) {
                JOptionPane.showMessageDialog(this, "Mã lệnh Đã Tồn Tại");
                return;
            }
            
            if("".equals(jTextFieldMalenh.getText())||"".equals(textFieldGiaKhop.getText())||"".equals(textFieldSoLuong.getText())||"".equals(jTextFieldTrangthai.getText()))
            {
                    JOptionPane.showMessageDialog(this, "Vui Lòng Điền Đầy Đủ Thông Tin");
                    return;
                }

            String reNumber="^[0-9]{1,6}$";
            String reFloat="\\-?\\d+\\.\\d+";
            if (!textFieldGiaKhop.getText().matches(reFloat) && !textFieldGiaKhop.getText().matches(reNumber)) {
                    JOptionPane.showMessageDialog(this, "Giá Khớp Phải Là Kiểu Float");
                    return;
                }
            if (!textFieldSoLuong.getText().matches(reNumber)) {
                    JOptionPane.showMessageDialog(this, "Số Lượng Phải Là Kiểu Số");
                    return;
                }
            if(Integer.valueOf(textFieldSoLuong.getText())<=0)
            {
                    JOptionPane.showMessageDialog(this, "Số Lượng Phải > 0");
                    return;
                }
            if(Float.valueOf(textFieldGiaKhop.getText())<=0)
            {
                    JOptionPane.showMessageDialog(this, "Giá Khớp Phải > 0");
                    return;
                }
           
           
           java.sql.Timestamp ngaykhop = java.sql.Timestamp.valueOf(jTextFieldNgayKhop.getText());
   		
           
            addLenhKhop(new LenhKhop(jTextFieldMalenh.getText(), ngaykhop, Float.parseFloat(textFieldGiaKhop.getText()), Integer.valueOf(textFieldSoLuong.getText()), jTextFieldTrangthai.getText()));
            System.out.println(jTextFieldMalenh.getText());
            JOptionPane.showMessageDialog(this, "Thêm Thành công");
            this.setVisible(false);
            jPanelMQLGD.removeAll();
	        jPanelMQLGD.add(new PanelDSLenhKhop());
	        jPanelMQLGD.repaint();
	        jPanelMQLGD.revalidate();
        }
        else
        {
        	java.sql.Timestamp ngaykhop = java.sql.Timestamp.valueOf(jTextFieldNgayKhop.getText());
            
        	 updateLenhKhop(new LenhKhop(jTextFieldMalenh.getText(), ngaykhop, Float.parseFloat(textFieldGiaKhop.getText()), Integer.valueOf(textFieldSoLuong.getText()), jTextFieldTrangthai.getText()));
             JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            this.setVisible(false);
            jPanelMQLGD.removeAll();
	        jPanelMQLGD.add(new PanelDSLenhKhop());
	        jPanelMQLGD.repaint();
	        jPanelMQLGD.revalidate();        }
    }
    
    private javax.swing.JButton jButtonCa;
    private javax.swing.JButton jButtonXN;
    private javax.swing.JLabel jLabelMaLenh;
    private javax.swing.JLabel jLabelNgaykhop;
    private javax.swing.JLabel jLabelSoluong;
    private javax.swing.JLabel jLabelGiakhop;
    private javax.swing.JLabel jLabelTrangthai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldTrangthai;
    private javax.swing.JTextField jTextFieldMalenh;
    private JTextField jTextFieldNgayKhop;
    private JTextField textFieldGiaKhop;
    private JTextField textFieldSoLuong;
}

package Panel;

import Class.LenhKhop;
import Frame.FrAddDSLenhKhop;
import Frame.FrMain;
import static Frame.FrMain.jPanelMQLGD;
import static Frame.FrMain.ketNoi;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


public class PanelDSLenhKhop extends javax.swing.JPanel {

    private LenhKhop lenhKhop;
    private String maLenh;
    
    public PanelDSLenhKhop() {
        initComponents();
        layDataLenhKhop();
        Thread threadRF=new Thread(){
        	int count=0;
        	@Override
        	public void run() {
        			while(true) {
        				layDataLenhKhop();
        				textFieldThreard.setText("Số lần Refresh lại trang: " +count);
                          count++;  
                          try
                          {
        			Thread.sleep(4000);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
        	}
       }
     };
     threadRF.start();
    }
    
   
 
 
  public void layDataLenhKhop() {
        DefaultTableModel dtm = (DefaultTableModel) jTableDSLenhKhop.getModel();
        dtm.setNumRows(0);
       
        Vector vt;
        String sql = "select * from LenhKhop ORDER BY Ngay DESC";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LenhKhop lenhKhop = new LenhKhop(rs.getString("MaLenh"), rs.getTimestamp("Ngay"), rs.getFloat("Gia"), rs.getInt("SoLuong"), rs.getString("TrangThai"));
                
                vt = new Vector();
                vt.add(lenhKhop.getMaLenh());
                vt.add(lenhKhop.getNgay());
                Locale localeVN = new Locale("vi", "VN");
                NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                String str1 = currencyVN.format(lenhKhop.getGia());
                vt.add(str1);
                vt.add(lenhKhop.getSoLuong());
                vt.add(lenhKhop.getTrangThai());

                
                dtm.addRow(vt);
            }
            jTableDSLenhKhop.setModel(dtm);
            rs.close();
            ps.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableDSLenhKhop = new javax.swing.JTable();
        jTableDSLenhKhop.setShowGrid(false);
        
        setBackground(new java.awt.Color(0, 0, 0));

       
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DANH SÁCH LỆNH KHỚP");


        jTableDSLenhKhop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableDSLenhKhop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Lệnh","Ngày Giờ","Giá Đặt","Số Lượng Khớp","Trạng Thái"
            }
        ));
        
        
        jTableDSLenhKhop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDSLenhKhop.setRowHeight(30);
        jTableDSLenhKhop.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableDSLenhKhop.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDSLenhKhop.getTableHeader().setReorderingAllowed(false);
        jTableDSLenhKhop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jTableDSLenhKhopMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTableDSLenhKhop);
        jTableDSLenhKhop.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        jTableDSLenhKhop.getTableHeader().setOpaque(false);
        jTableDSLenhKhop.getTableHeader().setBackground(Color.BLUE);
        jTableDSLenhKhop.getTableHeader().setForeground(new Color(0,0,0));
        jTableDSLenhKhop.getColumnModel().getColumn(2).setPreferredWidth(30);
        
        
        JButton btnNewButton = new JButton("Thêm lệnh khớp");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new FrAddDSLenhKhop().setVisible(true);
        	}
        });
        
        
        JButton btnSaLnhKhp = new JButton("Sửa lệnh khớp");
        btnSaLnhKhp.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jButtonSuaLenhKhopActionPerformed(evt);
        	}
        });
        
        
        JButton btnXaLnhKhp = new JButton("Xóa lệnh khớp");
        btnXaLnhKhp.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jButtonDelLenhKhopActionPerformed(evt);
        		
        	}
        });
        
        JButton btnRefreshLiDanh = new JButton("Refresh");
        btnRefreshLiDanh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		    jPanelMQLGD.removeAll();
        	        jPanelMQLGD.add(new PanelDSLenhKhop());
        	        jPanelMQLGD.repaint();
        	        jPanelMQLGD.revalidate();
        	}
        });
        
        textFieldThreard = new JTextField();
        textFieldThreard.setForeground(Color.WHITE);
        textFieldThreard.setBackground(Color.BLACK);
        textFieldThreard.setFont(new Font("Tahoma", Font.PLAIN, 12));
        textFieldThreard.setColumns(10);
        
        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(62)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jScrollPane10, GroupLayout.PREFERRED_SIZE, 1019, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnNewButton)
        							.addGap(101)
        							.addComponent(btnSaLnhKhp, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        							.addGap(105)
        							.addComponent(btnXaLnhKhp, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        							.addGap(94)
        							.addComponent(btnRefreshLiDanh, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
        							.addGap(74))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(398)
        					.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(textFieldThreard, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
        					.addGap(15)))
        			.addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(45)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel9)
        				.addComponent(textFieldThreard, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addComponent(jScrollPane10, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnRefreshLiDanh)
        				.addComponent(btnNewButton)
        				.addComponent(btnSaLnhKhp)
        				.addComponent(btnXaLnhKhp))
        			.addGap(149))
        );
        this.setLayout(layout);
    }// </editor-folenhKhop>//GEN-END:initComponents

    protected void jTableDSLenhKhopMouseClicked(MouseEvent evt) {
    	 maLenh= jTableDSLenhKhop.getValueAt(jTableDSLenhKhop.getSelectedRow(), 0).toString();
         
	}

	public void delDSKhop(String maLenh) {
		 String sql = "delete from LenhKhop where MaLenh = ?";
	        try {
	            PreparedStatement ps = ketNoi.prepareStatement(sql);
	            ps.setString(1, maLenh);
	            ps.executeUpdate();
	        } catch (SQLException ex) {
	            Logger.getLogger(FrMain.class.getName()).log(Level.SEVERE, null, ex);
	        }
    }
	
	
	public void jButtonDelLenhKhopActionPerformed(java.awt.event.ActionEvent evt) {
		 if(maLenh==null)
	        {
	            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Lệnh Khớp để xóa");
	            return;
	        }
	        
	        int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xoá?", "Xác nhận", 0);
	        if (ret == JOptionPane.CANCEL_OPTION) {

	        } else if (ret == JOptionPane.OK_OPTION) {
	            delDSKhop(maLenh);
	            JOptionPane.showMessageDialog(this, "Xóa Lệnh khớp thành công");
	            layDataLenhKhop();
	        }
   }
  
	public void jButtonSuaLenhKhopActionPerformed(java.awt.event.ActionEvent evt) {
		 if(maLenh==null)
	        {
	            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Lệnh để sửa");
	            return;
	        }
	       new FrAddDSLenhKhop(2, maLenh).setVisible(true);
  }
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jTableDSLenhKhop;
    private JTextField textFieldThreard;
}

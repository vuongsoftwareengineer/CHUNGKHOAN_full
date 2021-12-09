/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Class.KetNoiSQL;
import Class.ThucHienGD;
import Class.RunnableUpdate;
import Panel.PanelDSLenhKhop;
import Panel.PanelNDT;
import Panel.PanelSoHuu;
import Panel.PanelTKNH;
import Panel.PanelCoPhieu;
import Panel.PanelTinTuc;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrMain extends javax.swing.JFrame {
   
	
	public static Connection ketNoi = KetNoiSQL.layKetNoi();
    private RunnableUpdate r1=null;
    
    public FrMain() {
        initComponents();
        ketNoi = KetNoiSQL.layKetNoi();
       
        
       // new ThucHienGD().update();
       
//        r1=new RunnableUpdate("Start");
//        r1.start();
        
        jPanelMain.removeAll();
        jPanelMain.add(jPanelTrangChu);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        jPanelMTC.add(new PanelTinTuc());
        jPanelMTC.repaint();
        jPanelMTC.revalidate();
    }
    
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonQLNDT = new javax.swing.JButton();
        jButtonQLCP = new javax.swing.JButton();
        jButtonQLGD = new javax.swing.JButton();
        jButtonTC = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelQLCP = new javax.swing.JPanel();
        jPanelMQLCP = new javax.swing.JPanel();
        jPanelQLGD = new javax.swing.JPanel();
        jButtonLenhKhop = new javax.swing.JButton();
        jPanelMQLGD = new javax.swing.JPanel();
        jPanelQLNDT = new javax.swing.JPanel();
        jButtonTKNH = new javax.swing.JButton();
        jButtonNDT = new javax.swing.JButton();
        jPanelMQLNDT = new javax.swing.JPanel();
        jPanelTrangChu = new javax.swing.JPanel();
        jPanelMTC = new javax.swing.JPanel();
        jButtonTinTuc = new javax.swing.JButton();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLGD");
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1500, 146));

        jButtonQLNDT.setBackground(new java.awt.Color(255, 255, 255));
        jButtonQLNDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonQLNDT.setText("Nhà Đầu Tư");
        jButtonQLNDT.setToolTipText("Quản Lí Nhà Đầu Tư");
        jButtonQLNDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonQLNDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonQLNDTMouseExited(evt);
            }
        });
        jButtonQLNDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLNDTActionPerformed(evt);
            }
        });

        jButtonQLCP.setBackground(new java.awt.Color(255, 255, 255));
        jButtonQLCP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonQLCP.setText("Cổ Phiếu");
        jButtonQLCP.setToolTipText("Quản Lí Cổ Phiếu");
        jButtonQLCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonQLCPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonQLCPMouseExited(evt);
            }
        });
        jButtonQLCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLCPActionPerformed(evt);
            }
        });

        jButtonQLGD.setBackground(new java.awt.Color(255, 255, 255));
        jButtonQLGD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonQLGD.setText("Giao Dịch ");
        jButtonQLGD.setToolTipText("Quản Lí Giao DỊch");
        jButtonQLGD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonQLGDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonQLGDMouseExited(evt);
            }
        });
        jButtonQLGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLGDActionPerformed(evt);
            }
        });

        jButtonTC.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonTC.setText("Trang Chủ");
        jButtonTC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonTC.setSelected(true);
        jButtonTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTCMouseExited(evt);
            }
        });
        jButtonTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenuLayout.setHorizontalGroup(
        	jPanelMenuLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelMenuLayout.createSequentialGroup()
        			.addGap(131)
        			.addComponent(jButtonTC, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonQLNDT, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonQLCP, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonQLGD, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(551, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
        	jPanelMenuLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelMenuLayout.createSequentialGroup()
        			.addGap(22)
        			.addGroup(jPanelMenuLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonQLNDT, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonQLCP, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonQLGD, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonTC, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelMenu.setLayout(jPanelMenuLayout);

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 120));

        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelQLCP.setPreferredSize(new java.awt.Dimension(1500, 700));

     
        jPanelMQLCP.setPreferredSize(new java.awt.Dimension(0, 650));
        jPanelMQLCP.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelQLCPLayout = new javax.swing.GroupLayout(jPanelQLCP);
        jPanelQLCPLayout.setHorizontalGroup(
        	jPanelQLCPLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanelMQLCP, GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        jPanelQLCPLayout.setVerticalGroup(
        	jPanelQLCPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelQLCPLayout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(jPanelMQLCP, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanelQLCP.setLayout(jPanelQLCPLayout);

        jPanelMain.add(jPanelQLCP, "card2");

        jPanelQLGD.setPreferredSize(new java.awt.Dimension(1500, 700));

        jButtonLenhKhop.setText("Danh sách lệnh khớp");
        jButtonLenhKhop.setToolTipText("Danh Sách Lệnh");
        jButtonLenhKhop.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonLenhKhop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLenhKhopActionPerformed(evt);
            }
        });

        
        
     
        jPanelMQLGD.setPreferredSize(new java.awt.Dimension(112, 650));
        jPanelMQLGD.setLayout(new java.awt.CardLayout());
        
        btnDanhSach = new JButton();
        btnDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoHuuActionPerformed(evt);
            }
        });
        
        btnDanhSach.setToolTipText("");
        btnDanhSach.setText("Danh sách sở hữu");
        btnDanhSach.setPreferredSize(new Dimension(100, 30));

        javax.swing.GroupLayout jPanelQLGDLayout = new javax.swing.GroupLayout(jPanelQLGD);
        jPanelQLGDLayout.setHorizontalGroup(
        	jPanelQLGDLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelQLGDLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jButtonLenhKhop, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnDanhSach, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1079, Short.MAX_VALUE))
        		.addComponent(jPanelMQLGD, GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        jPanelQLGDLayout.setVerticalGroup(
        	jPanelQLGDLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelQLGDLayout.createSequentialGroup()
        			.addGroup(jPanelQLGDLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonLenhKhop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDanhSach, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanelMQLGD, GroupLayout.PREFERRED_SIZE, 663, GroupLayout.PREFERRED_SIZE))
        );
        jPanelQLGD.setLayout(jPanelQLGDLayout);
        jPanelMain.add(jPanelQLGD, "card2");

        jPanelQLNDT.setPreferredSize(new java.awt.Dimension(1500, 650));
        

        jButtonTKNH.setText("TKNH");
        jButtonTKNH.setToolTipText("Tài Khoản Ngân Hàng");
        jButtonTKNH.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonTKNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTKNHActionPerformed(evt);
            }
        });

        jButtonNDT.setText("NĐT");
        jButtonNDT.setToolTipText("Nhà Đầu Tư");
        jButtonNDT.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonNDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNDTActionPerformed(evt);
            }
        });

        jPanelMQLNDT.setPreferredSize(new java.awt.Dimension(0, 650));
        jPanelMQLNDT.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelQLNDTLayout = new javax.swing.GroupLayout(jPanelQLNDT);
        jPanelQLNDTLayout.setHorizontalGroup(
        	jPanelQLNDTLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelQLNDTLayout.createSequentialGroup()
        			.addGap(7)
        			.addComponent(jButtonNDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonTKNH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1285, Short.MAX_VALUE))
        		.addComponent(jPanelMQLNDT, GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        jPanelQLNDTLayout.setVerticalGroup(
        	jPanelQLNDTLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelQLNDTLayout.createSequentialGroup()
        			.addGroup(jPanelQLNDTLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonNDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonTKNH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanelMQLNDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanelQLNDT.setLayout(jPanelQLNDTLayout);

        jPanelMain.add(jPanelQLNDT, "card3");

        jPanelTrangChu.setPreferredSize(new java.awt.Dimension(1500, 700));

        jPanelMTC.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMTC.setForeground(new java.awt.Color(240, 240, 240));
        jPanelMTC.setLayout(new java.awt.CardLayout());

        jButtonTinTuc.setText("Tin Tức");
        jButtonTinTuc.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonTinTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTinTucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTrangChuLayout = new javax.swing.GroupLayout(jPanelTrangChu);
        jPanelTrangChu.setLayout(jPanelTrangChuLayout);
        jPanelTrangChuLayout.setHorizontalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTrangChuLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButtonTinTuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTrangChuLayout.setVerticalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangChuLayout.createSequentialGroup()
                .addGroup(jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTinTuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelTrangChu, "card2");

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1500, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQLCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLCPActionPerformed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(jPanelQLCP);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        jPanelMQLCP.add(new PanelCoPhieu());
        jPanelMQLCP.repaint();
        jPanelMQLCP.revalidate();
    }
    
    private void jButtonQLNDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLNDTActionPerformed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(jPanelQLNDT);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        jPanelMQLNDT.repaint();
        jPanelMQLNDT.revalidate();
    }//GEN-LAST:event_jButtonQLNDTActionPerformed

    private void jButtonNDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNDTActionPerformed
            // TODO add your hanprivatedling code here:
            new PanelNDT().setVisible(true);
        }//
   
    private void jButtonTKNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTKNHActionPerformed
    	new PanelTKNH().setVisible(true);
    }//GEN-LAST:event_jButtonTKNHActionPerformed

    private void jButtonQLGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLGDActionPerformed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(jPanelQLGD);
        jPanelMain.repaint();
        jPanelMain.revalidate();
      }//GEN-LAST:event_jButtonQLGDActionPerformed

     private void jButtonLenhKhopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLenhKhopActionPerformed
        // TODO add your handling code here:
        jPanelMQLGD.removeAll();
        jPanelMQLGD.add(new PanelDSLenhKhop());
        jPanelMQLGD.repaint();
        jPanelMQLGD.revalidate();
    }//GEN-LAST:event_jButtonLenhKhopActionPerformed

     private void jButtonSoHuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLenhKhopActionPerformed
         // TODO add your handling code here:
         jPanelMQLGD.removeAll();
         jPanelMQLGD.add(new PanelSoHuu());
         jPanelMQLGD.repaint();
         jPanelMQLGD.revalidate();
     }
    private void jButtonTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTCActionPerformed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(jPanelTrangChu);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jButtonTCActionPerformed

       private void jButtonTCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTCMouseEntered
        // TODO add your handling code here:
         jButtonTC.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButtonTCMouseEntered

    private void jButtonTCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTCMouseExited
        // TODO add your handling code here:
        jButtonTC.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonTCMouseExited

    private void jButtonQLNDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLNDTMouseEntered
        // TODO add your handling code here:
         jButtonQLNDT.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButtonQLNDTMouseEntered

    private void jButtonQLNDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLNDTMouseExited
        // TODO add your handling code here:
        jButtonQLNDT.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonQLNDTMouseExited

    private void jButtonQLCPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLCPMouseEntered
        // TODO add your handling code here:
         jButtonQLCP.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButtonQLCPMouseEntered

    private void jButtonQLCPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLCPMouseExited
        // TODO add your handling code here:
        jButtonQLCP.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonQLCPMouseExited

    private void jButtonQLGDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLGDMouseEntered
        // TODO add your handling code here:
        jButtonQLGD.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButtonQLGDMouseEntered

    private void jButtonQLGDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQLGDMouseExited
        // TODO add your handling code here:
        jButtonQLGD.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonQLGDMouseExited

       private void jButtonTinTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTinTucActionPerformed
        // TODO add your handling code here:
        jPanelMTC.removeAll();
        jPanelMTC.add(new PanelTinTuc());
        jPanelMTC.repaint();
        jPanelMTC.revalidate();
    }//GEN-LAST:event_jButtonTinTucActionPerformed

    
   
    public static void main(String args[]) {

//            try {
//                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                    if ("Nimbus".equals(info.getName())) {
//                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                        break;
//                    }
//                }
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//                  java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
                    new FrMain().setVisible(true);
                }
//            });
//        }  
//    

    private javax.swing.JButton jButtonLenhKhop;
    private javax.swing.JButton jButtonNDT;
    private javax.swing.JButton jButtonQLCP;
    private javax.swing.JButton jButtonQLGD;
    private javax.swing.JButton jButtonQLNDT;
    private javax.swing.JButton jButtonTC;
    private javax.swing.JButton jButtonTKNH;
    private javax.swing.JButton jButtonTinTuc;
    public static javax.swing.JPanel jPanelMQLCP;
    public static javax.swing.JPanel jPanelMQLGD;
    public static javax.swing.JPanel jPanelMQLNDT;
    private javax.swing.JPanel jPanelMTC;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelQLCP;
    private javax.swing.JPanel jPanelQLGD;
    private javax.swing.JPanel jPanelQLNDT;
    private javax.swing.JPanel jPanelTrangChu;
    private JButton btnDanhSach;
   }

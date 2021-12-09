/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Font;


public class PanelTinTuc extends javax.swing.JPanel {

   
    public PanelTinTuc() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new Dimension(1528, 818));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setText("TIN TỨC NỔI BẬT");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setText("Những cái nhất của Italia tại EURO 2020");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                    	  Desktop d=Desktop.getDesktop();
                          try {
                              // Browse a URL, say google.com
                              d.browse(new URI("https://tiin.vn/chuyen-muc/24/nhung-cai-nhat-cua-italia-tai-euro-2020.html?id=2180153"));
                          } catch (URISyntaxException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          } catch (IOException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                });


        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/euro2020.png"))); // NOI18N
        jLabel31.setText("jLabel31");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Hà Nội xét nghiệm 10.000 người có nguy cơ cao lây nhiễm COVID-19");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                    	  Desktop d=Desktop.getDesktop();
                          try {
                              // Browse a URL, say google.com
                              d.browse(new URI("https://tiin.vn/chuyen-muc/24/ha-noi-xet-nghiem-10000-nguoi-co-nguy-co-cao-lay-nhiem-covid-19.html"));
                          } catch (URISyntaxException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          } catch (IOException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setText("Ghi nhận 314 ca mắc Covid-19 tại TP Hồ Chí Minh và Bình Dương");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                    	  Desktop d=Desktop.getDesktop();
                          try {
                              // Browse a URL, say google.com
                              d.browse(new URI("https://tiin.vn/chuyen-muc/24/sang-87-ghi-nhan-314-ca-mac-covid-19-tai-tp-ho-chi-minh-va-binh-duong.html"));
                          } catch (URISyntaxException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          } catch (IOException ex) {
                              Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                });


        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anhtphcmcovid.png"))); // NOI18N
        jLabel26.setText("jLabel26");

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new Font("Times New Roman", Font.PLAIN, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setText("Thêm 1.612 ca mắc COVID-19 mới tại Việt Nam");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new Font("Times New Roman", Font.PLAIN, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setText("được ghi nhận trong ngày 3.718 ca");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Liên tiếp ghi nhận ca mắc mới, Bình Dương dự kiến cách ly toàn xã hội");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	  Desktop d=Desktop.getDesktop();
                  try {
                      // Browse a URL, say google.com
                      d.browse(new URI("https://tiin.vn/chuyen-muc/24/lien-tiep-ghi-nhan-ca-mac-moi-binh-duong-du-kien-cach-ly-toan-xa-hoi.html"));
                  } catch (URISyntaxException ex) {
                      Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IOException ex) {
                      Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
                  }
            }
        });
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(10, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(151)
        							.addComponent(jLabel28))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(90)
        							.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(30)
        									.addComponent(jLabel33))
        								.addGroup(layout.createSequentialGroup()
        									.addGap(18)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jLabel20, 0, 0, Short.MAX_VALUE)
        										.addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        							.addGap(43))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
        							.addGap(18))))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
        					.addGap(16)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel37)
        				.addComponent(jLabel36)
        				.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(98)
        					.addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
        			.addGap(69))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(12, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel33)
        					.addGap(63)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(360)
        							.addComponent(jLabel27)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jLabel28))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(195)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel22)
        								.addComponent(jLabel32))
        							.addGap(24)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel36)
        								.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel37)
        								.addComponent(jLabel25)))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(57)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(8)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap(223, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
         Desktop d=Desktop.getDesktop();
        try {
            // Browse a URL, say google.com
            d.browse(new URI("https://tiin.vn/chuyen-muc/24/sang-87-ghi-nhan-314-ca-mac-covid-19-tai-tp-ho-chi-minh-va-binh-duong.html"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
         Desktop d=Desktop.getDesktop();
        try {
            // Browse a URL, say google.com
            d.browse(new URI("https://tiin.vn/chuyen-muc/24/them-1612-ca-mac-covid-19-moi-tong-so-ca-ghi-nhan-trong-ngay-3718-ca.html"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jLabel22MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    // End of variables declaration//GEN-END:variables
}

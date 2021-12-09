/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import static Frame.FrMain.ketNoi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Frame.FrAddDSLenhKhop;


public class ThucHienGD {
    
    public void addLenhKhop(String maLenh,float giaKhop,int solgKhop,int nano)
    {
        java.util.Date dateNow=new java.util.Date();
        Timestamp date=new Timestamp(dateNow.getYear(), dateNow.getMonth(), dateNow.getDate(), dateNow.getHours(), dateNow.getMinutes()+1, dateNow.getSeconds(),nano );
        
        String sql = "INSERT INTO LenhKhop VALUES (?,?,?,?,?,?)" ;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maLenh);
            ps.setTimestamp(2,date);
            ps.setFloat(3, giaKhop);
            ps.setInt(4, solgKhop);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FrAddDSLenhKhop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void thucHienGD()
    {
          
        ArrayList<LenhDat> ld=new ArrayList<LenhDat>();
        String sql = "SELECT *FROM LenhDat WHERE NgayGioDat <= GETDATE() AND (MaTrangThai='CK'OR MaTrangThai='K1P') ORDER BY NgayGioDat";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                LenhDat a=new LenhDat();
                a.setMaLenh(rs.getString(1));
                a.setMaTKNH(rs.getString(2));
                a.setMaCP(rs.getString(3));
                a.setLoaiGD(rs.getString(4));
                a.setMaLoaiLenh(rs.getString(7));
                                
                ld.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrAddDSLenhKhop.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
    
    public void update()
    {
      
        thucHienGD();
       }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import Class.KetNoiSQL;
import Class.NhaDauTu;
import Class.TKNH;

public class SQLCommand {
    Connection kn = KetNoiSQL.layKetNoi();
    //
    public int setNDT(NhaDauTu T)
    {
        int x=1;
        String sql = "insert into NhaDauTu values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
    try
        {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, T.getMaTK());
            ps.setString(2, T.getHo());
            ps.setString(3, T.getTen());
            ps.setString(4, T.getNgaySinh());
            ps.setString(5, T.getNoiSinh());
            ps.setString(6, T.getPhai());
            ps.setString(7, T.getDiaChi());
            ps.setString(8, T.getEmail());
            ps.setString(9, T.getSDT());
            ps.setString(10, T.getCMND());
            ps.setString(11, T.getNgayCap());
            ps.setString(12, T.getNoiCap());
            ps.executeUpdate();
        }
        catch(SQLException ex)
        {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
        }
    }
    
    public int updateNDT(NhaDauTu T, String s)
    {
        int x=1;
        String sql = "update NhaDauTu\n"
                + "set Ho =?,"
                + "Ten =?,"
                + "NgaySinh=?,"
                + "NoiSinh=?,"
                + "Phai=?,"
                + "DiaChi=?,"
                + "Email=?,"
                + "SDT=?,"
                + "CMND=?,"
                + "NgayCap=?,"
                + "NoiCap=?,"
                + "TrNgNc=?,"
                + "MMGD=?,"
                + "MKDL=\n"
                + "where MaTK=? ";
        
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, T.getHo());
            ps.setString(2, T.getTen());
            ps.setString(3, T.getNgaySinh());
            ps.setString(4, T.getNoiSinh());
            ps.setString(5, T.getPhai());
            ps.setString(6, T.getDiaChi());
            ps.setString(7, T.getEmail());
            ps.setString(8, T.getSDT());
            ps.setString(9, T.getCMND());
            ps.setString(10, T.getNgayCap());
            ps.setString(11, T.getNoiCap());
            ps.setString(15, s);
            
            ps.executeUpdate();
            
        } catch(SQLException ex)
        {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
        }
    }
    
    public int deleteNDT(String s)
    {
        int x=1;
        String sql ="delete from NhaDauTu where MaTK = '"+s+"'";
        
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
        }
    }
    public int getNDT(NhaDauTu T,String s)
    {
        int x=1;
        String sql ="select* from NhaDauTu where MaTK = '"+s+"'";
        
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            T.setMaTK(s);
            while(rs.next())
            {
            T.setHo(rs.getString("Ho"));
            T.setTen(rs.getString("Ten"));
            T.setNgaySinh(rs.getString("NgaySinh"));
            T.setNoiSinh(rs.getString("NoiSinh"));
            T.setPhai(rs.getString("Phai"));
            T.setDiaChi(rs.getString("DiaChi"));
            T.setEmail(rs.getString("Email"));
            T.setSDT(rs.getString("SDT"));
            T.setCMND(rs.getString("CMND"));
            T.setNgayCap(rs.getString("NgayCap"));
            T.setNoiCap(rs.getString("NoiCap"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
        }
    }

    
    
    ///////
 
          
            
        public int setTKNH(TKNH t){
        int x=1;
        String sql = "insert into TKNH values(?,?,?,?)";
        try{
            PreparedStatement ps= kn.prepareStatement(sql);
            ps.setString(1,t.getMaTKNH());
            ps.setString(2,t.getMaTK());
            ps.setString(3,t.getMaNH());
            ps.setString(4,t.getSoTien());
            ps.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
            x=0;
        }
        finally{
            return x;
        }
    }
    public int updateTKNH(TKNH t,String s){
        int x=1;
        String sql="update TKNH " 
                +"set MaTKNH=?,"
                +"MaTK=?,"
                +"MaNH=?,"
                +"SoTien=? "
                +"where MaTKNH=? ";
        try{
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, t.getMaTKNH());
            ps.setString(2, t.getMaTK());
            ps.setString(3, t.getMaNH());
            ps.setString(4,t.getSoTien());
            ps.setString(5,t.getMaTKNH());
            ps.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
            x=0;
        }
        finally{
            return x;
        }
            }
    public int deleteTKNH(TKNH t,String s){
        int x=1;
        String sql ="delete from TKNH where MaTKNH = '"+s+"'";
        
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
    }
        }
    public int getTKNH(TKNH t, String s){
        int x=1;
        String sql ="select* from TKNH where MaTKNH = '"+s+"'";
        
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            t.setMaTKNH(s);
            while(rs.next())
            {
             t.setMaTK(rs.getString("MaTK"));
             t.setMaNH(rs.getString("MaNH"));
             t.setSoTien(rs.getString("SoTien"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            x=0;
        }
        finally
        {
            return x;
        }
    }
}

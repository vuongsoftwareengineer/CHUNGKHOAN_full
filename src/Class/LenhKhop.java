/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import static Frame.FrMain.ketNoi;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import DAO.LenhKhopDAO;
import Frame.FrMain;

public class LenhKhop extends Lenh{
    
    private int soLuong;
    private String trangThai;
    
   
    public LenhKhop() {
    	super();
    }

    public LenhKhop(String maLenh, Timestamp ngay, float gia, int soLuong, String trangThai) {
        super(maLenh,ngay,gia);
        this.soLuong=soLuong;
        this.trangThai=trangThai;
    }

	
	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	      
}

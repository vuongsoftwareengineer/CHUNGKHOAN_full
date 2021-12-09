/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.LenhKhop;
import java.util.ArrayList;

public interface LenhKhopDAO {
    ArrayList<LenhKhop> getDSLenhKhop();
    boolean insertLenh();
    boolean updateLenh();
    boolean deleteLenh();
}

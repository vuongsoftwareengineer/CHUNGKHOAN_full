/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Class.NhaDauTu;



public class InOutFile {

    private static FileWriter w = null;
    private static FileReader r = null;
    private static Scanner sc = null;

    void saveFile(String name, NhaDauTu T) throws IOException {
        try {
            w = new FileWriter(name);

            w.write(T.getMaTK() + "\n");
            w.write(T.getHo() + "\n");
            w.write(T.getTen() + "\n");
            w.write(T.getNgaySinh() + "\n");
            w.write(T.getNoiSinh() + "\n");
            w.write(T.getPhai() + "\n");
            w.write(T.getDiaChi() + "\n");
            w.write(T.getEmail() + "\n");
            w.write(T.getSDT() + "\n");
            w.write(T.getCMND() + "\n");
            w.write(T.getNgayCap() + "\n");
            w.write(T.getNoiCap() + "\n");
          
//            System.out.println(T.getMaTK());
//            System.out.println(T.getHo());
//            System.out.println(T.getTen());
//            System.out.println(T.getNgaySinh());
//            System.out.println(T.getNoiSinh());
//            System.out.println(T.getPhai());
//            System.out.println(T.getDiaChi());
//            System.out.println(T.getEmail());
//            System.out.println(T.getSDT());
//            System.out.println(T.getCMND());
//            System.out.println(T.getNgayCap());
//            System.out.println(T.getNoiCap());
//            System.out.println(T.getTrNgNc());
//            System.out.println(T.getMMGD());
//            System.out.println(T.getMKDL());

        } finally {
            if (w != null) {
                w.close();
            }
        }
    }

    public void loadFile(String name, NhaDauTu T) throws IOException {
        try {
            r = new FileReader(name);
            BufferedReader BuffR = new BufferedReader(r);
            sc = new Scanner(BuffR);
            while (sc.hasNext()) {
                T.setMaTK(sc.nextLine());
                T.setHo(sc.nextLine());
                T.setTen(sc.nextLine());
                T.setNgaySinh(sc.nextLine());
                T.setNoiSinh(sc.nextLine());
                T.setPhai(sc.nextLine());
                T.setDiaChi(sc.nextLine());
                T.setEmail(sc.nextLine());
                T.setSDT(sc.nextLine());
                T.setCMND(sc.nextLine());
                T.setNgayCap(sc.nextLine());
                T.setNoiCap(sc.nextLine());
            
//                System.out.println(T.getMaTK());
//                System.out.println(T.getHo());
//                System.out.println(T.getTen());
//                System.out.println(T.getNgaySinh());
//                System.out.println(T.getNoiSinh());
//                System.out.println(T.getPhai());
//                System.out.println(T.getDiaChi());
//                System.out.println(T.getEmail());
//                System.out.println(T.getSDT());
//                System.out.println(T.getCMND());
//                System.out.println(T.getNgayCap());
//                System.out.println(T.getNoiCap());
//                System.out.println(T.getTrNgNc());
//                System.out.println(T.getMMGD());
//                System.out.println(T.getMKDL());
            }
        } finally {
            if (r != null) {
                r.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here         
        InOutFile f = new InOutFile();
        NhaDauTu t = new NhaDauTu();
        String s = "test.txt";
        f.loadFile(s, t);
        s = "NDT2.txt";
        f.saveFile(s, t);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

public class CoPhieu {
    protected String maCP;
    private String tenCT;
    private String diaChi;
    private String SDT;
    private String email;
    private int soLg;
    private float giaNiemYet;

    
    protected void CoPhieu(String maCP) {
        this.maCP = maCP;
      }
    public String getMaCP() {
        return maCP;
    }

    public String getTenCT() {
        return tenCT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return email;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setMaCP(String maCP) {
        this.maCP = maCP;
    }

    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    public float getGiaNiemYet() {
        return giaNiemYet;
    }

    public void setGiaNiemYet(float giaNiemYet) {
        this.giaNiemYet = giaNiemYet;
    }

    
    
    public CoPhieu() {
    }

    public CoPhieu(String maCP, String tenCT, String diaChi, String SDT, String email, int soLg,float giaNiemYet) {
        this.maCP = maCP;
        this.tenCT = tenCT;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
        this.soLg = soLg;
        this.giaNiemYet=giaNiemYet;
    }
    
    public CoPhieu(String maCP, String tenCT, String diaChi, String SDT, String email, int soLg) {
        this.maCP = maCP;
       this.tenCT = tenCT;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
        this.soLg = soLg;
    }
}

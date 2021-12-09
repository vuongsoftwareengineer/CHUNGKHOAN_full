package Class;

import java.sql.Timestamp;

public abstract class Lenh {
	
	protected String maLenh;
	protected Timestamp ngay;
	protected float gia;
	public Lenh() {
		super();
		
	}
	
    public Lenh(String maLenh, Timestamp ngay, float gia) {
    	super();
    	this.maLenh=maLenh;
    	this.ngay=ngay;
    	this.gia=gia;
		
	}

    public Lenh(String maLenh, Timestamp ngay) {
    	super();
    	this.maLenh=maLenh;
    	this.ngay=ngay;
	
    }
	
	public String getMaLenh() {
		return maLenh;
	}
	public void setMaLenh(String maLenh) {
		this.maLenh = maLenh;
	}
	public Timestamp getNgay() {
		return ngay;
	}
	public void setNgay(Timestamp ngay) {
		this.ngay = ngay;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}

}

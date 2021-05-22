package com.luvina.quanlydanhba;

public class DanhBa {
	// khai bao thuoc tinh
	private String ten;
	private String soDienThoai;

	// khai bao phuong thuc
	// phuong thuc khoi tao
	public DanhBa(String ten, String soDienThoai) {
		this.ten = ten;
		this.soDienThoai = soDienThoai;
	}

	// phuong thuc getSoDienThoai
	public String getSoDienThoai() {
		return soDienThoai;
	}

	// phuong thuc setSoDienThoai
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	// phuong thuc getTen
	public String getTen() {
		return ten;
	}

	// phuong thuc setTen
	public void setTen(String ten) {
		this.ten = ten;
	}

}

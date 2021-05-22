package com.luvina.quanlydanhba.main;

import java.util.ArrayList;

import com.luvina.quanlydanhba.DanhBa;
import com.luvina.quanlydanhba.QuanLy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhBa db1 = new DanhBa("Thang","0123");
		DanhBa db2 = new DanhBa("TranThanh","43534");
		DanhBa db3 = new DanhBa("Hoai","0153");
		DanhBa db4 = new DanhBa("ToHoang","345235");
		DanhBa db5 = new DanhBa("ToTHang","43534");
		DanhBa db6 = new DanhBa("ToTien","34534");
		QuanLy ql = new QuanLy();
		DanhBa[] listDB = {db1, db2, db3, db4, db5, db6};
		ql.setListDB(listDB);
		System.out.println(ql.checkContacts("0964056426"));
		System.out.println(ql.getListDB());
		ql.addContact(1, "BachKhoa", "10");
		ql.editContacts("10", "123456");
		System.out.println(ql.listDB[1].getSoDienThoai()+" "+ql.listDB[1].getTen());
		ql.searchContacts("Thang");
		
	}

}

package com.luvina.quanlydanhba;

public class QuanLy {
	// khai bao thuoc tinh
	public DanhBa[] listDB;

	// khai bao phuong thuc
	// phuong thuc khoi tao
	public QuanLy() {
	}

	public DanhBa[] getListDB() {
		return listDB;
	}

	public void setListDB(DanhBa[] listDB) {
		this.listDB = listDB;
	}

	// phuong thuc kiem tra ton tai so dien thoai
	public boolean checkContacts(String gtSDT) {
		boolean ketQua = false;
		for (DanhBa db : listDB) {
			if (db.getSoDienThoai().equals(gtSDT)) {
				ketQua = true;
			}
		}
		return ketQua;
	}

	// phuong thuc them danh ba
	public void addContact(int index, String gtTen, String gtSDT) {
		if (checkContacts(gtSDT)) {
			System.out.println("Danh bạ này đã tồn tại");
			// return;
		} else {
			listDB[index].setTen(gtTen);
			listDB[index].setSoDienThoai(gtSDT);
			System.out.println("Đã thêm danh bạ thành công");
		}
	}

	// phuong thuc sua danh ba
	public void editContacts(String gtSDT, String SDTmoi) {
		if (checkContacts(SDTmoi)) {
			System.out.println("Số điện thoại mới đã tồn tại");
		} else {
			for (DanhBa db : listDB) {
				if (db.getSoDienThoai().equals(gtSDT)) {
					db.setSoDienThoai(SDTmoi);
					System.out.println("Đã sửa danh bạ thành công");
					return;
				}
			}
			System.out.println("Không tồn tại số điện thoại cần sửa, hãy tạo danh bạ mới");
		}

	}
	
	// phuong thuc tim kiem danh ba
	public void searchContacts(String gtTen) {
		//duyệt danh bạ lấy tên contact
		for (DanhBa db : listDB) {
			int k = 0;	//dùng biến tạm để xét chỉ số ký tự của tên cần tìm kiếm
			//duyệt từng ký tự tên lấy được trong danh bạ đem so sánh với kí tự của tên cần tìm kiếm
			for (int i = 0; i < db.getTen().length(); i++) {
				String kyTu = db.getTen().charAt(i)+""; 	//gán giá trị của tên cho biến kyTu
				if (kyTu.equalsIgnoreCase(gtTen.charAt(k)+"")) {	//câu lệnh so kí tự của tên trong danh bạ và tên tìm kiếm
					k++;	//tăng biến đếm nếu tìm được giá trị
				}
				if(k==gtTen.length()) {
					System.out.println(db.getTen()+" "+db.getSoDienThoai());
					break;
				}
			}
		}
	}
}

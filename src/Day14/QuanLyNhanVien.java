/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyNhanVien {

    // Danh sach nhan vien
    ArrayList<NhanVien> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        int nhapNua = 1;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap luong:");
            int luong = Integer.parseInt(sc.nextLine());
            NhanVien nv = new NhanVien(ten, ma, luong);
            arr.add(nv);
            System.out.println("Nhap nua hay khong 1- co, 0- khong");
            nhapNua = Integer.parseInt(sc.nextLine());
        } while (nhapNua == 1);
    }

    public void xuat() {
        for (NhanVien item : arr) {
            item.inThongTin();
        }
    }

    public void xoa() {
        System.out.println("Nhap ma nhan vien can xoa:");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            // thuc hien xoa doi tuong = index
            arr.remove(index);
            System.out.println("Xoa thanh cong");
        }
    }

    public void tim() {
        System.out.println("Nhap ma nhan vien can tim:");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            System.out.println("Tim thay doi tuong");
            arr.get(index).inThongTin();
        }
    }

    public int getIndex(String maNv) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMa().trim().equalsIgnoreCase(maNv.trim())) {
                return i;
            }
        }
        return -1;
    }

    public void timTrongKhoang() {
        System.out.println("Nhap luong bat dau:");
        int luongbd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong ket thuc:");
        int luongkt = Integer.parseInt(sc.nextLine());
        for (NhanVien nv : arr) {
            if ( luongbd <= nv.tinhLuong() && nv.tinhLuong() <= luongkt) {
                nv.inThongTin();
            }
        }
    }
}

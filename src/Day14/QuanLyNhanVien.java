/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QuanLyNhanVien {

    // Danh sach nhan vien
    List<NhanVien> arr = new ArrayList<>();
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
            if (luongbd <= nv.tinhLuong() && nv.tinhLuong() <= luongkt) {
                nv.inThongTin();
            }
        }
    }

    public void keThua() {
        // tao doi tuong bao ve
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap luong:");
        int luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so ca:");
        int ca = Integer.parseInt(sc.nextLine());
        NhanVien baoVe = new BaoVe(ca, ten, ma, luong);
        System.out.println("Thong tin doi tuong vua nhap");
        baoVe.inThongTin();
        System.out.println("Luong cua bao ve la" + baoVe.tinhLuong());
    }
    
    public void sapXep() {
        // Hien thi arr truoc khi sap xep
        System.out.println("Ds truoc khi sap xep");
        xuat();
        // thuc hien sap xep
        Collections.sort(arr);
        System.out.println("Ds sau khi sap xep");
        xuat();
        // C2
        List<NhanVien> sortedList = arr.stream().sorted(Comparator.comparing(NhanVien::getTen)).collect(Collectors.toList());
        for (NhanVien nv: sortedList) {
            nv.inThongTin();
        }
    }
}

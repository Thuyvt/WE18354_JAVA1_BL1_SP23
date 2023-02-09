/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QLDT {
    // Khai báo
    DienThoai mangDt[];
    int soLuong;

    public QLDT() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng điện thoại:");
        soLuong = Integer.parseInt(sc.nextLine());
        mangDt = new DienThoai[soLuong];
        for (int i = 0; i < mangDt.length; i++) {
            System.out.println("Nhập mã:");
            String ma = sc.nextLine();
            System.out.println("Nhập tên:");
            String ten = sc.nextLine();
            System.out.println("Nhập thương hiệu:");
            String thuongHieu = sc.nextLine();
            System.out.println("Nhập giá:");
            double gia = Double.parseDouble(sc.nextLine());
            DienThoai dt = new DienThoai(ma, ten, thuongHieu, gia);
            mangDt[i] = dt;
        }
    }
    
    public void xuat() {
        for (int i = 0; i < mangDt.length; i++) {
            DienThoai dt = mangDt[i];
            dt.inThongTin();
        }
    }
    
    public void giaMax() {
        DienThoai max = mangDt[0];
        for (int i = 1; i < mangDt.length; i++) {
            if (max.getGia() < mangDt[i].getGia()) {
                max = mangDt[i];
            }
        }
        max.inThongTin();
    }

}

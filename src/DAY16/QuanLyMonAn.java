/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {

    Scanner sc = new Scanner(System.in);
    List<MonAn> ds = new ArrayList<>();

    public void nhap() {
        String nhapTiep;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap gia:");
            int gia = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so luong:");
            int soLuong = Integer.parseInt(sc.nextLine());
            MonAn ma = new MonAn(ten, gia, soLuong);
            ds.add(ma);
            System.out.println("Nhap tiep hay khong (Y/N):");
            nhapTiep = sc.nextLine();
        } while (nhapTiep.equalsIgnoreCase("Y"));
    }

    public void xuat() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (MonAn item : ds) {
                System.out.println(item.toString());
            }
        }
    }

    public void tongTien() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            int tong = 0;
            for (MonAn ma : ds) {
                tong += ma.tongTien();
//            tong += ma.getGia() * ma.getSoLuong();
            }
            System.out.println("Tong tien la: " + tong);
        }

    }

    public void timMax() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            // C1:
            MonAn max = ds.get(0);
            for (MonAn item : ds) {
                if (item.tongTien() > max.tongTien()) {
                    max = item;
                }
            }
            System.out.println("Mon an co tong tien lon nhat la:" + max.toString());
            // C2: Sap xep giam dan theo tong tien
            ds.sort((ma1, ma2) -> ma2.tongTien() - ma1.tongTien());
            System.out.println("Mon an co tong tien lon nhat la:" + ds.get(0).toString());
            // Sap xep tang dan theo gia
            ds.sort((ma1, ma2) -> ma1.getGia() - ma2.getGia());
            // Sap xep tan dan theo ten
            ds.sort((ma1, ma2) -> ma1.getTen().compareTo(ma2.getTen()));
        }

    }

    public void keThua() {
        MonAn ma = new TraSua("tran chau den", "tra sua", 35000, 2);
        System.out.println(ma.toString());

    }
}

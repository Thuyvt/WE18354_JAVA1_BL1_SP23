/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien quanLy = new QuanLyNhanVien();
        int menu;
        do {
            System.out.println("====Menu====");
            System.out.println("1.       Nhập 1 danh sách đối tượng");
            System.out.println("2.    Xuất danh sách đối tượng đã nhập");
            System.out.println("3.    Xóa NV theo mã NV nhập vào");
            System.out.println("4.    Tìm nhân viên theo mã NV nhập vào");
            System.out.println("5.    Xuất danh sách NV theo khoảng lương nhập vào");
            System.out.println("0.   Thoát");
            System.out.println("Nhap chuong trinh can chay");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    quanLy.nhap();
                    break;
                }
                case 2 -> {
                    quanLy.xuat();
                    break;
                }
                case 3 -> {
                    quanLy.xoa();
                    break;
                }
                case 4 -> {
                    quanLy.tim();
                    break;
                }
                case 5 -> {
                    quanLy.timTrongKhoang();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (menu != 0);
    }
}

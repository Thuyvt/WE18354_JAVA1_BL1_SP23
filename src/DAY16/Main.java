/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY16;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        int menu;
        Scanner sc = new Scanner(System.in);
        QuanLyMonAn ql = new QuanLyMonAn();
        do {
            System.out.println("1.Nhập danh sách món ăn");
            System.out.println("2. Xuất danh sách món ăn ");
            System.out.println("3. Xuất tổng tiền phải trả cho tất cả món ăn đã chọn");
            System.out.println("4. Tìm món ăn có tổng tiền phải trả lớn nhất trong danh sách món đã chọn");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("Nhap chuong trinh can chay:");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    ql.nhap();
                    break;
                }
                case 2 -> {
                    ql.xuat();
                    break;
                }
                case 3 -> {
                    ql.tongTien();
                    break;
                }
                case 4 -> {
                    ql.timMax();
                    break;
                }
                case 5 -> {
                    ql.keThua();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (menu != 0);
    }
}

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
public class Main {

    public static void main(String[] args) {
        QLDT service = new QLDT();
        int chuongTrinh;
        do {
            System.out.println("====Menu===");
            System.out.println("1. Nhập");
            System.out.println("2. Xuât");
            System.out.println("3. Tìm giá lớn nhất");
            System.out.println("0. Thoát");
            System.out.println("Nhập chương trình cần chạy:");
            Scanner sc = new Scanner(System.in);
            chuongTrinh = Integer.parseInt(sc.nextLine());
            switch (chuongTrinh) {
                case 1 -> {
                    service.nhap();
                    break;
                }
                case 2 -> {
                    service.xuat();
                    break;
                }
                case 3 -> {
                    service.giaMax();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Nhập sai yêu cầu nhập lại");
                }
            }
        } while (chuongTrinh != 0);
    }
}

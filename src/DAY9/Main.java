/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY9;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        NycService service = new NycService();
        
        while (true) {
            System.out.println("==Menu===");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("0. Thoát");
            System.out.println("Nhập chương trình cần chạy:");
            Scanner sc = new Scanner(System.in);
            int chuongTrinh = sc.nextInt();
            switch (chuongTrinh) {
                case 1 -> {
                    service.nhap();
                    break;
                }
                case 2 -> {
                    service.xuat();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                    break;
                }
                default -> {
                    System.out.println("Nhập sai yêu cầu nhập lại");
                }
            }
        }
    }
}

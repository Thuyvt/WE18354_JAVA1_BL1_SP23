/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY4;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class LAB1_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("==Menu===");
            System.out.println("1. Kiểm tra số");
            System.out.println("2. tính tổng");
            System.out.println("3. Số chính phương");
            System.out.println("4. Toán tử");
            System.out.println("0. Thoát");
            System.out.println("Nhập chương trình cần chạy:");
            int chuongTrinh = sc.nextInt();
            switch(chuongTrinh) {
                case 1 -> {
                    kiemTraSo();
                    break;
                }
                case 2 -> {
                    tinhTong();
                    break;
                }
                case 3 -> {
                    soChinhPhuong();
                    break;
                }
                case 4 -> {
                    toanTu();
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
    // Kiểm tra số
    public static void kiemTraSo(){
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        // C1
        if (so%2 == 0) {
            System.out.println("Đây là số chẵn");
        } else {
            System.out.println("Đây là số lẻ");
        }
        if (so%3 != 0) {
            System.out.println("Đây là số không chia hết cho 3");
        } else {
            System.out.println("Đây là số chia hết cho 3");
        }
        // C2
        if(so%2 != 0 && so%3 == 0) {
            System.out.println("Đây là số lẻ và chia hết cho 3");
        } else if (so%2 != 0 && so%3 !=0) {
            System.out.println("Đây là số lẻ và không chia hết cho 3");
        } else if (so%2 == 0 && so%3 == 0) {
            System.out.println("Đây là số chẵn và chia hết cho 3");
        } else if (so%2 == 0 && so%3 != 0) {
            System.out.println("Đây là số chẵn và không chia hết cho 3");
        }
    }
    // Tính tổng
    public static void tinhTong(){
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        if (so >= 0) {
            System.out.println("Nhập sai dữ liệu");
        } else {
            int tong = 0;
            for(int i = so; i <= 0; i++) {
                tong = tong + i;
            }
            System.out.printf("Tổng từ %d đến 0 là %d\n", so, tong);
            tong = 0;
            for(int i = 0; i <= so; i--) {
                tong += i;
            }
            System.out.printf("Tổng từ %d đến 0 là %d\n", so, tong);
        }
    }
     // Số chính phương
    public static void soChinhPhuong() {
     System.out.println("Nhập số:");
        int so = sc.nextInt();
        // C1
        if (so > 1) {
            int can2 = (int) Math.sqrt(so);
            if (can2 * can2 == so) {
                System.out.println("Đây là số chính phương");
            }
        }
        // C2
        int dem = 0;
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (i * i == so) {
                dem++;
            }
        }
        if (dem > 0) {
            System.out.println("Đây là số chính phương");
        } else {
            System.out.println("Đây ko phải số chính phương");
        }
    }
    // Toán tử
    public static void toanTu() {
        System.out.println("Nhập số a:");
        float a = sc.nextFloat();
        System.out.println("Nhập số b:");
        float b = sc.nextFloat();
        System.out.println("a + b = "  + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
    }

}

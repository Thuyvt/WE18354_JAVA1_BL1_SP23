/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien:");
        int soLuong = sc.nextInt();
        sc.nextLine();
        if (soLuong > 0) {
            String ten[] = new String[soLuong];
            double diem[] = new double[soLuong];
            // Nhap ten va diem
            for (int i = 0; i < soLuong; i++) {
                System.out.print("Nhap ten:");
                ten[i] = sc.nextLine();
                System.out.print("Nhap diem:");
                diem[i] = sc.nextDouble();
                sc.nextLine();
            }
            System.out.println("Mang ten:" + Arrays.toString(ten));
            System.out.println("Mang diem:" + Arrays.toString(diem));
            // Goi ham sap xep 
            sort(ten, diem);
            // Hien thi lai mang
            for (int i = 0; i < soLuong; i++) {
                System.out.println("Ho ten:" + ten[i]);
                System.out.println("Diem:" + diem[i]);
                if (diem[i] >= 9) {
                    System.out.println("Hoc luc xuat sac");
                } else if (diem[i] >= 7.5) {
                    System.out.println("Hoc luc gioi");
                } else if (diem[i] >= 6.5) {
                    System.out.println("Hoc luc kha");
                } else if (diem[i] >= 5) {
                    System.out.println("Hoc luc trung binh");
                }
                System.out.println("=======================");
            }
        } else  {
            System.out.println("Nhap sai so luong");
        }
    }
    
    // Ham sap xep
    public static void sort(String mangTen[], double mangDiem[]) {
        for (int i = 0; i < mangDiem.length - 1 ; i++) {
            for (int j = i + 1; j < mangDiem.length; j++) {
                if (mangDiem[i] > mangDiem[j]) {
                    double diem = mangDiem[i];
                    mangDiem[i] = mangDiem[j];
                    mangDiem[j] = diem;
                    
                    String ten = mangTen[i];
                    mangTen[i] = mangTen[j];
                    mangTen[j] = ten;
                }
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Menu {
    public static void main(String[] args) {
        System.out.println("=== Menu chương trình===");
        System.out.println("1.   Tính tổng");
        System.out.println("2.   Đếm số lẻ");
        System.out.println("3.   Tính trung bình cộng số chẵn");
        System.out.println("Chọn chương trình cần chạy");
        Scanner sc = new Scanner(System.in);
        int chuongTrinh = sc.nextInt();
        switch (chuongTrinh) {
            case 1:
                tinhTong();
                break;
            case 2:
                dem();
                break;
            case 3:
                tbCong();
                break;
            default:
                System.out.println("Nhập sai chương trình");
                break;
        }
    }
    // Nhập số và tính tổng từ 1 đến số đã nhập
    // Chương tình tính tổng
    public static void tinhTong() {}
    // Nhập số và đếm các số lẻ từ 1 đến số đã nhập
    // Chương trình đếm số lẻ
    public static void dem() {}
    // Nhập số và tính trung bình cộng các số chẵn 1 đến số đã nhập
    // Chương trình tính trung bình cộng số chẵn
    public static void tbCong() {}
    
}

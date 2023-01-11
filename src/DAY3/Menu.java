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
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Menu chương trình===");
        System.out.println("1.   Tính tổng");
        System.out.println("2.   Đếm số lẻ");
        System.out.println("3.   Tính trung bình cộng số chẵn");
        System.out.println("Chọn chương trình cần chạy");
        int chuongTrinh = sc.nextInt();
          switch(chuongTrinh) {
              case 1 -> {
                  tinhTong();
                  break;
              }
              case 2 -> {
                  dem();
                  break;
              } 
              case 3 -> {
                  tbCong();
                  break;
              }
              default -> {
                  System.out.println("Nhập sai chương trình");
                  break;
              }
          }
    }
    // Nhập số và tính tổng từ 1 đến số đã nhập
    // Chương tình tính tổng
    public static void tinhTong() {
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        int tong = 0;
        for(int i = 1; i <= so; i++) {
            tong = tong + i;
            // tong += i;
        }
        System.out.printf("Tổng từ 1 đến %d là %d\n", so, tong);
    }
    // Nhập số và đếm các số lẻ từ 1 đến số đã nhập
    // Chương trình đếm số lẻ
    public static void dem() {
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        int dem = 0;
//        for(int i = 1; i <= so ; i++) {
//            if (i%2==1) {
////                dem++;
//                dem += 1;
//            }
//        }
//        System.out.printf("Có %d số lẻ từ 1 đến %d\n", dem, so);
        int i = 1;
        do {
            if (!(i%2==0)) {
                dem++;
            }
            i++;
        } while (i<= so);
       
    }
    // Nhập số và tính trung bình cộng các số chẵn1 đến số đã nhập
    // Chương trình tính trung bình cộng số chẵn
    public static void tbCong() {
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        int soLuong = 0;
        int tong = 0;
        for (int i = 1; i <= so ; i++) {
            if (i%2==0) {
                // tăng số lượng lên 1 đơn vị nếu là số chẵn
                soLuong++;
                // cộng số đang kiểm tra vào tổng
                tong = tong + i;
                
            }
        }
        double tbc = tong/soLuong;
        System.out.printf("Trung bình cộng từ 1 đến %d là %.2f\n", so, tbc);
        int soKiemTra = 1;
        int sl = 0;
        int tongChan = 0;
        while(soKiemTra <= so) {
            if (soKiemTra%2==0) {
                sl += 1;
                tongChan += soKiemTra;
            }
        }
        System.out.printf("Tbc số chẵn là %.3f\n", tongChan/sl);
        
    }
    
}

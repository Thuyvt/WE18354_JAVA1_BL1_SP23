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
public class Day7 {

    public static void main(String[] args) {
        int mangSo[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // Nhập giá trị cho mảng
        for (int i = 0; i < mangSo.length; i++) {
            System.out.printf("Nhap gia tri phan tu thu %d:", i + 1);
            mangSo[i] = sc.nextInt();
        }
        
        // Hiển thị giá trị của mảng
        System.out.println("Mang nhap vao:" + Arrays.toString(mangSo));
        
        // Tìm giá trị nhỏ nhất trong mảng 
        int min = mangSo[0];
        int index = 0;
        for (int i = 1 ; i < mangSo.length; i++) {
            // C1
            if (min > mangSo[i]) {
                min = mangSo[i];
                index = i;
            }
        }
        System.out.println("Gia tri nho nhat trong mang la" + min);
        System.out.println("Vi tri phan tu nho nhat trong mang la" + index);
        
        // Sắp xếp tăng dần giá trị của mảng
        Arrays.sort(mangSo);
        // Hiển thị lại giá trị sau sắp xếp
        System.out.println("Sau sap xep:" + Arrays.toString(mangSo));
        
        int sum = 0;
        for (int i = 0; i < mangSo.length; i++) {
            sum += mangSo[i];
        }
        float avg = (float) sum / mangSo.length;
        System.out.println("Gia tri trung binh cua mang là " + avg);
        
        // tính tbc phần tử chia hết cho 3
        int tong = 0, soLuong = 0;
        for (int i = 0; i < mangSo.length; i++) {
            if (mangSo[i] % 3 == 0) {
                tong += mangSo[i];
                soLuong++;
            }
        }
        if (soLuong > 0) {
            float tbc = (float) tong/soLuong;
            System.out.println("TBC cac so chia het cho 3 la " + tbc);
        } else {
            System.out.println("Khong co so chia het cho 3");
        }
    }
}

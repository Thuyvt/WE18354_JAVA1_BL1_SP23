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
public class ReNhanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm: ");
        int diem = sc.nextInt();
        System.out.println(diem > 50);
        if (diem > 50 && diem < 80) {
            System.out.println("Loại trung bình");
        } else if (diem >=80) {
            System.out.println("Loại Khá");
        } else if (diem >= 90) {
            System.out.println("Loại giỏi");
        }
     
    }
    
}

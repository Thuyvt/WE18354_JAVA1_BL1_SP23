package DAY3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThuyVT
 */
public class DAY3 {
    public static void main(String[] args) {
        // Nhập tên, số nhà, tên đường, tên phường, tên thành phố
        String ten, tenDuong, tenPhuong, tenTP;
        int soNha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập số nhà: ");
        // C1: Chuyển đổi chuỗi về kiểu dữ liệu số nguyên
        soNha = Integer.parseInt(sc.nextLine());
        // C2
        soNha = sc.nextInt();
        // Gọi nextLine() xóa giá trị trong bộ nhớ đệm
        sc.nextLine();
        System.out.println("Nhập tên đường: ");
        tenDuong = sc.nextLine();
        System.out.println("Nhập tên phường: ");
        tenPhuong = sc.nextLine();
        System.out.println("Nhập tên thành phố:");
        tenTP = sc.nextLine();
    }
}

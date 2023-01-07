/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class DAY2 {
    public static void main(String[] args) {
        // Hiển thị dữ liệu có xuống dòng
        System.out.println("Kiểu dữ liệu");
        // Hiển dữ liệu không xuống dòng
        System.out.print("Hiển thị không xuống dòng");
        // Hiển thị giá trị của biến
        float a = 9.5F;
        double b = 8.5;
        int c = 9;
        String chuoi = "Môn java1";
        System.out.printf("Điểm tổng kết %s là %d\n", chuoi, c);
        System.out.println("Điểm tổng kết " + chuoi + " là " + c);
        
        // Nhập họ tên, tuổi, số đo 3 vòng của người yêu cũ
        // Khởi tạo thư viện Scanner
        Scanner sc = new Scanner(System.in);
        // Khởi tạo biến để nhận giá trị nhập vào
        // Khai báo biến để lưu giá trị họ tên
        String hoTen;
        // Khai báo biến để lưu giá trị tuổi
        int tuoi;
        // Khai báo biến để lưu giá trị số do 3 vòng;
        double vong1, vong2, vong3;
        System.out.print("Nhập họ tên người yêu cũ: ");
        // Nhận giá trị là 1 dòng và gán cho biến hoTen
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        // Nhận giá trị nhập vào là số nguyên
        tuoi = sc.nextInt();
        System.out.print("Nhập số do vòng 1:");
        // Nhận giá trị nhập vào là số thực
        vong1 = sc.nextDouble();
        System.out.print("Nhập số do vòng 2:");
        // Nhận giá trị nhập vào là số thực
        vong2 = sc.nextDouble();
        System.out.print("Nhập số do vòng 3:");
        // Nhận giá trị nhập vào là số thực
        vong3 = sc.nextDouble();
        System.out.printf("Tên người yêu cũ là %s, năm nay %d, số đo 3 vòng là %f %f %f",
                hoTen, tuoi, vong1, vong2, vong3);
    }
}

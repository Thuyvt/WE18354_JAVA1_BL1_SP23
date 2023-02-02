/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

/**
 *
 * @author ThuyVT
 */
public class Day8 {
    public static void main(String[] args) {
        // Khởi tạo mới đối tượng
        SinhVien sv1 = new SinhVien();
        sv1.setTen("thuy");
        sv1.setTuoi(18);
        System.out.println("Tên sinh viên là " + sv1.getTen());
        System.out.println("Tuổi sinh viên là " + sv1.getTuoi());
        sv1.an();
        System.out.println("Số điện thoại " + sv1.getSoDienThoai());
        sv1.setDiem(20);
        
    }
    
}

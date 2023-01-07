/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

/**
 *
 * @author ThuyVT
 */
public class ParseString {

    public static void main(String[] args) {
        String diemTinHoc = "8.5";
        String diemC = "9.3";
        System.out.println((diemTinHoc + diemC));
        // Chuyển đổi chuỗi sang kiểu dữ liệu nguyên thủy
        double diemTin = Double.parseDouble(diemTinHoc);
        double diemNhapMon = Double.parseDouble(diemC);
        System.out.println((diemTin + diemNhapMon));
        String tuoiS = "a";
        try {
            int tuoi = Integer.parseInt(tuoiS);
            System.out.println("Tuổi của bạn là " + tuoi);
        } catch (Exception ex) {
            System.out.println("Bạn nhập sai định dạng tuổi");
        }
        System.out.println("Chương trình thành công");
    }
}

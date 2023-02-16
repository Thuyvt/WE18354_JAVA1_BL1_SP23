/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY9;

/**
 *
 * @author ThuyVT
 */
public class NguoiYeuCu {
    // Khai báo thuộc tính
    private String ten;
    private int tuoi;
    private String sdt;

    public NguoiYeuCu() {
    }

    public NguoiYeuCu(String ten, int tuoi, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    public NguoiYeuCu(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public void inThongTin() {
        System.out.println("Tên:" + this.ten);
        String message = this.tuoi >= 18 ? "Ngon" : "Cẩn thận đi tù";
        System.out.println(message);
    }
    
  
    
}

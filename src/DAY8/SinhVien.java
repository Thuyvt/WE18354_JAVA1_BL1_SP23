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
public class SinhVien {
    // Thuộc tính tên
    private String ten;
    // Thuộc tính tuổi
    private int tuoi;
    // Thuộc tính số điện thoại
    private String soDienThoai;
    // Thuộc tính điểm
    private double diem;
    
    // Gán giá trị cho thuộc tính ten
    public void setTen(String ten) {
        this.ten = ten;
    }
    // Trả ra giá trị tên của đối tượng
    public String getTen() {
        return this.ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    public void setDiem(double diem) {
        if (diem < 0 || diem >10) {
            System.out.println("Nhập sai điểm");
        } else  {
            this.diem = diem;
        }
    }
    
    public double getDiem() {
        return this.diem;
    }
    
    //phương thức
    void an() {
        System.out.println("Ăn đê !!!!");
    }
    
    
}

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
public class NycService {
    NguoiYeuCu mangnyc[] = new NguoiYeuCu[5];
    
    public NycService() {
    }
    
    public void nhap() {
        for (int i = 0; i < mangnyc.length; i++) {
            // C1
            NguoiYeuCu nyc = new NguoiYeuCu();
            nyc.setSdt("0903299680");
            nyc.setTen("luong");
            nyc.setTuoi(18);
            
            mangnyc[i] = nyc;
            
            // C2: tạo đôi tượng = contructor có tham số
            NguoiYeuCu nyc2 = new NguoiYeuCu("thuy", 18, "01829");
            mangnyc[i] = nyc2;
        }
    }
    
    public void xuat() {
        for (int i = 0; i < mangnyc.length; i++) {
            NguoiYeuCu ny = mangnyc[i];
            ny.inThongTin();
        }
    }
    
    public void nhoNhat() {
        NguoiYeuCu min = mangnyc[0];
        for (int i = 1; i < mangnyc.length; i++) {
            if (min.getTuoi() >= mangnyc[i].getTuoi()) {
                min = mangnyc[i];
            }
        }
        min.inThongTin();
    }
}

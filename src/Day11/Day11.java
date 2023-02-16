/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11;

import Day10.DienThoai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class Day11 {
    public static void main(String[] args) {
        // Array không có định dạng dữ liệu
        ArrayList arr1 = new ArrayList();
        // Thêm phần tử vào mảng
        arr1.add(1);// index = 0
        arr1.add("Thuyvt66");// index = 1
        arr1.add(true);// index=2
        arr1.add(7.5);// index=3
        // Hiển thị array
        System.out.println(arr1.toString());
        // Thêm phần tử vào mảng bằng index
        arr1.add(4, "abc");// index = 4
        System.out.println(arr1.toString());
        arr1.add(3, 9.5);
        System.out.println(arr1.toString());
        // Thay đổi giá trị các phần tử đã tồn tại trong array
        // set(index, giá trị mới)
        arr1.set(4, 9.5);
        System.out.println(arr1.toString());
        // Xóa 1 phần tử trong mảng
        // dùng index 
        arr1.remove(3);
        System.out.println(arr1.toString());
        // dùng giá trị phần tử trong mảng
        arr1.remove(true);
        System.out.println(arr1.toString());
        // đếm số lượng phần tử của arr
        System.out.println(arr1.size());
        // Array có định dạng kiểu dữ liệu
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("thuy");
        arr2.add("duy");
        // Với array có định chỉ được thêm dữ liệu = kiểu dữ liệu đã định dạng
//        arr2.add(2);
        //Hiển thị thông tin 1 phần tử trong array
        System.out.println(arr2.get(0));
        for (int i = 0; i < arr2.size(); i++) {
            String item = arr2.get(i);
            System.out.printf("Phần tử thứ %d là %s\n", (i + 1) , item);
        }
        // Không cần dùng index vào việc gì thì dùng cấu trúc for phía dưới
        for (String item : arr2) {
            System.out.println(item);
        }
        // Array có định dạng dữ liệu là 1 đối tượng
        List<DienThoai> arrDt = new ArrayList<>();
        DienThoai dt1 = new DienThoai("1", "iphone 14 pro max", "Apple", 27);
        DienThoai dt2 = new DienThoai("2", "Samsung flip", "Samsung", 32);
        DienThoai dt3 = new DienThoai("3", "Oppo A11", "Oppo", 7);
        DienThoai dt4 = new DienThoai("4", "Huaway K3", "Huaway", 12);
        DienThoai dt5 = new DienThoai("5", "Nokia A8", "Nokia", 4);

        arrDt.add(dt1);
        arrDt.add(dt2);
        arrDt.add(dt3);
        arrDt.add(dt4);
        arrDt.add(dt5);
        
        Collections.sort(arrDt);
        arrDt.stream().sorted(Comparator.comparing(DienThoai::getGia).reversed()).collect(Collectors.toList());
       
        // Tạo thêm 3 phần tử
        // Thêm vào arrDt
        // Sử dụng vòng lặp để duyệt arrDt
        // Và hiển thị thông tin các phần tử 
        // Tìm thông tin đối tượng = thương hiệu nhập vào
        // equals(): so sánh 2 string nhưng có phân biệt hoa thường
        // equalsIgnoreCase(): so sánh 2 string không phân biệt hoa thường
        // trim(): xóa khoảng trắng đầu và cuối của string
        // toLowerCase(): chuyển string -> toàn bộ viết thường
        // toUpperCase(): chuyển string -> toàn bộ viết hoa
        // split(): cắt string -> mảng string
        // concat(): nối 2 hoặc nhiều string với nhau
        String thuongHieu = " samsung ";
        for (DienThoai item: arrDt) {
            if (item.getThuongHieu().trim().toLowerCase().equals(thuongHieu.trim().toLowerCase())) {
                System.out.println("C1 - Thông tin đối tượng cần tìm là");
                item.inThongTin();
            }
            if (item.getThuongHieu().trim().equalsIgnoreCase(thuongHieu.trim())) {
                System.out.println("C2 - Thông tin đối tượng cần tìm là");
                item.inThongTin();
            }
        }
        // Xóa đối tượng trong arr = điều kiện
        // B1: tìm đối tượng với điều kiện đưa ra
        // B2: Xóa đối tượng = remove()
        // C1: remove = index đối tượng
        for (int i = 0; i < arrDt.size(); i++) {
            if (arrDt.get(i).getGia() >= 30) {
                // Xóa đối tượng
                arrDt.remove(i);
            }
        }
        // C2: remove = giá trị đối tượng
        for (DienThoai dt : arrDt) {
            if(dt.getGia() >= 30) {
                arrDt.remove(dt);
            }
        }
    }
}

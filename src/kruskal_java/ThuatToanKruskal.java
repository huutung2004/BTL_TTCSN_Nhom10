package kruskal_java;

import java.util.List;
public class ThuatToanKruskal {
    public static void main(String[] args) {
        List<String> dinhList = List.of("a", "b", "c", "d", "e");
        DoThi doThi = new DoThi(dinhList);

        // Thêm các cạnh với trọng số (dùng chữ cái thay vì số)
        doThi.themCanh("a", "b", 3);
        doThi.themCanh("b", "c", 4);
        doThi.themCanh("d", "e", 5);
       
        // Tìm cây khung nhỏ nhất
        List<Canh> cayKhung = doThi.timCayKhungNhoNhat();
        // Kiểm tra null trước khi xử lý kết quả
        if (cayKhung == null) {
            System.out.println("Không thể tìm cây khung nhỏ nhất do đồ thị không liên thông.");
            return;
        }
        if(dinhList.size() == 1){
            System.out.println("Cây khung nhỏ nhất: rỗng");
            return;
        }
        // In ra kết quả
        int tongTrongSo = 0;
        System.out.println("Cây khung nhỏ nhất:");
        for (Canh canh : cayKhung) {
            System.out.println("Đỉnh " + canh.getDinhNguon() + " nối" + " đỉnh " +  canh.getDinhDich() + ": " + canh.getTrongSo());
            tongTrongSo += canh.getTrongSo();
        }
        System.out.println("Tổng trọng số: " + tongTrongSo);
    }
}


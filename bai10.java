import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập mảng ban đầu
        System.out.print("Nhập số lượng phần tử ban đầu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        // Hiển thị menu
        System.out.println("Danh sách hiện tại: " + list);
        System.out.println("Chọn thao tác: 1. Thêm | 2. Xóa");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Nhập giá trị cần thêm: ");
            int value = sc.nextInt();
            System.out.print("Nhập vị trí cần thêm (0 -> " + list.size() + "): ");
            int pos = sc.nextInt();

            if (pos >= 0 && pos <= list.size()) {
                list.add(pos, value);
            } else {
                System.out.println("Vị trí không hợp lệ!");
            }
        } else if (choice == 2) {
            System.out.print("Nhập vị trí cần xóa (0 -> " + (list.size() - 1) + "): ");
            int pos = sc.nextInt();

            if (pos >= 0 && pos < list.size()) {
                list.remove(pos);
            } else {
                System.out.println("Vị trí không hợp lệ!");
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        // Kết quả
        System.out.println("Danh sách sau khi cập nhật: " + list);
        sc.close();
    }
}

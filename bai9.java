
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập phần tử cho mảng
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // In mảng ra màn hình
        System.out.println("danh sach cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

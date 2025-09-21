import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
<<<<<<< HEAD
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            int tong = 0;
            
            for (int i = 1; i <= n; i++) {
                tong += i;
            }
            
            System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
=======
            System.out.print("Nhập n: ");
            int n = sc.nextInt();
            
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            
            System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
>>>>>>> 5944ee75764c9d02716d6f4f6b50f16f02ff7274
        }
    }
}


package baitap_tuan4;
import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a= ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b= ");
        double b = scanner.nextDouble();
        System.out.println("Nhap 1 2 3 4 lan luoc tuong ung voi + - * / ");
        int Nhap = scanner.nextInt();
        double kq;
        switch(Nhap){
            case 1:
                kq = a + b;
                System.out.println("ket qua phep tinh cong: " + kq);
                break;
            case 2:
                kq = a - b;
                System.out.println("ket qua phep tinh tru: " + kq);
                break;
            case 3:
                kq = a*b;
                System.out.println("ket qua phep tinh nhan: " +kq);
                break;
            case 4:
                kq = a/b;
                System.out.println("ket qua tinh chia: " +kq);
                break;
            default:
                System.out.println(" hay nhap 1 den 4");
                
         
             
        }
    }
}

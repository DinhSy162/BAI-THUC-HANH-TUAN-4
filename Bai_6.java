
package baitap_tuan4;
import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        int ucln = 1;
        for(int i = Math.min(a,b); i >= 1; i-- ){
          if(a % i == 0 && b % i == 0){
              ucln =i;
              break;
          }
          
        }
        int bcnn = (a*b)/ucln;
        System.out.printf("UCLN cua a=%d  b=%d la:%d \n",a,b,ucln);
        System.out.printf("BCNN cua a=%d  b=%d la:%d ",a,b,bcnn);
        
    }       
}

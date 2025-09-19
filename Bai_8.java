
package baitap_tuan4;

import java.util.Scanner;


public class Bai_8 {
   public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Nhap so luon phan tu: ");
       int n = scanner.nextInt();
       int[] arr = new  int[n];
       
       System.out.println("Nhap cac phan tu:");
       for( int i = 0; i < n ;i++ ){
           arr[i] = scanner.nextInt();
       }
       int max=0;
       int ptMax = arr[0];
       
       for(int i = 0; i < n; i++){
           int dem = 0;
           for(int j=0; j < n ;j++ ){
               if(arr[i] == arr[j])
                   dem++;
           }
       
           if(dem > max){
              max = dem;
              ptMax =  arr[i];
           }
       
       }
       System.out.printf("Phan tu xuat hien nhieu nhat: %d va so lan xuat hien:%d", ptMax, max);
 
   } 
}

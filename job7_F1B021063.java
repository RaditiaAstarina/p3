
package P3;

import java.util.Scanner;

public class job7 {
 int hitungDebit;
 
 public job7(int volume, int waktu){
 hitungDebit = volume/waktu;
 }
 
 public int hitungDebit(){
 return hitungDebit;
 }
 
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Volume air  : ");
        int volume = input.nextInt(); 

        System.out.println("Waktu       : ");
        int waktu = input.nextInt(); 
        
        job7 nilai = new job7(volume, waktu);
        System.out.println("Debit air   : " + nilai.hitungDebit());
    }
}


package jsp3;
import java.util.Scanner;

public class jobsheet7 {
 int hitungDebit;
 
 public jobsheet7(int volume, int waktu){
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
        
        jobsheet7 nilai = new jobsheet7(volume, waktu);
        System.out.println("Debit air   : " + nilai.hitungDebit());
    }
}

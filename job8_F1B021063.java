
package P3;
import java.util.Scanner;

public class job8 {
 double hitungKecepatan;
 
 public job8(int jarak,int waktu){
 hitungKecepatan = jarak / waktu;
 }
 public double hitungKecepatan(){
 return hitungKecepatan;
 }
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Jarak tempuh   : ");
 int jarak = input.nextInt();
 System.out.print("Watu tempuh    : ");
 int waktu = input.nextInt();
 
 job8 hasil = new job8 (jarak,waktu);
 System.out.println("Kecepatan tempuh: " +hasil.hitungKecepatan());
 
 }
}



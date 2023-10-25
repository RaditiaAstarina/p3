package jsp3;
import java.util.Scanner;

public class jobsheet8 {
 double hitungKecepatan;
 
 public jobsheet8(int jarak,int waktu){
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
 
 jobsheet8 hasil = new jobsheet8 (jarak,waktu);
 System.out.println("Kecepatan tempuh: " +hasil.hitungKecepatan());
 
 }
}

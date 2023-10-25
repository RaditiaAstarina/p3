
package P3;
import java.util.Scanner;

public class job9 {

 double energiPotensial;
 final double gravitasi = 9.81;
 
 public job9(double massa, double gravitasi, double tinggi){
 energiPotensial = massa*gravitasi*tinggi;
 }
 
 public double getEnergiPotensial(){
 return energiPotensial;
 }
 
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Massa benda        : ");
 double massa = input.nextInt();
 System.out.print("Tinggi             : ");
 double tinggi = input.nextInt();
 
 job9 energi = new job9(massa, 9.81, tinggi);
 
 double hasilEnergiPotensial = energi.getEnergiPotensial();
 System.out.println("Energi Potensial   : " +hasilEnergiPotensial);
 }

}

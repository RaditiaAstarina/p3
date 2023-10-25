package jsp3;
import java.util.Scanner;

public class jobsheet9 {

 double energiPotensial;
 final double gravitasi = 9.81;
 
 public jobsheet9(double massa, double gravitasi, double tinggi){
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
 
 jobsheet9 energi = new jobsheet9(massa, 9.81, tinggi);
 
 double hasilEnergiPotensial = energi.getEnergiPotensial();
 System.out.println("Energi Potensial   : " +hasilEnergiPotensial);
 }

}

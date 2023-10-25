
package P2;

public class job5 {
 String hari;
 String bulan;
 int tanggal;
 int tahun;
 
 public job5(String hari, String bulan){
 this.hari = hari;
 this.bulan = bulan;
 }
 public job5(int tahun, int tanggal) {
 this.tanggal = tanggal;
 this.tahun = tahun;
 }
 public static void main(String[] args){
     
 job5 lahir1 = new job5("Selasa","Mei");
 job5 lahir2 = new job5(2023, 3);
 
 System.out.println("Hari   : " + lahir1.hari);
 System.out.println("Tanggal: " + lahir2.tanggal);
 System.out.println("Bulan  : " + lahir1.bulan);
 System.out.println("Tahun  : " + lahir2.tahun);
 }
}

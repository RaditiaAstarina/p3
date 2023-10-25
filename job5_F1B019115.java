package jsp3;

public class jobsheet5 {
 String hari;
 String bulan;
 int tanggal;
 int tahun;
 
 public jobsheet5(String hari, String bulan){
 this.hari = hari;
 this.bulan = bulan;
 }
 public jobsheet5(int tahun, int tanggal) {
 this.tanggal = tanggal;
 this.tahun = tahun;
 }
 public static void main(String[] args){
     
 jobsheet5 lahir1 = new jobsheet5("Rabu","Oktober");
 jobsheet5 lahir2 = new jobsheet5(2000, 10);
 
 System.out.println("Hari   : " + lahir1.hari);
 System.out.println("Tanggal: " + lahir2.tanggal);
 System.out.println("Bulan  : " + lahir1.bulan);
 System.out.println("Tahun  : " + lahir2.tahun);
 }
}

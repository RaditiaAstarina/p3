package jsp3;

public class jobsheet4 {
 private String nama;
 private int tahun;
 
 public jobsheet4(String nama) {
 this.nama = nama;
 }
 public jobsheet4(int tahun) {
 this.tahun = tahun;
 }
 
 public String getNama(){
 return nama;
 }
 public void setNama(){
 this.nama = nama;
 }
 public int getTahun(){
 return tahun;
 }
 public void setTahun(){
 this.tahun = tahun;
 }
 
 public static void main(String[] args){
    jobsheet4 A=new jobsheet4 ("BRIO");
    jobsheet4 B=new jobsheet4 (2017);
   
 System.out.println("Jenis mobil: " +A.getNama());
 System.out.println("Tahun mobil: " +B.getTahun());
 }
}

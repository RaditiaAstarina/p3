
package P2;


public class job4 {
 private String nama;
 private int tahun;
 
 public job4(String nama) {
 this.nama = nama;
 }
 public job4(int tahun) {
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
    job4 A=new job4 ("Avanza");
    job4 B=new job4 (2023);
   
 System.out.println("Jenis mobil: " +A.getNama());
 System.out.println("Tahun mobil: " +B.getTahun());
 }
}


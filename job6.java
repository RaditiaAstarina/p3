
package P2;
import java.util.Scanner;

public class job6{
 String judul;
 int halaman;
 
 public job6(String judul) {
 this.judul = judul;
 }
 public job6(int halaman) {
 this.halaman = halaman;
 }
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Judul buku   : ");
 String judul = input.nextLine();
 
 System.out.print("Halaman buku : ");
 int halaman = input.nextInt();
 }
}


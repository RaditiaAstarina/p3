package jsp3;

public class jobsheet3 { 
    String x;
    double ipk;

public jobsheet3( ) {
    
}
public jobsheet3(String nama) {
    x=nama;
}

public jobsheet3(String nama, double ipk) {
    x=nama;
    this.ipk=ipk;
}

public static void main(String[] args){ 
jobsheet3 mhs = new jobsheet3("Raditia Astarina",3.59);

System.out.println("Nama    : "+mhs.x);
System.out.println("IPK     : "+mhs.ipk);
}
} 

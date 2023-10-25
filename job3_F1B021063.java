
package P2;


public class job3 { 
    String x;
    double ipk;

public job3( ) {
    
}
public job3(String nma) {
    x=nma;
}

public job3(String nma, double ipk) {
    x=nma;
    this.ipk=ipk;
}

public static void main(String[] args){ 
job3 mhs = new job3("M. rifqi",4.00);

System.out.println("Nama    : "+mhs.x);
System.out.println("IPK     : "+mhs.ipk);
}
}

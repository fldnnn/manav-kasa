import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, e, d, m, p;
        System.out.print("Armut Kilo Miktarı :");
        a= scan.nextDouble();
        System.out.print("Elma Kilo Miktarı :");
        e= scan.nextDouble();
        System.out.print("Domates MKilo Miktarı :");
        d= scan.nextDouble();
        System.out.print("Muz Kilo Miktarı :");
        m= scan.nextDouble();
        System.out.print("Patlıcan Kilo Miktarı :");
        p= scan.nextDouble();
        double toplamTutar = (a*2.14+e*3.67+d*1.11+m*0.95+p*5);
        System.out.print("Toplam Tutar : "+toplamTutar+ "TL");
    }
}

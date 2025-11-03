import java.util.Scanner;

public class PengirimanBarang {
    public static void main(String[] args) {
        double jarak,HJ = 0,BP,Volume,Hv,p,l,t,HargaTotal;

        Scanner input = new Scanner(System.in);
        System.out.println("Jarak Antar: ");
        jarak = input.nextDouble();
        System.out.println("Berat Paket: ");
        BP = input.nextDouble();

        if (jarak <= 10000) {
        HJ = 4250 * BP;
        }else if (jarak > 10000) {
            HJ = 6000 * BP;
        }

        System.out.println("Panjang Paket: ");
        p = input.nextDouble();
        System.out.println("Lebar Paket: ");
        l = input.nextDouble();
        System.out.println("Tinggi Paket: ");
        t = input.nextDouble();
        Volume = p*l*t;

        if (Volume > 100) {
            Hv = 50000;
            }else{
            Hv = 0;
        }

        HargaTotal = HJ + Hv;
        System.out.println("Dengan Jarak " + jarak +"KM Dan Volume paket " + Volume + " Cm Maka Harga Total Adalah " + HargaTotal);

    }
}

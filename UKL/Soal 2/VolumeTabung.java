
import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Phi = Math.PI;

        System.out.println(" Masukkan Rusuk Tabung: ");
        int Rusuk = input.nextInt();
        double R = (Rusuk * Rusuk);

        System.out.println("Masukkan Tinggi Tabung: ");
        double T = input.nextDouble();

        double hasil = Phi * R * T;

        System.out.println("Maka Volume tabung adalah " + hasil + " Cm ");
    }
}

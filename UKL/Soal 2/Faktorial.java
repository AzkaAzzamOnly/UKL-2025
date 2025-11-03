
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan yang ingin di faktorial");
        int Bilangan1 = input.nextInt();

        int hasil =1;

        for (int i = 1; i <= Bilangan1; i++) {
            hasil *= i;
        }

        System.out.println("Hasil dari bilangan faktorial dari " + Bilangan1 + " adalah: " + hasil);

        input.close();
    }
}


import java.util.Scanner;

public class GanjlGenap {
    public static void main(String[] args) {
        int Bilangan;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan: ");
        Bilangan = input.nextInt();
        
        if (Bilangan % 2 == 0) {
            System.out.println("Wah Ternyata Bilangan "  + Bilangan + " Adalah Genap");
        }else{
            System.out.println("Wah Ternyata Bilangan " + Bilangan + " Adalah Ganjil");
        }
    }
}

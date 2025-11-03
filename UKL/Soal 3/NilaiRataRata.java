
import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Siswa: ");
        int JS = input.nextInt();

        double TotalNilai = 0;

        for (int i = 1; i <= JS; i++) {
            System.out.println("Masukkan nilai siswa ke- " + i + ": ");

            TotalNilai += input.nextDouble();
        }

        if (JS > 0 ) {
            double RtRt = TotalNilai / JS;
            System.out.println("Rata Rata Nilai: " + RtRt);
        } else {
            System.out.println("Tidak ada nilai");
        }

        input.close();

    }
}

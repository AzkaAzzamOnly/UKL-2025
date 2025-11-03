
import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Kolom: ");
        int klm = input.nextInt();
        System.out.print("Masukkan Jumlah Baris: ");
        int brs = input.nextInt();
        
        int [][] matriks1 = new int [brs][klm];
        int [][] matriks2 = new int [brs][klm];
        int [][] HasilMatriks = new int [brs][klm];

        System.out.println("\n ---- Matriks A ----");
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < klm; j++) {
                System.out.print("Matriks[" + i + "] " + "[" + j+ "] : ");
                matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("\n ---- Matriks B ----");
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < klm; j++) {
                System.out.print("Matriks[" + i + "] " + "[" + j+ "] :");
                matriks2[i][j] = input.nextInt();
            }
        }

            for (int i1 = 0; i1 < brs; i1++) {
                for (int j = 0; j < klm; j++) {
                    HasilMatriks[i1][j] = matriks1[i1][j] + matriks2[i1][j];
                }
            }

            System.out.println("Hasil Matriks A + B ");
            for (int i1 = 0;  i1 < brs; i1++) {
                for (int j = 0; j < klm; j++) {
                    System.out.printf("%5d", HasilMatriks[i1][j]);
                }
                System.out.println();
            }
        input.close();
            
    }
    }


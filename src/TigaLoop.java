import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while    : ");
        int iWhile = 1;
        while (iWhile <= n) {
            System.out.print(iWhile + " ");
            iWhile++;
        }
        System.out.println();

        System.out.print("do-while : ");
        int iDoWhile = 1;
        do {
            System.out.print(iDoWhile + " ");
            iDoWhile++;
        } while (iDoWhile <= n);

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        int jumlahPrintln = 0;

        System.out.print("Disaring : ");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            jumlahPrintln++;
        }

        System.out.println();
        System.out.println("Sampai println  : " + jumlahPrintln + " kali");

        /*
Pada i = 8, kondisi i % 2 == 0 bernilai benar,
sehingga continue dijalankan terlebih dahulu.
Akibatnya program langsung kembali ke awal loop
dan tidak pernah mencapai kondisi break.
*/

        /*
OUTPUT n = 5

Batas deret (n) : 5

===== SATU DERET, TIGA LOOP =====
for      : 1 2 3 4 5
while    : 1 2 3 4 5
do-while : 1 2 3 4 5

i <  n berputar : 4 kali
i <= n berputar : 5 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali


OUTPUT n = 0

Batas deret (n) : 0

===== SATU DERET, TIGA LOOP =====
for      :
while    :
do-while : 1

i <  n berputar : 0 kali
i <= n berputar : 0 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali


KESIMPULAN:
do-while mengecek kondisinya sesudah badan loop dijalankan,
jadi badannya pasti jalan minimal sekali.
*/

        /*
Kesimpulan:
do-while mengecek kondisinya sesudah badan loop dijalankan,
jadi badannya pasti jalan minimal sekali.
*/

        System.out.println();
    }
}
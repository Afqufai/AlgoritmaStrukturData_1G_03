package P3.ArrayObjects.src;
import P3.ArrayObjects.src.PersegiPanjang;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int arrlength = sc03.nextInt();
        
        PersegiPanjang[] ppArray = new PersegiPanjang[arrlength];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc03.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc03.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        sc03.close();
    }
}

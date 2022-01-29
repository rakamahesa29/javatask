import java.util.Scanner;

public class tahunKabisat {

    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hitung Tahun Kabisat : by raka mahesa");
        System.out.println("=====================================");
        System.out.print("Masukan tahun : ");

        tahun = scan.nextInt();
        if (tahun % 400 == 0) {
          System.out.print(tahun + " Adalah Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
          System.out.print(tahun + " Adalah Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
          System.out.print(tahun + " Adalah Tahun Kabisat\n");
        } else {
          System.out.print(tahun + " Adalah Bukan Tahun Kabisa\n");
        }
    }

}
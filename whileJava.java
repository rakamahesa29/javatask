import java.util.Scanner;

public class whileJava {
    
    public static void main(String[] args) {
        String lagi = "Ya";
        while(lagi.equals("Ya"))
        {
              Scanner nilai=new Scanner (System.in);

              System.out.print("Masukan nilai A = ");
              int A=nilai.nextInt();
              System.out.print("Masukan nilai B = n");
              int B=nilai.nextInt();

              int hasil= A+B;

              System.out.print("Mau lagi (Ya/Tidak) ?");
              Scanner x = new Scanner(System.in);
              lagi = x.nextLine().toUpperCase();

               
              System.out.println("Jumlah nilai = " + hasil);

               
        }
               System.out.println("Terimakasih");
    }

}

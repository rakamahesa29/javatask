import javax.swing.*;

public class taskArray9 {

    public static void main(String[] args) {
        
        // variable input
        int[] no = new int[10];
        String[] nama = new String[25];
        String[] nim = new String[10];
        int[] uts = new int[10];
        int[] uas = new int[10];
        int[] nilaiUts = new int[10];
        int[] nilaiUas = new int[10];
        int[] na = new int[10];
        int i = 0;
        String[] grade = new String[10];
        String tanya ="";

        

        do {

            no[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nomer"));
            nim[i]=JOptionPane.showInputDialog("Masukan Nim");
            nama[i]=JOptionPane.showInputDialog("Masukan Nama");
            nilaiUts[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai UTS"));
            nilaiUas[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai UAS"));

            uts[i]=nilaiUts[i]/2;
            uas[i]=nilaiUas[i]/2;

            na[i]=uts[i]+uas[i];

            if (na[i] >= 80 && na[i] <=100){
                grade[i] = "A";
            }
            else if (na[i] > 75 && na[i] < 80){
                grade[i] = "B";
            }
            else if (na[i] > 65 && na[i] < 75){
                grade[i] = "C";
            }
            else if (na[i] > 50 && na[i] < 65){
                grade[i] = "D";
            }
            else {
                grade[i] = "E";
            }
            
            i++;
            tanya=JOptionPane.showInputDialog("Ingin Tambahkan Data Lagi ? [YA/TIDAK]");
        } while(tanya.equalsIgnoreCase("Ya"));
            System.out.println("===================  OUTPUT NILAI ====================");
            System.out.println("NO    NIM    NAMA    UTS    UAS    NILAI AKHIR    INDEX");
            System.out.println("======================================================");
          for(int j=0;j<i;j++) {
              System.out.println(no[j]+"     "+nim[j]+"    "+nama[j]+"    "+nilaiUts[j]+"     "+nilaiUas[j]+"         "+na[j]+"          "+grade[j]);
          }
    }
}

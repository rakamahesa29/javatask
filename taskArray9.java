import javax.swing.*;

public class taskArray9 {

    public static void main(String[] args) {
        
        // variable input
        int[] no = new int[10];
        String[] nama = new String[25];
        String[] nim = new String[10];
        int[] uts = new int[10];
        int[] uas = new int[10];
        int[] na = new int[10];
        int i = 0;
        String grade;
        String tanya ="";

        

        do {

            no[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nomer"));
            nim[i]=JOptionPane.showInputDialog("Masukan Nim");
            nama[i]=JOptionPane.showInputDialog("Masukan Nama");
            uts[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai UTS"));
            uas[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai UAS"));

            na[i]=(uts[i]+uas[i])/2;

            if (na[i] >= 80) {
                grade = "A";
            } else if (na[i] < 80) {
                grade = "B";
            } else if (na[i] <= 65 ) {
                grade = "C";
            } else if (na[i] <= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            
            i++;
            tanya=JOptionPane.showInputDialog("Ingin Tambahkan Data Lagi ? [YA/TIDAK]");
        } while(tanya.equalsIgnoreCase("Ya"));
            System.out.println("===================  OUTPUT NILAI ====================");
            System.out.println("NO    NIM    NAMA    UTS    UAS    NILAI AKHIR    INDEX");
            System.out.println("======================================================");
          for(int j=0;j<i;j++) {
              System.out.println(no[j]+"     "+nim[j]+"    "+nama[j]+"    "+uts[j]+"     "+uas[j]+"         "+na[j]+"          "+grade);
          }
    }
}

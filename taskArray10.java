import javax.swing.*;

public class taskArray10 {

    public static void main(String[] args) {
        
        // variable input
        int[] no = new int[10];
        String[] nama = new String[25];
        String[] jurusan = new String[30];
        String[] kelas = new String[20];
        int[] jumTiket = new int[20];
        int[] harga = new int[20];
        int[] totalHarga = new int[20];
        int i = 0;
        String tanya="";

        // processing
        do {
            no[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan nomer"));
            nama[i]=JOptionPane.showInputDialog("Masukan Nama");
            jurusan[i]=JOptionPane.showInputDialog("Masukan Jurusan");
            kelas[i]=JOptionPane.showInputDialog("Masukan Kelas");
            jumTiket[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Tiket"));
            harga[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan harga tiketn satuan"));
            totalHarga[i]=jumTiket[i]*harga[i];
            i++;

            tanya=JOptionPane.showInputDialog("Ingin Tambahkan Data Lagi ? [YA/TIDAK]");

        } while (tanya.equalsIgnoreCase("Ya"));
            System.out.println("============================= OUTPUT TIKET KERETA ========================================");
            System.out.println("No"+"\t\t\t"+"Nama"+"\t\t\t"+"Jurusan"+"\t\t\t"+"Kelas"+"\t\t\t"+"Jumlah Tiket"+"\t\t\t"+"Harga Tiket Satuan"+"\t\t\t"+"Total Bayar");
            System.out.println("==========================================================================================");
            for(int j=0;j<i;j++) {
            System.out.println(no[j]+"\t\t\t"+nama[j]+"\t\t\t"+jurusan[j]+"\t\t\t"+kelas[j]+"\t\t\t"+jumTiket[j]+"\t\t\t"+harga[j]+"\t\t\t"+totalHarga[j]);
        }

    }
    
}

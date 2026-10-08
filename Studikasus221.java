import java.util.Scanner;

/**
 * Studikasus221
 */
public class Studikasus221 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = sc.nextLine();

        System.out.print("jenis kegiatan(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA: ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

       
        int peringkatJuara = 0;
        int statusPKM= 0;

        if (jenisKegiatan.equalsIgnoreCase("belmawa")||
            jenisKegiatan.equalsIgnoreCase("bakorma")||
            jenisKegiatan.equalsIgnoreCase("mandiri")){
                System.out.print("peringkat juara: ");
                peringkatJuara = sc.nextInt();
            }else if (jenisKegiatan.equalsIgnoreCase("pkm")){
                System.out.print("apakah lolos pendanaan(1=lolos,0=tidak lolos");
            }
            System.out.print("Status pendanaan PKM: ");
            statusPKM = sc.nextInt();
        
        
    }
}
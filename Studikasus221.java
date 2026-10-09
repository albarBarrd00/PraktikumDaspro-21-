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
        
            if ( jumlahDokumen < 4) {
                int dokKurang = 4 - jumlahDokumen;
                System.out.println("dokumen tidak lengkap (kurang"+ dokKurang+" dokumen) dana tidak diberikan");        
            }
            if (jenisKegiatan.equalsIgnoreCase("belmawa") ||
                jenisKegiatan.equalsIgnoreCase("bakorma") ||
                jenisKegiatan.equalsIgnoreCase(jenisKegiatan)) {
                    if ( peringkatJuara >= 1 && peringkatJuara <= 3)
                    System.out.println("Mendapat dana penghargaan");
                else {
                System.out.println("Tidak mendapat dana ");
                }
            
           
                }else if (jenisKegiatan.equalsIgnoreCase("pkm")) 
                if (statusPKM == 1){
                    System.out.println("Tim lolos dana penghargaan diberikan");
                }else {
                    System.out.println("Tim tidak lolos pendanaan, dana penghargaan tidak diberikan");
                }
            else {
                System.out.println("Kegiatan ini tidak memeperoleh dana penghargaan");
            }

        

        sc.close();
        }
}
    

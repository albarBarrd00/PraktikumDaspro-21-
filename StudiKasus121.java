import java.util.Scanner;
/**
 * StudiKasus121
 */
public class StudiKasus121 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga;
        int totalBayar, kembalian, diskon, kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup= input.nextInt();
        System.out.println("Masukkan uang bayar: ");
        uangBayar= input.nextInt();


        totalHarga = jumlahCup*hargaPerCup;
        System.out.println();


        if (totalHarga >= 10000) {
            diskon = (int) (totalHarga*0.1); 
            totalBayar=totalHarga-diskon;
            System.out.println("total harga:"+totalBayar);
        }else{
               System.out.println("total yang perlu di bayar: "+uangBayar);
            } 
        
            System.out.println("")
    }
}        




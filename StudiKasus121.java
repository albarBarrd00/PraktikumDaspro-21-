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
        diskon = 0;


        if (totalHarga >= 100000) {
            diskon =(int)(totalHarga*0.1); 
            totalBayar=totalHarga-diskon;
            System.out.println("total harga yang harus di bayar:"+totalBayar);
        }else{
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga yang harus dibayar Rp" + totalBayar);
        }
           
            System.out.println("total harga: "+ totalHarga);
            System.out.println("diskon: "+ diskon);
            System.out.println("Total bayar: "+ totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian yang didapat Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup,kurang Rp" + kurang);
        }

        input.close();

    }
}        




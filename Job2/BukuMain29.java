import java.util.Scanner;
public class BukuMain29 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok ); 
        System.out.println("Harga: Rp" + harga); 
    }
    void terjual(int jml) {
        if (stok>0) {
        stok -= jml;
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public static void main(String[] args) {
    
        BukuMain29 bk1 = new BukuMain29();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;  
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 590000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku29 bukuzaki = new Buku29("Nice Try", "Zaki Erlangga", 200, 1, 100000000);
        bukuzaki.terjual(1);
        bukuzaki.tampilInformasi();
    }
}

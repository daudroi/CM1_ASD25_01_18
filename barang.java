public class barang {
    String kodebarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    barang() {
    }

    barang(String kb, String nm, String ktgr, int stk, int hrga) {
        kodebarang = kb;
        nama = nm;
        kategori = ktgr;
        stok = stk;
        harga = hrga;
    }

    void tampilDataBarang() {
        System.out.println("Kode Barang :");
        System.out.println("Kategori    :");
        System.out.println("Stok        :");
        System.out.println("Harga       :");
    }
}

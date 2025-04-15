public class dataBarang {
    public static barang[] daftarBarang = {
        new barang("Br001", "Leo Kripik", "Makanan", 10, 1000),
        new barang("Br002", "You (1000 Botol)", "Minuman", 10, 7000),
        new barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000),
        new barang("Br004", "Rinso Cair", "Sabun", 10, 7000),
        new barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000)
    };

    void tampil() {
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Kode", "Nama Barang", "Kategori", "Stok", "Harga");
        for (int i = 0; i < daftarBarang.length; i++) {
            System.out.printf("%-20s %-20s %-20s %-20d %-20d\n",
                daftarBarang[i].kodebarang,
                daftarBarang[i].nama,
                daftarBarang[i].kategori,
                daftarBarang[i].stok,
                daftarBarang[i].harga
            );
        }
    }   
}
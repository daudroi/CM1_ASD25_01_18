public class dataTransaksi {
    Transaksi[] dataTransaksi = {
        new Transaksi("Tr001", "Santi", "21-04-2024", 1,dataBarang.daftarBarang[0]),
        new Transaksi("Tr002", "Yani", "21-04-2024", 2,dataBarang.daftarBarang[1]),
        new Transaksi("Tr003", "Siska", "23-04-2024", 3,dataBarang.daftarBarang[2]),
        new Transaksi("Tr004", "MeiMei", "23-04-2024", 1,dataBarang.daftarBarang[3]),
        new Transaksi("Tr005", "Ihsan", "24-04-2024", 1,dataBarang.daftarBarang[4])
    };

    void tampil1() {
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", 
            "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian", "Nama Barang", "kuantitas", "Harga");

        for (int i = 0; i < dataTransaksi.length; i++) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20d %-20s\n",
                dataTransaksi[i].kodeTransaksi,
                dataTransaksi[i].namaPembeli,
                dataTransaksi[i].tanggalPembelian,  
                dataTransaksi[i].brg.nama,
                dataTransaksi[i].qty,
                dataTransaksi[i].brg.harga
            );
        }
    }
}


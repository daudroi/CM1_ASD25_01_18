public class Transaksi {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    barang brg;

    Transaksi(){}

    Transaksi(String kodeTransaksi, String namaPembeli, String tanggalPembelian,int qty, barang brg){
        this.kodeTransaksi = kodeTransaksi;
    this.namaPembeli = namaPembeli;
    this.tanggalPembelian = tanggalPembelian;
    this.qty = qty;
    this.brg = brg;
    }

    
}

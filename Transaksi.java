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

    public void tampilDataTransaksi() {
        System.out.println("Kode Transaksi  : " + kodeTransaksi);
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Tanggal         : " + tanggalPembelian);
        System.out.println("Nama Barang     : " + brg.nama);
        System.out.println("Qty             : " + qty);
        System.out.println("Harga           : " + brg.harga);
        System.out.println("--------------------------------");
    }

    
}

public class service {
    Transaksi[] dataTransaksi;
    int index;

    public service(Transaksi[] dataTransaksi) {
        this.dataTransaksi = dataTransaksi;
        this.index = dataTransaksi.length; 
    }

    public void pencarian(String namaPembeli) {
        boolean found = false;
        int jumlahDitemukan = 0;

        for (int i = 0; i < index; i++) {
            if (dataTransaksi[i].namaPembeli.equalsIgnoreCase(namaPembeli)) {
                dataTransaksi[i].tampilDataTransaksi();
                found = true;
                jumlahDitemukan++;
            }
        }

        if (!found) {
            System.out.println("Transaksi dengan nama pembeli '" + namaPembeli + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu transaksi atas nama '" + namaPembeli + "'.");
        }
    }
}
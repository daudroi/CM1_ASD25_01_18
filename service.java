public class service {
    Transaksi[] dataTransaksi;
    int index;

    public service(Transaksi[] dataTransaksi) {
        this.dataTransaksi = dataTransaksi;
        this.index = dataTransaksi.length; 
    }

    public void searching(String namaPembeli) {
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
    public void Sorting() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (dataTransaksi[j].namaPembeli.compareToIgnoreCase(dataTransaksi[j + 1].namaPembeli) > 0) {             
                    Transaksi temp = dataTransaksi[j];
                    dataTransaksi[j] = dataTransaksi[j + 1];
                    dataTransaksi[j + 1] = temp;
                }
            }
        }
    }
}
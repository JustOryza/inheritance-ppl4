public class barang {

    public int kode = 1;
    public int jumlah = 10;
    public int harga = 3000;
    public String nama = "Tepung Maizena";
    public String kategori = "Barang Setengah Jadi";

    public void output() {

        System.out.println(this.getClass().getName());

    }

    public void info() {
        System.out.println("nama barang : " + nama);
        System.out.println("kode barang : " + kode);
        System.out.println("harga barang : " + harga);
        System.out.println("kategori barang : " + kategori);
        System.out.println("jumlah barang : " + jumlah);

    }
}

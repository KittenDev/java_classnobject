package restaurant;

/**
 *
 * @author Dafaa
 */
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    
    public void tambahMakanan(String nama, double harga, int stok){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = stok;
    }
    
    public void tampilMakanan(){
        if(!isOutOfStock()){
            System.out.println(this.nama_makanan + "[" + this.stok + "]" + "\tRp. " + this.harga_makanan);
        }
    }
    
    private boolean isOutOfStock(){
        return this.stok == 0;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void minStok(int jumlah) {
        if(jumlah > stok){
            System.out.println("Stok tidak cukup, pembelian gagal");
        }else{
            this.stok -= jumlah;
        }
    }
}

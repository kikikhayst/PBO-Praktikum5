/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nim, nama, alamat;
    int umur;
    public Mahasiswa() {
        nim = "";
        nama = "";
        alamat = "";
        umur = 0;
    }
    
    public Mahasiswa (String newNim, String newNama, String newAlamat, int newUmur) {
        nim = newNim;
        nama = newNama;
        alamat = newAlamat;
        umur = newUmur;
    }
    
    public void setNim(String newNim) {
        nim = newNim;
    }
    
    public void setNama(String newNama) {
        nama = newNama;
    }
    
    public void setAlamat(String newAlamat) {
        alamat = newAlamat;
    }
    
    public void setumur(int newUmur) {
        umur = newUmur;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public String toString() {
        String str = 
                "Nim: "+nim+"\n"+
                "Nama: "+nama+"\n"+
                "Alamat: "+alamat+"\n"+
                "Umur: "+umur+"\n";
        return str;
    }
    
    static void test() {
        Mahasiswa mhs = new Mahasiswa("19.5.00081", "Rizqi Rama Hayustya", "Jl. Final Fantasy", 21);
        System.out.println("Data Mahasiswa");
        System.out.println(mhs.getNim());
        System.out.println(mhs.getNama());
        System.out.println(mhs.getAlamat());
        System.out.println(mhs.getUmur());
//        System.out.println(mhs);
    }
    
    public static void main(String args[]) {
        test();
    }
}

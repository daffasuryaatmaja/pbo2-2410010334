/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 *
 * @author Lenovo
 * 
 * • Skripsi hanya dibaca di tempat: batasHariPinjam() bernilai 0 dan pinjam() selalu mengembalikan false
(override method pinjam()).
• Denda Skripsi selalu 0 dan keterangan() menampilkan penulis serta program studi.
• Tambahkan method cariJudul(String kataKunci) di kelas Perpustakaan yang mengembalikan
List<Koleksi> berisi koleksi yang judulnya memuat kata kunci, tanpa membedakan huruf besar dan kecil. \n bagaimana aku melakukannya
 */
public class Skripsi extends Koleksi {
    private final String penulis;
    private final String programStudi;
    
    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }
    
    @Override
    public int batasHariPinjam() {
        return 0;
    }
    
    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0;
    }
    
    @Override
    public boolean pinjam() {
        return false;
    }
    
    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis + " (" + programStudi + ")";
    }
}
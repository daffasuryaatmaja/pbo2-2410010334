/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    
    private final List<Koleksi> daftarKoleksi = new ArrayList<>();
    private final Map<String, Anggota> peminjam = new HashMap<>();
    
    public void tambah(Koleksi koleksi) {
        daftarKoleksi.add(koleksi);
    };
    
    public Koleksi cari (String kode) {
        for (Koleksi k : daftarKoleksi) {
            if (k.getKode().equals(kode)) {
                return k;
            }
        }
        return null;
    };
    
    public boolean pinjam(String kode, Anggota anggota) {
        Koleksi koleksi = cari(kode);
        if (koleksi == null || !koleksi.pinjam()) {
            return false;
        }
        peminjam.put(kode, anggota);
        return true;
    }
    
    public long kembalikan(String kode, int hariTerlambat) {
        Koleksi koleksi = cari(kode);
        if (koleksi == null || koleksi.getStatus() == StatusKoleksi.TERSEDIA) {
            return 0;
        }
        koleksi.kembalikan();
        peminjam.remove(kode);
        // Polymorphism: rumus denda mengikuti jenis object (Buku atau Majalah)
        return koleksi.hitungDenda(hariTerlambat);
    }
    
    public Anggota getPeminjam(String kode) {
        return peminjam.get(kode);
    }
    
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Koleksi k : daftarKoleksi) {
            if (k.getStatus() == StatusKoleksi.TERSEDIA) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public List<Koleksi> getDaftarKoleksi() {
        return List.copyOf(daftarKoleksi);
    }
    
    public List<Koleksi> cariJudul(String kataKunci) {
        List<Koleksi> hasil = new ArrayList<>();
        String kunci = kataKunci.toLowerCase();
        for (Koleksi k : daftarKoleksi) {
            if (k.getJudul().toLowerCase().contains(kunci)) {
                hasil.add(k);
            }
        }
        return hasil;
    }
}
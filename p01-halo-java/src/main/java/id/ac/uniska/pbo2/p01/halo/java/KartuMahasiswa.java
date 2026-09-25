/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01.halo.java;

/**
 *
 * @author Lenovo
 */
public class KartuMahasiswa {
    public String nama = "Daffa Surya Atmaja";
    public String npm = "2410010334";
    public String prodi = "Teknik Informatika";
    public int semester = 5;
    public String alasan = "ingin belajar java";
 
    public KartuMahasiswa() {};
 
    public void tampilkanKartu() {
        System.out.println("==============================");
        System.out.println(" KARTU MAHASISWA PBO 2");
        System.out.println("==============================");
        System.out.println(" Nama    : " + nama);
        System.out.println(" NPM     : " + npm);
        System.out.println(" Prodi   : " + prodi);
        System.out.println(" Semester: " + semester);
        System.out.println(" Alasan  : " + alasan);
        System.out.println("==============================");
    }
    
}

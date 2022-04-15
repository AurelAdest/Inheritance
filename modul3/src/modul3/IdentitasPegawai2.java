/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author aurel
 */
public class IdentitasPegawai2 extends IdentitasPegawai{
    String jeniskelamin;
    int nomorpegawai;
    
    public void identitas(){
        jeniskelamin = "Perempuan";
        System.out.println("jenis Kelamin: "+jeniskelamin);
    }
     public void setnomorpegawai(int nomorpegawai){
        this.nomorpegawai= nomorpegawai;
    }
     public void cetak(){
         super.identitas();
    }
     public void nomorpegawai(){
         System.out.println("Nomor Pegawai: "+nomorpegawai);
     }
}

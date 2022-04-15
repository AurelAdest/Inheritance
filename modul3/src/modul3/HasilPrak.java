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
public class HasilPrak {
    public static void main(String[] args){
        IdentitasPegawai2 identitaspegawai= new IdentitasPegawai2();
        identitaspegawai.cetak();
        identitaspegawai.identitas();
        identitaspegawai.setnomorpegawai(333333);
        identitaspegawai.nomorpegawai();
        
        GajiPegawai gaji=new GajiPegawai();
        System.out.println("Bekerja dibagian admin");
        gaji.gaji(6,2);
        gaji.gaji(6,2,2);
    }
}

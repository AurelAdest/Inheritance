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
public class Hitung4 {
    public static void main(String[] args){
        BangunDatar4 bangundatar=new BangunDatar4();
        
        Persegi4 persegi = new Persegi4 ();
        persegi.sisi=4;
        
        PersegiPanjang4 perjang = new PersegiPanjang4();
        perjang.lebar=11;
        perjang.panjang=2;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        perjang.luas();
        perjang.keliling();
        
    }
}

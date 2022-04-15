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
public class Anak extends ayah{
    double nilaimax=99.9;
    String nama="Dina";
    int age = 17;
    
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("Yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("Dengan tinggi badan "+super.Tb);
    }
}

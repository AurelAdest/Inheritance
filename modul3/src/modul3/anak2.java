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
public class anak2 extends ayah {
    //deklarasi variabel
    double nilaimax=99.9;
    String nama;
    int age = 17;
    
 public void setnama(String nama){
     this.nama=nama;
 }

 //method output program
public void cetak(){
System.out.println("Anak ini punya sifat "+ super.Sifat);
System.out.println("Yang bernama " +nama);
System.out.println("Berumur "+age+"tahun");
System.out.println("Dengan tinggi badan "+super.Tb);
super.hobbi();
        }

}

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
public class GajiPegawai {
    int gaji;
    
 void gaji (int a, int b){
     gaji=a*b;
     System.out.println("Gaji utama yang di dapat: "+gaji+"00000");
 }
 void gaji (double a, double b, double c){
     gaji = (int)(a*b*c);
     System.out.println("GAji yang didapat jika bekerja secara baik menjadi: "+gaji+"00000");
 }
}

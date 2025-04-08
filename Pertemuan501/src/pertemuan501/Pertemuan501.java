/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan501;

/**
 *
 * @author suciantari2301010425
 * TGL 8 April 2025
 */
public class Pertemuan501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan();
        //pancong.bentuk = "bulat";
        pancong.setBentuk("Bulat");
        pancong.rasa = "coklat";
        pancong.warna = "Hijau";
        pancong.harga = 15000;
        
        System.out.println("Pancong : " +pancong.getBentuk());
        
        jajan pukis = new jajan();
        //pancong.bentuk = "bulat";
        pukis.setBentuk("Bulat");
        pukis.rasa = "coklat";
        pukis.warna = "Hijau";
        pukis.harga = 15000;
        
        System.out.println("Pukis : " +pukis.getBentuk());
    }
    
}


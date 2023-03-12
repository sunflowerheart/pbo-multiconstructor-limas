/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limas;

/**
 *
 * @author yafiaryamaulana
 */
public class Main_limas {
    public static void main(String[] args) {
        Limas limas  = new Limas(8, 3, 10, 13);
         limas.ComputeAndSetVolume();
        System.out.print("Volume Limas dengan panjang alas " +limas.panjangAlas+ ", lebar " +limas.lebarAlas+ ", tinggi " +limas.tinggi+ ", tinggi Alas " +limas.tinggiLimas " adalah " +limas.getVolume());

        }
    
}

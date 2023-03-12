/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limas;

/**
 *
 * @author yafiaryamaulana
 */
public class Limas {
    private float panjangAlas;
    private float lebarAlas;
    private float tinggi;
    private float tinggiLimas;
    private float volume;


    public Limas (float panjangAlas, float lebarAlas, float tinggi, float tinggiLimas) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggiLimas;
    }

    public Limas (float panjangAlas, float lebarAlas, float tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggi / 2;
    }

    public Limas (float panjangAlas, float tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = panjangAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggi / 2;
    }

   public void ComputeAndSetVolume(){
          //compute volume
          int calculate_vol = this.panjangAlas  * this.lebarAlas * this.tinggi * this.tinggiLimas;
          this.volume = calculate_vol;
       }
   public int getVolume(){
        return this.volume;
    }
  }

    


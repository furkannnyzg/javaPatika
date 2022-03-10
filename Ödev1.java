/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ödev1;

import java.util.Scanner;

/**
 *
 * @author eren_
 */
public class Ödev1 {

    
    public static void main(String[] args) {
        int mat,fizik,kimya,türkce,tarih,müzik;
        Scanner k=new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=k.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik=k.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya=k.nextInt();
        System.out.print("Türkçe Notunuz: ");
        türkce=k.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih=k.nextInt();
        System.out.print("Müzik Notunuz: ");
        müzik=k.nextInt();
        
        int toplam=mat+kimya+tarih+fizik+müzik+türkce;
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız: "+sonuc);
        while(sonuc<60){
            System.out.println("Sınıfta Kaldı");
        break;
        }
        
        while(sonuc>60){
        System.out.println("Sınıfı Geçti");
        break;
        }
    }
    
}

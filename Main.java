/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persegipanjang;
import java.util.Scanner;
/**
 *
 * @author salsa
 */
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukan panjang persegi panjang: ");
//        int panjang=input.nextInt();
//        System.out.println("Masukan lebar persegi panjang: ");
//        int lebar=input.nextInt();
//        
//        PersegiPanjang myPersegiPanjang = new PersegiPanjang(panjang, lebar);
//        System.out.println("Luas persegi panjang: " +myPersegiPanjang.getLuas());
//        System.out.println("Keliling persegi panjang: " +myPersegiPanjang.getKeliling());

        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("Persegi panjang 1 dengan panjang " +persegiPanjang1.panjang  +" dan lebar " +persegiPanjang1.lebar +" memiliki luas " +persegiPanjang1.getLuas() +" dan keliling " +persegiPanjang1.getKeliling());
        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("Persegi panjang 2 dengan panjang " +persegiPanjang2.panjang  +" dan lebar " +persegiPanjang2.lebar +" memiliki luas " +persegiPanjang2.getLuas() +" dan keliling " +persegiPanjang2.getKeliling());
        
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25,1);
        persegiPanjang3.setLebar(35);
        System.out.println("Persegi panjang 3 dengan panjang " +persegiPanjang3.panjang  +" dan lebar " +persegiPanjang3.lebar +" memiliki luas " +persegiPanjang3.getLuas() +" dan keliling " +persegiPanjang3.getKeliling());
    }
}

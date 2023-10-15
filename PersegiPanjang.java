/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persegipanjang;

import java.util.Scanner;

/**
 *
 * @author salsa
 */
public class PersegiPanjang {
    int panjang =1, lebar=1;
    
    PersegiPanjang(){
    }
    
    PersegiPanjang (int panjangBaru, int lebarBaru){
        panjang=panjangBaru;
        lebar=lebarBaru;
    }
    
    int getLuas(){
        return panjang*lebar;
    }
    int getKeliling(){
        return (2*panjang)+(2*lebar);
    }
    
    void setPanjang(int panjangBaru){
        panjang=panjangBaru;
    }
    
    void setLebar(int lebarBaru){
        lebar=lebarBaru;
    }
}

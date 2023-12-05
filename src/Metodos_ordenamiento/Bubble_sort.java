/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_ordenamiento;

import java.util.ArrayList;

/**
 *
 * @author 57301
 */
public class Bubble_sort {
    public static ArrayList<Integer> Ordenar_Burbuja(ArrayList<Integer> Array){
        for (int i = 0; i < Array.size(); i++){
            for (int j = 0; j < Array.size()-1; j++) {
                if(Array.get(j) > Array.get(j+1)){
                    int Cambiar = Array.get(j+1);
                    Array.set(j+1, Array.get(j));
                    Array.set(j, Cambiar);
                }
            }
        }
        return Array;
    }
}

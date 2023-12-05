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
public class Merge_Sort {
        public static ArrayList<Integer> Ordenar_mezcla(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n > 1) {
            int mitad = n / 2;

            ArrayList<Integer> mitadIzquierda = new ArrayList<>(arr.subList(0, mitad));
            ArrayList<Integer> mitadDerecha = new ArrayList<>(arr.subList(mitad, n));

            mitadIzquierda = Ordenar_mezcla(mitadIzquierda);
            mitadDerecha = Ordenar_mezcla(mitadDerecha);

            return Mezcla(mitadIzquierda, mitadDerecha);
        }
        return arr; 
    }

    private static ArrayList<Integer> Mezcla(ArrayList<Integer> izq, ArrayList<Integer> der) {
        ArrayList<Integer> Array_Aux = new ArrayList<>();
        int i = 0, j = 0;

        while (i < izq.size() && j < der.size()) {
            if (izq.get(i) <= der.get(j)) {
                Array_Aux.add(izq.get(i++));
            } else {
                Array_Aux.add(der.get(j++));
            }
        }
        while (i < izq.size()) {
            Array_Aux.add(izq.get(i++));
        }
        while (j < der.size()) {
            Array_Aux.add(der.get(j++));
        }
        return Array_Aux;
    }
    
}

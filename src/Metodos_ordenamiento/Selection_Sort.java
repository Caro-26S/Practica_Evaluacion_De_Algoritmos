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
public class Selection_Sort {
    public static ArrayList<Integer> Ordenar_seleccion(ArrayList<Integer> array){
        int men, pos = 0;
        for (int i = 0; i < array.size(); i++) {
            men = 2147483647;
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(j) < men) {
                    men = array.get(j);
                    pos = j;
                }
            }
            array.set(pos, array.get(i));
            array.set(i, men);
        }
        return array;
    }
}

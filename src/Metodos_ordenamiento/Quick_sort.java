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
public class Quick_sort {
    public static ArrayList<Integer> Ordenar_rapido(ArrayList<Integer> array_no_ordenado) {
        if (array_no_ordenado.size() <= 1) {
            return array_no_ordenado;
        } else {
            int aux = array_no_ordenado.get(0);
            ArrayList<Integer> menores = new ArrayList<>();
            ArrayList<Integer> iguales = new ArrayList<>();
            ArrayList<Integer> mayores = new ArrayList<>();

            for (Integer entero : array_no_ordenado) {
                if (entero < aux) {
                    menores.add(entero);
                } else if (entero == aux) {
                    iguales.add(entero);
                } else {
                    mayores.add(entero);
                }
            }
            ArrayList<Integer> array_ordenado = new ArrayList<>();
            array_ordenado.addAll(Ordenar_rapido(menores));
            array_ordenado.addAll(iguales);
            array_ordenado.addAll(Ordenar_rapido(mayores));

            return array_ordenado;
        }
    }
}

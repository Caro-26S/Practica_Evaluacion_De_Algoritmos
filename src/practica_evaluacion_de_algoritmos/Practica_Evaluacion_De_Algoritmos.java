
package practica_evaluacion_de_algoritmos;
import Metodos_ordenamiento.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Practica_Evaluacion_De_Algoritmos {
    private static Scanner lector = new Scanner(System.in);
    private static Random rn = new Random();
    public static void main(String[] args) {
        byte cantidad_datos = 0, metodo_ordenamiento = 0;
        int total_datos = 0;
        double tiempo_1 = 0, tiempo_2 = 0;
        ArrayList<Integer> array = new ArrayList<>();
        boolean bandera = true;
        
        do {            
            try {
                System.out.println("Ingresa la cantidad de datos que tendra el array"
                        +"\n1. 10000"
                        +"\n2. 100000"
                        +"\n3. 1000000");
                cantidad_datos = lector.nextByte();
                if(cantidad_datos > 3 || cantidad_datos <= 0){
                    System.out.println("Ingresaste un valor erroneo");
                }else{
                    bandera = false;
                }
                    
            } catch (Exception e) {
                System.out.println("Ingresaste un valor erroneo");
            }
        } while (bandera);
        bandera = true;
        do {            
            try {
                System.out.println("Ingresa que metodo de ordenamiento quieres usar"
                        +"\n1. Metodo Burbuja"
                        +"\n2. Metodo Seleccion"
                        +"\n3. Metodo Rapido"
                        +"\n4. Metodo Mezcla");
                metodo_ordenamiento = lector.nextByte();
                if(metodo_ordenamiento > 4 || metodo_ordenamiento <= 0){
                    System.out.println("Ingresaste un valor erroneo");
                }else{
                    bandera = false;
                }
                    
            } catch (Exception e) {
                System.out.println("Ingresaste un valor erroneo");
            }
        } while (bandera);
        
        
        switch (cantidad_datos) {
            case 1 -> {
                total_datos = 10000;
            }
            case 2 -> {
                total_datos = 100000;
            }
            case 3-> {
                total_datos = 1000000;
            }
            default -> {
            }
        }
        
        for (int i = 0; i < total_datos; i++) {
            array.add(rn.nextInt());
        }
        switch (metodo_ordenamiento) { 
            case 1 -> {
                tiempo_1 = System.currentTimeMillis();
                Metodos_ordenamiento.Bubble_sort.Ordenar_Burbuja(array);
                tiempo_2 = System.currentTimeMillis();
            }
            case 2 -> {
                tiempo_1 = System.currentTimeMillis();
                Metodos_ordenamiento.Selection_Sort.Ordenar_seleccion(array);
                tiempo_2 = System.currentTimeMillis();           
            }
            case 3-> {
                tiempo_1 = System.currentTimeMillis();
                Metodos_ordenamiento.Quick_sort.Ordenar_rapido(array);
                tiempo_2 = System.currentTimeMillis();      
            }
            case 4-> {
                tiempo_1 = System.currentTimeMillis();
                Metodos_ordenamiento.Bubble_sort.Ordenar_Burbuja(array);
                tiempo_2 = System.currentTimeMillis();      
            }
            default -> {
            }
        }
        System.out.println("\n");
        System.out.println("tiempo antes de ordenar: " + tiempo_1 + "\ntiempo despues de ordenar: " + tiempo_2 + "\ntiempo de ejecucion:" + (tiempo_2-tiempo_1)/1000 + " Segundos");
       
    }
    
}

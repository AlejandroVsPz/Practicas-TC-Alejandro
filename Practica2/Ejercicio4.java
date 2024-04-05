package Practica2;

/* Implemente un algoritmo que resuelva la potenciación. */

public class Ejercicio4 {
    public static void main(String[] args) {
        int base = 5; // el numero
        int expo = 5; // el exponente
        int res = 1; // variable resultado de la multiplicacion
        for (int i = 0; i < expo; i++) { // ciclo para hacer las multiplicaciones
            res = res * base; 
        }
        System.out.println(res); // imprime el resultado
    }

}

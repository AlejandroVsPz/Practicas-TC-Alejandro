package Practica2;

/*Implemente un algoritmo
que calcule si un número es primo. */

public class Ejercicio5 {
    public static void main(String[] args) {
        int num = 17; // Variable del numero a calcular si es primo o no
        int suma = 0; // incrementa si el mod % es 0
        for(int i = 2; i<num; i++){ // ciclo para hacer las divisiones
            if (num % i == 0) {
                suma = suma + 1;
            }
        }

        if (suma > 0) { // condicion si es mayor a 0 no es primo
            System.out.println(num + " No es primo");
        }else if (suma == 0) {
            System.out.println(num + " Si es primo");
        }
    }

}

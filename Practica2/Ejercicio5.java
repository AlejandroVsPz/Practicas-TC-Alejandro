package Practica2;

/*Implemente un algoritmo
que calcule si un número es primo. */

public class Ejercicio5 {
    public static void main(String[] args) {
        int num = 17;
        int suma = 0;
        for(int i = 2; i<num; i++){
            if (num % i == 0) {
                suma = suma + 1;
            }
        }

        if (suma > 0) {
            System.out.println(num + " No es primo");
        }else if (suma == 0) {
            System.out.println(num + " Si es primo");
        }
    }

}

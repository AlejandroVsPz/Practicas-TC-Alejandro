package Practica2;

/* Implemente un algoritmo que resuelva la potenciación. */

public class Ejercicio4 {
    public static void main(String[] args) {
        int base = 5;
        int expo = 5;
        int res = 1;
        for(int i = 0; i< expo; i++){
            res = res * base;
        }
        System.out.println(res);
    }

}

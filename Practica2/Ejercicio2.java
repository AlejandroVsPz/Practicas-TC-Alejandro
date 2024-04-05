package Practica2;

/*Implemente un algoritmo que calcule el factorial de
un número n. */
public class Ejercicio2 {

    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        for(int i = 1; i<=n; i++){
            res = res * i;
        }
        System.out.println(res);

    }
}

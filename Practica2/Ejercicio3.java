package Practica2;

/*implemente un algoritmo que imprima la serie fibonacci */

public class Ejercicio3 {
public static void main(String[] args) {
    int n = 50;
    long primero = 0;
    long segundo = 1;
    long res = 0;
    System.out.println(primero);
    System.out.println(segundo);
    for(int i = 0; i<n-2; i++){
        res = primero + segundo;
        System.out.println(res);
        primero = segundo;
        segundo = res;
    }
}
}

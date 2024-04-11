package Examen1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int clave = 0;
        int numin = 0;
        double res = 0;
        boolean condition = true;
        String resultado;

        while (condition) {
            texto = sc.nextLine();
            String[] partes = texto.split(",");
            String parte1 = partes[0];
            String parte2 = partes[1];

            clave = Integer.parseInt(parte1);
            numin = Integer.parseInt(parte2);

            switch (clave) {
                case 12:
                    res = numin * 2;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 15:
                    res = numin * 2.2;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 18:
                    res = numin * 4.5;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 19:
                    res = numin * 3.5;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 23:
                    res = numin * 6;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 25:
                    res = numin * 6;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                case 29:
                    res = numin * 5;
                    resultado = Double.toString(res); // Convierte el número a cadena
                    resultado = resultado.replaceAll("\\.0", ""); // Elimina los ".0"
                    System.out.println(resultado);
                    break;
                default:
                    condition = false;
            }
        }
    }

}

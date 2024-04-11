package Practica3;

import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        String nombre;
        int edad;

        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        System.out.println("Ingresa el nombre:");
        nombre = text.nextLine();

        try{
            System.out.println("Ingresa la edad:");
            edad = number.nextInt();
            EdadException EdadEx = new EdadException();
            EdadEx.validarEdad(edad);
        }catch(EdadException ex){
            ex.printStackTrace();
            System.out.println("entre al catch");
            System.out.println(ex.getMessage());
        }finally{
            
        }
    }
}

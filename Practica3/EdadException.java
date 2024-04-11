package Practica3;

public class EdadException extends Exception {

    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }

    public EdadException(int edad) throws EdadException{
        this.validarEdad(edad);
    }

    public void validarEdad(int edad) throws EdadException{
        if (!(edad >= 18 && edad <= 45)) {
            System.out.println("la edad no esta permitid");
            throw new EdadException("error de edad");
        }

    }
}

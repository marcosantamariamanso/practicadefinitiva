package practicadefinitiva;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años.");
    }
}
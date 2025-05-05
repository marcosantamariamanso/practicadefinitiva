package practicadefinitiva;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Ana", 30);
        persona.saludar();
        persona.cumplirAnios();
        
        System.out.println("Dirección: " + persona.getDireccionCompleta());
    }
}
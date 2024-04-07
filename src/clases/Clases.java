package clases;

public class Clases {

    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona(); //Crea un nuevo objeto/instancia de la clase Persona
        System.out.println("persona2 = " + persona2); //Imprime el valor de la referencia en memoria del objeto (hexadecimal)
        
        persona2.desplegarInformacion(); // Devuelve valores null en los atributos de nombre y apellido de la clase Persona
        var pruebas = 5;
    }

}

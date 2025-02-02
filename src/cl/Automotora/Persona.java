package cl.Automotora;
/**
 * Nombre del Package :Automotora
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 14:56
 * Nombre del Proyecto Desafio - Automotora
 */
public class Persona {
    //Atributos
    private String rut ;
    private String nombre;
    private int edad;

    //Constructor Vacio
    public Persona() {
    }

    //Constructor completo de la clase
    public Persona(String rut, String nombre, int edad) {
        super();
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

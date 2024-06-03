package cl.Automotora;

public class Vehiculo {
    //Atributos
    private String color;
    private String patente;

    //Constructos Vacio
    public Vehiculo() {
    }

    //Constructor Completo
    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    //Getters y Seters de la Clase
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}

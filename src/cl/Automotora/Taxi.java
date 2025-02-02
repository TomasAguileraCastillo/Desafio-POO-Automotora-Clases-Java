package cl.Automotora;

/**
 * Nombre del Package :Automotora
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 14:43
 * Nombre del Proyecto Desafio - Automotora
 */
public class Taxi extends Vehiculo {
    private int valorPasaje;

    //Constructor Vacio

    public Taxi() {
    }

    //constructor completo de la clase


    public Taxi(String color, String patente, int valorPasaje) {
        //Atributos heredados de la clase vehiculo *************
        super(color, patente);
        //********************************************************
        this.valorPasaje = valorPasaje;
    }

    //Metodos y Funciones

    public int pagarPasaje(int monto){
        if (monto >= valorPasaje) {
            return monto - valorPasaje;
        }
        return monto;
    }


    //Getters y Seterrs de la Clase

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}

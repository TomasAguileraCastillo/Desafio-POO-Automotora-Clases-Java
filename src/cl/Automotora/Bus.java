package cl.Automotora;

/**
 * Nombre del Package :Automotora
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 14:49
 * Nombre del Proyecto Desafio - Automotora
 */
public class Bus extends Vehiculo {
    //Atributos
    private int cantidadDeAsientos;

    //Constructor Vacio
    public Bus() {
    }
    //Constructor Completo de la Clase
    public Bus(String color, String patente, int cantidadDeAsientos) {
        //Atributo heredado de la clase Vehiculo****
        super(color, patente);
        //******************************************
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    //Metodos y Funciones

    public int asientosDisponibles(int asientosUtilizados){
        if (asientosUtilizados <= cantidadDeAsientos) {
            return cantidadDeAsientos - asientosUtilizados;
        }
        return 0;
    }


    //Getters y Setters de la clase
    public int getCantidadDeAsientos() {

        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {

        this.cantidadDeAsientos = cantidadDeAsientos;
    }
}

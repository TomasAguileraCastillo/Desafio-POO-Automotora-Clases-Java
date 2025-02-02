package cl.Automotora;

/**
 * Nombre del Package :Automotora
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 14:46
 * Nombre del Proyecto Desafio - Automotora
 */
public class MiniBus extends Bus {
    //Atributos
    private String tipoViaje;

    //Constriuctor Vacio
    public MiniBus() {
    }

    //Construcotr completo de la clase
    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        //Atributos heredados de la clase Bus ****
        super(color, patente, cantidadDeAsientos);
        //****************************************
        this.tipoViaje = tipoViaje;
    }

    //Metodos y Funciones



    public void imprimeAtributosClase(){
        System.out.println("MiniBus{" +
                "Color  = '" + super.getColor()+ '\'' +
                "Patente = '" + super.getPatente()+ '\'' +
                "tipo Viaje = '" + tipoViaje + '\'' +
                "cantidad de Asientos = '" + super.getCantidadDeAsientos()+ '\''+
                '}');
    }

    //Getters y Setters
    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
}

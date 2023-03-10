/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import PagoReserva.Reserva;
import java.util.Random;
/**
 *
 * @author CJAA
 */

/**
 * Esta clase contiene variables y constructores que apoyan la creación de métodos
 */
    public class Servicio {

    /**
     *
     */
    protected String ciudad;

    /**
     *
     */
    protected double valor;

    /**
     *
     */
    protected Reserva reserva;

    /**
     *
     */
    protected double puntuacion;

    /**
     *
     */
    protected int identificador;
    //Esta variable es privada puesto que solo se usa para generar
    //el identificador
    private static int contador;
    /**
     * Este constructor inicializa la variable puntuación generando un entero al azar entre (1,4) ambos incluidos
     * y le suma un double redondeado a un decimal.También inicializa la variable identificador con un valor por defecto
     * al que se le suma una variable estática que funciona como contador y permite que los identificadores sean únicos
     * @param ciudad
     * @param valor 
     */
    public Servicio(String ciudad, double valor){
        Random rd=new Random();
        //Se genera la puntuación al azar sumándo un entero aleatorio entre 1 y 4 a
        //un double aleatorio que se redondea a un decimal
        this.puntuacion=rd.nextInt(1,5)+(Math.round(rd.nextDouble()*10.0)/10.0);
        //La variable estática contador se la usa para que el identificador de cada servicio
        //sea único sin importar la ejecución en la que se da, puesto que no se guarda este identificador
        //en ningún archivo, no se puede utilizar el método que se aplica en reserva o pago
        contador+=1;
        //Se le suma 9000 al contador para que no sea un número muy pequeño;
        this.identificador=9000+contador;
        this.ciudad=ciudad;
        this.valor=valor;
    }
     /**
     *Este método permite a un objeto de tipo Servicio presentar los datos generados
     * por la reserva en pantalla. Este método será sobreescrito por sus clases hijas
     * 
     */ 
    public void mostrarReserva(){
        String simbolo="/**************RESERVA GENERADA*************/";
        String simbolo1="/*                                         */";
        String simbolo2="/*******************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("CÓDIGO RESERVA: "+this.reserva.getNumeroReserva());
        System.out.println("CLIENTE: "+this.reserva.getCliente().getNombres()+" "+this.reserva.getCliente().getApellidos());
        System.out.println("TIPO RESERVA: "+this.reserva.getTipoReserva());
    }

    /**
     *
     * @return
     */
    public String getCiudad(){
        return this.ciudad;
    }

    /**
     *
     * @return
     */
    public double getValor(){
        return this.valor;
    }

    /**
     *
     * @return
     */
    public Reserva getReserva(){
        return this.reserva;
    }

    /**
     *
     * @return
     */
    public double getPuntuacion(){
        return this.puntuacion;
    }

    /**
     *
     * @return
     */
    public int getIdentificador(){
        return this.identificador;
    }

    /**
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor){
        this.valor = valor;
    }

    /**
     *
     * @param reserva
     */
    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }

    /**
     *
     * @param puntuacion
     */
    public void setPuntuacion(double puntuacion){
        this.puntuacion = puntuacion;
    }

    /**
     *
     * @param identificador
     */
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
}

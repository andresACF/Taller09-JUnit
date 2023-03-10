/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import ElementoServicios.Departamento;
import ElementoServicios.Hotel;

/**
 *
 * @author User
 */
/**
 * Esta clase contiene variables y constructores que apoyan la creación de métodos
 */
public class Hospedaje extends Servicio{

    /**
     *
     */
    protected String fechaEntrada;

    /**
     *
     */
    protected String fechaSalida;
    private Hotel hotel;
    private Departamento departamento;
    private double precioH;
/**
 * Constructor de Hospedaje, se utiliza exclusivamente para 
 * introducir en sus parametros a un objeto de tipo Hotel
 * @param ciudad
 * @param precio
 * @param hotel 
 */
    public Hospedaje(String ciudad,double precio, Hotel hotel){
        super(ciudad,precio);
        this.hotel=hotel;

    }
    /**
     * Construcor de Hospedale, se usa esclusivamente para 
     * introducir en sus parametros a un objeto de tipo Hotel
     * @param ciudad
     * @param precio
     * @param departamento 
     */
    public Hospedaje(String ciudad,double precio,Departamento departamento){
        super(ciudad,precio);
        this.departamento=departamento;
    }
//   
      /**
     *Este método permite a un objeto de tipo Hospedaje/Hotel presentar los datos generados
     * por la reserva en pantalla. Debe ser escrito 
     * Sobreescribiendo el método 
     */ 
    @Override
     public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("FECHAS: "+this.reserva.getDesde()+"-"+this.reserva.getHasta());
        System.out.println("CIUDAD: "+this.hotel.getCiudadH());
        System.out.println("HOTEL: "+this.hotel.getNombre());
        System.out.println("VALOR A PAGAR: "+this.getValor());
     }
     /**
     *Este método permite a un objeto de tipo Hospedaje/Departamento presentar los datos generados
     * por la reserva en pantalla. Debe ser escrito 
     * Sobreescribiendo el método 
     */ 
     public void mostrarReservaDe(){
        super.mostrarReserva();
        System.out.println("FECHAS: "+this.reserva.getDesde()+"-"+this.reserva.getHasta());
        System.out.println("CIUDAD: "+this.departamento.getCiudadDepa());
        System.out.println("DEPARTAMENTO: "+this.departamento.getNombreDepa());
        System.out.println("VALOR A PAGAR: "+this.getValor());
     }
    
    
    //Getters

    /**
     *
     * @return
     */

    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     *
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     *
     * @return
     */
    public Double getPrecioH() {
        return precioH;
    }

    /**
     *
     * @param precioH
     */
    public void setPrecioH(Double precioH) {
        this.precioH = precioH;
    }

    /**
     *
     * @return
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     *
     * @param hotel
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    /**
     *
     * @return
     */
    public String getFechaEntrada(){
        return this.fechaEntrada;
    }

    /**
     *
     * @return
     */
    public String getFechaSalida(){
        return this.fechaSalida;
    }
    //Setters

    /**
     *
     * @param fechaEntrada
     */
    public void setFechaEntrada(String fechaEntrada){
        this.fechaEntrada=fechaEntrada;
    }

    /**
     *
     * @param fechaSalida
     */
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida=fechaSalida;
    }
    
}

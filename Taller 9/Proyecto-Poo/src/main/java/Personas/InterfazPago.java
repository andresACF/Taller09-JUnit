/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Personas;

import PagoReserva.Reserva;

/**
 *
 * @author User
 */
public interface InterfazPago {

    /**
     * Este método es llamado en el método pagarReserva cuando el cliente elige
     * tarjeta ocomo método de pago
     *
     * @param tarjetaDeCredito
     * @param mesAnoCaducidad
     * @param reservaAPagar
     * @param fechaActual
     */
    void pagar(String tarjetaDeCredito, String mesAnoCaducidad, Reserva reservaAPagar, String fechaActual);

    /**
     * Este método es llamado en el método pagarReserva cuando el cliente elige
     * cheque ocomo método de pago
     *
     * @param cheque
     * @param reservaAPagar
     * @param fechaActual
     */
    void pagar(String cheque, Reserva reservaAPagar, String fechaActual);

    /**
     * Este método permite al cliente pagar su reserva Llama al método pagar que
     * es sobrecargado según el cheque o tarjeta
     */
    void pagarReserva();
    
}

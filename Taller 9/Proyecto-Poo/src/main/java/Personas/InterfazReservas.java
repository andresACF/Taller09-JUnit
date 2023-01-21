/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Personas;

/**
 *
 * @author User
 */
public interface InterfazReservas {

    /**
     *Este método permite al cliente reservar paquete de entretenimiento, basandose en la ciudad seleccionada
     *
     */
    void reservarEntretenimiento();

    /**
     *Este método permite al cliente reservar un Hotel ó departamento en base a la ciudad seleccionada, y preferencias del usuario
     */
    void reservarHospedaje();

    /**
     *Este método permite al cliente reservar un transporte según la capacidad deseada
     */
    void reservarTransporte();
    
}

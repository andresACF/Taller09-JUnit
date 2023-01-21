
package ElementoServicios;

import Enum.Estado;
import java.util.ArrayList;

/**
 *
 * @author Jorge Daniel
 */
public class Familiar extends Habitacion {

    public Familiar(String codigoHotel, double precio, int capacidad, int numerodeHabitacion, Estado estado) {
        super(codigoHotel, precio, capacidad, numerodeHabitacion, estado);
    }
    
    public Familiar() {
        
    }
    

    public void tipoHabitacion(ArrayList<String[]> habitacionString, Hotel hotElegido, ArrayList<Habitacion> habitaciones, long dias) {
        for (int i = 0; i < habitacionString.size(); i++) {
            //para obtner la habitación necesita pasar por 3 requisitos, que pertenezca al hotel, que este disponible y que sea del tipo que el cliente solicito
            if (habitacionString.get(i)[0].equals(hotElegido.getCodigoHotel()) && habitacionString.get(i)[5].equals("DISPONIBLE")) {
                Habitacion habi = new Familiar(habitacionString.get(i)[0], Double.valueOf(habitacionString.get(i)[2]), Integer.parseInt(habitacionString.get(i)[3]), Integer.parseInt(habitacionString.get(i)[4]), Estado.valueOf(habitacionString.get(i)[5]));
                habitaciones.add(habi);
                int numero = (int) (Math.random() * habitaciones.size() + 1);
                System.out.println("Usted ha elegido una habitación Familiar para un total de " + dias + " noche(s).");
                System.out.println("El costo del paquete a pagar es de: " + habitaciones.get(numero - 1).getPrecio() * dias);
            }
        }
    }

}

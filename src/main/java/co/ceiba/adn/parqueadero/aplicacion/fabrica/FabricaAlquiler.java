/**
 * 
 */
package co.ceiba.adn.parqueadero.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.ceiba.adn.parqueadero.aplicacion.comando.ComandoAlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;

/**
 * @author carlos.quezada
 *
 */
@Component
public class FabricaAlquiler {
	
	public AlquilerEspacio fabricarAlquilerEspacio(ComandoAlquilerEspacio comandoAlquilerProducto) 
	{
		
		return new AlquilerEspacio(
								 comandoAlquilerProducto.getPlaca(),
										comandoAlquilerProducto.getTipoVehiculo());
	}

}

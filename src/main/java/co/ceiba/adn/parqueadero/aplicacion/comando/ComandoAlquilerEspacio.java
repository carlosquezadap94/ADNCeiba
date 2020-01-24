/**
 * 
 */
package co.ceiba.adn.parqueadero.aplicacion.comando;

import java.util.Date;

/**
 * @author carlos.quezada
 *
 */
public class ComandoAlquilerEspacio {
	
	public String placa;
	
	
	public String tipoVehiculo;


	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	
	/**
	 * @return the tipoVehiculo
	 */
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	/**
	 * @param placa
	 * @param fechaHoraIngreso
	 * @param tipoVehiculo
	 */
	public ComandoAlquilerEspacio(String placa,
			String tipoVehiculo) {
		super();
		
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public ComandoAlquilerEspacio() {}
	
	
	
	
	
	
	
	

}

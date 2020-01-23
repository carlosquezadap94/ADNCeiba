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
	
	private Date fechaHoraIngreso;
	
	
	public String tipoVehiculo;


	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @return the fechaHoraIngreso
	 */
	public Date getFechaHoraIngreso() {
		return fechaHoraIngreso;
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
	public ComandoAlquilerEspacio(String placa, Date fechaHoraIngreso, Date fechaHoraSalida,
			String tipoVehiculo) {
		super();
		
		this.placa = placa;
		this.fechaHoraIngreso = fechaHoraIngreso;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	
	
	
	
	
	
	

}

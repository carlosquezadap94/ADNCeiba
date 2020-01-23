package co.ceiba.adn.parqueadero.dominio.modelo;

import java.util.Date;

/**
 * @author carlos.quezada
 *
 */
public class AlquilerEspacio {
	
	private String placa;
	private Date fechaHoraIngreso;
	private TipoVehiculo tipoVehiculo;

	
	public AlquilerEspacio( String placa, Date fechaHoraIngreso,
			String tipoVehiculo)
	{
		super();
		this.placa = placa;
		this.fechaHoraIngreso = fechaHoraIngreso;
		this.tipoVehiculo = validar(tipoVehiculo);
	}
	
	public TipoVehiculo validar(String tipo) 
	{
		for (TipoVehiculo tipoV : TipoVehiculo.values())
		{ 
		    if(tipo.equals(tipoV)) 
		    {
		    	return tipoV;
		    }
		}
	
		return TipoVehiculo.NO_IDENTIFICADO;
	}



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
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	
	
	
}

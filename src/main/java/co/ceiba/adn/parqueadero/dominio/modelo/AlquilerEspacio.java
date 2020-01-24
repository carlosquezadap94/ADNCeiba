package co.ceiba.adn.parqueadero.dominio.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author carlos.quezada
 *
 */

@Getter
@Setter
@NoArgsConstructor
public class AlquilerEspacio {
	
	private String placa;
	private String tipoVehiculo;
	public int id;
	private Date fechaHoraIngreso;
	private Date fechaHoraSalida;
	
	
	public AlquilerEspacio( String placa,
			String tipoVehiculo)
	{
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
	}

	

}

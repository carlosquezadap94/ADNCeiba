package co.ceiba.adn.parqueadero.infraestructura.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


/**
 * @author carlos.quezada
 *
 */
@Getter
@Setter
@Entity
@Table(name = "alquilerEspacio")
public class AlquilerEspacioEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;
	
	@Column(name = "fechaInicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaHoraIngreso;
	

	@Column(name = "fechaSalida")
	@Temporal(TemporalType.DATE)
	private Date fechaHoraSalida;
	
	@Column(name = "tipoVehiculo")
	public String tipoVehiculo;

	
	@Column(name = "placa")
	public String placa;
	
	
	


}

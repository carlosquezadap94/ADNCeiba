package co.ceiba.adn.parqueadero.infraestructura.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.ceiba.adn.parqueadero.dominio.modelo.TipoVehiculo;

/**
 * @author carlos.quezada
 *
 */
@Entity
@Table(name = "alquilerEspacio")
public class AlquilerEspacioEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;
	
	@Column(name = "fechaInicio")
	@Temporal(TemporalType.DATE)
	private Date fecha_hora_ingreso;
	

	@Column(name = "fechaSalida")
	@Temporal(TemporalType.DATE)
	private Date fecha_hora_salida;
	
	@Column(name = "tipo")
	@Enumerated
	public TipoVehiculo tipoVehiculo;

	
	@Column(name = "placa")
	public String placa;


}

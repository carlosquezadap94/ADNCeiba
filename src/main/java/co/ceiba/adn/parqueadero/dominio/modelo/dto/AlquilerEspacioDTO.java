package co.ceiba.adn.parqueadero.dominio.modelo.dto;

import java.sql.Date;

public class AlquilerEspacioDTO {
	
	public int id;
	
	public String placa;
	
	private Date fechaHoraIngreso;
	

	private Date fechaHoraSalida;
	
	public int tipoVehiculo;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @return the fecha_hora_ingreso
	 */
	public Date getFecha_hora_ingreso() {
		return fechaHoraIngreso;
	}

	/**
	 * @return the fecha_hora_salida
	 */
	public Date getFecha_hora_salida() {
		return fechaHoraSalida;
	}

	/**
	 * @return the tipo_vehiculo
	 */
	public int getTipo_vehiculo() {
		return tipoVehiculo;
	}

	/**
	 * @param id
	 * @param placa
	 * @param fecha_hora_ingreso
	 * @param fecha_hora_salida
	 * @param tipo_vehiculo
	 */
	public AlquilerEspacioDTO(int id, String placa, Date fecha_hora_ingreso, Date fecha_hora_salida,
			int tipo_vehiculo) {
		super();
		this.id = id;
		this.placa = placa;
		this.fechaHoraIngreso = fecha_hora_ingreso;
		this.fechaHoraSalida = fecha_hora_salida;
		this.tipoVehiculo = tipo_vehiculo;
	}
	
	
	

}
	
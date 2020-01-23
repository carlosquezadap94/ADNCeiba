package co.ceiba.adn.parqueadero.dominio.modelo.dto;

import java.sql.Date;

public class AlquilerEspacioDTO {
	
	public int id;
	
	public String placa;
	
	private Date fecha_hora_ingreso;
	

	private Date fecha_hora_salida;
	
	public int tipo_vehiculo;

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
		return fecha_hora_ingreso;
	}

	/**
	 * @return the fecha_hora_salida
	 */
	public Date getFecha_hora_salida() {
		return fecha_hora_salida;
	}

	/**
	 * @return the tipo_vehiculo
	 */
	public int getTipo_vehiculo() {
		return tipo_vehiculo;
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
		this.fecha_hora_ingreso = fecha_hora_ingreso;
		this.fecha_hora_salida = fecha_hora_salida;
		this.tipo_vehiculo = tipo_vehiculo;
	}
	
	
	

}
	
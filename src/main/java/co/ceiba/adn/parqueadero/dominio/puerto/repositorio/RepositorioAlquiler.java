/**
 * 
 */
package co.ceiba.adn.parqueadero.dominio.puerto.repositorio;

import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.modelo.dto.AlquilerEspacioDTO;

/**
 * @author carlos.quezada
 *
 */
public interface RepositorioAlquiler
{
	public void guardarEspacionAlquiler(AlquilerEspacio alquilerEspacio);	
	public void realizarPago();	
	public AlquilerEspacioDTO buscar(String placa);
	public int cantCupos();
}

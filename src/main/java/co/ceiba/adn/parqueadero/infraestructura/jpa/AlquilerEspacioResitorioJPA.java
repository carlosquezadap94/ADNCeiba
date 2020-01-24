package co.ceiba.adn.parqueadero.infraestructura.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import co.ceiba.adn.parqueadero.infraestructura.entidades.AlquilerEspacioEntidad;

/**
 * @author carlos.quezada
 *
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerEspacioResitorioJPA extends JpaRepository<AlquilerEspacioEntidad,Long>
{
	@Query("SELECT COUNT(a) FROM AlquilerEspacioEntidad a where a.tipoVehiculo = ?1 ")
	public int contarAutos(String tipoVehiculo);
	
	
	@Query("SELECT a FROM AlquilerEspacioEntidad a where a.placa = ?1 ")
	public AlquilerEspacioEntidad buscar(String placa);
}
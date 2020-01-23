package co.ceiba.adn.parqueadero.infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import co.ceiba.adn.parqueadero.dominio.modelo.TipoVehiculo;
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
	@Query("SELECT COUNT(*) FROM alquilerEspacio a where where a.tipo_vehiculo = ?1 ")
	public void contarAutos(TipoVehiculo tipoVehiculo);
	
	
	//select CAST(COUNT(*) AS BIT) FROM alquilerEspacio WHERE (UserID = 20070022)
}
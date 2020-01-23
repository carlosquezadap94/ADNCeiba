package co.ceiba.adn.parqueadero.aplicacion.manejadores;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.ceiba.adn.parqueadero.aplicacion.comando.ComandoAlquilerEspacio;
import co.ceiba.adn.parqueadero.aplicacion.fabrica.FabricaAlquiler;
import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.servicio.alquiler.ServicioAlquiler;
import co.ceiba.adn.parqueadero.infraestructura.entidades.AlquilerEspacioEntidad;

@Service
public class ManejadorEspacioAlquiler {

	


	private final FabricaAlquiler fabricaAlquiler;
	private final ServicioAlquiler servicioAlquiler;
	
	
	
	public ManejadorEspacioAlquiler(FabricaAlquiler fabricaAlquiler,ServicioAlquiler servicioAlquiler ) 
	{
		this.fabricaAlquiler = fabricaAlquiler;		
		this.servicioAlquiler = servicioAlquiler;
	}
	

	@Transactional
	public void registrar(ComandoAlquilerEspacio comandoAlquilerEspacio) {
	
		AlquilerEspacio alquilerEspacio = fabricaAlquiler.fabricarAlquilerEspacio(comandoAlquilerEspacio);
		servicioAlquiler.registrar(alquilerEspacio);
	}
	

	
		
	

}

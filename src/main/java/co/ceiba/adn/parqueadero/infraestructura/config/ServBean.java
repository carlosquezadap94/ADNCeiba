package co.ceiba.adn.parqueadero.infraestructura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ceiba.adn.parqueadero.dominio.puerto.repositorio.RepositorioAlquiler;
import co.ceiba.adn.parqueadero.dominio.servicio.alquiler.ServicioAlquiler;

/**
 * @author carlos.quezada
 *
 */
@Configuration
public class ServBean {
	

	@Bean
	public ServicioAlquiler crearServicioAlquilerEspacio(RepositorioAlquiler repositorioAlquiler) {
		return new ServicioAlquiler(repositorioAlquiler);
	}

	
}

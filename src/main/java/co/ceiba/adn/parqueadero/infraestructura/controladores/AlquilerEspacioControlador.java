/**
 * 
 */
package co.ceiba.adn.parqueadero.infraestructura.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ceiba.adn.parqueadero.aplicacion.comando.ComandoAlquilerEspacio;
import co.ceiba.adn.parqueadero.aplicacion.manejadores.ManejadorEspacioAlquiler;

/**
 * @author carlos.quezada
 *
 */

@RestController
@RequestMapping(value = "/alquiler_espacio")
public class AlquilerEspacioControlador {
	private final ManejadorEspacioAlquiler manejadorEspacioAlquiler;
	
	public AlquilerEspacioControlador(ManejadorEspacioAlquiler manejadorEspacioAlquiler) 
	{
		this.manejadorEspacioAlquiler = manejadorEspacioAlquiler;
	}
	
	@PostMapping(value = "/registrar")
	public void registrar(@RequestBody ComandoAlquilerEspacio comandoAlquilerProducto) {
		manejadorEspacioAlquiler.registrar(comandoAlquilerProducto);
	}

	@GetMapping("/{PLACA}")
	public void devolver(@PathVariable(name = "PLACA") String placa) {
		
	}
	

}

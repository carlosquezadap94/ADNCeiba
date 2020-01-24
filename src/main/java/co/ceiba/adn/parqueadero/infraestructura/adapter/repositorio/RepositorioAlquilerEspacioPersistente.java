package co.ceiba.adn.parqueadero.infraestructura.adapter.repositorio;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.modelo.dto.AlquilerEspacioDTO;
import co.ceiba.adn.parqueadero.dominio.puerto.repositorio.RepositorioAlquiler;
import co.ceiba.adn.parqueadero.infraestructura.entidades.AlquilerEspacioEntidad;
import co.ceiba.adn.parqueadero.infraestructura.jpa.AlquilerEspacioResitorioJPA;

/**
 * @author carlos.quezada
 *
 */
@Repository
public class RepositorioAlquilerEspacioPersistente implements RepositorioAlquiler{

	AlquilerEspacioResitorioJPA alquilerEspacioResitorioJPA;
	private ModelMapper modelMapper = new ModelMapper();
	

	public RepositorioAlquilerEspacioPersistente(AlquilerEspacioResitorioJPA alquilerEspacioResitorioJPA) {
			this.alquilerEspacioResitorioJPA = alquilerEspacioResitorioJPA;
	}
	
	
	@Override
	public void guardarEspacionAlquiler(AlquilerEspacio alquilerEspacio) {
		AlquilerEspacioEntidad alquilerEspacioEntidad = modelMapper.map(alquilerEspacio, AlquilerEspacioEntidad.class);
		alquilerEspacioResitorioJPA.save(alquilerEspacioEntidad);
	}


	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public AlquilerEspacioDTO buscar(String placa) 
	{
		AlquilerEspacioEntidad alquilerEspacioEntidad = alquilerEspacioResitorioJPA.buscar(placa);
		if (alquilerEspacioEntidad != null)
		{
			return modelMapper.map(alquilerEspacioEntidad, AlquilerEspacioDTO.class);
		}
		else
		{
			return null;
		}
	}


	@Override
	public int cantCupos(String tipoVehiculo)
	{
		return alquilerEspacioResitorioJPA.contarAutos(tipoVehiculo);	
	}




	

}

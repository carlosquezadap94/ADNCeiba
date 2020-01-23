package co.ceiba.adn.parqueadero.dominio.servicio.alquiler;

import co.ceiba.adn.parqueadero.dominio.excepcion.ExcepcionPpal;
import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.modelo.TipoVehiculo;
import co.ceiba.adn.parqueadero.dominio.modelo.dto.AlquilerEspacioDTO;
import co.ceiba.adn.parqueadero.dominio.puerto.repositorio.RepositorioAlquiler;

public class ServicioAlquiler {
	
	

	private RepositorioAlquiler repositorioAlquilarEspacio;
	private static final String VEHICULO_EXISTE = "Ya existe un vehiculo con la placa ";
	private static final String VEHICULO_NO_IDENTIFICADO = "Tipo de vehiculo no permito y/o identificado ";
	private static final String PARQUEADERO_LLENO = "Ya esta lleno el parqueadero ";
	
	public ServicioAlquiler(RepositorioAlquiler repositorioAlquilarEspacio)
	{
		this.repositorioAlquilarEspacio = repositorioAlquilarEspacio;
	}
	
	
	public void registrar(AlquilerEspacio alquilerEspacio) 
	{
		
			if (alquilerEspacio.getTipoVehiculo()==TipoVehiculo.MOTOCICLETA)
			{
				boolean tiene_espacio = true;
				
				if (tiene_espacio) {
					
					boolean espacio_por_placa = true;
					
					if (espacio_por_placa) {
						new ExcepcionPpal(PARQUEADERO_LLENO);
					}else{
						
					}
					
					
				}else {
					new ExcepcionPpal(PARQUEADERO_LLENO);
				}
				
			}else if(alquilerEspacio.getTipoVehiculo()==TipoVehiculo.AUTO)
			{
				boolean tiene_espacio = true;
				
				if (tiene_espacio) 
				{
					boolean espacio_por_placa = true;
					
					if (espacio_por_placa) {
						new ExcepcionPpal(PARQUEADERO_LLENO);
					}else{
						
					}
					
					
				}else 
				{
					new ExcepcionPpal(PARQUEADERO_LLENO);
				}
				
			}else 
			{
				new ExcepcionPpal(VEHICULO_NO_IDENTIFICADO);
			}
		
		
	
	}		
	



}

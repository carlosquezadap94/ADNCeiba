package co.ceiba.adn.parqueadero.dominio.servicio.alquiler;

import java.util.Date;

import co.ceiba.adn.parqueadero.dominio.excepcion.ExcepcionPpal;
import co.ceiba.adn.parqueadero.dominio.modelo.AlquilerEspacio;
import co.ceiba.adn.parqueadero.dominio.modelo.dto.AlquilerEspacioDTO;
import co.ceiba.adn.parqueadero.dominio.puerto.repositorio.RepositorioAlquiler;

public class ServicioAlquiler {
	
	

	private RepositorioAlquiler repositorioAlquilarEspacio;
	private static final String VEHICULO_EXISTE = "Ya existe un vehiculo con la placa ";
	private static final String VEHICULO_NO_IDENTIFICADO = "Tipo de vehiculo no permito y/o identificado ";
	private static final String PARQUEADERO_LLENO = "Ya esta lleno el parqueadero ";
	private static final String MOTOCICLETA = "MOTOCICLETA";
	private static final String AUTO = "AUTOMOVIL";

	private static final int CANT_CARROS = 20;
	private static final int CANT_MOTOS = 10;

	

	
	
	public ServicioAlquiler(RepositorioAlquiler repositorioAlquilarEspacio)
	{
		this.repositorioAlquilarEspacio = repositorioAlquilarEspacio;
	}
	
	
	public void registrar(AlquilerEspacio alquilerEspacio) 
	{
		
		
		
		alquilerEspacio.setFechaHoraIngreso(new Date());
		
		int cant = repositorioAlquilarEspacio.cantCupos(alquilerEspacio.getTipoVehiculo());
		AlquilerEspacioDTO alquilerEspacioDTO = repositorioAlquilarEspacio.buscar(alquilerEspacio.getPlaca());
		
		if (alquilerEspacioDTO!=null)
		{
			new ExcepcionPpal(VEHICULO_EXISTE);
		}
		else{
			if (alquilerEspacio.getTipoVehiculo().equals(MOTOCICLETA))
			{
					
				if (cant<CANT_MOTOS)
				{	
					repositorioAlquilarEspacio.guardarEspacionAlquiler(alquilerEspacio);	
				}else {
					new ExcepcionPpal(PARQUEADERO_LLENO);
				}
				
			}else if(alquilerEspacio.getTipoVehiculo().equals(AUTO))
			{
				if (cant<CANT_CARROS) 
				{
					repositorioAlquilarEspacio.guardarEspacionAlquiler(alquilerEspacio);				
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
	



}

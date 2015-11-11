package pe.com.implast.rs.logic.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.implast.rs.model.dao.ParteProduccionDAO;
import pe.com.implast.rs.model.dao.imp.ParteProduccionDAOImpl;

@Path("/ParteService")
public class ParteProduccionBUSImpl {
	
	private static Logger LOG=LoggerFactory.getLogger(ParteProduccionBUSImpl.class);
	
	private ParteProduccionDAO parteProduccionDAO= new ParteProduccionDAOImpl();
	
	@GET
	@Path("/{codigoParte}")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getPartePedido(
		@PathParam(value="codigoParte") String numeroParte	
			){
		
		LOG.info("getPartePedido()..");
		List<String> response=new ArrayList<String>();
		GenericEntity<List<String>> list=null;
		
		try{
			
			response.add("TIPO1");
			response.add("TIPO2");
			response.add("TIPO3");
			response.add("TIPO4");
			List<String> partes=parteProduccionDAO.obtenerPartesProduccion();
			list = new GenericEntity<List<String>>(response) {  };
		        
		}catch (Exception e){
			LOG.error(e.getMessage(), e);
		}
		//return response;
		return Response.ok(list).build();
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON} )
	public List<String> getOperadores(){
		List<String> operadores=new ArrayList<String>(); 
		try{
			
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
		}
		return operadores;
	}
}

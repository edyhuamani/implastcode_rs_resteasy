package pe.com.implast.rs.logic.service;

import java.util.List;

import javax.ws.rs.core.Response;



public interface ParteProduccionBUS {
	 Response getPartePedido(String numeroParte);
	  List<String> getOperadores();
}

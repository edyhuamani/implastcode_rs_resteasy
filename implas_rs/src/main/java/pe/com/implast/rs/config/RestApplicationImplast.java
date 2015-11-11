package pe.com.implast.rs.config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import pe.com.implast.rs.logic.service.imp.ParteProduccionBUSImpl;

@ApplicationPath("/rest")
public class RestApplicationImplast extends Application{
	
	
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public Set<Class<?>> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class<?>> classes) {
		this.classes = classes;
	}

	public RestApplicationImplast() {
		/** Se adicionan las clases que contendran los services**/
		classes.add(ParteProduccionBUSImpl.class);
	}
	
	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return super.getProperties();
	}
	
	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		//return super.getSingletons();
		return Collections.EMPTY_SET;
	}
}

package fr.ca.cat.edtn.repository;

import javax.enterprise.context.ApplicationScoped;

import fr.ca.cat.edtn.model.Edtn;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EdtnRepository implements PanacheRepository<Edtn> {

	public Edtn findEdtnById(Long idEdtn){
		return findById(idEdtn);
	}


}
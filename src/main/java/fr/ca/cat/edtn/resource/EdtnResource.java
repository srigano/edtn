package fr.ca.cat.edtn.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.ca.cat.edtn.model.Edtn;
import fr.ca.cat.edtn.repository.EdtnRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/edtn")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class EdtnResource {
	
	@Inject
	EdtnRepository edtnRepository;

	@Path("/{idEdtn}")
	@GET
	public Edtn getEdtnById(@PathParam("idEdtn") Long idEdtn) {
		log.info("recherche des avis par id: idEdtn={}", idEdtn);
		return edtnRepository.findById(idEdtn);
	}

	// @Path("/dossier/{idDossier}")
	// @GET
	// public List<Avis> getAvisByIDossier(@PathParam("idDossier") Long idDossier) {
	// 	log.info("recherche des avis par id: idDossier={}", idDossier);
	// 	return avisRepository.findByIdDossier(idDossier);
	// }	

}
/* package fr.ca.cat.pocdafne.avis.rest.client;

import java.util.Set;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.smallrye.common.annotation.Blocking;

@Path("/donneesfinancieres")
public class DonneesFinancieresRessource {

    @Inject
    @RestClient 
    DonneesFinancieresService donneesFinancieresService;


    @GET
    @Path("/name/{name}")
    @Blocking 
    public Set<DonneesFinancieres> name(String name) {
        return donneesFinancieresService.getByName(name);
    }
} */
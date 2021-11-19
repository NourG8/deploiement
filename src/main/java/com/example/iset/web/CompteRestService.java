package com.example.iset.web;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.iset.dao.compteRepository;
import com.example.iset.entity.Compte;

@Component
@Path("/Banque")
public class CompteRestService {

	@Autowired
	private compteRepository compteRepository;
	
	
	@GET
	@Path("/Compte")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte>getComptes(){
		return compteRepository.findAll();
	}
	

	@GET
	@Path("/Compte/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getcompte(@javax.ws.rs.PathParam(value = "code") Long code){
		return compteRepository.findById((long) code).get();
	}
	
	@POST
	@Path("/Compte")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte Addcompte(Compte compte){
		return compteRepository.save(compte);
	}
	
	@PUT
	@Path("/Compte/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte Editcompte(@javax.ws.rs.PathParam(value = "code") Long code,@RequestBody Compte compte){
		return compteRepository.save(compte);
	}
	
	@DELETE
	@Path("/Compte/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deletecompte(@javax.ws.rs.PathParam(value = "code") Long code){
		Compte cp=compteRepository.getOne(code);
		compteRepository.delete(cp);
		return "delete succesfully code : "+code;
	}
	
	
}

package fr.ca.cat.edtn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "EDTN")
public class Edtn extends PanacheEntityBase {
	@Id
	@Column(name="ID_EDTN")
	private Long idEdtn;

	@Column(name="NOM_DOCU")
	private String nomDocument;

	@Column(name="ID_AGT")
	private String idAgent;
	
	@Column(name="URL")
	private String urlDocument;   



}
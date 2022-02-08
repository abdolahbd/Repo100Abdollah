package com.sadaqah.sadaqah.model;

import java.io.Serializable;




import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.n52.jackson.datatype.jts.GeometryDeserializer;
import org.n52.jackson.datatype.jts.GeometrySerializer;
import org.locationtech.jts.geom.Point;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@Entity
@Table(name="Annonce")
public class Annonce {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="_id")
	private Long id;
	
	
	@ManyToOne
	private Utilisateur donnateur;
	
	@Column(name="_titre")
	private String titre;
	
	@Column(name="_description")
	private String description;
	
	@Column(name="_quantite")
	private Long quatite;
	
	@Column(name="_date")
	private Date date;
	
	@Column(name="_photo")
	private String photo;
	
	@Column(name="_status", columnDefinition = "varchar(100) default 'declaree'")
	private String status;
	
	
	@ManyToOne
	private Commune commune;

	
	@ManyToOne
	private Category categorie;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public Long getQuatite() {
		return quatite;
	}

	public void setQuatite(Long quatite) {
		this.quatite = quatite;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Category getCategorie() {
		return categorie;
	}

	@JsonSetter
	public void setCategorie(Category categorie) {
		this.categorie = categorie;
	}

	public Utilisateur getDonnateur() {
		return donnateur;
	}

	@JsonSetter
	public void setDonnateur(Utilisateur donnateur) {
		this.donnateur = donnateur;
	}
	
	public Commune getCommune() {
		return commune;
	}

	@JsonSetter
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Annonce(Long id,  Utilisateur donnateur, String titre, String desc, Long quatite, Date date,
			String photo, Category categorie, String status, Commune commune) {
		super();
		this.id = id;
		this.donnateur = donnateur;
		this.titre = titre;
		this.description = desc;
		this.quatite = quatite;
		this.date = date;
		this.photo = photo;
		this.categorie = categorie;
		this.status=status;
		this.commune=commune;	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}

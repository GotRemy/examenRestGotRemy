package com.humanbooster.examenRestGotRemy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "marque")
	@NotNull(message="Le champ marque ne peut pas être null")
	@NotBlank(message="Le champ marque ne peut pas être blanc")
	private String marque;
	
	@Column(name = "modele")
	@NotNull(message="Le champ modele ne peut pas être null")
	@NotBlank(message="Le champ modele ne peut pas être blanc")
	private String modele;
	
	@Column(name = "carburant")
	@NotNull(message="Le champ carburant ne peut pas être null")
	@NotBlank(message="Le champ carburant ne peut pas être blanc")
	private String carburant;
	
	@Column(name = "annee")
	@NotNull(message="Le champ annee ne peut pas être null")
	private int annee;
	
	@Column(name = "kilometrage")
	@NotNull(message="Le champ kilometrage ne peut pas être null")
	private int kilometrage;
	
	@Column(name = "prix")
	@NotNull(message="Le champ prix ne peut pas être null")
	private int prix;
	
	@Column(name = "description")
	@NotNull(message="Le champ description ne peut pas être null")
	@NotBlank(message="Le champ description ne peut pas être blanc")
	private String description;

	/**
	 * @param id
	 * @param marque
	 * @param modele
	 * @param carburant
	 * @param annee
	 * @param kilometrage
	 * @param prix
	 * @param description
	 */
	public Car(Long id,
			@NotNull(message = "Le champ marque ne peut pas être null") @NotBlank(message = "Le champ marque ne peut pas être blanc") String marque,
			@NotNull(message = "Le champ modele ne peut pas être null") @NotBlank(message = "Le champ modele ne peut pas être blanc") String modele,
			@NotNull(message = "Le champ carburant ne peut pas être null") @NotBlank(message = "Le champ carburant ne peut pas être blanc") String carburant,
			@NotNull(message = "Le champ annee ne peut pas être null") int annee,
			@NotNull(message = "Le champ kilometrage ne peut pas être null") int kilometrage,
			@NotNull(message = "Le champ prix ne peut pas être null") int prix,
			@NotNull(message = "Le champ description ne peut pas être null") @NotBlank(message = "Le champ description ne peut pas être blanc") String description) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.description = description;
	}

	/**
	 * @param marque
	 * @param modele
	 * @param carburant
	 * @param annee
	 * @param kilometrage
	 * @param prix
	 * @param description
	 */
	public Car(
			@NotNull(message = "Le champ marque ne peut pas être null") @NotBlank(message = "Le champ marque ne peut pas être blanc") String marque,
			@NotNull(message = "Le champ modele ne peut pas être null") @NotBlank(message = "Le champ modele ne peut pas être blanc") String modele,
			@NotNull(message = "Le champ carburant ne peut pas être null") @NotBlank(message = "Le champ carburant ne peut pas être blanc") String carburant,
			@NotNull(message = "Le champ annee ne peut pas être null") int annee,
			@NotNull(message = "Le champ kilometrage ne peut pas être null") int kilometrage,
			@NotNull(message = "Le champ prix ne peut pas être null") int prix,
			@NotNull(message = "Le champ description ne peut pas être null") @NotBlank(message = "Le champ description ne peut pas être blanc") String description) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.description = description;
	}
	
	public Car() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

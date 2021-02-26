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
@Table(name="Color")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codeRgb")
	@NotNull(message="Le champ codeRgb ne peut pas être null")
	@NotBlank(message="Le champ codeRgb ne peut pas être blanc")
	private String codeRgb;
	
	@Column(name = "libelle")
	@NotNull(message="Le champ libelle ne peut pas être null")
	@NotBlank(message="Le champ libelle ne peut pas être blanc")
	private String libelle;

	/**
	 * @param id
	 * @param codeRgb
	 * @param libelle
	 */
	public Color(Long id,
			@NotNull(message = "Le champ codeRgb ne peut pas être null") @NotBlank(message = "Le champ codeRgb ne peut pas être blanc") String codeRgb,
			@NotNull(message = "Le champ libelle ne peut pas être null") @NotBlank(message = "Le champ libelle ne peut pas être blanc") String libelle) {
		super();
		this.id = id;
		this.codeRgb = codeRgb;
		this.libelle = libelle;
	}

	/**
	 * @param codeRgb
	 * @param libelle
	 */
	public Color(
			@NotNull(message = "Le champ codeRgb ne peut pas être null") @NotBlank(message = "Le champ codeRgb ne peut pas être blanc") String codeRgb,
			@NotNull(message = "Le champ libelle ne peut pas être null") @NotBlank(message = "Le champ libelle ne peut pas être blanc") String libelle) {
		super();
		this.codeRgb = codeRgb;
		this.libelle = libelle;
	}
	
	public Color() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeRgb() {
		return codeRgb;
	}

	public void setCodeRgb(String codeRgb) {
		this.codeRgb = codeRgb;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}

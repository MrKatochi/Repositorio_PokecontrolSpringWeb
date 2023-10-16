package com.pokecontrol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon_full extends Pokemon_base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String habilidad;
	private String naturaleza;
	private String objeto;
	private String ataque1;
	private String ataque2;
	private String ataque3;
	private String ataque4;
	
	private long ev_hp;
	private long ev_velocidad;
	private long ev_ataque;
	private long ev_ataqueEsp;
	private long ev_defensa;
	private long ev_defensaEsp;

	// Agrega aquí los métodos y atributos adicionales de la clase Pokemon_full

	public Pokemon_full() {
		super();
	}
	
	public Pokemon_full( String habilidad, String naturaleza, String objeto, String ataque1, String ataque2,
			String ataque3, String ataque4, long ev_hp, long ev_velocidad, long ev_ataque, long ev_ataqueEsp,
			long ev_defensa, long ev_defensaEsp) {
		super();
		
		this.habilidad = habilidad;
		this.naturaleza = naturaleza;
		this.objeto = objeto;
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.ataque3 = ataque3;
		this.ataque4 = ataque4;
		this.ev_hp = ev_hp;
		this.ev_velocidad = ev_velocidad;
		this.ev_ataque = ev_ataque;
		this.ev_ataqueEsp = ev_ataqueEsp;
		this.ev_defensa = ev_defensa;
		this.ev_defensaEsp = ev_defensaEsp;
	}


	public Pokemon_full(long id, String habilidad, String naturaleza, String objeto, String ataque1, String ataque2,
			String ataque3, String ataque4, long ev_hp, long ev_velocidad, long ev_ataque, long ev_ataqueEsp,
			long ev_defensa, long ev_defensaEsp) {
		super();
		this.id = id;
		this.habilidad = habilidad;
		this.naturaleza = naturaleza;
		this.objeto = objeto;
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.ataque3 = ataque3;
		this.ataque4 = ataque4;
		this.ev_hp = ev_hp;
		this.ev_velocidad = ev_velocidad;
		this.ev_ataque = ev_ataque;
		this.ev_ataqueEsp = ev_ataqueEsp;
		this.ev_defensa = ev_defensa;
		this.ev_defensaEsp = ev_defensaEsp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(String ataque1) {
		this.ataque1 = ataque1;
	}

	public String getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(String ataque2) {
		this.ataque2 = ataque2;
	}

	public String getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(String ataque3) {
		this.ataque3 = ataque3;
	}

	public String getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(String ataque4) {
		this.ataque4 = ataque4;
	}

	public long getEv_hp() {
		return ev_hp;
	}

	public void setEv_hp(long ev_hp) {
		this.ev_hp = ev_hp;
	}

	public long getEv_velocidad() {
		return ev_velocidad;
	}

	public void setEv_velocidad(long ev_velocidad) {
		this.ev_velocidad = ev_velocidad;
	}

	public long getEv_ataque() {
		return ev_ataque;
	}

	public void setEv_ataque(long ev_ataque) {
		this.ev_ataque = ev_ataque;
	}

	public long getEv_ataqueEsp() {
		return ev_ataqueEsp;
	}

	public void setEv_ataqueEsp(long ev_ataqueEsp) {
		this.ev_ataqueEsp = ev_ataqueEsp;
	}

	public long getEv_defensa() {
		return ev_defensa;
	}

	public void setEv_defensa(long ev_defensa) {
		this.ev_defensa = ev_defensa;
	}

	public long getEv_defensaEsp() {
		return ev_defensaEsp;
	}

	public void setEv_defensaEsp(long ev_defensaEsp) {
		this.ev_defensaEsp = ev_defensaEsp;
	}

	// Agrega aquí los getters y setters de la clase Pokemon_full

	
}
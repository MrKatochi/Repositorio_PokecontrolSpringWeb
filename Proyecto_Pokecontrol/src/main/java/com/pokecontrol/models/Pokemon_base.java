package com.pokecontrol.models;

public class Pokemon_base {

	private long n_pokedex;
	private String nombre;
	private String imagen;
	private float peso;
	private float altura;
	private String descripcion;

	private String tipo1;
	private String tipo2;
	
	private long iv_hp;
	private long iv_velocidad;
	private long iv_ataque;
	private long iv_ataqueEsp;
	private long iv_defensa;
	private long iv_defensaEsp;
	
	
	public Pokemon_base() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pokemon_base(long n_pokedex, String nombre, String imagen, float peso, float altura, String descripcion,
			String tipo1, String tipo2, long iv_hp, long iv_velocidad, long iv_ataque, long iv_ataqueEsp,
			long iv_defensa, long iv_defensaEsp) {
		super();
		this.n_pokedex = n_pokedex;
		this.nombre = nombre;
		this.imagen = imagen;
		this.peso = peso;
		this.altura = altura;
		this.descripcion = descripcion;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.iv_hp = iv_hp;
		this.iv_velocidad = iv_velocidad;
		this.iv_ataque = iv_ataque;
		this.iv_ataqueEsp = iv_ataqueEsp;
		this.iv_defensa = iv_defensa;
		this.iv_defensaEsp = iv_defensaEsp;
	}


	public long getN_pokedex() {
		return n_pokedex;
	}


	public void setN_pokedex(long n_pokedex) {
		this.n_pokedex = n_pokedex;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo1() {
		return tipo1;
	}


	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}


	public String getTipo2() {
		return tipo2;
	}


	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}


	public long getIv_hp() {
		return iv_hp;
	}


	public void setIv_hp(long iv_hp) {
		this.iv_hp = iv_hp;
	}


	public long getIv_velocidad() {
		return iv_velocidad;
	}


	public void setIv_velocidad(long iv_velocidad) {
		this.iv_velocidad = iv_velocidad;
	}


	public long getIv_ataque() {
		return iv_ataque;
	}


	public void setIv_ataque(long iv_ataque) {
		this.iv_ataque = iv_ataque;
	}


	public long getIv_ataqueEsp() {
		return iv_ataqueEsp;
	}


	public void setIv_ataqueEsp(long iv_ataqueEsp) {
		this.iv_ataqueEsp = iv_ataqueEsp;
	}


	public long getIv_defensa() {
		return iv_defensa;
	}


	public void setIv_defensa(long iv_defensa) {
		this.iv_defensa = iv_defensa;
	}


	public long getIv_defensaEsp() {
		return iv_defensaEsp;
	}


	public void setIv_defensaEsp(long iv_defensaEsp) {
		this.iv_defensaEsp = iv_defensaEsp;
	}
	
	
}

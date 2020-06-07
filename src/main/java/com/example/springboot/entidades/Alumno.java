package com.example.springboot.entidades;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;

/**
 * The persistent class for the alumno database table.
 * 
 */
@Entity
@NamedQuery(name="Alumno.findAll", query="SELECT a FROM Alumno a")
@Data
public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codigo;

	private String apellido;

	private String clave;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String genero;

	private String nombre;

	//bi-directional many-to-one association to Carrera
	@ManyToOne
	@JoinColumn(name="carrera")
	private Carrera carreraBean;

	public Alumno() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getCarreraBean() {
		return this.carreraBean;
	}

	public void setCarreraBean(Carrera carreraBean) {
		this.carreraBean = carreraBean;
	}

}
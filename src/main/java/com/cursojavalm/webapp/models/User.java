package com.cursojavalm.webapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	
	@Id
	@Getter @Setter
	@Column(name = "id")
	private Long id;
	
	@Getter @Setter
	@Column(name = "nombre")
	private String name; 

	@Getter @Setter
	@Column(name = "apellido")
	private String lastname;
	
	@Getter @Setter
	@Column(name = "email")
	private String mail;
	
	@Getter @Setter
	@Column(name = "telefono")
	private String telephone;

	@Getter @Setter
	@Column(name = "password")
	private String password;

	
}

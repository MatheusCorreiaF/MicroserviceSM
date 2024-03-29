package com.redfield.microservicesm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User
{
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 2)
	private String nome;
	@Past
	private Date dataNasc;
	@OneToMany(mappedBy = "user")
	private List<Post> posts;
	
	
	public User() {
		super();
	}

	public User(Integer id, String nome, Date dataNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
}

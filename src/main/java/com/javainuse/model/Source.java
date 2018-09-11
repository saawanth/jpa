package com.javainuse.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Source")
public class Source {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name", unique=true,nullable=false )
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL, mappedBy = "source")
	private Routes routes;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Routes getRoutes() {
		return routes;
	}

	public void setRoutes(Routes routes) {
		this.routes = routes;
	}
	
}

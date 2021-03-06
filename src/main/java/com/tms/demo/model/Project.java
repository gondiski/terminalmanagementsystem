package com.tms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "project")
public class Project {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	@ManyToOne
	private TerminalGroup terminalGroup;
	
	public Project(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

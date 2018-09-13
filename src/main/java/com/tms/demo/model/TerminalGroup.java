package com.tms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TerminalGroup {
	@Id
	@GeneratedValue
	private Integer id;
	private String application;
	private String name;
	private Integer terminal_id;
	private String partition_size;
	private String upgrade_type;
	
	public TerminalGroup() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTerminal_id() {
		return terminal_id;
	}

	public void setTerminal_id(Integer terminal_id) {
		this.terminal_id = terminal_id;
	}

	public String getPartition_size() {
		return partition_size;
	}

	public void setPartition_size(String partition_size) {
		this.partition_size = partition_size;
	}

	public String getUpgrade_type() {
		return upgrade_type;
	}

	public void setUpgrade_type(String upgrade_type) {
		this.upgrade_type = upgrade_type;
	}
	
}


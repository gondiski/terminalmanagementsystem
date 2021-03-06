package com.tms.demo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;

//@Component
public interface TmsService {
	
	public List<Application> findAllApplications() throws DataAccessException;
	
	public Application findApplicationById(int id) throws DataAccessException;
	
	public void SaveApplication(Application application) throws DataAccessException;
	
	public long count(Application application) throws DataAccessException;
	
	public List<Project> findAllProjects() throws DataAccessException;
	
	public Project findProjectById(int id) throws DataAccessException;
	
	public void SaveProject(Project project) throws DataAccessException;
	
	public long count(Project project) throws DataAccessException;
	
	public List<Terminal> findAllTerminals() throws DataAccessException;
	
	public Terminal findTerminalById(int id) throws DataAccessException;
	
	public void SaveTerminal(Terminal terminal) throws DataAccessException;
	
	public long count(Terminal terminal) throws DataAccessException;
	
	public List<TerminalGroup> findAllTerminalGroups() throws DataAccessException;
	
	public TerminalGroup findTerminalGroupById(int id) throws DataAccessException;
	
	public void SaveTerminalGroup(TerminalGroup terminalGroup) throws DataAccessException;
	
	public long count(TerminalGroup terminalGroup) throws DataAccessException;
}

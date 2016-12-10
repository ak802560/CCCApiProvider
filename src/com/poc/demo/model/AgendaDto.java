package com.poc.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "agenda")
@XmlAccessorType(XmlAccessType.NONE)
public class AgendaDto implements Serializable{
	
	private String account;
	private String project;
	private String agendaId;
	private String agendaOvr;
	private String startDate;
	private String startTime;
	private String description;
	private String story;
	
	 public AgendaDto(String account, String project, String agendaId, String gendaOvr, String startDate, String startTime, String description, String story) {
	        super();
	        this.account = account;
	        this.project = project;
	        this.agendaId = agendaId;
	        this.agendaOvr = gendaOvr;
	        this.startDate = startDate;
	        this.startTime = startTime;
	        this.description = description;
	        this.story = story;
	    }
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAgendaId() {
		return agendaId;
	}
	public void setAgendaId(String agendaId) {
		this.agendaId = agendaId;
	}
	public String getAgendaOvr() {
		return agendaOvr;
	}
	public void setAgendaOvr(String gendaOvr) {
		this.agendaOvr = gendaOvr;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
	

}

package com.poc.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="agenda")
public class AgendaListVO {
	
	private List<AgendaDto> agendaList = new ArrayList<AgendaDto>();
	 
    public List<AgendaDto> getClientAgendaList() {
        return agendaList;
    }
 
    public void setClientAgendaList(List<AgendaDto> agendaList) {
        this.agendaList = agendaList;
    }

}

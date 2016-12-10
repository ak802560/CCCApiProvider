package com.poc.demo.controller;
 
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.demo.model.AgendaDto;
import com.poc.demo.model.AgendaListVO;
import com.poc.demo.model.EmployeeListVO;
import com.poc.demo.model.EmployeeVO;
 
@RestController
public class CCCRESTController 
{
    public EmployeeListVO getAllEmployees() 
    {
        EmployeeListVO employees = new EmployeeListVO();
         
        EmployeeVO empOne = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2,"Amit","Singhal","asinghal@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3,"Kirti","Mishra","kmishra@gmail.com");
         
         
        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);
         
        return employees;
    }
     
    @RequestMapping(value = "/employees/{id}")
    @ResponseBody
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id) 
    {
        if (id <= 3) {
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
    
    @RequestMapping(value = "/employees", produces ="application/json")
    public EmployeeListVO getAllEmployeesJSON(Model model) 
    {
       // model.addAttribute("employees", getAllEmployees());
        return getAllEmployees();
    }
    
    
    @RequestMapping(value = "/agenda", produces ="application/json")
    public AgendaListVO getClientAgenda() 
    {
        return getClientAgendaList();
    }
    
    
    public AgendaListVO getClientAgendaList() 
    {
    	AgendaListVO agenda = new AgendaListVO();
         
        AgendaDto agOne = new AgendaDto("DCX","Lisa","#agenda1","agenda1","Dec 10 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing.The Agile Manifesto doesn’t provide concrete steps. Organizations usually seek more specific methods within the Agile movement. These include Crystal Clear, Extreme Programming, Feature Driven Development, Dynamic Systems Development Method (DSDM), Scrum, and others.");
        AgendaDto agTwo = new AgendaDto("BNP","CCCApp J2","#agenda2","agenda2","Dec 11 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing.The Agile Manifesto doesn’t provide concrete steps. Organizations usually seek more specific methods within the Agile movement. These include Crystal Clear, Extreme Programming, Feature Driven Development, Dynamic Systems Development Method (DSDM), Scrum, and others.");
        AgendaDto agThree = new AgendaDto("ING","CCCApp J3","#agenda3","agenda3","Dec 12 2016","9:00 - 12:00", "The Agile Manifesto doesn’t provide" , "concrete steps. Organizations usually seek more specific methods within the Agile movement. These include Crystal Clear, Extreme Programming, Feature Driven Development, Dynamic Systems Development Method (DSDM), Scrum, and others..Presentation of Scrum methodology. Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agFour = new AgendaDto("CNA","CCCApp J4","#agenda4","agenda4","Dec 13 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agFive = new AgendaDto("INS","CCCApp J5","#agenda5","agenda5","Dec 14 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agSix = new AgendaDto("PPM","CCCApp J6","#agenda6","agenda6","Dec 15 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agSeven = new AgendaDto("PRG","CCCApp J7","#agenda7","agenda7","Dec 16 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agEight = new AgendaDto("PGS","CCCApp J8","#agenda8","agenda8","Dec 17 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agNine = new AgendaDto("COC","CCCApp J9","#agenda9","agenda9","Dec 18 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agTen = new AgendaDto("DFS","CCCApp J10","#agenda10","agenda10","Dec 09 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agEleven = new AgendaDto("SAP","CCCApp J11","#agenda11","agenda11","Dec 09 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agTwelve = new AgendaDto("NN","CCCApp J12","#agenda12","agenda12","Dec 09 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        AgendaDto agThirteen = new AgendaDto("DCB","CCCApp J13","#agenda13","agenda13","Dec 09 2016","9:00 - 12:00", "Presentation of Scrum methodology", "Scrum is part of the Agile movement. Agile is a response to the failure of the dominant software development project management paradigms (including waterfall) and borrows many principles from lean manufacturing");
        
        agenda.getClientAgendaList().add(agOne);
        agenda.getClientAgendaList().add(agTwo);
        agenda.getClientAgendaList().add(agThree);
        agenda.getClientAgendaList().add(agFour);
        agenda.getClientAgendaList().add(agFive);
       
        agenda.getClientAgendaList().add(agSix);
        agenda.getClientAgendaList().add(agSeven);
        
       
        
        
        /*agendListVo.add(agOne);
        agendListVo.add(agTwo);
        agendListVo.add(agThree);
        agendListVo.add(agFour);
        agendListVo.add(agFive);
        agendListVo.add(agSix);
        agendListVo.add(agSeven);
        agendListVo.add(agEight);
        agendListVo.add(agNine);
        agendListVo.add(agTen);
        agendListVo.add(agEleven);
        agendListVo.add(agTwelve);
        agendListVo.add(agThirteen);*/
        
         
         
        //return agendListVo;
        return agenda;
    }
    
    
    
}
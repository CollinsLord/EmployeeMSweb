/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entities.EmployeeJPA;
import Entities.LeaveJPA;
import Entities.SalaryJPA;
import Sessions.EmployeeJPAFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Collins Arku
 */
@Named(value = "bean")
@ApplicationScoped
public class JSFManagedBean implements Serializable{

     private EmployeeJPA employee;
     private SalaryJPA salary;
     private LeaveJPA leave;
    
    @EJB
    private EmployeeJPAFacade facade;

   

    public EmployeeJPA getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeJPA employee) {
        this.employee = employee;
    }

    public EmployeeJPAFacade getFacade() {
        return facade;
    }

    public void setFacade(EmployeeJPAFacade facade) {
        this.facade = facade;
    }
   
    
    public JSFManagedBean() {
         employee=new EmployeeJPA();
         salary=new SalaryJPA();
         leave=new LeaveJPA();
    }

    public SalaryJPA getSalary() {
        return salary;
    }

    public void setSalary(SalaryJPA salary) {
        this.salary = salary;
    }

    public LeaveJPA getLeave() {
        return leave;
    }

    public void setLeave(LeaveJPA leave) {
        this.leave = leave;
    }
    
    public String addleave(){
    facade.addleave(leave);
    return "leave";
    
    }
    public String addsalary(){
        facade.addsa(salary);
        salary=new SalaryJPA();
         return "salary";
    }
    
     public String Add(){
        facade.addem(employee);
        employee=new EmployeeJPA();
        return "emreport";
    }
    
     public List <EmployeeJPA> showemp(){
       return facade.findAll();
     }
       public List <SalaryJPA> lsalary(){
     return facade.llistsalary();
      
     }
        public List <LeaveJPA> lleave(){
     return facade.llistleave();
      
     }
        
        public void delete(EmployeeJPA emp){
            this.facade.remove(emp);
             
        }
        public String edit(EmployeeJPA emp){
            this.employee=emp;
            return "admin";
            
        }
        public String edits(){
            
            this.facade.edit(employee);
            employee=new EmployeeJPA();
         return "emreport";
        }
        
          public String editsa(SalaryJPA sal){
            this.salary=sal;
            return "salary";
        }
        public String editsa(){
            
            facade.edits(salary);
            salary=new SalaryJPA();
         return "salreport";
        }
        
         
}

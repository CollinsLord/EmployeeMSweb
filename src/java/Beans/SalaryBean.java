/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import Entities.SalaryJPA;
import Sessions.EmployeeJPAFacade;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author Collins Arku
 */
@Named(value = "bean1")
@RequestScoped
public class SalaryBean {

      
     private SalaryJPA salary;
      @EJB
      private EmployeeJPAFacade facade;

   

    public SalaryJPA getSalary() {
        return salary;
    }

    public void setSalary(SalaryJPA salary) {
        this.salary = salary;
    }

    public EmployeeJPAFacade getFacade() {
        return facade;
    }

    public void setFacade(EmployeeJPAFacade facade) {
        this.facade = facade;
    }
      
    /**
     * Creates a new instance of SalaryBean
     */
    public SalaryBean() {
         salary=new SalaryJPA();
    }
     public String addsalary(){
        facade.addsa(salary);
        return "admin";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessions;


import Entities.EmployeeJPA;
import Entities.LeaveJPA;
import Entities.SalaryJPA;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Collins Arku
 */
@Stateless
public class EmployeeJPAFacade extends AbstractFacade<EmployeeJPA> {

    @PersistenceContext(unitName = "EmployeeMSwebPU")
    private EntityManager em;
 
  
 SalaryJPA salary=new SalaryJPA();
 LeaveJPA leave =new LeaveJPA();
 EmployeeJPA employee=new EmployeeJPA();
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeJPAFacade() {
       super(EmployeeJPA.class);
      
       
    }
    //a mothed
    public LeaveJPA addleave(LeaveJPA leave){
      em.persist(leave);
        return leave;
    }
   
    ///a method that will salary
    public SalaryJPA addsa(SalaryJPA salary){
        em.persist(salary);
        return salary;
    }
    //the method that add new employee
     public EmployeeJPA addem(EmployeeJPA emp){
         if(emp.getId()==null){
             em.persist(emp);
         }

        return emp;
    }
    public SalaryJPA edits(SalaryJPA salary){
        em.merge(salary);
        return salary;
    }
     
     public List <EmployeeJPA> llistEmployee(){
         Query query=em.createQuery("Select e from EmployeeJPA e");
         return query.getResultList();
     }
     
     public List <LeaveJPA> llistleave(){
         Query query=em.createQuery("Select l from LeaveJPA l");
         return query.getResultList();
     }
          public List <SalaryJPA> llistsalary(){
         Query query=em.createQuery("Select s from SalaryJPA s");
         return query.getResultList();
     }
          
         
          

}

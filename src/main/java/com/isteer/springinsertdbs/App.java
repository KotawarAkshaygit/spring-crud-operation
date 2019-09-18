package com.isteer.springinsertdbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.isteer.springinsertdbs.EntityBean;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    		  
    		     EmployeeDaoImpl dao=(EmployeeDaoImpl)context.getBean("empdao");  
    		     
    		     EntityBean employee = new EntityBean();
    		     
    		/*     employee.setName("rana");
    		     employee.setLocation("Bangalore");
    		     employee.setContact("9098789098");
    		     Number status = dao.save(employee); 
    		     */
    		     
    		     dao.deleteEmpById(4);
    //	System.out.println(status);
    		     
    	/*	     employee.setLocation("adilabad");
    		    employee.setContact("9999999999");
    		    employee.setName("kumar");
    		   
    		     dao.update(employee);
    		    // System.out.println(status);  
    		     * */
    		     
    }
}

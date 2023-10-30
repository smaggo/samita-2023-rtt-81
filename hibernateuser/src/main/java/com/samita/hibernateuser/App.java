package com.samita.hibernateuser;

import com.samita.hibernateuser.controller.HibernateQueryLang;
import com.samita.hibernateuser.model.User;

public class App 
  {
    public static void main( String[] args )
    {
    	
    	
    	HibernateQueryLang obj = new HibernateQueryLang();
    	
    	obj.useGroupByClause();
    	obj.getmaxsalary();
    	//obj.useOrderByClause();  // invoke orderbyclause
    	
    	
    	//obj.useFromClause();      // invoke Fromclause method
    	//UserService obj = new UserService(); // way to create object from class using constructor , class name is always same construtor name
    	
    	//obj.createUserTable();  // way to invoke method; object.methodname
    	
       // obj.createUser();   // here we are invoking createUser method 
    	
    	
    	//obj.findUser(4);   //  here we are invoking findUser method
    	
    	//obj.updateUser(3);  // here we are invoking merge method
    	
    	//obj.deleteUser(3);
    	
    	
    }
}

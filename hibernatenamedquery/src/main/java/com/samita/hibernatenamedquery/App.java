package com.samita.hibernatenamedquery;

import com.samita.hibernatenamedquery.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeController obj = new EmployeeController();
    	//obj.createEmployeeTable();
   // obj.findEmployeeByName();
    obj.ShowOfficeCodes_AsDepartment();    
    }
}

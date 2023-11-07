package junit.test;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import jpa.service.StudentService;

public class StudentServiceTest {
	
	/**
     * Rigorous Test :-)
     */
    @Test
    public void testvalidateStudentNotFound()
    {
    	boolean expectedResult = false;
    	
    	StudentService s = new StudentService();
		boolean actualResult = s.validateStudent("sim@gmainl.com", "abcd");
		assertEquals(expectedResult,actualResult, "conditions failed!");
		System.out.println("conditions success!");
	}
    
    @Test
    public void testvalidateStudentFound()
    {
    	boolean expectedResult = true;
    	
    	StudentService s = new StudentService();
		boolean actualResult = s.validateStudent("hluckham0@google.ru", "X1uZcoIh0dj");
		assertEquals(expectedResult,actualResult, "conditions failed!");
		System.out.println("conditions success!");
	}
    

    }

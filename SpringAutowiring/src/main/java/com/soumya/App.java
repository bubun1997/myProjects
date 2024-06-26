package com.soumya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soumya.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("./com/soumya/resources/Config.xml");
    	
    	Student student = context.getBean("student",Student.class);
    	
    	System.out.println(student);
    	
    	
    }
}

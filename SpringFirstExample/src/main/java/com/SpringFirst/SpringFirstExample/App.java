package com.SpringFirst.SpringFirstExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {     Resource r=new ClassPathResource("web.xml");  
          BeanFactory factory=new XmlBeanFactory(r);  


    	//ApplicationContext context= new ClassPathXmlApplicationContext("web.xml");
    	Student s=(Student) factory.getBean("student");
    	System.out.println(s);


    }
}

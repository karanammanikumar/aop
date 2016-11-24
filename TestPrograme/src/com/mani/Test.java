package com.mani;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Target a=factory.getBean("proxy",Target.class);  
	    Target1 a1=factory.getBean("proxy1",Target1.class);  

	    a.test1();
	    a.test2();
	    a1.test3();
	    a1.test4();
	}
}

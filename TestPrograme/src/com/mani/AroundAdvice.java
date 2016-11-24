package com.mani;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object obj;
		long startTime = System.currentTimeMillis();
		System.out.println("starttime :"+startTime);
		obj= arg0.proceed();
		long endTime = System.currentTimeMillis()-startTime;
//		  Method[] method= new Target().getClass().getMethods();
		System.out.println("Time take to complete  is "+endTime+" milliseconds");
		
		return obj;
	}


}

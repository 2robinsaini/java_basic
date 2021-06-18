package com.robin.java.core;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class LogsAspect {

	private Logger logger = LoggerFactory.getLogger(LogsAspect.class.getName());

	@Pointcut("execution(* com.robin.java.controller.MainController.*(..))")
	private void checkMethod() {
	}

	@Before("checkMethod()")
	public void logMethodCallBefore(JoinPoint joinPoint) {
		logger.info("Method Call Start ");
		System.out.println("called AOP: Start ");

		Object[] signatureArgs = joinPoint.getArgs();
		for (Object signatureArg : signatureArgs) {
			System.out.println("Arg: " + signatureArg);
		}

	}

	@After("checkMethod()")
	public void logMethodCallAfter(JoinPoint joinPoint) {
		logger.info("Method Call End ");
		System.out.println("called AOP: Done ");

		Object[] signatureArgs = joinPoint.getArgs();
		for (Object signatureArg : signatureArgs) {
			System.out.println("Arg: " + signatureArg);
		}

	}

}

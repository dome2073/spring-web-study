package org.zerock.part12;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//12. Aspect �� �ֳ����̼� �������� ����
@Aspect
@Component("profiler")
public class Profiler {
	
	@Pointcut("execution(public * org.zerock.part12..*(..))")
	public void publicMethod() {}
	
	@Around("publicMethod()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("profiler == Before || " + joinPoint.getSignature().toShortString());
		try {
			System.out.println("�� �ý����� " + System.getProperty("spring.profile.active") +"�Դϴ�.");
			
			Object result = joinPoint.proceed();
			return result;
		}finally {
			System.out.println("profiler == After ||" + joinPoint.getSignature().toShortString());
		}
	}
}

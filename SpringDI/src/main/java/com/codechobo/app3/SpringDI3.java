package com.codechobo.app3;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI3 {
	public static void main(String[] args) {
		
		//Q2. ApplicationContext를 이용해서 객체를 얻어오도록 변경 // SportsCar

		//1. ac생성 spring/springcontext7.xml
		// file은 파일경로
		// classpath는 ..
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context3.xml");
		
		//2. ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("Car");
		SportsCar c2 = (SportsCar)ac.getBean("Car");
		SportsCar c3 = (SportsCar)ac.getBean("Car");
		SportsCar c4 = (SportsCar)ac.getBean("Car");
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); //결과가 다 다르다
		
		// 요청할때 마다 새로운 객체를 준다. (scope
		// 어떨때 사용?? IV가 필요한 객체가 필요할 때, 
		// 일시적으로 필요할때 
		// EX) FORM 에서 입력한 값 ,...등
		
		//정리 
		// scope에는 singletone, prototype 이 있다.
		// 기본이 singletone, 필요할 때 prototype을 사용한다
		// singletone은 같은것을 주고 
		// prototype은 매번 다른것을 준다.
	
	}
}


class Engine {}

class Door{}

class SportsCar{
	int oil;
	String color;
	Engine engine;
	Door[] doors;
	
	
	
	
}

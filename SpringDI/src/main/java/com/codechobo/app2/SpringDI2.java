package com.codechobo.app2;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI2 {
	public static void main(String[] args) {
		
		//Q2. ApplicationContext를 이용해서 객체를 얻어오도록 변경 // SportsCar

		//1. ac생성 spring/springcontext7.xml
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context1.xml");
		
		//2. ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("Car");
		SportsCar c2 = (SportsCar)ac.getBean("Car");
		SportsCar c3 = (SportsCar)ac.getBean("Car");
		SportsCar c4 = (SportsCar)ac.getBean("Car");
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		// --> 다같은 객체 , 기본적으로 싱글톤이기 때문에
		// 매번 getBean()으로 가져오면 같은 객체를 가져옴 , context 에서 bean의 scope = "singleton" 이 기본값 // 바꾸고싶다면 prototype로 변경 --> SpringDI3
		
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

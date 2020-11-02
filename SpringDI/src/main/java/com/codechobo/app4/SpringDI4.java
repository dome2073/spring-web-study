package com.codechobo.app4;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI4 {
	public static void main(String[] args) {
		
		//Q4. Engine, Door을 bean으로 등록하고 SportCar객체에 주입하는 코드를 작성하세요
		//1. Engine, Door를 bean등록한다.
		//2. context:annotation 설정한다.
		//3. 해당 객체에 자동주입하는 @AutoWired한다.
		
		//1. ac생성 spring/springcontext7.xml
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context4.xml");
		
		//2. ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("Car");
		System.out.println(c);
//		SportsCar [oil=0, color=null, engine=null, doors=null]

	}
}


class Engine {}

class Door{}

class SportsCar{
	int oil;
	String color;
	
	@Autowired
	Engine engine;
	@Autowired
	Door[] doors;
	
	@Override
	public String toString() {
		return "SportsCar [oil=" + oil + ", color=" + color + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}
	
	
	
	
}

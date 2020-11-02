package com.codechobo.app6;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI6 {
	public static void main(String[] args) {
		
		//Q6. @Autowired 대신에 context6.xml에 <property>를 이용해서 객체 주입하세요 
		   
		
		//1. Engine, Door를 bean등록한다.
		//2. context:annotation 설정한다.
		//3. 해당 객체에 자동주입하는 @AutoWired한다. 
		
		//1. ac생성 spring/springcontext7.xml
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context6.xml");
		
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
	
	Engine engine;
	Door[] doors;
	
	@Override
	public String toString() {
		return "SportsCar [oil=" + oil + ", color=" + color + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

	public Door[] getDoors() {
		return doors;
	}
	

	public void setDoors(Door[] doors) {
		this.doors = doors;
	}

}

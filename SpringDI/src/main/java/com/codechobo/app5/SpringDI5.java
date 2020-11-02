package com.codechobo.app5;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI5 {
	public static void main(String[] args) {
		
		//Q5. 이전 단계를 Autowired를 이용하지않고 구현하기 //setter와 getter를 이용
		   //-- > 별로 좋지않은방법 // setter에 @AutoWired붙혀도 상관없다.
		
		//1. Engine, Door를 bean등록한다.
		//2. context:annotation 설정한다.
		//3. 해당 객체에 자동주입하는 @AutoWired한다.
		
		//1. ac생성 spring/springcontext7.xml
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context5.xml");
		
		//2. ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("Car");
		c.setEngine((Engine)ac.getBean("Engine"));
		c.setDoors(new Door[] {
				ac.getBean("Door",Door.class),
				ac.getBean("Door",Door.class),
				ac.getBean("Door",Door.class),
				ac.getBean("Door",Door.class)
		});
		
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
	
	//@Autowired //배열이 통째로 들어감 //이걸 XML에서 처리할수있음 
	public void setDoors(Door[] doors) {
		this.doors = doors;
	}
	
	
	
	
}

﻿package day01.class04.polymorphism;

import day01.class04.polymorphism.TV;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price; 
	
	public SamsungTV(){ //생성자
		System.out.println("===> SamsungTV 객체 생성");
	}

// 생성자 인젝션 이용
//	public SamsungTV(Speaker speaker){
//		System.out.println("===> SamsungTV(2) 객체 생성");
//		this.speaker = speaker;
//	}
//	
//	public SamsungTV(Speaker speaker, int price){
//		System.out.println("===> SamsungTV(3) 객체 생성");
//		this.speaker = speaker;
//		this.price = price;
//	}
	
	

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	
	//TV 인터페이스에 선언된 추상 메소드들을 모두 재정의해야만 한다.
	public void powerOn(){
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}
	

	public void powerOff(){
		System.out.println("SamsungTV---전원 끈다.");
	}
	
	public void volumeUp(){
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
 
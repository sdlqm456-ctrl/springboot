package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
@Component // 컨테이너에 빈등록 
public class SamsungTV implements TV {
	
	// @Autowired 컨테이너의 객체를 꺼내서 사용  (1. 필드 주입방법)
	@Setter(onMethod_ = {@Autowired})
	 Speaker Speaker;
	
	// 2. 생성자 
//	public SamsungTV(com.example.demo.Speaker speaker) {
//		super();
//		Speaker = speaker;
//	}
	//3. setter 
//	@Autowired
//	public void setSpeaker(Speaker speaker) {
//		Speaker = speaker;
//	}
//	
	public Speaker getSpeaker() {
		return Speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}
	@Override
	public void volumeUp() {
		Speaker.volumeUp();;
	}
	@Override
	public void volumeDown() {
		Speaker.volumeDown();
	}
}

package co.kr.abacus.spring.di.entrdev.service;

import org.springframework.stereotype.Component;

@Component("modelDevice")
public class ModelDeviceImpl implements Device {
	// 일반 판매 
	public void sale() {
		System.out.println("단말 일반  판매");
	}
	
	// 할브 판매 
	public void installment() {
		System.out.println("단말 할부  판매");
		
	}
}

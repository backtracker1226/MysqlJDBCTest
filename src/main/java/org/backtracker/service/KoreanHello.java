package org.backtracker.service;

public class KoreanHello implements Hello {
	
	private KoreanMsg msg;
	
	
	public KoreanHello(KoreanMsg msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return msg.getHello();
	}

}

package com.businessclasses;

public class dtdc implements courier {

	public dtdc() {
	System.out.println("dtdc");
	}

	@Override
	public String deliver(int orderid) {
		// TODO Auto-generated method stub
		return "dtdc is ready to deiver"+orderid;
	}

}

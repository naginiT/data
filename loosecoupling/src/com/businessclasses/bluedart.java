package com.businessclasses;

public class bluedart implements courier{

	public bluedart() {
		System.out.println("bluedart");
	}

	@Override
	public String deliver(int orderid) {
		// TODO Auto-generated method stub
		return "bludart is ready to deiver"+orderid;
	}

}

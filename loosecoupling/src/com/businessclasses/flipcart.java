package com.businessclasses;

public class flipcart {
	private courier cc;
	

	public courier getCc() {
		return cc;
	}

	public void setCc(courier cc) {
		this.cc = cc;
	}

	public flipcart() {
	System.out.println("flipkart");
	}
	
	public String purchase(String[] items){
		int orderid=1258;
		String s=cc.deliver(orderid);
		
		
		return s+"sdfaljkfsad"+orderid;
		
	}
	

}

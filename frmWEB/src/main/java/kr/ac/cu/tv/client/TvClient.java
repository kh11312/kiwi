package kr.ac.cu.tv.client;

import kr.ac.cu.tv.factory.TvFactory;
import kr.ac.cu.tv.util.TV;

public class TvClient {

	public static void main(String[] args) {
		TvFactory factory = TvFactory.getInstance() ; 
		TV tv = factory.getBrand("lg");
		tv.powerOff(); tv.powerOn();
	}

}

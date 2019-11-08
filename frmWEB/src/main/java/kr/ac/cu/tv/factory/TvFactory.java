package kr.ac.cu.tv.factory;

import java.util.HashMap;
import java.util.Map;

import kr.ac.cu.tv.model.vo.LgTV;
import kr.ac.cu.tv.model.vo.SamsungTV;
import kr.ac.cu.tv.util.TV;

public class TvFactory {
	private static TvFactory instance ;  
	private Map<String, TV> map ;
	private TvFactory() {
		map = new HashMap<String, TV>();
		map.put("samsung", 	new SamsungTV());
		map.put("lg", 		new LgTV());
	}
	
	public static TvFactory getInstance() {
		if(instance == null) {
			instance = new TvFactory();
		}
		return instance; 
	}
	
	public TV getBrand(String brand) {
		return map.get(brand) ;
	}
}



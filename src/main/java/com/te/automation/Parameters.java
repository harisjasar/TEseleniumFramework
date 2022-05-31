package com.te.automation;

import java.util.HashMap;

public class Parameters {
	
	private HashMap<String, Object> paramsMap;

	public Parameters() {
		this.paramsMap = new HashMap<String, Object>();
	}
	

	public String Get(String key) {
		return (String) this.paramsMap.get(key);
	}
	
	public void Insert(String key, Object value) {
		this.paramsMap.put(key, value);
	}
}
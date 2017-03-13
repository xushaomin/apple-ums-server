package com.appleframework.ums.server.collector.utils;

import java.util.HashMap;

import com.appleframework.rest.AbstractRestRequest;

public class MapUtil {

	/*public static Map<String, String> create(String key, String value) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(key, value);
		return map;
	}

	public static Map<String, String> create(int size) {
		Map<String, String> map = new HashMap<String, String>(size);
		return map;
	}
	
	public static Map<String, String> create(int size, String key, String value) {
		Map<String, String> map = new HashMap<String, String>(size);
		map.put(key, value);
		return map;
	}*/
	
	public static HashMap<String, String> create(AbstractRestRequest request) {
		HashMap<String, String> map = new HashMap<String, String>(2);
		map.put("ip", request.getRestRequestContext().getIp());
		map.put("content", request.getRestRequestContext().getContent());
		return map;
	}
}

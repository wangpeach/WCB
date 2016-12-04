package com.wljz.services;

import java.util.HashMap;
import java.util.Map;

import com.wljz.utils.HttpConnection;
import com.wljz.utils.HttpConnection.HttpType;

public class CqsscService extends BaseService {
	
	String url = "http://www.cp66607.com/api/cqssc?=&limit=5";
	
	/**
	 * 
	 * @param limit
	 * @return
	 */
	public String reqHaoMa(int limit) {
		
		Map<String, Object> arg = new HashMap<String, Object>();
		arg.put("act", "lishikaijianghaoma");
		arg.put("limit", limit);
		HttpConnection conn = new HttpConnection(HttpType.http);
		String reuslt = conn.sendRequest(url, arg);
		
		return null;
	}
	
}

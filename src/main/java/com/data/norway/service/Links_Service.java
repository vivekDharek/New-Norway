package com.data.norway.service;

import java.util.List;
import java.util.Map;

public interface Links_Service {
	
	List<Map<String, Object>> getIncommingLinks(String id);
	List<Map<String, Object>> getOutgoingLinks(String id);
	List<Map<String, Object>> getIncommingGraph(String id);
	List<Map<String, Object>> getOutgoingGraph(String id);
}

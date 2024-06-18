package com.data.norway.service;

import java.util.List;
import java.util.Map;
/**
*
* @author Vivek Dharek
*/

public interface Nodes_Services {
	
	/**
	*
	* Following methods are implemented in Nodes_ServiceImpl.java
	*/
	
	List<Map<String, Object>> getIncommingLinks(String id);
	List<Map<String, Object>> getOutgoingLinks(String id);
	List<Map<String, Object>> getIncommingGraph(String id);
	List<Map<String, Object>> getOutgoingGraph(String id);
	List<Map<String, Object>> getNode(String id);
	List<Map<String, Object>> getBaseline(String id);

}

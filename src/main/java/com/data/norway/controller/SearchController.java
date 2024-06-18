package com.data.norway.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.*;
import com.data.norway.service.*;

/**
*
* @author Vivek Dharek
*/

@Controller
public class SearchController {
	
	/**
	*
	* This is controller class which will handle APIs requests. 
	*/
	
	private Nodes_Services nodes_service;
	
	public SearchController(Nodes_Services nodes_service) {
		super();
		this.nodes_service = nodes_service;
	}
	
	/**
	*
	* For search of single node.  
	*/

	@GetMapping(path = "/")
	public String byId(String id, Model model){
		List<Map<String, Object>> jsonData = nodes_service.getBaseline(id);
		model.addAttribute("jsonData", jsonData);
		return "baseline";
	}
	
	/**
	*
	* For getting incoming links and incoming graph.
	* jsonData will hold the data of all incoming nodes and will be passed to front-end through model.addAttribute  
	* graphData will hold the data of all incoming nodes as tree structure and will be passed to front-end through model.addAttribute 
	* @return tree.html
	*/
	
	@GetMapping(value = "/incominglinks")
	public String getIncomingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = nodes_service.getIncommingLinks(id);
		List<Map<String,Object>> graphData = nodes_service.getIncommingGraph(id);
		model.addAttribute("jsonData", jsonData);
		model.addAttribute("graphData", graphData);
		return "tree";
	}
	
	/**
	*
	* For getting outgoing links and outgoing graph.
	* jsonData will hold the values of all outgoing nodes and will be passed to front-end through model.addAttribute.
	* graphData will hold the values of all outgoing nodes as tree structure and will be passed to front-end through model.addAttribute.
	* @return tree.html
	*/
	
	@GetMapping(value = "/outgoinglinks")
	public String getOutgoingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = nodes_service.getOutgoingLinks(id);
		List<Map<String,Object>> graphData = nodes_service.getOutgoingGraph(id);
		model.addAttribute("jsonData", jsonData);
		model.addAttribute("graphData", graphData);
		return "tree";
	}
}

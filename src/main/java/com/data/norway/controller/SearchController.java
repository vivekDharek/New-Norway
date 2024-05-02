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

@Controller
public class SearchController {
	
	private Nodes_Services nodes_service;
	
	public SearchController(Nodes_Services nodes_service) {
		super();
		this.nodes_service = nodes_service;
	}

	@GetMapping(path = "/")
	public String byId(String id, Model model){
		List<Map<String, Object>> jsonData = nodes_service.getNode(id);
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
	
	@GetMapping(value = "/incominglinks")
	public String getIncomingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = nodes_service.getIncommingLinks(id);
		List<Map<String,Object>> graphData = nodes_service.getIncommingGraph(id);
		model.addAttribute("jsonData", jsonData);
		model.addAttribute("graphData", graphData);
		return "tree";
	}
	
	@GetMapping(value = "/outgoinglinks")
	public String getOutgoingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = nodes_service.getOutgoingLinks(id);
		List<Map<String,Object>> graphData = nodes_service.getOutgoingGraph(id);
		model.addAttribute("jsonData", jsonData);
		model.addAttribute("graphData", graphData);
		return "tree";
	}
}

package com.data.norway.model;

import java.util.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class SSRS_PS {

	@Id
	private String id;
	private String req_type;
	private String stage;
	private String obj_text;
	private String req_origin; 
	
	@Relationship (type = "bypass")
	List<CONTRACT> bypassTo = new ArrayList<CONTRACT>();
	
	@Relationship (type = "realizes")
	List<SAD> realizesTo = new ArrayList<SAD>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReq_type() {
		return req_type;
	}

	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getObj_text() {
		return obj_text;
	}

	public void setObj_text(String obj_text) {
		this.obj_text = obj_text;
	}

	public String getReq_origin() {
		return req_origin;
	}

	public void setReq_origin(String req_origin) {
		this.req_origin = req_origin;
	}

	public List<CONTRACT> getBypassTo() {
		return bypassTo;
	}

	public void setBypassTo(List<CONTRACT> bypassTo) {
		this.bypassTo = bypassTo;
	}

	public List<SAD> getRealizesTo() {
		return realizesTo;
	}

	public void setRealizesTo(List<SAD> realizesTo) {
		this.realizesTo = realizesTo;
	}

	public SSRS_PS(String id, String req_type, String stage, String obj_text, String req_origin,
			List<CONTRACT> bypassTo, List<SAD> realizesTo) {
		super();
		this.id = id;
		this.req_type = req_type;
		this.stage = stage;
		this.obj_text = obj_text;
		this.req_origin = req_origin;
		this.bypassTo = bypassTo;
		this.realizesTo = realizesTo;
	}
	
	
	
}

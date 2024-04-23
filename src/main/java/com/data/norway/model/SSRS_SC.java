package com.data.norway.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node		
public class SSRS_SC {
	
	@Id
	private String id;
	private String req_type;
	private String stage;
	private String obj_text;
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
	public SSRS_SC(String id, String req_type, String stage, String obj_text) {
		super();
		this.id = id;
		this.req_type = req_type;
		this.stage = stage;
		this.obj_text = obj_text;
	}
	
	

}

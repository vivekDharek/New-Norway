package com.data.norway.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class SSRS_AMAC {
	
	@Id
	private String id;
	private String stage;
	private String req_type;
	private String obj_text;
	private String req_origin;
	
	@Relationship(type = "realizes")
	List<SAD> realizesTo = new ArrayList<SAD>();

	public SSRS_AMAC(String id, String stage, String req_type, String obj_text, String req_origin,
			List<SAD> realizesTo) {
		super();
		this.id = id;
		this.stage = stage;
		this.req_type = req_type;
		this.obj_text = obj_text;
		this.req_origin = req_origin;
		this.realizesTo = realizesTo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getReq_type() {
		return req_type;
	}

	public void setReq_type(String req_type) {
		this.req_type = req_type;
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

	public List<SAD> getRealizesTo() {
		return realizesTo;
	}

	public void setRealizesTo(List<SAD> realizesTo) {
		this.realizesTo = realizesTo;
	}
}

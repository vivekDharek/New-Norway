package com.data.norway.model;

import java.util.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class SSRS_DS {

	@Id
	String id;
	String req_type;
	String stage;
	String obj_text;
	String bypass;
	String realizes;
	String req_origin;
	String req;

	@Relationship(type = "bypass", direction = Relationship.Direction.OUTGOING)
	List<CONTRACT> bypassTo = new ArrayList<CONTRACT>();

	@Relationship(type = "realizes", direction = Relationship.Direction.OUTGOING)
	List<SAD> realizedTo = new ArrayList<SAD>();

	public List<CONTRACT> getBypassTo() {
		return bypassTo;
	}

	public List<SAD> getRealizedTo() {
		return realizedTo;
	}

	public SSRS_DS(){
		this.bypassTo = new ArrayList<CONTRACT>();
		this.realizedTo = new ArrayList<SAD>();
	}

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

	public String getBypass() {
		return bypass;
	}

	public void setBypass(String bypass) {
		this.bypass = bypass;
	}

	public String getRealizes() {
		return realizes;
	}

	public void setRealizes(String realizes) {
		this.realizes = realizes;
	}

	public String getReq_origin() {
		return req_origin;
	}

	public void setReq_origin(String req_origin) {
		this.req_origin = req_origin;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}

	public void setBypassTo(List<CONTRACT> bypassTo) {
		this.bypassTo = bypassTo;
	}

	public void setRealizedTo(List<SAD> realizedTo) {
		this.realizedTo = realizedTo;
	}
	
	
	
}

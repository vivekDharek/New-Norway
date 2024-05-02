package com.data.norway.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Nodes {
	
	@Id
	private String id;
	private String ac_condition;
	private String cust_comments;
	private String external_id;
	private String obj_text;
	private String req_forwarding;
	private String req_origin;
	private String req_rational;
	private String req_title;
	private String req_type;
	private String req_verification;
	private String stage;
	private String val_evidence;
	private String val_proof_measure;
	private String val_result;
	private String val_statement;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAc_condition() {
		return ac_condition;
	}
	public void setAc_condition(String ac_condition) {
		this.ac_condition = ac_condition;
	}
	public String getCust_comments() {
		return cust_comments;
	}
	public void setCust_comments(String cust_comments) {
		this.cust_comments = cust_comments;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}
	public String getObj_text() {
		return obj_text;
	}
	public void setObj_text(String obj_text) {
		this.obj_text = obj_text;
	}
	public String getReq_forwarding() {
		return req_forwarding;
	}
	public void setReq_forwarding(String req_forwarding) {
		this.req_forwarding = req_forwarding;
	}
	public String getReq_origin() {
		return req_origin;
	}
	public void setReq_origin(String req_origin) {
		this.req_origin = req_origin;
	}
	public String getReq_rational() {
		return req_rational;
	}
	public void setReq_rational(String req_rational) {
		this.req_rational = req_rational;
	}
	public String getReq_title() {
		return req_title;
	}
	public void setReq_title(String req_title) {
		this.req_title = req_title;
	}
	public String getReq_type() {
		return req_type;
	}
	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}
	public String getReq_verification() {
		return req_verification;
	}
	public void setReq_verification(String req_verification) {
		this.req_verification = req_verification;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getVal_evidence() {
		return val_evidence;
	}
	public void setVal_evidence(String val_evidence) {
		this.val_evidence = val_evidence;
	}
	public String getVal_proof_measure() {
		return val_proof_measure;
	}
	public void setVal_proof_measure(String val_proof_measure) {
		this.val_proof_measure = val_proof_measure;
	}
	public String getVal_result() {
		return val_result;
	}
	public void setVal_result(String val_result) {
		this.val_result = val_result;
	}
	public String getVal_statement() {
		return val_statement;
	}
	public void setVal_statement(String val_statement) {
		this.val_statement = val_statement;
	}
	public Nodes(String id, String ac_condition, String cust_comments, String external_id, String obj_text,
			String req_forwarding, String req_origin, String req_rational, String req_title, String req_type,
			String req_verification, String stage, String val_evidence, String val_proof_measure, String val_result,
			String val_statement) {
		super();
		this.id = id;
		this.ac_condition = ac_condition;
		this.cust_comments = cust_comments;
		this.external_id = external_id;
		this.obj_text = obj_text;
		this.req_forwarding = req_forwarding;
		this.req_origin = req_origin;
		this.req_rational = req_rational;
		this.req_title = req_title;
		this.req_type = req_type;
		this.req_verification = req_verification;
		this.stage = stage;
		this.val_evidence = val_evidence;
		this.val_proof_measure = val_proof_measure;
		this.val_result = val_result;
		this.val_statement = val_statement;
	}
	
	

}

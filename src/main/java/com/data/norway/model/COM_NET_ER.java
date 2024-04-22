package com.data.norway.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class COM_NET_ER {
	
	@Id
	private String id;
	private String req_type;
	private String obj_text;
	private String val_statement;
	private String val_evidence;
	private String val_proof;
	private String val_result;
	private String ac_condition;
	private String validates;
	
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
	public String getObj_text() {
		return obj_text;
	}
	public void setObj_text(String obj_text) {
		this.obj_text = obj_text;
	}
	public String getVal_statement() {
		return val_statement;
	}
	public void setVal_statement(String val_statement) {
		this.val_statement = val_statement;
	}
	public String getVal_evidence() {
		return val_evidence;
	}
	public void setVal_evidence(String val_evidence) {
		this.val_evidence = val_evidence;
	}
	public String getVal_proof() {
		return val_proof;
	}
	public void setVal_proof(String val_proof) {
		this.val_proof = val_proof;
	}
	public String getVal_result() {
		return val_result;
	}
	public void setVal_result(String val_result) {
		this.val_result = val_result;
	}
	public String getAc_condition() {
		return ac_condition;
	}
	public void setAc_condition(String ac_condition) {
		this.ac_condition = ac_condition;
	}
	public String getValidates() {
		return validates;
	}
	public void setValidates(String validates) {
		this.validates = validates;
	}
	
	public COM_NET_ER(String id, String req_type, String obj_text, String val_statement, String val_evidence,
			String val_proof, String val_result, String ac_condition, String validates) {
		super();
		this.id = id;
		this.req_type = req_type;
		this.obj_text = obj_text;
		this.val_statement = val_statement;
		this.val_evidence = val_evidence;
		this.val_proof = val_proof;
		this.val_result = val_result;
		this.ac_condition = ac_condition;
		this.validates = validates;
	}
	
	

}

package com.data.norway.model;

import java.util.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class DS_ER {
	
	@Id
	String id;
	String obj_text;
	String req_type;
	String val_evidence;
	String val_proof;
	String val_result;
	String val_statement;
	String ac_condition;
	String validates;

	@Relationship(type = "validates", direction = Relationship.Direction.OUTGOING)
	List<SSRS_DS> validatesTo = new ArrayList<SSRS_DS>();

	public DS_ER() {
		this.validatesTo = new ArrayList<SSRS_DS>();
	}

	public String getAc_condition() {
		return ac_condition;
	}

	public String getValidates() {
		return validates;
	}

	public DS_ER(String id, String obj_text, String req_type, String val_evidence, String val_proof, String val_result,
			String val_statement, String ac_condition, String validates) {
		super();
		this.id = id;
		this.obj_text = obj_text;
		this.req_type = req_type;
		this.val_evidence = val_evidence;
		this.val_proof = val_proof;
		this.val_result = val_result;
		this.val_statement = val_statement;
		this.ac_condition = ac_condition;
		this.validates = validates;
	}

	public String getId() {
		return id;
	}
	public String getObj_text() {
		return obj_text;
	}
	public String getReq_type() {
		return req_type;
	}
	public String getVal_evidence() {
		return val_evidence;
	}
	public String getVal_proof() {
		return val_proof;
	}
	public String getVal_result() {
		return val_result;
	}
	public String getVal_statement() {
		return val_statement;
	}
	public List<SSRS_DS> getVal() {
		return validatesTo;
	}
	
	public void setVal(List<SSRS_DS> ssrs_ds) {
		validatesTo = ssrs_ds;
	}
	
}

package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Nodes_DTO {
	
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

}

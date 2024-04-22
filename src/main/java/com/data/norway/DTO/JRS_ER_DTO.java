package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JRS_ER_DTO {
	
	private String id;
	private String req_type;
	private String obj_text;
	private String val_statement;
	private String val_evidence;
	private String val_proof_measure;
	private String val_result;
	private String ac_condition;
	private String validates;

}

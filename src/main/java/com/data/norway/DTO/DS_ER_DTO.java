package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DS_ER_DTO {

	String id;
	String obj_text;
	String req_type;
	String val_evidence;
	String val_proof;
	String val_result;
	String val_statement;
	String ac_condition;
	String validates;
	
}

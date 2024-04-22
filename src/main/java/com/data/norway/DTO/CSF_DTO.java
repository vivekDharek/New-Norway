package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CSF_DTO {
	
	private String id;
	private String req_type;
	private String obj_text;
	private String val_statement;
	private String val_evidence;
	private String val_proof;
	private String ac_condition;
	private String val_result;
	private String validates;
	@Override
	public String toString() {
		return "CSF_DTO [id=" + id + ", req_type=" + req_type + ", obj_text=" + obj_text + ", val_statement="
				+ val_statement + ", val_evidence=" + val_evidence + ", val_proof=" + val_proof + ", ac_condition="
				+ ac_condition + ", val_result=" + val_result + ", validates=" + validates + "]";
	}
	
	

}

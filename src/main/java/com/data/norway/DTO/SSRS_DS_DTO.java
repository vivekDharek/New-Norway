package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SSRS_DS_DTO {

	String id;
	String req_type;
	String stage;
	String obj_text;
	String bypass;
	String realizes;
	String req_origin;
	String req;
	
}

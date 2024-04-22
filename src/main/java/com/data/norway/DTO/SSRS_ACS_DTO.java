package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SSRS_ACS_DTO {
	
	private String id;
	private String req_type;
	private String stage;
	private String obj_text;
	private String req_origin;

}

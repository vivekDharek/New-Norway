package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContractDTO {

	private String id;
    private String external_id;
    private String req_type;
    private String obj_text;
    private String req_title;
    private String req_rational;
    private String cust_comments;
    private String req_forwarding;
    private String req_varification;
	
}

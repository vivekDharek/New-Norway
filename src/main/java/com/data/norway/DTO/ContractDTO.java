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
    
	@Override
	public String toString() {
		return "ContractDTO [id=" + id + ", external_id=" + external_id + ", req_type=" + req_type + ", obj_text="
				+ obj_text + ", req_title=" + req_title + ", req_rational=" + req_rational + ", cust_comments="
				+ cust_comments + ", req_forwarding=" + req_forwarding + ", req_varification=" + req_varification + "]";
	}
	 
}

package com.data.norway.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SAD_DTO {
	String id;
    String req_type;
    String stage;
    String obj_text;
    String req_forwarding;
    String realizes;
    String req_origin;
}

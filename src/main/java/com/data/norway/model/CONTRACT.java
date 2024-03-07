package com.data.norway.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class CONTRACT {
	
	@Id
    String id;
    String external_id;
    String req_type;
    String obj_text;
    String req_title;
    String req_rational;
    String cust_comments;
    String req_forwarding;
    String req_varification;
    
    public String getId() {
        return id;
    }
    public String getExternal_id() {
        return external_id;
    }
    public String getReq_type() {
        return req_type;
    }
    public String getObj_text() {
        return obj_text;
    }
    public String getReq_title() {
        return req_title;
    }
    public String getReq_rational() {
        return req_rational;
    }
    public String getCust_comments() {
        return cust_comments;
    }
    public String getReq_forwarding() {
        return req_forwarding;
    }
    public String getReq_varification() {
        return req_varification;
    }
    public CONTRACT(String id, String external_id, String req_type, String obj_text, String req_title,
            String req_rational, String cust_comments, String req_forwarding, String req_varification) {
        this.id = id;
        this.external_id = external_id;
        this.req_type = req_type;
        this.obj_text = obj_text;
        this.req_title = req_title;
        this.req_rational = req_rational;
        this.cust_comments = cust_comments;
        this.req_forwarding = req_forwarding;
        this.req_varification = req_varification;
    }

}

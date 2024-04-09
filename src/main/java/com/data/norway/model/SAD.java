package com.data.norway.model;

import java.util.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class SAD {

	@Id
    String id;
    String req_type;
    String stage;
    String obj_text;
    String req_forwarding;
    String realizes;
    String req_origin;

    @Relationship(type = "realizes")
    List<SRS> realizedTo =  new ArrayList<SRS>();

    public SAD() {
        this.realizedTo = new ArrayList<SRS>();
    }
    public String getId() {
        return id;
    }
    public String getReq_type() {
        return req_type;
    }
    public String getStage() {
        return stage;
    }
    public String getObj_text() {
        return obj_text;
    }
    public String getReq_forwarding() {
        return req_forwarding;
    }
    public String getRealizes() {
        return realizes;
    }
    public String getReq_origin() {
        return req_origin;
    }
    public SAD(String id, String req_type, String stage, String obj_text, String req_forwarding, String realizes,
            String req_origin) {
        this.id = id;
        this.req_type = req_type;
        this.stage = stage;
        this.obj_text = obj_text;
        this.req_forwarding = req_forwarding;
        this.realizes = realizes;
        this.req_origin = req_origin;
    }
    public List<SRS> getRealizesTo() {
        return realizedTo;
    }
	public void setRealizesTo(List<SRS> realizesTo) {
		this.realizedTo = realizesTo;
	}

    
    
	
}

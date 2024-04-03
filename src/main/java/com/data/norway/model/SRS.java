package com.data.norway.model;

import java.util.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class SRS {
	
	@Id
    String id;
    String req_type;
    String stage;
    String obj_text;
    String req_forwarding;
    String realizes;
    
    @Relationship(type = "realizes")
    List<CONTRACT> realizedTo = new ArrayList<CONTRACT>();

    public SRS(){
        this.realizedTo = new ArrayList<CONTRACT>();
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
    public SRS(String id, String req_type, String stage, String obj_text, String req_forwarding, String realizes) {
        this.id = id;
        this.req_type = req_type;
        this.stage = stage;
        this.obj_text = obj_text;
        this.req_forwarding = req_forwarding;
        this.realizes = realizes;
    }

    public List<CONTRACT> getRealizedTo() {
        return realizedTo;
    }

	public void setRealizedTo(List<CONTRACT> realizedTo) {
		this.realizedTo = realizedTo;
	}

    
    
}

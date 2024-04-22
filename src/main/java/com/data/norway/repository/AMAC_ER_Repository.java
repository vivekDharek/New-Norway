package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.AMAC;

public interface AMAC_ER_Repository extends Neo4jRepository<AMAC, String> {
	
	

}

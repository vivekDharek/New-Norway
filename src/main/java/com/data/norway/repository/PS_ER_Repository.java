package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.PS_ER;

public interface PS_ER_Repository extends Neo4jRepository<PS_ER, String> {

}

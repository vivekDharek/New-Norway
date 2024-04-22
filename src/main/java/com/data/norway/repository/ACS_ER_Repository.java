package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.ACS_ER;

public interface ACS_ER_Repository extends Neo4jRepository<ACS_ER, String> {

}

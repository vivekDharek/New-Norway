package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.SRS;

public interface SRS_Repository extends Neo4jRepository<SRS, String> {

}

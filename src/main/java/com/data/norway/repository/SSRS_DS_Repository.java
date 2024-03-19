package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.SSRS_DS;

public interface SSRS_DS_Repository extends Neo4jRepository<SSRS_DS, String> {

}

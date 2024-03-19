package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.SAD;

public interface SAD_Repository extends Neo4jRepository<SAD, String> {

}
